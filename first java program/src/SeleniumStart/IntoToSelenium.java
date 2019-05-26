package SeleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class IntoToSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.spicejet.com");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
 driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click();
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
	//[accept= ok, yes,submit and dismiss=No, cancel,deny]
	int i=0;
	while(i<4) {
		driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		i++;
	}
//	
//	driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
//	driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
	driver.findElement(By.cssSelector("input[type='submit']")).click();

//	driver.navigate().to("https://www.facebook.com");
//	//driver.navigate().back();
//
//	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Mukesh_acharya64@yahoo.com");
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("*************");
//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
//	
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("************");
//
//	driver.findElement(By.cssSelector("input[id='pass']")).click();
	//driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("todays sbi blue chip mutual fund price");
//driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys(Keys.ENTER);
	}
}
