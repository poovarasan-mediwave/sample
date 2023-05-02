package com.Page_Object_Models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Global.Base_Class;

public class SignUp extends Base_Class {

	public SignUp() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[contains(@class,'btn ')])[1]")
	private WebElement SignUp;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@id='mobileNumber']")
	private WebElement MobileNumber;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	private WebElement ConfirmPassword;

	@FindBy(xpath = "//input[@id='termsAndCondition']")
	private WebElement selectterms;

	@FindBy(xpath = "//input[@id='privacyStatement']")
	private WebElement selectprivacy;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SignupButton;

	@FindBy(xpath = "//div[@id='error-content']")
	private WebElement ErrorContent;

	@FindBy(xpath = "//span[text()='A 6 digit verification code will be sent to your registered email address.']")
	private WebElement SuccessContent;

	public WebElement getSignUp() {
		return SignUp;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getSelectterms() {
		return selectterms;
	}

	public WebElement getSelectprivacy() {
		return selectprivacy;
	}

	public WebElement getSignupButton() {
		return SignupButton;
	}

	public WebElement getErrorContent() {
		return ErrorContent;
	}

	public WebElement getSuccessContent() {
		return SuccessContent;
	}

}
