package com.Page_Object_Models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lip_Global.Base_Class;

public class ChildDetails extends Base_Class {

	public ChildDetails() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"/auth/login\"]")
	private WebElement AlreadySignUp;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "(//button[contains(@class,'btn ')])[1]")
	private WebElement Loginbutton;

	@FindBy(xpath = "(//div[contains(@class,'p-5 flex')]//div)[2]")
	private WebElement childicon;

	@FindBy(xpath = "//div[@id='vueapp--southern-child-overview']//div[1]//div[1]//p[1]")
	private WebElement childaccessicon;

	@FindBy(xpath = "//span[2]//a[1]")
	private WebElement childoverviewlink;

	@FindBy(xpath = "//body//div//div[@id='vueapp--southern-child-overview']//div//div[2]//div[1]//p[1]")
	private WebElement Appointmentsicon;

	@FindBy(xpath = "//li[@id='upcoming-appointments-list-slider-slide01']//button[2]")
	private WebElement clicktoviewappointmentdetails;

	@FindBy(xpath = "//button[@id='appointment-detail-ok-btn']")
	private WebElement appointmentreschedule;

	@FindBy(xpath = "(//label[@class='app-slot-label'])[1]")
	private WebElement SelectLocation;

	@FindBy(xpath = "(//label[@class='app-slot-label'])[2] ")
	private WebElement selectDate;

	@FindBy(xpath = "(//label[@class='card-time-label'])[1]")
	private WebElement SelectTime;

	@FindBy(xpath = "//button[@id='success-ok-btn']")
	private WebElement confirmbooking;

	@FindBy(xpath = "//div[@id='success-content']")
	private WebElement Successappointment;

	@FindBy(xpath = "//button[@id='success-ok-btn']")
	private WebElement okaysuccesspopup;

	@FindBy(xpath = "//div[3]//div[1]//p[1]")
	private WebElement clickimmunisationscreeningicon;

	@FindBy(xpath = "//label[@for='panel']")
	private WebElement clickimmunisationpanel;

	@FindBy(xpath = "//label[@for='panel2']")
	private WebElement clickscreeningpanel;

	@FindBy(xpath = "//div[4]//div[1]//p[1]")
	private WebElement lettersanddocumentsicon;

	@FindBy(xpath = "//button[text()='All'] ")
	private WebElement AllButton;

	@FindBy(xpath = "//button[text()[normalize-space()='View Document']]")
	private WebElement ViewDocument;

	@FindBy(xpath = "(//a[contains(@class,'border flex')])[1]")
	private WebElement CloseDocument;

	@FindBy(xpath = "(//div[@class='mw-filter']//div)[1]")
	private WebElement ClickFilter;

	@FindBy(xpath = "(//input[@name='document filter All'])[3] ")
	private WebElement selectCheckBox3;

	@FindBy(xpath = "(//input[@name='document filter All'])[1] ")
	private WebElement selectCheckBox1;

	@FindBy(xpath = "(//input[@name='document filter All'])[8] ")
	private WebElement selectCheckBox8;

	@FindBy(xpath = "(//input[@name='document filter All'])[16] ")
	private WebElement selectCheckBox16;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement ApplyButton;

	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement ClearButton;

	@FindBy(xpath = "//p[text()='Sort by ']")
	private WebElement SortIcon;

	@FindBy(xpath = "(//input[@class='mw-radio small'])[2]")
	private WebElement SortAlphabetically;

	@FindBy(xpath = "//span[1]//a[1]")
	private WebElement clickhomelink;

	@FindBy(xpath = "//body/div/div[@id='vueapp--southern-dashboard']/div/div/div[2]/div[1]/p[1]")
	private WebElement clickresourcesicon;

	@FindBy(xpath = "//button[@id='ckxiqc8cx00om0hnevbczmjjr']")
	private WebElement clickfindoutmorebutton;

	@FindBy(xpath = "//button[@id='ckxiqb4ph00o80hne0v4lueru--ckymkd8h7000b0hnpmmnnin43']")
	private WebElement clickstar;

	@FindBy(xpath = "//body/div/section[@id='southern-vueapp-resources']/div/div/div/button/span[1]")
	private WebElement clickfavouritebutton;

	public WebElement getAlreadySignUp() {
		return AlreadySignUp;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getChildicon() {
		return childicon;
	}

	public WebElement getChildaccessicon() {
		return childaccessicon;
	}

	public WebElement getChildoverviewlink() {
		return childoverviewlink;
	}

	public WebElement getAppointmentsicon() {
		return Appointmentsicon;
	}

	public WebElement getClicktoviewappointmentdetails() {
		return clicktoviewappointmentdetails;
	}

	public WebElement getAppointmentreschedule() {
		return appointmentreschedule;
	}

	public WebElement getConfirmbooking() {
		return confirmbooking;
	}

	public WebElement getSuccessappointment() {
		return Successappointment;
	}

	public WebElement getOkaysuccesspopup() {
		return okaysuccesspopup;
	}

	public WebElement getClickimmunisationscreeningicon() {
		return clickimmunisationscreeningicon;
	}

	public WebElement getClickimmunisationpanel() {
		return clickimmunisationpanel;
	}

	public WebElement getClickscreeningpanel() {
		return clickscreeningpanel;
	}

	public WebElement getLettersanddocumentsicon() {
		return lettersanddocumentsicon;
	}

	public WebElement getClickhomelink() {
		return clickhomelink;
	}

	public WebElement getClickresourcesicon() {
		return clickresourcesicon;
	}

	public WebElement getClickfindoutmorebutton() {
		return clickfindoutmorebutton;
	}

	public WebElement getClickstar() {
		return clickstar;
	}

	public WebElement getClickfavouritebutton() {
		return clickfavouritebutton;
	}

	public WebElement getSelectLocation() {
		return SelectLocation;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}

	public WebElement getSelectTime() {
		return SelectTime;
	}

	public WebElement getAllButton() {
		return AllButton;
	}

	public WebElement getViewDocument() {
		return ViewDocument;
	}

	public WebElement getCloseDocument() {
		return CloseDocument;
	}

	public WebElement getClickFilter() {
		return ClickFilter;
	}

	public WebElement getSelectCheckBox3() {
		return selectCheckBox3;
	}

	public WebElement getSelectCheckBox1() {
		return selectCheckBox1;
	}

	public WebElement getSelectCheckBox8() {
		return selectCheckBox8;
	}

	public WebElement getSelectCheckBox16() {
		return selectCheckBox16;
	}

	public WebElement getApplyButton() {
		return ApplyButton;
	}

	public WebElement getClearButton() {
		return ClearButton;
	}

	public WebElement getSortIcon() {
		return SortIcon;
	}

	public WebElement getSortAlphabetically() {
		return SortAlphabetically;
	}

}
