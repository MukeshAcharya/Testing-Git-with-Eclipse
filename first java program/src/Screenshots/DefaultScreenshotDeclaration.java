package Screenshots;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DefaultScreenshotDeclaration {
	

	
	public static void Scrneeshot(WebDriver driver) throws Exception {
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
File Gs= ts.getScreenshotAs(OutputType.FILE);
	//we can provide screenshot with name or we can directly give time as well. 
//FileUtils.copyFile(Gs,new File("./Screenshot/"+ScreenshotName+".png"));
FileUtils.copyFile(Gs,new File("./Screenshot/"+System.currentTimeMillis()+".png"));
System.out.println("ScreenShot taken");
		
	}

}
