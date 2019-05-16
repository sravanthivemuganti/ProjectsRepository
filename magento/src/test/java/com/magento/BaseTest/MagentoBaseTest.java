package com.magento.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MagentoBaseTest {

	protected WebDriver driver;
	protected String url;
	@BeforeClass
	public void  startTest(){
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		//step1: Go to http://live.guru99.com/index.php/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
