package com.apex.test.samples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchJava {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		List<WebElement> links = driver.findElements(By.xpath("//h3[@class='LC20lb']"));
		for (WebElement link : links) {
			if (link.getText().compareToIgnoreCase("") != 0) {
				System.out.println(link.getText());
			}
		}
	}
}
