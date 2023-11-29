package Dev_Smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Heliosz_Service.Reuseable_Method;

public class Data_Clean_Room_Module extends Driver_initialization{
	
	static Webelements pojo= new Webelements();

	 static Reuseable_Method extent_report = new Reuseable_Method();
	 
	 static Utils_event screenshot = new Utils_event();
	 
	 
	 public static void Data_Clean_Room_screen() throws InterruptedException {
		 
		 extent_report.test=extent_report.report.startTest("Data_Clean_Room_Screen");
		 time();
		 pojo.Data_Clean_Room_tab.click();
		 time();
		 pojo.DMA_Region_toggle_button.click();
		 time();
		 pojo.Data_Clean_Room_Global_filter.click();
		 time();
		 pojo.Data_Clean_global_filter_fiscalyr.click();
		 time();
		 pojo.DC_global_filter_fiscalyr_option.click();
	
		 time();
		 pojo.DC_global_filter_brand.click();
		 time();
		 pojo.DC_global_filter_brand_option.click();
		 time();
		 channeltype();
		 pojo.Dc_global_filter_Apply_button.click();
		 
			extent_report.report.endTest(extent_report.test);
			//extent_report.report.flush();
	 }
	 
	 public static void channeltype() {
		 
		 WebElement findElement = driver.findElement(By.xpath("//mat-select[@formcontrolname='channelType']"));
		 findElement.click();
		 
		 try {
			 pojo.Dc_global_filter_channeltype_option.isDisplayed();
			 pojo.Dc_global_filter_channeltype_option.click();
			 extent_report.test.log(LogStatus.PASS, "Channel Type dropdown is dispalyed in global filter");
		 }
		catch (Exception e) {
			 extent_report.test.log(LogStatus.FAIL, "Channel Type dropdown is not dispalyed in global filter");
		}
		 
	
	 }
	 
	 public static void filter() throws InterruptedException {
		 pojo.Data_Clean_global_filter_fiscalyr.click();
		 time();
		 pojo.DC_global_filter_fiscalyr_option.click();
		 time();
		 pojo.DC_global_filter_brand.click();
		 time();
		 pojo.DC_global_filter_brand_option.click();
		 
	 }
	 
	 
	 
}
