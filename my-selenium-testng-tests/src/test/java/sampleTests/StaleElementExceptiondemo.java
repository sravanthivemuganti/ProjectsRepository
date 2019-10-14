package sampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptiondemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Training')]"));
		link.click();
		driver.navigate().back();
		Thread.sleep(5000);
		try {
		link.click();
		}
		catch(StaleElementReferenceException e){
			link=driver.findElement(By.xpath("//a[contains(text(),'Training')]"));
			link.click();
		}
	}
}
