package com.Step_Definition;

import java.io.IOException;
import java.util.Set;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Security_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external {string} for the security flow purpose")
	public void launch_the_external_for_the_security_flow_purpose(String string) throws Throwable {
		browserLaunch("chrome");
		maximize();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());
		sleep(1500);
	}

	@When("User click the Staff login button for the security flow purpose")
	public void user_click_the_staff_login_button_for_the_security_flow_purpose() throws Throwable {
		btnClick(si.getQuesPage().getstafflogin());
		sleep(1500);
	}

	@When("User enter the microsoft login email {string} and click the next button")
	public void user_enter_the_microsoft_login_email_and_click_the_next_button(String string) throws Throwable {
		enterText(si.getQuesPage().getexternalemail(), FileReaderManager.getInstanceFRM().getInstanceCR().getemail());
		btnClick(si.getQuesPage().getexternalNext());
		sleep(2000);
	}

	@When("User enter the microsoft login password {string} and click the signup button")
	public void user_enter_the_microsoft_login_password_and_click_the_signup_button(String string) throws Throwable {
		enterText(si.getQuesPage().getexternalPassword(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
		btnClick(si.getQuesPage().getexnext());
		sleep(2000);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(10000);
	}

	@When("User launch the serviceuser url {string}")
	public void user_launch_the_serviceuser_url(String string) throws Throwable {
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getuserurl());
		sleep(10000);
	}

	@When("User enter the email {string} in email field")
	public void user_enter_the_email_in_email_field(String string) throws Throwable {
		enterText(si.gettop_page().getLogemail(), FileReaderManager.getInstanceFRM().getInstanceCR().getuseremail());
		sleep(1500);
	}

	@When("User enter the password {string} in password field")
	public void user_enter_the_password_in_password_field(String string) throws Throwable {
		enterText(si.gettop_page().getLogpass(), FileReaderManager.getInstanceFRM().getInstanceCR().getuserpass());
		sleep(2000);
	}

	@When("User click all clients and account setting button")
	public void user_click_all_clients_and_account_setting_button() throws Throwable {
		sleep(3000);
		btnClick(si.gettop_page().getAllclients());
		sleep(4000);
		btnClick(si.gettop_page().getAccount());
		sleep(2000);
	}

	@When("User click security button and enter temporary memorable word and save button")
	public void user_click_security_button_and_enter_temporary_memorable_word_and_save_button() throws Throwable {
		btnClick(si.getsecuPage().getSecurity());
		sleep(2000);

		enterText(si.getsecuPage().getMemorablepin(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getEntermemo());
		sleep(2000);

		btnClick(si.getsecuPage().getSavepin());
		sleep(4000);

	}

	@When("User Enter temporary password and save button")
	public void user_enter_temporary_password_and_save_button() throws Throwable {

		enterText(si.getsecuPage().getMemorablepass(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getEnterpass());
		sleep(1000);

		btnClick(si.getsecuPage().getSavepass());
		sleep(4000);

	}

	@When("User click logout button")
	public void user_click_logout_button() throws Throwable {

		String Parenthandle = driver.getWindowHandle();
		btnClick(si.getQuesPage().getlogout());
		sleep(6000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
				btnClick(si.getQuesPage().getlogout2());
			}
			driver.switchTo().window(Parenthandle);
		}

		sleep(10000);

	}

	@When("User enter memorable word and click login buttpn")
	public void user_enter_memorable_word_and_click_login_buttpn() throws Throwable {

		String usermemo = FileReaderManager.getInstanceFRM().getInstanceCR().getusermemo();
		enterText(si.gettop_page().getPin(), usermemo);
		sleep(3000);
		frameswitch(si.gettop_page().getRecaptchaframe());
		sleep(2000);
		btnClick(si.gettop_page().getRecaptcha());
		frame_out();
		sleep(4000);
		btnClick(si.gettop_page().getLogin());
		sleep(10000);

	}

	@When("User enter the new password and confirm password and click next")
	public void user_enter_the_new_password_and_confirm_password_and_click_next() throws Throwable {

		String pass = FileReaderManager.getInstanceFRM().getInstanceCR().getpass();
		enterText(si.getsecuPage().getNewpass(), pass);

		sleep(1500);

		String conpass = FileReaderManager.getInstanceFRM().getInstanceCR().getconpass();
		enterText(si.getsecuPage().getConfipass(), conpass);
		sleep(3000);

		btnClick(si.getsecuPage().getConfirm());
		sleep(2000);
	}

	@When("User enter the memorable word and confirm memorable word and click next")
	public void user_enter_the_memorable_word_and_confirm_memorable_word_and_click_next() throws Throwable {

		String memo = FileReaderManager.getInstanceFRM().getInstanceCR().getmemo();
		enterText(si.getsecuPage().getEnterpin(), memo);
		sleep(2000);

		String conmemo = FileReaderManager.getInstanceFRM().getInstanceCR().getconmemo();
		enterText(si.getsecuPage().getConfipin(), conmemo);
		sleep(1500);

		btnClick(si.getsecuPage().getConfirmbtn());
		sleep(2000);

	}

	@When("User click the login button")
	public void user_click_the_login_button() throws Throwable {

		btnClick(si.getsecuPage().getLogin());
		sleep(2000);

	}
}
