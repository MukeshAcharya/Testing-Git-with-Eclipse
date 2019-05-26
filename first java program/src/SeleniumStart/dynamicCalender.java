package SeleniumStart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Choose Date']")).click();
		
		while(!driver.findElement(By.xpath("//*[@class='DayPicker-Month']/div")).getText().contains("April"));
		{
			
			driver.findElement(By.cssSelector("[class='DayPicker-NavBar'][class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		java.util.List<WebElement> dates =driver.findElements(By.className("calDate"));
		
		int count=driver.findElements(By.className("calDate")).size();
		System.out.println(count);
		
		 
	
//		for (int i=0;i<count;i++)
//		{
//			String text= driver.findElements(By.className("caldate")).get(i).getText();
//			if(text.equalsIgnoreCase("23"))
//			{
//				dates.get(i).click();
//				break;
//			}		
//		}
			for(WebElement opt:dates)
			{
				if (opt.getText().equals("23"))
				{
					opt.click();
					break;
				}
				
			}
	}
}
