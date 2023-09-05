package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Triage_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for triage flow purpose")
	public void launch_the_external_site_for_triage_flow_purpose(String string) throws Throwable {
		browserLaunch("chrome");
		maximize();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());
		sleep(1500);
	}

	@When("User click the Staff login button for triage flow purpose")
	public void user_click_the_staff_login_button_for_triage_flow_purpose() throws Throwable {
		btnClick(si.getExternal_Login().getStafflogin_Button());
		sleep(2000);
		System.out.println("Enter the microsoft account page");
	}

	@When("User enter the microsoft email {string} and click the next button for triage flow purpose")
	public void user_enter_the_microsoft_email_and_click_the_next_button_for_triage_flow_purpose(String string)
			throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getEmail());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		sleep(2000);
	}

	@When("User enter the password {string} and click the signup button for triage flow purpose")
	public void user_enter_the_password_and_click_the_signup_button_for_triage_flow_purpose(String string)
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

	@When("User click the Triage worklist button in pending page")
	public void user_click_the_triage_worklist_button_in_pending_page() throws Throwable {
		btnClick(si.gettriPage().getTriage1());
		sleep(2000);

	}

	@When("User click the select button and IG raised SG")
	public void user_click_the_select_button_and_ig_raised_sg() throws Throwable {
		btnClick(si.gettriPage().getSelect());
		sleep(1500);
		// btnClick(si.gettriPage().getIRraised());
		// sleep(3000);
		// btnClick(si.gettriPage().getSavebtn());
		sleep(6000);

	}

	@When("User click the Assign to me and mark completed button and click save")
	public void user_click_the_assign_to_me_and_mark_completed_button_and_click_save() throws Throwable {
		// btnClick(si.gettriPage().getSelect());
//		sleep(1500);
		// btnClick(si.gettriPage().getAssign());
		sleep(6500);
		// btnClick(si.gettriPage().getSavebtn());
		// sleep(9000);
		// btnClick(si.gettriPage().getSelect());
		sleep(6000);
		btnClick(si.gettriPage().getMarkcompleted());
		sleep(2000);
		btnClick(si.gettriPage().getSavebtn());
		sleep(6000);

	}

	@When("User click completed button and landed in completed page and select pending page")
	public void user_click_completed_button_and_landed_in_completed_page_and_select_pending_page() throws Throwable {
		btnClick(si.gettriPage().getCompleted());
		sleep(2000);

	}

	@When("User click the search option and Enter the particular User ID and click pending button")
	public void user_click_the_search_option_and_enter_the_particular_user_id_and_click_pending_button()
			throws Throwable {

		String userno = FileReaderManager.getInstanceFRM().getInstanceCR().getuserno();
		enterText(si.gettriPage().getSearch(), userno);
		sleep(10000);

		btnClick(si.gettriPage().getUserno());
		sleep(2000);

		btnClick(si.gettriPage().getAudit());
		sleep(2000);

	}

	@When("User click the filter by button and select TOP option")
	public void user_click_the_filter_by_button_and_select_top_option() throws Throwable {

		btnClick(si.gettriPage().getBackbtn1());
		sleep(3000);

		btnClick(si.gettriPage().getPending());
		sleep(5000);

		btnClick(si.gettriPage().getFilterby());
		sleep(2000);

		btnClick(si.gettriPage().getTOP());
		sleep(1000);

	}

	@When("User select the category and rightcare status and safegaurding")
	public void user_select_the_category_and_rightcare_status_and_safegaurding() throws Throwable {
		btnClick(si.gettriPage().getCat2());
		sleep(1000);

		btnClick(si.gettriPage().getRed());
		sleep(1500);

		btnClick(si.gettriPage().getUnsafe());
		sleep(2000);

	}

	@When("User select the status and click the submit button")
	public void user_select_the_status_and_click_the_submit_button() throws Throwable {
		// btnClick(si.gettriPage().getSG());
		sleep(1000);

		btnClick(si.gettriPage().getSubmit());
		sleep(6000);

		btnClick(si.gettriPage().getFilterby());

	}

	@When("User click the Reset button and shows the pending page")
	public void user_click_the_reset_button_and_shows_the_pending_page() throws Throwable {

		btnClick(si.gettriPage().getReset());
		sleep(5000);

	}
}
