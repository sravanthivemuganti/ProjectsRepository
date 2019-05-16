package com.magento.tests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import com.magento.BaseTest.MagentoBaseTest;
import com.magento.constants.MobileConstant;
import com.magento.pages.MobilePage;

public class SortMobileByNameTest_TC1 extends MagentoBaseTest implements MobileConstant{
	
	StringBuffer verifiacationErrors=new StringBuffer();
	int screenshotcount=0;
	@Test(priority=0)
	public void verifyTitle() {
		driver.get(BASEURL);
		//Step 2. Verify Title of the page
		try {
		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "THIS IS DEMO SITE FOR   ");
		}
		catch(Exception e){
			verifiacationErrors.append(e.toString());
		}
	}
	@Test(priority=1)
	public void sortMobileName() throws Exception{
		MobilePage mobilepage=new MobilePage(driver);
		//step3: click on MOBILE menu
		mobilepage.mobileLinkClick();
		//step4:verify title of the page
		try {
			Assert.assertEquals(driver.getTitle(), "Mobile");
		}
		catch (Exception e) {
			System.out.println("Catch");
			verifiacationErrors.append(e.toString());
		}
		//step5:select "sort by" dropdown as "Name"
		new Select(driver.findElement(By.xpath(MOBILESORTBY_XPATH_LOCATOR))).selectByVisibleText("Name");
		//step6: verify all sorted by name or not
		screenshotcount=screenshotcount+1;
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String png=("C:\\Users\\vgsgo\\eclipse-workspace\\magento\\Screenshots\\"+"Mobile Products Sorted By Name"+screenshotcount+".png");
		FileUtils.copyFile(srcFile,new File(png));
	}
}
