package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginStepDefinitions {
	public WebDriver driver=null;
	@Given("open Browser")
	public void open_Browser() {
	   driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("Enter the url {string}")
	public void enter_the_url(String url) {
		 driver.get(url);
	}

	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String userName, String password) {
	   driver.findElement(By.name("uid")).sendKeys(userName);
	   driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("Click on login Button")
	public void click_on_login_Button() {
	   driver.findElement(By.name("btnLogin")).click();
	}

	@Then("Validate with title after login successful")
	public void validate_with_title_after_login_successful() {
		
		try {
			Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		}
		catch (Exception e) {
			Assert.assertTrue(false);
		}
	}
	@Then("Verify login")
	public void verify_login() {
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			System.out.println("Logged in Succesfully");
		else {
			try {
			System.out.println("Invalid Login ");
			Alert alert=driver.switchTo().alert();
			alert.accept();
			}
			catch(Exception e) {
				System.out.println("Alert not present");
			}
		}
	}

	@And("Close the Browser")
	public void close_the_Browser() {
	   driver.quit();
	}
}
