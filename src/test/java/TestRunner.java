import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestRunner {
	WebDriver driver;
	
	
		
		@Before
		public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET 101\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
//		  test.log(LogStatus.PASS, "Browser successfully opend");
		  
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      
	      driver.manage().window().maximize();
		}
		
		@org.junit.Test
		public void fill_form() throws InterruptedException {
			
			
			driver.findElement(By.id("autocomplete")).sendKeys("Karan");
			Thread.sleep(1000);
		}
		
		
		
		@After
		public void tearUp() {
			driver.close();
		}
		
}
