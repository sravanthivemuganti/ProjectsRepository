package com.apex.ecommerce.register.page;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.register.constant.RegisterConstant;

public class Registerpage implements RegisterConstant{
	
	@FindBy(linkText=ACCOUNT_lINKTETXT_LOCATOR)
	private WebElement accountLinkElem;
	@FindBy(linkText=SIGNUP_lINKTETXT_LOCATOR)
	private WebElement signupElem;
	@FindBy(xpath=RegisterConstant.GENDER_MALE_NAME_LOCATOR)
	private WebElement genderMaleElem;
	@FindBy(xpath=RegisterConstant.GENDER_FEMALE_NAME_LOCATOR)
	private WebElement genderFemaleElem;
	@FindBy(name=RegisterConstant.FNAME_NAME_LOCATOR)
	private WebElement firstNameElem;
	@FindBy(name=RegisterConstant.LNAME_NAME_LOCATOR)
	private WebElement LastNameElem;
	@FindBy(name=RegisterConstant.DAY_NAME_LOCATOR)
	private WebElement dateOfBirthDayElem;
	@FindBy(name=RegisterConstant.MONTH_NAME_LOCATOR)
	private WebElement dateOfBirthMonthElem;
	@FindBy(name=RegisterConstant.YEAR_NAME_LOCATOR)
	private WebElement dateOfBirthYearElem;
	@FindBy(name=RegisterConstant.EMAIL_SIGNUP_NAME_LOCATOR)
	private WebElement emailElem;
	@FindBy(name=RegisterConstant.HOUSENO_NAME_LOCATOR)
	private WebElement houseNumElem;
	@FindBy(name=RegisterConstant.ADD1_NAME_LOCATOR)
	private WebElement streetNameElem;
	@FindBy(name=RegisterConstant.CITY_NAME_LOCATOR)
	private WebElement townNameElem;
	@FindBy(name=RegisterConstant.STATE_NAME_LOCATOR)
	private WebElement countyNameElem;
	@FindBy(name=RegisterConstant.COUNTRY_NAME_LOCATOR)
	private WebElement countryNameElem;
	@FindBy(name=RegisterConstant.POSTCODE_NAME_LOCATOR)
	private WebElement postcOdeElem;
	@FindBy(name=RegisterConstant.DAYPHONE_NAME_LOCATOR)
	private WebElement dayPhoneElem;
	@FindBy(name=RegisterConstant.NIGHTPHONE_NAME_LOCATOR)
	private WebElement nightPhoneElem;
	@FindBy(name=RegisterConstant.PASSWORD_SIGNUP_NAME_LOCATOR)
	private WebElement passwordElem;
	@FindBy(name=RegisterConstant.CPASSWORD_NAME_LOCATOR)
	private WebElement confirmPasswordElem;
	@FindBy(name=RegisterConstant.NEWSLETTER_NAME_LOCATOR)
	private WebElement newsLetterElem;
	@FindBy(name=RegisterConstant.TERMS_NAME_LOCATOR)
	private WebElement termsAndConditionElem;
	@FindBy(name=RegisterConstant.SUBMIT_NAME_LOCATOR)
	private WebElement signupButtonElem;
	
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void signupPage(String gender, String fname, String lname, String day, String month, String year,
			String email, String hno, String street, String town, String county, String country, String postcode,
			String mphone, String ephone, String pwd, String cpwd, String newsletter, String terms)
			throws InterruptedException {
		accountLinkElem.click();
		signupElem.click();
		if (gender.contentEquals("M"))
			genderMaleElem.click();
		else if (gender.equalsIgnoreCase("F"))
			genderFemaleElem.click();

		firstNameElem.sendKeys(fname);
		LastNameElem.sendKeys(lname);
		dateOfBirthDayElem.sendKeys(day);
		dateOfBirthMonthElem.sendKeys(month);
		dateOfBirthYearElem.sendKeys(year);
		emailElem.sendKeys(email);
		houseNumElem.sendKeys(hno);
		streetNameElem.sendKeys(street);
		townNameElem.sendKeys(town);
		countyNameElem.sendKeys(county);
		countryNameElem.sendKeys(country);
		postcOdeElem.sendKeys(postcode);
		dayPhoneElem.sendKeys(mphone);
		nightPhoneElem.sendKeys(ephone);
		byte[] encodedBytes = Base64.encodeBase64(pwd.getBytes());
		System.out.println("encodedBytes "+ new String(encodedBytes));
		passwordElem.sendKeys(new String(encodedBytes));

//		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
//		System.out.println("decodedBytes "+ new String(decodedBytes));
		byte[] encodedBytesConfirm = Base64.encodeBase64(cpwd.getBytes());
		System.out.println("encodedBytes "
				+ ""+ new String(encodedBytesConfirm));

		confirmPasswordElem.sendKeys(new String(encodedBytesConfirm));
		if (newsletter.equals("1") && !newsLetterElem.isSelected()) {
			newsLetterElem.click();
		}
		if (terms.equals("1"))
			termsAndConditionElem.click();
		signupButtonElem.click();
	}
}
