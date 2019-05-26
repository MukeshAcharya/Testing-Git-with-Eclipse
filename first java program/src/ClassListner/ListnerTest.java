package ClassListner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ClassListner.ListnerDemo.class)

public class ListnerTest {
	
	String k;
	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
}
	@Test
	public void Test2() {
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		k=driver.getTitle();
		System.out.println(k);
		if (k.equals("facebook"))
		{
			System.out.println("Title is matching");
		}else
		{
			System.out.println("Title is not matching");
		}
	}
	}
