package SeleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class atomateRediff {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","F:/Drivers/geckodriver.exe");
				System.setProperty("webdriver.chrome.driver","F:/Drivers/chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				//WebDriver driver =new FirefoxDriver();
				driver.get("https://www.rediff.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				WebDriverWait wait= new WebDriverWait(driver, 10);
				driver.findElement(By.xpath("//span[@class='homesprite moneyicon']")).click();
				driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
				driver.findElement(By.id("useremail")).sendKeys("sharma.avneesh008@gmail.com");
				
				driver.findElement(By.xpath("//input[@type='button']")).click();
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));
				driver.findElement(By.id("userpass")).sendKeys("Gmail@12345");
			
				driver.findElement(By.id("loginsubmit")).click();
				driver.findElement(By.id("portfolioid")).click();
				driver.findElement(By.xpath("//option[@value='1893506']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("btnLftGrySml"))));
				driver.findElement(By.className("btnLftGrySml")).click();
				driver.findElement(By.id("addstockname")).sendKeys("Tata");
			
				driver.findElement(By.id("12090010")).click();
				//System.out.println(driver.findElements(By.id("ajax_listOfOptions")).size());
				driver.findElement(By.id("addstockname")).sendKeys("Tata Chemicals Ltd.");
				driver.findElement(By.id("stockAddDate")).sendKeys("01-05-2019");
				driver.findElement(By.id("addstockqty")).sendKeys("123");																	
				driver.findElement(By.id("addstockprice")).sendKeys("12345");
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='NSE']"))));
				
				driver.findElement(By.xpath("//label[@for='nse']")).click();
				driver.findElement(By.id("addStockButton")).click();	
				driver.findElement(By.id("equityid12090010")).click();
				System.out.println(driver.findElement(By.id("equityid12090010")).isEnabled());
				driver.findElement(By.xpath("//input[@type='Delete']")).click();

	}

}
