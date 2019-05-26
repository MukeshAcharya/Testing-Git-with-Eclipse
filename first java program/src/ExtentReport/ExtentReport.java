package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
		
	public static void ExReport(){
	
	ExtentHtmlReporter htmlreport= new ExtentHtmlReporter("./Reports/Screenshots.html");
	
	ExtentReports report= new ExtentReports();
	report.attachReporter(htmlreport);
	
	ExtentTest logger=report.createTest("Testing it for screenshots");
	
	logger.log(Status.INFO, "this is for screenshot purpose only");
	
	logger.log(Status.PASS, "Title Verified");
	
	report.flush();

	}

}
