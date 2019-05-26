package SeleniumStart;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import ExtentReport.ExtentReport;
import Screenshots.DefaultScreenshotDeclaration;

public class handlewindows {
	
	ExtentReports report;
	
	ExtentTest logger;
	
	@BeforeMethod
	
	public void setup() {
		ExtentReport.ExReport();
		
	}
	
	@AfterMethod 
	
	public void getScreenshot(ITestResult result, WebDriver driver) throws Exception {
		if (result.getStatus()==ITestResult.FAILURE);
		DefaultScreenshotDeclaration.Scrneeshot(driver);
		
	}
	
	
@Test
		public void  Scrneeshot(){

		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		try {
			driver.get("https://www.google.com");
			
			DefaultScreenshotDeclaration.Scrneeshot(driver);
			
			String test=driver.getTitle();
			
			Assert.assertTrue(test.contains("Mukesh"));
			DefaultScreenshotDeclaration.Scrneeshot(driver);
			
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("open new tab");
			
			DefaultScreenshotDeclaration.Scrneeshot(driver);
			
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
			
		
			
			WebElement Links=driver.findElement(By.tagName("a"));
			System.out.println(Links.getSize());
			String Clicktogetnewtab =Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			driver.findElement(By.xpath("//a[@href='https://stackoverflow.com/questions/15551779/open-link-in-new-tab-or-window']")).sendKeys(Clicktogetnewtab);
			DefaultScreenshotDeclaration.Scrneeshot(driver);
			
		} catch (Exception e) {
			
			System.out.println("Error while taking screenshot");
		}
		Set <String> ids=driver.getWindowHandles();
		Iterator <String> it=ids.iterator();
		//String parentsid=it.next();
		String childid=it.next();
	
		System.out.println(driver.switchTo().w indow(childid).getTitle());
		
	}

}
