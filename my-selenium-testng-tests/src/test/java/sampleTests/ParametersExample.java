package sampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	void setUp(String browser, String app) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(app);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	@Test
	void searchPage() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		Assert.assertEquals("Java - Google Search", driver.getTitle());
	}

	@AfterClass
	void tearDown() {
		driver.close();
	}
}
