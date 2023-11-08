package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	WebDriver driver= null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.setProperty("webdriver.chrome.driver","C:/Users/KOMPUTER/eclipse-workspace/Cucumbertest/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@And("User is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(3000);
	}

	@And("click on login	 button")
	public void click_on_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("user proceed to home page")
	public void user_proceed_to_home_page() throws InterruptedException {
		driver.getPageSource().contains("Logged In Successfully");
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
