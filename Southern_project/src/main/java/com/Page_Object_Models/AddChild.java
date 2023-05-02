package com.Page_Object_Models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Global.Base_Class;

public class AddChild extends Base_Class {

	public AddChild() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@aria-label='“signin”']")
	private WebElement AlreadySignUp;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbutton;

	@FindBy(xpath = "//p[@class='text-white text-center']")
	private WebElement AddChild;

	@FindBy(xpath = "//input[@id='child-nhs-number']")
	private WebElement NHSNumber;

	@FindBy(xpath = "//input[@id='dobDate']")
	private WebElement Date;

	@FindBy(xpath = "//input[@id='dobMonth']")
	private WebElement Month;

	@FindBy(xpath = "//input[@id='dobYear']")
	private WebElement Year;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Addchildbutton;

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getAddChild() {
		return AddChild;
	}

	public WebElement getNHSNumber() {
		return NHSNumber;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getAddchildbutton() {
		return Addchildbutton;
	}

	public WebElement getAlreadySignUp() {
		return AlreadySignUp;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Loginbutton;
	}

}
