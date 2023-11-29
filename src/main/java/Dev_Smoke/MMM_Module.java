package Dev_Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Heliosz_Service.Reuseable_Method;

public class MMM_Module extends Driver_initialization{

	static Webelements pojo= new Webelements();

	 static Reuseable_Method extent_report = new Reuseable_Method();
	 
	 static Utils_event screenshot = new Utils_event();
	 
	 public static void MMM_Module_Screen() throws InterruptedException {
		 extent_report.test=extent_report.report.startTest("MMM_Screen");
		 pojo.MMM_tab.click();
		 time();
		 screenshot.Scrolldown(pojo.Scroll_to_bar_garph);
		 time();
		 Channel_dropdown();
		 time();
		 pojo.MMM_Global_filter.click();
		 time();
		 Category_option();
		 time();
		 extent_report.report.endTest(extent_report.test);
	     //extent_report.report.flush();
	 }
	 
	 
	 
	 
	 public static void Channel_dropdown() throws InterruptedException {
		 
		 String arr[] = {"Amazon","Digital Display"};
		 
		 for(int i=0;i<arr.length;i++) {
			 pojo.MMM_Channel_dropdown.click();
			   WebElement findElement = driver.findElement(By.xpath("//mat-option/span[contains(text(),'"+arr[i]+"')]"));
				 findElement.click();
				 try {
					 List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='card-container-right']//div[@class='mmm-label']/ul/li"));
					 if(!findElements.isEmpty()) {
						 extent_report.test.log(LogStatus.PASS, "MMM_Labels is displayed based on Brand -"+arr[i]+"");
					 }
				 }
				 catch(NoSuchElementException e){
					 extent_report.test.log(LogStatus.FAIL, "MMM_Labels are not displayed based on Brand -"+arr[i]+"");
						extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
				 }
		 }
  
		 time();
	 }



	 public static void Category_option() throws InterruptedException {
				pojo.MMM_Category_filter.click();
			 driver.findElement(By.xpath("//mat-option/span[contains(text(),'Eye')]")).click();
			// driver.findElement(By.xpath("//mat-option/span[contains(text(),'Eye')]")).click();
			time();
			pojo.MMM_Brand_filter.click();
			time();
			pojo.MMM_Brand_Option_Filter.click();
			time();
			
			try {
				pojo.MMM_clear_button_flter.click();
				 extent_report.test.log(LogStatus.PASS, "Clear button is clickable");
				 time();
				pojo.MMM_Cancel_button_filter.click();
				extent_report.test.log(LogStatus.PASS, "Cancel button is clickable");
				 
			}
			catch(NoSuchElementException e){
				extent_report.test.log(LogStatus.FAIL, "Clear button is not clickable");
				extent_report.test.log(LogStatus.FAIL, "Cancel button is not clickable");
			}
			
		}
	 }



