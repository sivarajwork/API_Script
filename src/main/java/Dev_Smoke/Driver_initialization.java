package Dev_Smoke;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver_initialization {
	
	public static String  QA_env= "http://192.168.2.11/login";
	

	public static RemoteWebDriver driver;
	
	@SuppressWarnings("unused")
	@BeforeClass
	
	
	public static void browserlaunch() throws InterruptedException 
	
	{
		try {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		String path = System.getProperty("user.dir");
        String downloadFilepath = path+"\\Downloads";
        Map<String, Object> prefs = new HashMap<String, Object>(); 
        prefs.put("credentials_enable_service", false);  
        prefs.put("profile.password_manager_enabled", false);  
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("download.default_directory", downloadFilepath);
        chromeOptions.setExperimentalOption("prefs", prefs); 
        chromeOptions.setExperimentalOption("excludeSwitches", "disable-popup-blocking"); 
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
        chromeOptions.addArguments("--remote-allow-origins=*");  //added
        chromeOptions.addArguments("--window-size=1920,1080"); //added
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(QA_env);
	
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	
	
	public static void time() throws InterruptedException {
		
		Thread.sleep(2000);
	}
	
	public static void explicity(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	wait.until(ExpectedConditions.visibilityOf(element));
	}
}
