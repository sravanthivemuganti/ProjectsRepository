package com.apex.test.samples;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebEcommerce {

	public static void main(String[] args) throws InterruptedException {
		// create driver

		WebDriver driver = new FirefoxDriver();
		// open page
		driver.get("http://www.ecommerce.saipratap.net");
		// ----Electronics-----
	//	electronicsSubMenu(driver);
	//	categoriesMenu(driver);
	//	brandsMenu(driver);
		productsMenu(driver);

	}

	// ----Electronics-----
	public static void electronicsSubMenu(WebDriver driver) throws InterruptedException {
		WebElement Electronics = driver.findElement(By.className("hide"));
		Thread.sleep(1000);
		Electronics.click();
		Thread.sleep(1000);
		WebElement sortBy = driver.findElement(By.linkText("Newest First"));
		sortBy.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Descending")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Ascending")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("hide")).click();
		driver.findElement(By.linkText("Digital cameras")).click();
		driver.findElement(By.linkText("Newest First")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Descending")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Ascending")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("hide")).click();
		driver.findElement(By.linkText("Audio")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Newest First")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Descending")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Ascending")).click();
		Thread.sleep(1000);

		driver.findElement(By.className("hide")).click();
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Newest First")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Descending")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Ascending")).click();
		Thread.sleep(2000);

	}

	// Categories
	public static void categoriesMenu(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(2000);
		electronicsSubMenu(driver); // calls in categories menu
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here to view the products")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Digital cameras (0 items)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Audio (0 items)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Computers (5 items)")).click();
		Thread.sleep(2000);
	}
	public static void brandsMenu(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("BRANDS")).click();
		Thread.sleep(1000);
		
		for(int i=1;i<=6;i++) {
		
		driver.findElement(By.cssSelector("a[href='category.php?manufid="+i+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Newest First")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Descending")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Ascending")).click();
		Thread.sleep(1000);

		}
		driver.findElement(By.linkText("BRANDS")).click();
		Thread.sleep(1000);
		
		for(int i=1;i<=6;i++) {
			
			driver.findElement(By.cssSelector("a[href='category.php?manufid="+i+"']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Newest First")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Price Descending")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Price Ascending")).click();
			Thread.sleep(1000);

			}
		/*
		 * driver.findElement(By.linkText("BRANDS")).click(); Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("a[href=\'category.php?manufid=2\']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Newest First")).click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Descending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Ascending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("a[href=\'category.php?manufid=3\']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Newest First")).click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Descending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Ascending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("a[href=\'category.php?manufid=4\']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Newest First")).click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Descending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Ascending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("a[href=\'category.php?manufid=5\']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Newest First")).click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Descending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Ascending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("a[href=\'category.php?manufid=6\']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Newest First")).click(); Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Descending")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Price Ascending")).click();
		 * Thread.sleep(1000);
		 */
	}
	public static void productsMenu(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("PRODUCTS")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Newest First")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Descending")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Price Ascending")).click();
		Thread.sleep(1000);
		
		for (int i = 2; i < 10; i++) {
//		driver.findElement(By.cssSelector("a[href='proddetail.php?proid=10001']")).click();
//		Thread.sleep(1000);
			driver.findElement(By.linkText("PRODUCTS")).click();

		driver.findElement(By.cssSelector("a[href='proddetail.php?proid=1000"+i+"']")).click();
		Thread.sleep(1000);
		}

	}

}
