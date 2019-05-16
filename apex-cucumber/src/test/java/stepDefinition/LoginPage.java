package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {

	public WebDriver driver;
	String validateData;

	@Given("I want to Open Browser")
	public void i_want_to_Open_Browser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("Enter the url {string}")
	public void enter_the_url(String url) {
		driver.get(url);
	}

	@Given("Click on Account and Click on Login Link")
	public void click_on_Account_and_Click_on_Login_Link() {
		driver.findElement(By.xpath("//a/span[contains(text(),'Account')]")).click();
		driver.findElement(By.linkText("Log In")).click();
	}

	@When("Enter username {string} and password {string} and validate {string}")
	public void enter_username_and_password(String username, String password, String validate) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		validateData = validate;
	}

	@When("Click on Login Button")
	public void click_on_Login_Button() {
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	}

	@Then("I validate the page")
	public void i_validate_the_page() {
		if (validateData.equals("valid")) {
			try {
				Assert.assertEquals(driver.getTitle(), "My Account");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Assert.assertEquals(
						driver.findElement(By.xpath("//span[contains(text(),'Invalid login or password.')]")).getText(),
						"Invalid login or password.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Then("Close Login Browser")
	public void close_Login_Browser() {
		driver.close();
	}
}
