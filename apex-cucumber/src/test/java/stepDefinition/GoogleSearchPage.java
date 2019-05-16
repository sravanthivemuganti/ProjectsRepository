package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleSearchPage {

	public WebDriver driver;
@Given("^I want toOpen Browser$")
public void i_want_toOpen_Browser() {
	
   driver=new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("I enter url {string}")
public void i_enter_url(String url) {
    driver.get(url);
}

@When("search the data and click search")
public void search_the_data_and_click_search() {
   driver.findElement(By.name("q")).sendKeys("cucumber");
   driver.findElement(By.name("btnK")).click();
}

@Then("I validate search data")
public void i_validate_search_data() {
   Assert.assertEquals(driver.getTitle(), "cucumber - Google Search");
}

@Then("Close Browser")
public void close_Browser() {
    driver.close();
}

}
