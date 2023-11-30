package Dev_Smoke;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovy.transform.Final;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Webelements extends Driver_initialization {


	public Webelements() {
		PageFactory.initElements(driver, this);
		}
	
	
	//Login_Page
	
	@FindBy(xpath="//input[@type='email']")
	 public WebElement emailid;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	public WebElement signin;
	
	@FindBy(xpath="//div[contains(text(),('Marketing Management'))]")
	public WebElement marketing_management;
	
	
	//Calendar_Screen
	
	@FindBy(xpath="//div[@class='heliosz-menu']/ul/li[contains(text(),'Calendar')]")
	public WebElement Calendar_tab;
	
	@FindBy(xpath="//div[@class='tab-menus ng-star-inserted']/ul/li[contains(text(),'New Campaign ')]")
	public WebElement New_Campaign;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	public WebElement Calendar_Cancel_button;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement Calendar_Save_button;
	
	@FindBy(xpath="//input[@placeholder='Campaign Name']")
	public WebElement Campaign_name;
	
	@FindBy(xpath="//div[@class='form-group']/descendant::mat-select[@formcontrolname='category']")
	public WebElement Category_dropdown;
	
	@FindBy(xpath="//div[@class='form-group']/descendant::mat-select[@formcontrolname='brand']")
	public WebElement Brand_dropdown;
	
	@FindBy(xpath="//div[@class='form-group']/descendant::mat-select[@formcontrolname='channelType']")
	public WebElement Channel_Type_Dropdown;
	
	@FindBy(xpath="//div[@class='form-group']/descendant::mat-select[@formcontrolname='channel']")
	public WebElement Channel_dropdown;
	
	@FindBy(xpath="//input[@placeholder='Cost']")
	public WebElement cost;
	
	@FindBy(xpath="//mat-option//span[contains(text(),'Eye')]")
	public WebElement Category_option;
	
	@FindBy(xpath="//mat-option//span[contains(text(),' Brand B ')]")
	public WebElement Brand_option;
	
	@FindBy(xpath="//mat-option//span[contains(text(),'Amazon ')]")
	public WebElement Channel_Type_option;
	
	@FindBy(xpath="//mat-option//span[contains(text(),' AMS ')]")
	public WebElement Channel_option;
	
	@FindBy(xpath="//mat-form-field[@appearance='outline']/descendant::input[@placeholder='Start Date']")
	public WebElement Start_Date;
	
	@FindBy(xpath="//mat-form-field[@appearance='outline']/descendant::input[@placeholder='End Date']")
	public WebElement End_Date;
	
	@FindBy(xpath="//simple-snack-bar/div")
	public WebElement Success_toaster_message;
	
	@FindBy(xpath="//input[@placeholder='Cost']")
	public WebElement Update_screen_cost;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public WebElement Update_Screen_update_button;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	public WebElement Update_Screen_cancel_button;
	
	@FindBy(xpath="//simple-snack-bar/div")
	public WebElement update_message;
	
	
	//Calendar Header Dropdown options
	
	@FindBy(xpath="//div/span[contains(text(),'Brand')]")
	public WebElement Brand_Header_dropdown;
	
	@FindBy(xpath="//div/span[contains(text(),'Category')]")
	public WebElement Category_Header_dropdown;
	
	@FindBy(xpath="//mat-select[@placeholder='Channel']")
	public WebElement Channel_Header_dropdown;
	
	@FindBy(xpath="//mat-select[@placeholder='Channel Type']")
	public WebElement Channel_type_Header_dropdown;
	
	@FindBy(xpath="//mat-option[@role='option']/span[contains(text(),' Brand A ')]")
	public WebElement Brand_header_option;
	
	@FindBy(xpath="//mat-option[@role='option']/span[contains(text(),' Eye ')]")
	public WebElement Category_header_option;
	
	@FindBy(xpath="//mat-option[@role='option']/span[contains(text(),' Owned Site ')]")
	public WebElement Channel_header_option;
	
	@FindBy(xpath="//mat-option[@role='option']/span[contains(text(),' Amazon ')]")
	public WebElement Channel_type_header_option;
	
	@FindBy(xpath="//button[contains(text(),'Reset Filter')]")
	public WebElement Reset_Filter_button;
	
	
	//Export button
	
	@FindBy(xpath="//div[@class='tab-menus ng-star-inserted']//li[2]")
	public WebElement export_button;
	
	//All Campaign Date tab
	
	@FindBy(xpath="//li[contains(text(),'All Campaign Date')]")
	public WebElement Monthly_tab;
	
	//Logout button
	
	@FindBy(xpath="//div[@class='user-profile dropdown']")
	public WebElement logout;
	
	//Dashboard_Screen_Tab
	
	@FindBy(xpath="//ul/li[contains(text(),'Dashboard')]")
	public WebElement Dashboard_tab;
	
	@FindBy(xpath="//mat-select[@placeholder='Channel Type']")
	public WebElement Dashboard_Channel_Type_dropdown;
	
	@FindBy(xpath="//mat-select[@placeholder='Channel']")
	public WebElement Dashboard_Channel_dropdown;
	
	@FindBy(xpath="//mat-option/span[contains(text(),'Amazon')]")
	public WebElement Dashboard_channel_type_option;
	
	@FindBy(xpath="//mat-option/span[contains(text(),'AMS')]")
	public WebElement Dashboard_channel_option;
	
	
	//Content Optimization
	
	@FindBy(xpath="//ul/li[contains(text(),' Content Optimization')]")
	public WebElement content_optimization_tab;
	
	@FindBy(xpath="//input[@type='file']")
	public WebElement upload_button;

	@FindBy(xpath="//button[normalize-space(text())='Get Score']")
	public WebElement get_score;
	
	@FindBy(xpath="//button[normalize-space(text())='Delete']")
	public WebElement delete_image;
	
	
	//campaign_analysis_tab
	
	@FindBy(xpath="//ul/li[contains(text(),'Campaign Analysis')]")
	public WebElement campaign_analysis_tab;
	
	@FindBy(xpath="//mat-select[@placeholder='Brand']")
	public WebElement CA_brand_dropdown;
	
	@FindBy(xpath="//mat-select[@placeholder='Channel']")
	public WebElement CA_channel_dropdwon;
	
	@FindBy(xpath="//mat-option//span[contains(text(),'Digital Display')]")
	public WebElement CA_channel_option;
	
	@FindBy(xpath="//input[@type='checkbox'and @id='mat-mdc-checkbox-2-input']")
	public WebElement incremental_sale;
	
	@FindBy(xpath="//input[@type='checkbox'and @id='mat-mdc-checkbox-3-input']")
	public WebElement impression;
	
	@FindBy(xpath="//input[@type='checkbox'and @id='mat-mdc-checkbox-4-input']")
	public WebElement clicks;
	
	
	//Campaign Simulation_Screen
	
	@FindBy(xpath="//ul/li[contains(text(),'Campaign Simulation')]")
	public WebElement Campaign_simulation_tab;

	@FindBy(xpath="//mat-select[@formcontrolname='categoryFormControl']")
	public WebElement Impression_category_dropdown;
	
	@FindBy(xpath="//mat-select[@formcontrolname='brandFormControl']")
	public WebElement Impression_Brand_dropdown;
 	
	@FindBy(xpath="//input[@placeholder='Enter Budget']")
	public WebElement Impression_Amount;
	
	@FindBy(xpath="//heliosz-scurve-graph-template//mat-select[@formcontrolname='brandFormControl']//span[normalize-space(text())='Brand A']")
	public WebElement S_curve_Graph_brand_dropdown_brand_A;
	
	@FindBy(xpath="//mat-select[@formcontrolname='brandFormControl']")
	public WebElement S_curve_Graph_brand_dropdown;
	
	@FindBy(xpath="//mat-select[@formcontrolname='channelFormControl']")
	public WebElement S_curve_graph_subchannel_dropdown;
	
	@FindBy(xpath="//heliosz-scurve-table-template//mat-select[@formcontrolname='brandFormControl']//span[normalize-space(text())='Brand B']")
	public WebElement S_curve_table_brand_dropdown;
	
//	@FindBy(xpath="//mat-select[@formcontrolname='brandFormControl']")
//	public WebElement S_curve_table_brand_dropdown;
	
	@FindBy(xpath="//mat-select[@formcontrolname='channelFormControl']//span[normalize-space(text())='AMS']")
	public WebElement S_curve_channel_dropdown;
	
	@FindBy(xpath="//tr[@class='border-right']//th[contains(text(),'Maximum Threshold')]")
	public WebElement S_curve_scroll_down_table;
	
	@FindBy(xpath="//ul/li[contains(text(),'Budget Allocation')]")
	public WebElement Budget_Allocation;
	
	@FindBy(xpath="//input[@formcontrolname='budgetFormControl']")
	public WebElement budget_amt_text;
	
	@FindBy(xpath="//button[normalize-space(text())='Submit']")
	public WebElement budget_submit_button;
	
	
	//Data Clean Room Tab
	 
	 @FindBy(xpath="//ul/li[contains(text(),'Data Clean Room')]")
	 public WebElement Data_Clean_Room_tab;
	 
	 @FindBy(xpath="//div[@class='mdc-switch__icons ng-star-inserted']")
	 public WebElement DMA_Region_toggle_button;
	
	 @FindBy(xpath="//div[@class='heliosz-header']//div[@class='header-icon'][2]")
	 public WebElement Data_Clean_Room_Global_filter;
	
	 @FindBy(xpath="//mat-select[@formcontrolname='fiscalYr']")
	 public WebElement Data_Clean_global_filter_fiscalyr;
	
	 @FindBy(xpath="//mat-option[@span=contains(text(),' FY - 2026 ')]")
	 public WebElement DC_global_filter_fiscalyr_option;
	 
	 @FindBy(xpath="//mat-select[@formcontrolname='brand']")
	 public WebElement DC_global_filter_brand;
	 
	 @FindBy(xpath="//mat-option//span[contains(text(),' Brand A ')]")
	 public WebElement DC_global_filter_brand_option;
	 
	 @FindBy(xpath="//mat-select[@formcontrolname='channelType']")
	 public WebElement Dc_global_filter_channeltype_dropdown;
	
	 @FindBy(xpath="//mat-option//span[contains(text(),' Amazon ')]")
	 public WebElement Dc_global_filter_channeltype_option;
	 
	 @FindBy(xpath="//button[contains(text(),'Apply')]")
	 public WebElement Dc_global_filter_Apply_button;
	 
	 @FindBy(xpath="//button[contains(text(),'Clear')]")
	 public WebElement Dc_global_filter_clear_button;
	
	//MMM Screen
		
		@FindBy(xpath="//ul/li[contains(text(),'MMM')]")
		public WebElement MMM_tab;
		
		@FindBy(xpath="//div[@class='mmm-label']/ul/li")
		public WebElement Scroll_to_bar_garph;
	
		@FindBy(xpath="//mat-select[@formcontrolname='channelFormControl']")
		public WebElement MMM_Channel_dropdown;
		
		@FindBy(xpath="//div[@class='heliosz-header']//div[@class='header-icon'][2]")
		 public WebElement MMM_Global_filter;
		
		@FindBy(xpath="//mat-select[@formcontrolname='category']")
		public WebElement MMM_Category_filter;
		
		@FindBy(xpath="//mat-select[@formcontrolname='brand']")
		public WebElement MMM_Brand_filter;
		
		@FindBy(xpath="//mat-option//span[contains(text(),'Brand A')]")
		public WebElement MMM_Brand_Option_Filter;
	
		@FindBy(xpath="//button[contains(text(),'Clear')]")
		public WebElement MMM_clear_button_flter;
		
		@FindBy(xpath="//button[contains(text(),'Cancel')]")
		public WebElement MMM_Cancel_button_filter;
		
		
		//MTA screen
		
				@FindBy(xpath="//ul/li[contains(text(),' Content Optimization')]")
				public WebElement MTA_tab;
				
				
				@FindBy(xpath="//div[@class='heliosz-header']//div[@class='header-icon'][2]")
				 public WebElement MTA_Global_filter;
		
	public static void start_Date_value(String start_date) {
		WebElement date = 	driver.findElement(By.xpath("//button/span[normalize-space(text())='"+start_date+"']"));
		date.click();
	}
	
	public static void particular_box(String start_date) {
		WebElement box = driver.findElement(By.xpath("//mwl-calendar-month-cell/descendant::span[contains(@class,'number') and contains(text(),'"+start_date+"')]/preceding-sibling::span"));
		box.click();
	}
	
	
	
}	





