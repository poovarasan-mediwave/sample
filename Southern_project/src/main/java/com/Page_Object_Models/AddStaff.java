package com.Page_Object_Models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Global.Base_Class;

public class AddStaff extends Base_Class {

	public AddStaff() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"/auth/login\"]")
	private WebElement AlreadySignUp;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement Loginbutton;

	@FindBy(xpath = "//p[normalize-space()='Staff overview']")
	private WebElement ClickStaffOverview;

	@FindBy(xpath = "//span[text()='Add staff profile']")
	private WebElement AddStaffbutton;

	@FindBy(xpath = "//label[normalize-space()='Select user role']")
	private WebElement clickselectuserrole;

	@FindBy(xpath = "//input[@id='admin role id 2']")
	private WebElement selectadmin;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id='staffId']")
	private WebElement rioid;

	@FindBy(xpath = "//button[contains(text(),'Create')]")
	private WebElement createprofilebutton;

	public WebElement getClickStaffOverview() {
		return ClickStaffOverview;
	}

	public WebElement getAddStaffbutton() {
		return AddStaffbutton;
	}

	public WebElement getClickselectuserrole() {
		return clickselectuserrole;
	}

	public WebElement getSelectadmin() {
		return selectadmin;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getRioid() {
		return rioid;
	}

	public WebElement getCreateprofilebutton() {
		return createprofilebutton;
	}

	public WebElement getClickOkaybutton() {
		return clickOkaybutton;
	}

	@FindBy(xpath = "//button[@id='success-ok-btn']")
	private WebElement clickOkaybutton;

}
