package Dev_Smoke;

import Heliosz_Service.Reuseable_Method;

public class MTA_module extends Driver_initialization {

	
		
	    static Webelements pojo= new Webelements();
		
		static Reuseable_Method extent_report = new Reuseable_Method();

		public static void MTA_Screen() throws InterruptedException {
			
			pojo.MTA_tab.click();
			time();
			pojo.MTA_Global_filter.click();
			
		}
}
