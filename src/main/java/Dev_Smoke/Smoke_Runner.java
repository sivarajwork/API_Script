package Dev_Smoke;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Smoke_Runner extends Driver_initialization {

	Webelements pojo;
	
	@Test
	
	public static void login() throws InterruptedException {
		
		Login_Module.Login();
	}

	@Test(priority=2,enabled=true)
	
	public static void Calendar_Tab() throws InterruptedException {
		
		Calendar_Module.calendar_screen();
	}
	
	@Test(priority=1,enabled=false)
	
	public static void Dashboard_Tab() throws InterruptedException {
		
		Dashboard.Dashboard_Screen();
	}
	
	
	@Test(priority=7,enabled=false)
	
	public static void content_Optimization_tab() throws InterruptedException {
		
		Content_Optimization.Content_Optimization_module();
	}

	
	@Test(priority=3,enabled=false)
	
	public static void Campaign_Analysis_tab() throws InterruptedException {
		
		Campaign_Analysis.Campaign_Analysis_module();
	}
	
	@Test(priority=4,enabled=false)
	
	public static void campaign_simulation_tab() throws InterruptedException {
		
		campaign_simulation.campaign_simulation_screen();
	}
	
	@Test(priority=6,enabled=false)
	
	public static void Data_Clean_Room_tab() throws InterruptedException {
		Data_Clean_Room_Module.Data_Clean_Room_screen();
	}
	
	@Test(priority=5,enabled=false)
	
	public static void MMM_tab() throws InterruptedException {
		
		MMM_Module.MMM_Module_Screen();
	}
}
