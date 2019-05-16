package com.apex.test.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceLoginPage {
	public static void main(String[] args) throws InterruptedException {
		// create driver
		
		WebDriver driver = new FirefoxDriver();
		// open page
		driver.get("http://www.ecommerce.saipratap.net/customerlogin.php");
		//identify the elements and set the data
		driver.findElement(By.name("email")).sendKeys("test2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pwd2");
		//perform action
		driver.findElement(By.linkText("Login")).click();
		//validate the result
		//title,url,content,data
		//String message=driver.findElement(By.xpath("msg")).toString();
		String title=driver.getTitle();
		//System.out.println(message);
		if(title.equalsIgnoreCase("ez Shop Online")){
			System.out.println("test is success");
		}else {
			System.out.println("test is failed");
		}
		/*		driver.findElement(By.className("continue")).click();
		 * WebElement fname=driver.findElement(By.name("fname"));
		 * fname.sendKeys("Sravanthi");
		 * driver.findElement(By.name("lname")).sendKeys("Vemuganti");
		 * driver.findElement(By.name("day")).sendKeys("12");
		 * driver.findElement(By.name("month")).sendKeys("12");
		 * driver.findElement(By.name("year")).sendKeys("12");
		 * driver.findElement(By.name("email")).sendKeys("sravathi.v@gamil.com");
		 * driver.findElement(By.name("houseno")).sendKeys("123");
		 * driver.findElement(By.name("add1")).sendKeys("San Pablo");
		 * driver.findElement(By.name("city")).sendKeys("Fremont");
		 * driver.findElement(By.name("state")).sendKeys("California");
		 * driver.findElement(By.name("postcode")).sendKeys("12345");
		 * driver.findElement(By.name("phone")).sendKeys("1234567");
		 * driver.findElement(By.name("fax")).sendKeys("1-1234567");
		 * driver.findElement(By.name("password")).sendKeys("apex");
		 * driver.findElement(By.name("cpassword")).sendKeys("apex");
		 * driver.findElement(By.name("Submit")).click();; //
		 * driver.findElement(By.name("terms")).isSelected();
		 * //driver.findElement(By.name("newsletter")).
		 * 
		 */
	}

}
