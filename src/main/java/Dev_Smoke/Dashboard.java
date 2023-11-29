package Dev_Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Heliosz_Service.Reuseable_Method;

public class Dashboard extends Driver_initialization{

     static Webelements pojo= new Webelements();

	 static Reuseable_Method extent_report = new Reuseable_Method();
	 
	 static Utils_event screenshot = new Utils_event();
	 
	public static void Dashboard_Screen() throws InterruptedException {
		
		extent_report.test=extent_report.report.startTest("Dashboard_Screen");
		time();
		pojo.Dashboard_tab.click();
		time();
		pojo.Dashboard_Channel_Type_dropdown.click();
		time();
		pojo.Dashboard_channel_type_option.click();
		time();
		pojo.Dashboard_Channel_dropdown.click();
		time();
		pojo.Dashboard_channel_option.click();
		
		//Amount validation 
		time();
		dropdown_amt_values();
		
		extent_report.report.endTest(extent_report.test);
		//extent_report.report.flush();
	}
	
	public static void dropdown_amt_values() throws InterruptedException {
		
		List<WebElement> findElements = driver.findElements(By.xpath("//tr/td"));
		time();
		for(WebElement element : findElements) {
			
			String text = element.getText();
			
			if(text!=null) {
				extent_report.test.log(LogStatus.PASS, "Budget,Impression,Clicks columns have values");
				System.out.println("have values");
				break;
			}
			else {
				extent_report.test.log(LogStatus.FAIL, "Budget,Impression,Clicks columns doesn't have values");
				extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
			}
		}
	}
	

}
