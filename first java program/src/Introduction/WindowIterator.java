package Introduction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ExtentReport.ExtentReport;
import Screenshots.DefaultScreenshotDeclaration;

public class WindowIterator {
	
	static int k,i;
	//static String T;

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	//driver.switchTo().alert().dismiss();
//driver.findElement(By.className("gLFyf gsfi")).sendKeys("learn java");
//driver.findElement(By.className("gLFyf gsfi")).submit();
	//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("how to click all links in selenium");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("food shop");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
	List<WebElement> Links = driver.findElements(By.xpath("//*[@id='rso']//div[@class='r']//a"));
	System.out.println(Links.size());
	k=Links.size();
	Actions act=new Actions(driver);
	
//	for (i=1;i<=k;i++)
//		
//	{
//		driver.navigate().toString(k);
//	}
	for (WebElement ele:Links)
	{
		//T=ele.getAttribute("href");
		act.keyDown(Keys.CONTROL).click(ele).keyUp(Keys.CONTROL).build().perform();
	}String parent=driver.getWindowHandle();
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

}

	
