package Dev_Smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Heliosz_Service.Reuseable_Method;

public class Content_Optimization extends Driver_initialization{
	
	 static Webelements pojo= new Webelements();

	 static Reuseable_Method extent_report = new Reuseable_Method();
	 
	 static Utils_event screenshot = new Utils_event();
	 
	 static String uploaded_file ="C:\\Users\\sivaraj\\eclipse-workspace\\API_Test\\target\\nike.jpg";
	 
	public static void Content_Optimization_module() throws InterruptedException {
		
		extent_report.test=extent_report.report.startTest("Content_Optimization_Screen");
		time();
        pojo.content_optimization_tab.click();
		time();
		
		WebElement upload_file = driver.findElement(By.xpath("//div[contains(@class,'upload-container')]/input"));
		//explicity(upload_file);
		upload_file.sendKeys(uploaded_file);
		extent_report.test.log(LogStatus.PASS, "File uploaded");
		extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
	//	pojo.upload_button.sendKeys(uploaded_file);
		time();
		pojo.get_score.click();
		time();
		try {
		pojo.delete_image.click();
		extent_report.test.log(LogStatus.PASS, "File deleted Successfully");
		}
		catch (Exception e) {
			extent_report.test.log(LogStatus.PASS, "File not deleted");
			extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
		}
		
		
		extent_report.report.endTest(extent_report.test);
		extent_report.report.flush();
	}

}
