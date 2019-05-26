package SeleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fantasycricket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.fantasycricketdream11.com");

	}

}
