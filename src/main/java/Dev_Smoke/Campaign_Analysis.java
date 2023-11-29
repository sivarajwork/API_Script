package Dev_Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Heliosz_Service.Reuseable_Method;

public class Campaign_Analysis extends Driver_initialization{

	 static Webelements pojo= new Webelements();

	 static Reuseable_Method extent_report = new Reuseable_Method();
	 
	 static Utils_event screenshot = new Utils_event();
	 
	public static void Campaign_Analysis_module() throws InterruptedException {
		
		extent_report.test=extent_report.report.startTest("Campaign_Analysis_Screen");
		time();
		pojo.campaign_analysis_tab.click();
		time();
		
		//dropdown validation
		Brand_Dropdown();
		time();	
		//Graph validation
		graph_checkbox_validation();
		
		//drodown validation
		Dropdown_option_event("Channel", "Channel dropdown is not working");
		time();
		Dropdown_suboption_event("Digital Display", "Channel option are not clickable");
		time();
		Dropdown_option_event("Year", "FY Year dropdown is not working");
		time();
		Dropdown_suboption_event("FY - 2022", "FY Year option are not clickable");
		time();
		Graph_bar_validation_basedon_FY_years("FY-Year");
		
		extent_report.report.endTest(extent_report.test);
		//extent_report.report.flush();
	}
	
	
	public static void Brand_Dropdown() throws InterruptedException {
		
		String arr[] = { "A", "B", "C", "D", "E" } ;	
		
		for (int i=0;i<arr.length;i++) {
			
			time();
			pojo.CA_brand_dropdown.click();
			WebElement findElement = driver.findElement(By.xpath("//mat-option/span[contains(text(),'Brand "+arr[i]+"')]"));
			findElement.click();
			time();
			try {
			 List<WebElement> list_ele = driver.findElements(By.cssSelector("rect[class=bar]"));
			 
			 if(list_ele.size()>0) {
				 extent_report.test.log(LogStatus.PASS, "graph bar displayed  "+arr[i]+"");
			 }
//			 else {
//				 extent_report.test.log(LogStatus.FAIL, "graph bar not display");
//				extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
//
//			 }
			}
			catch
				
				(NoSuchElementException e) {
				 extent_report.test.log(LogStatus.FAIL, "graph bar not display");
					extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
			}
				
			 
		}
		
//		try {
//		
//		WebElement Channel_dropdown = driver.findElement(By.xpath("//mat-select[@placeholder='Channel']"));
//		Channel_dropdown.click();
//		}
//		
//		catch
//		(NoSuchElementException e) {
//			 extent_report.test.log(LogStatus.FAIL, "Channel dropdown not working");
//				extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
//		}
	}
	
	public static void graph_checkbox_validation() {
		
		
		pojo.impression.click();
		pojo.clicks.click();
		try {
			 List<WebElement> list_ele = driver.findElements(By.cssSelector("rect[class=bar]"));
			 
			 if(list_ele.size()>0) {
				 extent_report.test.log(LogStatus.PASS, "Impression and Clicks graph bar displayed");
			 }
		}
		catch
			(NoSuchElementException e) {
			 extent_report.test.log(LogStatus.FAIL, "Impression and Clicks graph bar not display");
				extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
		}
	
	
	}
	
	public static void Dropdown_option_event(String dropdown_Names, String error_message) 
	{
		try {
			WebElement findElement = driver.findElement(By.xpath("//mat-select[@formcontrolname='"+dropdown_Names+"']"));
			findElement.click();
			System.out.println("channel dropdown click ");
		}
			
			catch
			(NoSuchElementException e) {
				 extent_report.test.log(LogStatus.FAIL, error_message);
					extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
			}
	}
	
	public static void Dropdown_suboption_event(String dropdown_Option_Names, String error_message) 
	{
		try {
			WebElement findElement = driver.findElement(By.xpath("//mat-option//span[contains(text(),'"+dropdown_Option_Names+"')]"));
			findElement.click();
			System.out.println("channel dropdown click ");
		}
			
			catch
			(NoSuchElementException e) {
				 extent_report.test.log(LogStatus.FAIL, error_message);
					extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
			}
	}
	
	public static void Graph_bar_validation_basedon_FY_years(String years) {
	
	try {
		 List<WebElement> list_ele = driver.findElements(By.cssSelector("rect[class=bar]"));
		 
		 if(list_ele.size()>0) {
			 extent_report.test.log(LogStatus.PASS, ""+years+"graph bar displayed");
		 }
//		 else {
//			 extent_report.test.log(LogStatus.FAIL, "graph bar not display");
//			extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
//
//		 }
		}
		catch
			
			(NoSuchElementException e) {
			 extent_report.test.log(LogStatus.FAIL, ""+years+"graph bar is not displayed");
				extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
		}
}
}
