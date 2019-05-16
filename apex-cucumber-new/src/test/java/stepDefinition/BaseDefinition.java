package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BaseDefinition {
	WebDriver driver;
	@Given("Open Browser")
	public void open_Browser() {
	   driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Then("Close Browser")
	public void close_Browser() {
	    driver.close();
	}
}
