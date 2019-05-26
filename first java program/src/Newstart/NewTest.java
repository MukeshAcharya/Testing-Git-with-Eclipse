package Newstart;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import ExtentReport.ExtentReport;
import Screenshots.DefaultScreenshotDeclaration;
import TestNgAnnotations.NewStart;

	public class NewTest {
	
	WebDriver driver;
	static int k,i;
	int s;
//ExtentHtmlReporter testreport = new ExtentHtmlReporter();
//ExtentHtmlReporter htmlreport= new ExtentHtmlReporter("./Reports/Screenshots.html");
//ExtentReports extent(string,boolean);
ExtentTest logger;

	@Test
	public void Methodtesting1() {
		//report= new ExtentReports();
		//test= report.createTest(testName)
		//extent.attachReporter(testreport);
		//test= extent.createTest("my First test","description");
		NewStart obj = new NewStart();
		int expectedresult = 3;
		int result1 = obj.add(1, 2);
 
		System.out.println("This is tetsing for method 1");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(result1,expectedresult );
		sa.assertAll();

		// Assert.assertEquals(result1,expectedresult);

	}

	@Test
	public void Methodtesting2() {
		NewStart obj2 = new NewStart();
		System.out.println("This is testing for method 2");
		String Expectedresult = ("Hello String");
		String result2 = obj2.addstring("Hello", "String");
		Assert.assertEquals(result2, Expectedresult);

	}
	
	@Test
	public void Methodtesting5() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("how to");
		
		Actions actions =new Actions(driver);
		
		List<WebElement> links=driver.findElements(By.xpath("//*[@id='searchform']//ul[@class='erkvQe']//li"));
	
		System.out.println("links present: - "+links);
		System.out.println("this is to get the links size: - "+links.size());
		k=links.size();
		for (WebElement ele:links)
		
		actions.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).build().perform();
		
		String parent=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext())
		{
		  String child_window=I1.next();
		  if(!parent.equals(child_window))
		  {
		    driver.switchTo().window(child_window);
		    System.out.println(driver.switchTo().window(child_window).getTitle());
		    ExtentReport.ExReport();
			DefaultScreenshotDeclaration.Scrneeshot(driver);
		    driver.close();
		  }
		}
		driver.switchTo().window(parent);
		System.out.println(driver.switchTo().window(parent).getTitle());
	}
		
	@Test
	public void MethodTesting4() throws Exception {
		//extent==new ExtentReports("./Reports/Reporting.html");
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("food items");
		//driver.findElement(By.className("gLFyf gsfi")).sendKeys("food items");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
		List <WebElement> foodlist=driver.findElements(By.xpath("//div[@id='search']//div[@class='r']"));
		
		
		
		System.out.println("there are"+foodlist.size()+ "of links present in this page");
		
		ExtentReport.ExReport();
		DefaultScreenshotDeclaration.Scrneeshot(driver);
		driver.close();
	}
		
	@Test
	public void Methodtesting3() {
		NewStart obj3 = new NewStart();
		System.out.println("This is tetsing for method 3");
		int[] ExpectedArray = { 1, 2, 3 };
		int[] result3 = obj3.getArray();
		 Assert.assertEquals(result3, ExpectedArray);

	}

}
