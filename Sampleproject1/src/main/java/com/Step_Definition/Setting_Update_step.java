package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Setting_Update_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the exeternal site {string} for setting update")
	public void launch_the_exeternal_site_for_setting_update(String string) throws Throwable {
		browserLaunch("chrome");
		maximize();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());
		sleep(1500);
		btnClick(si.getExternal_Login().getStafflogin_Button());
		sleep(2000);
		System.out.println("Enter the microsoft account page");
	}

	@When("User can enter the super admin email {string} and click next button for setting update")
	public void user_can_enter_the_super_admin_email_and_click_next_button_for_setting_update(String string)
			throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getEmail());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		sleep(2000);
	}

	@When("User can enter the super admin password {string} and click the next button forsetting update")
	public void user_can_enter_the_super_admin_password_and_click_the_next_button_forsetting_update(String string)
			throws Throwable {
		enterText(si.getExternal_Login().getExternalPassword(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		wait(20);
		btnClick(si.getExternal_Login().getExternalNext());
		System.out.println("Successfully login to the Microsaoft account");
		sleep(10000);
	}

	@When("User can click the forms and questionnaire option for setting update purpose")
	public void user_can_click_the_forms_and_questionnaire_option_for_setting_update_purpose() throws Throwable {
		System.out.println("User enter the forms&questionnaire page");
		btnClick(si.getQb().getFormsquestionnaire());
		sleep(20000);
	}

	@When("User can click the setting option")
	public void user_can_click_the_setting_option() throws Throwable {
		btnClick(si.getSetting_Update().getSetting_icon());
		sleep(5000);
	}

	@When("User can reset the questionnaire name and internal questionnaire name")
	public void user_can_reset_the_questionnaire_name_and_internal_questionnaire_name() throws Throwable {
		btnClick(si.getQb().getQuestionnaire_Name());
		wait(20);
		clear(si.getQb().getQuestionnaire_Name());
		wait(20);
		enterText(si.getQb().getQuestionnaire_Name(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getReset_Questionnaire_Name());
		sleep(2500);
		btnClick(si.getQb().getInternalQuestionnaire_name());
		wait(20);
		clear(si.getQb().getInternalQuestionnaire_name());
		wait(20);
		enterText(si.getQb().getInternalQuestionnaire_name(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getReset_Internalquestionnaire_Name());
		sleep(2000);

	}

	@When("User can click the more option")
	public void user_can_click_the_more_option() throws InterruptedException {
		btnClick(si.getSetting_Update().getMore_Options());
		sleep(3000);

	}

	@When("User can reset the catagory and services")
	public void user_can_reset_the_catagory_and_services() throws Throwable {
		javascriptScrollDown(si.getSetting_Update().getCatagory());
		wait(20);
		btnClick(si.getSetting_Update().getCatagory());
		sleep(2000);
		clickon_Listelement(si.getQb().getSelect_QuestionnaireType(), 4);
		sleep(2000);

		javascriptScrollDown(si.getSetting_Update().getService());
		wait(20);
		btnClick(si.getSetting_Update().getService());
		sleep(2000);
		clickon_Listelement(si.getQb().getSelect_Service(), 0);
		sleep(2000);

	}

	@When("User can click the update button")
	public void user_can_click_the_update_button() throws Throwable {
		javascriptScrollDown(si.getSetting_Update().getUpdate_Option());
		wait(20);
		btnClick(si.getSetting_Update().getUpdate_Option());
		sleep(5000);
	}

	@When("User again click the setting option")
	public void user_again_click_the_setting_option() throws Throwable {
		btnClick(si.getSetting_Update().getSetting_icon());
		sleep(5000);
		btnClick(si.getSetting_Update().getMore_Options());
		sleep(2000);
		javascriptScrollDown(si.getSetting_Update().getUpdate_Option());
		sleep(1500);
	}

}
