package SeleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("how to press control key  and click in selenium webdriver");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
	System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footerdriver=driver.findElement(By.id("footcnt"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement brscol1=driver.findElement(By.xpath("//div[@class='brs_col']"));
	System.out.println(brscol1.findElements(By.tagName("a")).size());
	for(int i=0;i<brscol1.findElements(By.tagName("a")).size();i++)
	{
		String clickonlink =Keys.chord(Keys.CONTROL,Keys.ENTER); 
		
		brscol1.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);	
	
	}
	
	//WebElement subfooterdriver=driver.findElement(By.class("fbar"));
	//System.out.println(subfooterdriver.findElements(By.tagName("a")).size());
	}

}
