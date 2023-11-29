package Dev_Smoke;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Heliosz_Service.Reuseable_Method;

public class campaign_simulation extends Driver_initialization{

	static Webelements pojo= new Webelements();

	 static Reuseable_Method extent_report = new Reuseable_Method();
	 
	 static Utils_event screenshot = new Utils_event();
	 
	 public static void campaign_simulation_screen() throws InterruptedException {
		 
		 extent_report.test=extent_report.report.startTest("campaign_simulation_Screen");
		 time();
		 pojo.Campaign_simulation_tab.click();
		 time();
		 //Sales_tab_Category
		 Category();
		 time();
		//Sales_tab_Brand
		 Brand();
		//Sales_tab_Amount
		 pojo.Impression_Amount.clear();
		 time();
		 pojo.Impression_Amount.sendKeys("2739.9");
		 time();
		 //Impress_tab
		 common_tabs("Impression");
		 time();
		 //Impression_tab_Category
		 Impression_Category();
		 //Impression_tab_Brand
		 Impression_Brand();
		 time();
		 //Imopression_tab_Amount
		 pojo.Impression_Amount.clear();
		 time();
		 pojo.Impression_Amount.sendKeys("2739.9");
		 
		 //S-Curve_tab
		 common_tabs("S-Curve");
		 time();
		 //S-Curve_Brand
     	S_Curve_graph_Brand();
		 time();
		 //S-Curve_Channel
		 S_Curve_graph_sub_Brand_channel();
		 time();
		 //screenshot.Scrolldown(pojo.S_curve_scroll_down_table);
		//S-Curve_table_Brand
		// S_Curve_table_Brand();
		// time();
	//	common_tabs("Budget Allocation");
		time();
		pojo.budget_amt_text.sendKeys("272.29");
		time();
		pojo.budget_submit_button.click();
		time();
		Budget_Allocation_Brand();
		 
		extent_report.report.endTest(extent_report.test);
		//extent_report.report.flush();
	 }
	 
	//Sales_Category_Dropdown_Field
	 
	 public static void Category() throws InterruptedException {
			
		 String arr[] = { "Eye", "Face", "Hair", "Lip", "Nail", "Skin care" } ;	
			
			for (int i=0;i<arr.length;i++) {
				time();
				pojo.Impression_category_dropdown.click();
				WebElement findElement = driver.findElement(By.xpath("//mat-option/span[contains(text(),'"+arr[i]+"')]"));
				time();
				findElement.click();
				time();
				try {
				 List<WebElement> list_ele = driver.findElements(By.cssSelector("rect[class='bar']"));
				 
				 if(list_ele.size()>0) {
					 extent_report.test.log(LogStatus.PASS, "Bar Graph line is displayed based on Category - "+arr[i]+"");
				 }

				}
				catch
					
					(NoSuchElementException e) {
					 extent_report.test.log(LogStatus.FAIL, "Bar Graph line is not displayed based on Category - "+arr[i]+"");
						extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
				}
				 
			}
			
			//For Closing the Dropdown filed
			//driver.findElement(By.xpath("//mat-option/span[contains(text(),'Eye')]")).click();
		}
	 
	 
//Sales_Brand_Dropdown_Field
	 
	 public static void Brand() throws InterruptedException {
		 
		 String arr[] = { "A", "B", "C"} ;	
			
			for (int i=0;i<arr.length;i++) {
				time();
				pojo.Impression_Brand_dropdown.click();
				WebElement findElement = driver.findElement(By.xpath("//mat-option/span[normalize-space((text())='Brand "+arr[i]+"')]"));
				time();
				findElement.click();
				try {
				 List<WebElement> list_ele = driver.findElements(By.cssSelector("rect[class='bar']"));
				 
				 if(!list_ele.isEmpty()) {
					 extent_report.test.log(LogStatus.PASS, "Bar Graph line is displayed based on Brand -"+arr[i]+"");
				 }

				}
				catch
					
					(NoSuchElementException e) {
					 extent_report.test.log(LogStatus.FAIL, "Bar Graph line is not displayed based on Brand -"+arr[i]+"");
						extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
				}
				 
			}
			time();
			
		}
	 
	 
	 public static void common_tabs(String Tab_name) {
		 
		 driver.findElement(By.xpath("//div[@role='tab']//span[normalize-space(text())='"+Tab_name+"']")).click();
	 }
	 
	 
//Impression_Category_dropdown_Field	 
	 
	 public static void Impression_Category() throws InterruptedException {
			
		 String arr[] = { "Eye", "Face", "Hair", "Lip", "Nail", "Skin care" } ;	
			
			for (int i=0;i<arr.length;i++) {
				time();
				pojo.Impression_category_dropdown.click();
				WebElement findElement = driver.findElement(By.xpath("//mat-option/span[contains(text(),'"+arr[i]+"')]"));
				time();
				findElement.click();
				time();
				try {
				 List<WebElement> list_ele = driver.findElements(By.cssSelector("path[fill='none']"));
				 
				 if(list_ele.size()>0) {
					 extent_report.test.log(LogStatus.PASS, "Path Graph line is displayed based on Category - "+arr[i]+"");
				 }

				}
				catch
					
					(NoSuchElementException e) {
					 extent_report.test.log(LogStatus.FAIL, "Path Graph line is not displayed based on Category - "+arr[i]+"");
						extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
				}
				 
			}
			
		
		}
	 
	 
//Impression Brand Dropdown field	 
	 
public static void Impression_Brand() throws InterruptedException {
		 
		 String arr[] = { "A", "B", "C"} ;	
			
			for (int i=0;i<arr.length;i++) {
				time();
				pojo.Impression_Brand_dropdown.click();
				WebElement findElement = driver.findElement(By.xpath("//mat-option/span[normalize-space((text())='Brand "+arr[i]+"')]"));
				time();
				findElement.click();
				try {
				 List<WebElement> list_ele = driver.findElements(By.cssSelector("path[fill='none']"));
				 
				 if(!list_ele.isEmpty()) {
					 extent_report.test.log(LogStatus.PASS, "Path Graph line is displayed based on Brand -"+arr[i]+"");
				 }

				}
				catch
					
					(NoSuchElementException e) {
					 extent_report.test.log(LogStatus.FAIL, "Path Graph line is not displayed based on Brand -"+arr[i]+"");
						extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
				}
				 
			}
			time();
			
		}
	 
 //S-Curve_Brand_Dropdown


public static void  S_Curve_graph_Brand() throws InterruptedException {
	 
	 String arr[] = { "A","B", "C", "D", "E","A"} ;	
		
		for (int i=0;i<arr.length;i++) {
			time();
			pojo.S_curve_Graph_brand_dropdown.click();
			//WebElement findElement = driver.findElement(By.xpath("//heliosz-scurve-graph-template//mat-select[@formcontrolname='brandFormControl']//span[normalize-space(text())='Brand "+arr[i]+"')]"));
			WebElement findElement = driver.findElement(By.xpath("//mat-option//span[contains(text(),' Brand "+arr[i]+"')]"));
			time();
			findElement.click();
			time();
			try {
			 List<WebElement> list_ele = driver.findElements(By.cssSelector("circle[fill='transparent']"));
			 
			 if(!list_ele.isEmpty()) {
				 extent_report.test.log(LogStatus.PASS, "S_Curve Graph line is displayed based on Brand -"+arr[i]+"");
			 }

			}
			catch
				
				(NoSuchElementException e) {
				 extent_report.test.log(LogStatus.FAIL, "S_Curve Graph line is not displayed based on Brand -"+arr[i]+"");
					extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
			}
			 
		}
//		WebElement findElement = driver.findElement(By.xpath("//mat-option//span[contains(text(),' Brand E')]"));
//		findElement.click();
		//common_tabs("S-Curve");
		time();
		
	}

//Brand sub channel dropdown top right side in the screen

public static void  S_Curve_graph_sub_Brand_channel() throws InterruptedException {
	 
	 String arr[] = { "AMS", "AMZ", "Owned Site", "Partner Site / E Retail"} ;	
		
		for (int i=0;i<arr.length;i++) {
			time();
			pojo.S_curve_graph_subchannel_dropdown.click();
			//WebElement findElement = driver.findElement(By.xpath("//heliosz-scurve-graph-template//mat-select[@formcontrolname='channelFormControl']//span[normalize-space(text())='Brand "+arr[i]+"')]"));
			WebElement findElement = driver.findElement(By.xpath("//mat-option/span[contains(text(),'"+arr[i]+"')]"));
			
			time();
			findElement.click();
			try {
			 List<WebElement> list_ele = driver.findElements(By.cssSelector("circle[fill='transparent']"));
			 
			 if(!list_ele.isEmpty()) {
				 extent_report.test.log(LogStatus.PASS, "S_Curve Graph line is displayed based on SubChannel -"+arr[i]+"");
			 }

			}
			catch
				
				(NoSuchElementException e) {
				 extent_report.test.log(LogStatus.FAIL, "S_Curve Graph line is not displayed based on SubChannel -"+arr[i]+"");
					extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
			}
			 
		}
		//pojo.S_curve_Graph_brand_dropdown_brand_A.click();
		time();
		common_tabs("Budget Allocation");
	}
	 

// Brand dropdown based on table bottum on the screen
	  
public static void S_Curve_table_Brand() throws InterruptedException {
	
	String arr[] = { "B", "C", "D", "E"} ;	
	
	for (int i=0;i<arr.length;i++) {
	time();
	pojo.S_curve_table_brand_dropdown.click();
	WebElement findElement = driver.findElement(By.xpath("//heliosz-scurve-table-template//mat-select[@formcontrolname='brandFormControl']//span[normalize-space(text())='Brand "+arr[i]+"')]"));
	//WebElement findElement = driver.findElement(By.xpath("//mat-option//span[contains(text(),' Brand "+arr[i]+"')]"));
	time();
	findElement.click();
	List<WebElement> findElements = driver.findElements(By.xpath("//tr//td"));
	time();
	for(WebElement element : findElements) {
		
		String text = element.getText();
		
		if(text!=null) {
			extent_report.test.log(LogStatus.PASS, "AMZ, AMS, Partner Site/E Retail and Owned Site columns have values");
			System.out.println("have values");
			break;
		}
		else {
			extent_report.test.log(LogStatus.FAIL, "AMZ, AMS, Partner Site/E Retail and Owned Site columns doesn't have values");
			extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
		}
	}
	time();
	}
}
	 
	 
//Budget Allocation_Brand_Dropdown_Field

	 public static void Budget_Allocation_Brand() throws InterruptedException {
		 
		 String arr[] = {"B", "C", "D", "E"} ;	
			
			for (int i=0;i<arr.length;i++) {
				time();
				pojo.Impression_Brand_dropdown.click();
				WebElement findElement = driver.findElement(By.xpath("//mat-option/span[normalize-space((text())='Brand "+arr[i]+"')]"));
				time();
				findElement.click();
				time();
				pojo.budget_submit_button.click();
				time();
				try {
					
				 List<WebElement> list_ele = driver.findElements(By.xpath("//div[@class='bar-width']"));
				 
				 if(!list_ele.isEmpty()) {
					 extent_report.test.log(LogStatus.PASS, "Budget_Allocation_Bar_width_Graph is displayed based on Brand -"+arr[i]+"");
				 }

				}
				catch
					
					(NoSuchElementException e) {
					 extent_report.test.log(LogStatus.FAIL, "Budget_Allocation_Bar_width_Graph is not displayed based on Brand -"+arr[i]+"");
						extent_report.test.log(LogStatus.INFO,extent_report.test.addBase64ScreenShot("data:image/png;base64,"+ screenshot.report_Screenshot()));
				}
				 
			}
			time();
			
		}	 
	 
	 
	 
	 
	 
	 
	 
	 }



