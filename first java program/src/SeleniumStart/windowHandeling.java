package SeleniumStart;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandeling {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("How to
		// press control and click in Selenium");
		// driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
		Actions action = new Actions(driver);
		// WebElement test=
		// driver.findElement(By.xpath("//*[contains(@class,'rLC20lb'<Key press in (Ctrl
		// + mouse click) in Selen)]"));
		// action.sendKeys(Keys.CONTROL).click(test);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();// to come out from frame.
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F://ScreenShot//Screenshots.png") );

		// set<string> parentpage= ids.driven

		// action.keyDown(Keys.CONTROL).build().perform();
		// WebElement obj=driver.findElement(
		// By.xpath("//a[contains(href,'https://ads.google.com/intl/en_in/home/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1')]"));
		// action.sendKeys(Keys.CONTROL).click(obj);

	}

}
