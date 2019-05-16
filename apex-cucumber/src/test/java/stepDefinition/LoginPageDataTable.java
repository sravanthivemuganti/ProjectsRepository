package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginPageDataTable {
	WebDriver driver;

	
	@Given("Open Browser")
	public void open_Browser() {
	  driver =new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Enter Login url {string}")
	public void enter_Login_url(String url) {
	    driver.get(url);
	}
	
	@Given("Click on the Account and Click on Login Link")
	public void click_on_the_Account_and_Click_on_Login_Link() {
		driver.findElement(By.xpath("//a/span[contains(text(),'Account')]")).click();
		driver.findElement(By.linkText("Log In")).click();
	}
	
	@When("Enter user login details")
	public void enter_user_login_details(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(data.get(0).get(1));
	}

	@When("Click on the Login Button")
	public void click_on_the_Login_Button() {
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();  
	}

	
	  @Then("I validate data") public void i_validate_data() { try {
	  Assert.assertEquals(driver.getTitle(), "My Account"); } catch (Exception e) {
	  e.printStackTrace(); } }
	 
	@Then("Close the Browser")
	public void close_the_Browser() {
	    driver.close();
	}
	
}
