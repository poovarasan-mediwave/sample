package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Client_Dashboard extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the browser <url>")
	public void launch_the_browser_url() throws IOException {
		browserLaunch("chrome");
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());
	}

	@When("User click the Staff login button in page")
	public void user_click_the_staff_login_button_in_page() {
		btnClick(si.getQb2().getStafflogin_Button());
		wait(20);
	}

	@When("User enter the super microsoft email <email> and click next button")
	public void user_enter_the_super_microsoft_email_email_and_click_next_button() throws Throwable {

		enterText(si.getQb2().getExternalemail(), FileReaderManager.getInstanceFRM().getInstanceCR().getEmail());
		sleep(2000);
		btnClick(si.getQb2().getExternalNext());
		sleep(2000);

	}

	@When("User enter the microsoft email <email> and click next button")
	public void user_enter_the_microsoft_email_email_and_click_next_button() throws Throwable {
	}

	@When("User enter password <password>")
	public void user_enter_password_password() throws Throwable {
		enterText(si.getQb2().getExternalPassword(), FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());
		sleep(2000);
	}

	@Then("click signup button")
	public void click_signup_button() throws Throwable {
		btnClick(si.getQb2().getExternalNext());
		btnClick(si.getQb2().getExternalNext());
		System.out.println("Successfully login to the Microsoft account");

	}

	@When("click Admin fucntion in dashboard")
	public void click_admin_fucntion_in_dashboard() throws Throwable {
		sleep(20000);
		btnClick(si.getInstanceAdmin_Func().getAdmin_Fun());
	}

	@When("click client dashboard")
	public void click_client_dashboard() throws Throwable {
		sleep(20000);
		waitForElement(si.getInstanceClient_dash().getClient_dash(), 10);
		btnClick(si.getInstanceClient_dash().getClient_dash());
	}

	@When("In dropdown default select Top")
	public void in_dropdown_default_select_top() {
		// by default selected TOP in dropdown
	}

	@When("In dashboard heading click edit")
	public void in_dashboard_heading_click_edit() throws Throwable {
		btnClick(si.getInstanceClient_dash().getDash_head_edit());
		sleep(4000);
	}

	@When("edit the text")
	public void edit_the_text() throws Throwable {
		clear(si.getInstanceClient_dash().getDash_head_txtbox());
		enterText(si.getInstanceClient_dash().getDash_head_txtbox(), "Dashboard for Clients");
		btnClick(si.getInstanceClient_dash().getDash_head_save());
		sleep(4000);
	}

	@When("Dashboard description click edit")
	public void dashboard_description_click_edit() throws Throwable {
		btnClick(si.getInstanceClient_dash().getDash_descrip_edit());
		// sleep(4000);
		screenShot("Aaaa.png");
	}

	@When("edit the text in dashboard description")
	public void edit_the_text_in_dashboard_description() {
		clear(si.getInstanceClient_dash().getDash_descrip_txtbox());
		enterText(si.getInstanceClient_dash().getDash_descrip_txtbox(),
				"Here You can see list of forms assigned to the user to track their journey on TOP");
		btnClick(si.getInstanceClient_dash().getDash_head_save());
	}

	@When("In step one top eligibility click preview button")
	public void in_step_one_top_eligibility_click_preview_button() {
		btnClick(si.getInstanceStep1_topEligibility().getPreview_step1());

	}

	@When("opens a preview page and click close buttton")
	public void opens_a_preview_page_and_click_close_buttton() throws Throwable {
		javascriptScrollDown(si.getInstanceStep1_topEligibility().getNext_preview());
		screenShot("preview.png");
		btnClick(si.getInstanceStep1_topEligibility().getClose_preview());
	}

	@When("Click edit in Form description")
	public void click_edit_in_form_description() {
		btnClick(si.getInstanceStep1_topEligibility().getEdit_form_step1());
	}

	@When("edit the text in Form description")
	public void edit_the_text_in_form_description() {
		javascriptScrollDown(si.getInstanceStep1_topEligibility().getPreview_step1());
		clear(si.getInstanceStep1_topEligibility().getTxtbox_form());
		enterText(si.getInstanceStep1_topEligibility().getTxtbox_form(), "Help you to know how many weeks");
		btnClick(si.getInstanceStep1_topEligibility().getSave_form());
	}

	@Then("Click edit to change the estimated completion time")
	public void click_edit_to_change_the_estimated_completion_time() {
		btnClick(si.getInstanceStep1_topEligibility().getEdit_time());
		clear(si.getInstanceStep1_topEligibility().getTxtbox_time());
		enterText(si.getInstanceStep1_topEligibility().getTxtbox_time(), "0530");
		btnClick(si.getInstanceStep1_topEligibility().getSave_form());

	}

	@When("click replace to change the form")
	public void click_replace_to_change_the_form() throws Throwable {
		sleep(10000);
		btnClick(si.getInstanceStep2_Top().getReplace_step2());
	}

	@When("select the form")
	public void select_the_form() {

		if (displayedMethod(si.getInstanceStep2_Top().getSelect_form())) {
			btnClick(si.getInstanceStep2_Top().getSelect_form());

		} else {
			btnClick(si.getInstanceStep2_Top().getClose_form());
		}
	}

	@When("click the submit button")
	public void click_the_submit_button() throws Throwable {
		javascriptScrollDown(si.getInstanceStep2_Top().getConfirm_form());
		sleep(4000);
		btnClick(si.getInstanceStep2_Top().getConfirm_form());
	}

	@When("click the close icon")
	public void click_the_close_icon() {
		btnClick(si.getInstanceStep2_Top().getClose_form());
	}

	@When("click preview to view the form and close")
	public void click_preview_to_view_the_form_and_close() throws Throwable {
		sleep(5000);
		btnClick(si.getInstanceStep2_Top().getPreview_step2());
		screenShot("previewform_Step2.png");
		btnClick(si.getInstanceStep2_Top().getClose_preview_step2());

	}

	@When("click edit button to change the form description")
	public void click_edit_button_to_change_the_form_description() {
		btnClick(si.getInstanceStep2_Top().getEdit_form_step2());
		clear(si.getInstanceStep2_Top().getTxtbox_form_step2());
		enterText(si.getInstanceStep2_Top().getTxtbox_form_step2(), "In step 2 shows full description");
		btnClick(si.getInstanceStep2_Top().getSave_step2());
	}

	@Then("click edit to change the estimated time change")
	public void click_edit_to_change_the_estimated_time_change() throws Throwable {
		btnClick(si.getInstanceStep2_Top().getEdit_time_step2());
		clear(si.getInstanceStep2_Top().getTxtbox_time_step2());
		// EnterText(si.getInstanceStep2_Top().getTxtbox_time_step2(), "0530");
		// sleep(3000);
		// ClickOnElement(si.getInstanceStep2_Top().getSave_step2());
	}

	@When("In step three click the replace button")
	public void in_step_three_click_the_replace_button() throws Throwable {
		btnClick(si.getInstanceStep3_Top().getReplace_step3());
		sleep(4000);

	}

	@When("select the replace form")
	public void select_the_replace_form() throws Throwable {
		btnClick(si.getInstanceStep3_Top().getSelect_form_step3());
		screenShot("replace_step3.png");
	}

	@When("Scroll down to submit and click the submit button")
	public void scroll_down_to_submit_and_click_the_submit_button() {
		javascriptScrollDown(si.getInstanceStep3_Top().getConfirm_form_step3());
		btnClick(si.getInstanceStep3_Top().getConfirm_form_step3());
	}

	@When("close the form tab")
	public void close_the_form_tab() {

		btnClick(si.getInstanceStep3_Top().getClose_icon_step3());
	}

	@When("preview and close the tab")
	public void preview_and_close_the_tab() throws Throwable {
		btnClick(si.getInstanceStep3_Top().getPreview_form_step3());
		screenShot("preview_step4.png");
		sleep(4000);
		btnClick(si.getInstanceStep3_Top().getClose_icon_step3());
	}

	@When("edit to change the description")
	public void edit_to_change_the_description() {
		btnClick(si.getInstanceStep3_Top().getEdit_form_step3());
		clear(si.getInstanceStep3_Top().getTxtbox_form_step3());
		enterText(si.getInstanceStep3_Top().getTxtbox_form_step3(), "In step 3 check the form and fill");
		btnClick(si.getInstanceStep3_Top().getSave_step3());
	}

	@When("change the estimated time")
	public void change_the_estimated_time() {
		btnClick(si.getInstanceStep3_Top().getEdit_time_step3());
		clear(si.getInstanceStep3_Top().getTxtbox_time_step3());
		enterText(si.getInstanceStep3_Top().getTxtbox_time_step3(), "1010");
		btnClick(si.getInstanceStep3_Top().getSave_step3());
	}

	@When("In step four replace the form")
	public void in_step_four_replace_the_form() throws Throwable {
		btnClick(si.getInstanceStep4_Top().getReplace_step4());
		sleep(3000);
		btnClick(si.getInstanceStep4_Top().getSelect_form_step4());

	}

	@When("Scroll down to submit and click the submit")
	public void scroll_down_to_submit_and_click_the_submit() {
		javascriptScrollDown(si.getInstanceStep4_Top().getConfirm_form_step4());
		btnClick(si.getInstanceStep4_Top().getConfirm_form_step4());
	}

	@When("click close icon")
	public void click_close_icon() {
		btnClick(si.getInstanceStep4_Top().getClose_step4());
	}

	@When("preview the step four form")
	public void preview_the_step_four_form() throws Exception {
		btnClick(si.getInstanceStep4_Top().getPreview_step4());
		screenShot("preview_Step4.png");
		btnClick(si.getInstanceStep4_Top().getClose_step4());
	}

	@When("edit form description")
	public void edit_form_description() {
		btnClick(si.getInstanceStep4_Top().getEdit_form_step4());
		clear(si.getInstanceStep4_Top().getTxtbox_form_step4());
		enterText(si.getInstanceStep4_Top().getTxtbox_form_step4(), "Check step 4 and fill the required field");
		btnClick(si.getInstanceStep4_Top().getSave_step4());
	}

	@Then("edit time estimation")
	public void edit_time_estimation() {
		btnClick(si.getInstanceStep4_Top().getTime_edit_step4());
		clear(si.getInstanceStep4_Top().getTxtbox_time_step4());
		enterText(si.getInstanceStep4_Top().getTxtbox_time_step4(), "0630");
		btnClick(si.getInstanceStep4_Top().getSave_step4());
	}

	@When("click the preview in counselling form")
	public void click_the_preview_in_counselling_form() throws Throwable {
		btnClick(si.getInstanceCoun_Consent().getPreview_coun());
		screenShot("counselling.png");
	}

	@When("close the counselling preview")
	public void close_the_counselling_preview() {
		btnClick(si.getInstanceCoun_Consent().getClose_form_coun());
	}

	@When("edit form description in counselling")
	public void edit_form_description_in_counselling() throws Throwable {
		btnClick(si.getInstanceCoun_Consent().getEdit_form_coun());
		sleep(2000);
		clear(si.getInstanceCoun_Consent().getTxtbox_form_coun());
		enterText(si.getInstanceCoun_Consent().getTxtbox_form_coun(),
				"Here is the counselling form available for you and its free");
		btnClick(si.getInstanceStep4_Top().getSave_step4());
	}

	@When("click Replace consent form")
	public void click_replace_consent_form() {
		btnClick(si.getInstanceCoun_Consent().getReplace_coun());
	}

	@When("select the form and click the submit button")
	public void select_the_form_and_click_the_submit_button() {
		btnClick(si.getInstanceCoun_Consent().getSelect_consentform());
		javascriptScrollDown(si.getInstanceCoun_Consent().getConfirm_consent());
		btnClick(si.getInstanceCoun_Consent().getConfirm_consent());

	}

	@When("close the tab in consent replace")
	public void close_the_tab_in_consent_replace() throws Throwable {
		btnClick(si.getInstanceCoun_Consent().getClose_form_coun());
		sleep(2000);
	}

	@When("preview consent form and close")
	public void preview_consent_form_and_close() throws Throwable {
		btnClick(si.getInstanceCoun_Consent().getPreview_consent());
		screenShot("preview_consent.png");
		btnClick(si.getInstanceCoun_Consent().getClose_form_coun());

	}

	@When("edit the consent form description")
	public void edit_the_consent_form_description() {

		btnClick(si.getInstanceCoun_Consent().getEdit_consent());
		clear(si.getInstanceCoun_Consent().getTxtbox_consent());
		enterText(si.getInstanceCoun_Consent().getTxtbox_consent(), "Here is consent form");
		btnClick(si.getInstanceStep4_Top().getSave_step4());
	}
}
