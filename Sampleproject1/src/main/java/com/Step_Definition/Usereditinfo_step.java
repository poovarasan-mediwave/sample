package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Usereditinfo_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("user enters the url & login to the account")
	public void user_enters_the_url_login_to_the_account() throws Throwable {
		browserLaunch("chrome");
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserurl());
		sleep(3000);
		enterText(si.gettopedithistory().getEmail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuseremail());
		sleep(3000);
		enterText(si.gettopedithistory().getPassword(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserpassword());
		sleep(3000);
		enterText(si.gettopedithistory().getPin(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserpin());
		sleep(3000);
		frameswitch(si.gettopedithistory().getRecaptchaframe());
		sleep(5000);
		btnClick(si.gettopedithistory().getRecaptcha());
		sleep(5000);
		frame_out();
		btnClick(si.gettopedithistory().getLogin());
		sleep(15000);
		btnClick(si.getuseredit().getAccountmenuheader());
		sleep(3000);
		btnClick(si.getuseredit().getAccountmenu());
		sleep(3000);
	}

	@When("user click on the menu option & edit client info")
	public void user_click_on_the_menu_option_edit_client_info() throws Throwable {

		btnClick(si.getuseredit().getProfileedit());
		sleep(3000);
		si.getuseredit().getFirstname().clear();
		si.getuseredit().getFirstname().sendKeys("RAM");
		sleep(3000);
		si.getuseredit().getLastname().clear();
		si.getuseredit().getLastname().sendKeys("PRASATH");
		sleep(3000);
		si.getuseredit().getFlatno().clear();
		si.getuseredit().getFlatno().sendKeys("128");
		sleep(3000);
		si.getuseredit().getPostcode().clear();
		si.getuseredit().getPostcode().sendKeys("CT16 9SD");
		sleep(3000);
		btnClick(si.getuseredit().getClienteditsave());
		sleep(10000);

	}

	@When("user edit the security preferences")
	public void user_edit_the_security_preferences() throws Throwable {
		btnClick(si.getuseredit().getClienteditsecurity());
		sleep(3000);
		btnClick(si.getuseredit().getJustemailissafe());
		sleep(3000);
		btnClick(si.getuseredit().getSavesecurity());
		sleep(3000);

	}

	@When("user edit the contact preferences")
	public void user_edit_the_contact_preferences() throws Throwable {
		btnClick(si.getuseredit().getClienteditcontactpreference());
		sleep(3000);
		btnClick(si.getuseredit().getClienteditcontactmail());
		sleep(3000);
		btnClick(si.getuseredit().getSavesecurity());
		sleep(10000);
	}

	@When("user checks the account history")
	public void user_checks_the_account_history() throws Throwable {
		javascriptScrollDown(si.getuseredit().getAccounthistoryheader());
		sleep(1500);
		btnClick(si.getuseredit().getAccounthistoryheader());
		sleep(3000);
		btnClick(si.getuseredit().getBackbutton());
		sleep(3000);
		screenShot("Account_History");
		sleep(6000);
	}

	@When("user delete the account")
	public void user_delete_the_account() throws InterruptedException {
		btnClick(si.getuseredit().getDeleteaccountheader());
		sleep(3000);
		btnClick(si.getuseredit().getDete_Account());
		sleep(3000);

	}
}
