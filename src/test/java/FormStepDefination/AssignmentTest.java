package FormStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class AssignmentTest {

	
		WebDriver driver;
		@Given("I want to write a step with precondition")
		public void i_want_to_write_a_step_with_precondition() {
		    // Write code here that turns the phrase above into concrete actions
              
			 System.setProperty("webdriver.chrome.driver", "D:\\SDET 101\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://v1.training-support.net/selenium/simple-form");
		}

		@Given("some other precondition")
		public void Name() {
               
//			Enter the name of user
			driver.findElement(By.id("firstName")).sendKeys("Pradeep");
		}

		@io.cucumber.java.en.When("I complete action")
		public void LastName() {
		    
			driver.findElement(By.id("lastName")).sendKeys("Chakrawarti");
		}

		@io.cucumber.java.en.When("some other action")
		public void Email() {
                 
			driver.findElement(By.id("email")).sendKeys("pradeep@gmai.com");
		}

		@io.cucumber.java.en.When("yet another action")
		public void Contact() {

			driver.findElement(By.xpath("//input[@placeholder='9876543210']")).sendKeys("7879646297");
			
		}

		@io.cucumber.java.en.When("I validate the outcomes")
		public void message() {

			driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("Task have done");
		}

		@io.cucumber.java.en.When("check more outcomes")
		public void Submit_form() {
         
			//input[@type='submit']
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}

		@Given("I want to write a step with name{int}")
		public void ClearForm() {
             driver.findElement(By.xpath("//input[@type='reset']")).click();
		}

		

	
}
