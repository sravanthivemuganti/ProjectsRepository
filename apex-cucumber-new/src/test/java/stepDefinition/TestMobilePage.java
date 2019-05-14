package stepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestMobilePage {
	WebDriver driver;
	@Given("Open Browser")
	public void open_Browser() {
	   driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Given("Enter url {string}")
	public void enter_url(String url) {
	    driver.get(url);
	}

	@Given("Click Mobile")
	public void click_Mobile() {
	   driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
	}

	@Given("Click Add to cart")
	public void click_Add_to_cart() {
	   driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
	}

	@Given("Go to Cart")
	public void go_to_Cart() {
	   driver.findElement(By.xpath("//a[contains(@href,'checkout')]")).click();
	}

	@Then("Checkout the cart")
	public void checkout_the_cart() {
	    driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
	}

	@Then("Close Browser")
	public void close_Browser() {
	    driver.close();
	}


}
