package Com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	    public WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();  
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://testffc.nimapinfotech.com/");
	    }
	    

	    @AfterMethod
	    public void tearDown() {
	    	
	    
	            driver.quit();
	        }
	    
}

