package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TOP_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();


	@Given("Launch the external site {string} for TOP eligibility")
	public void launch_the_external_site_for_top_eligibility(String string) throws Throwable {
		browserLaunch("chrome");
		wait(20);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getuserurl());
		sleep(2000);
	}

	@When("User can enter the top serviceuser email {string} and click the next button")
	public void user_can_enter_the_top_serviceuser_email_and_click_the_next_button(String string) throws Throwable {
		String email2 = FileReaderManager.getInstanceFRM().getInstanceCR().getEmail2();
		enterText(si.gettop_page().getLogemail(), email2);

		sleep(2000);
	}

	@When("User enter the top serviceuser password {string} and click recaptcha")
	public void user_enter_the_top_serviceuser_password_and_click_recaptcha(String string) throws Throwable {
		String password2 = FileReaderManager.getInstanceFRM().getInstanceCR().getPassword2();
		enterText(si.gettop_page().getLogpass(), password2);

		sleep(2000);

	}

	@When("User enter the memorable word and click login button for TOP eligibility")
	public void user_enter_the_memorable_word_and_click_login_button_for_top_eligibility() throws Throwable {
		String memorable = FileReaderManager.getInstanceFRM().getInstanceCR().getMemorable();
		enterText(si.gettop_page().getPin(), memorable);
		sleep(3000);
		// driver.switchTo().frame(0);
		frameswitch(si.gettop_page().getRecaptchaframe());
		sleep(2000);
		btnClick(si.gettop_page().getRecaptcha());
		frame_out();
		// driver.switchTo().defaultContent();
		sleep(5000);
		btnClick(si.gettop_page().getLogin());
		sleep(14000);

	}

	@When("User click the start button in the dashboard page for TOP eligibility")
	public void user_click_the_start_button_in_the_dashboard_page_for_top_eligibility() throws Throwable {
		btnClick(si.gettop_page().getStart());
		// btnClick(si.gettop_page().getCompletenow());
		sleep(2000);
	}

	@When("User click yes radio button for pregnancy test and yes for last menstrual period")
	public void user_click_yes_radio_button_for_pregnancy_test_and_yes_for_last_menstrual_period() throws Throwable {

		btnClick(si.gettop_page().getYes());
		btnClick(si.gettop_page().getPeriodyes());
		sleep(1000);

	}

	@When("User enter the date of first day of last period and click next button")
	public void user_enter_the_date_of_first_day_of_last_period_and_click_next_button() throws Throwable {

		btnClick(si.gettop_page().getDOB());
		btnClick(si.gettop_page().getLastperiod());
		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(2000);

	}

	@When("User enter the DOB above18 years and select yes for feel safe and click next button")
	public void user_enter_the_dob_above18_years_and_select_yes_for_feel_safe_and_click_next_button() throws Throwable {
		btnClick(si.gettop_page().getDOB());

		String day = FileReaderManager.getInstanceFRM().getInstanceCR().getDay();
		enterText(si.gettop_page().getDay(), day);

		String month = FileReaderManager.getInstanceFRM().getInstanceCR().getMonth();
		enterText(si.gettop_page().getMonth(), month);

		String year = FileReaderManager.getInstanceFRM().getInstanceCR().getYear();
		enterText(si.gettop_page().getYear(), year);

		sleep(1500);

		btnClick(si.gettop_page().getYessafe());
		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(6000);

	}

	@When("User select the yes or no button for registered UK gp and select the address")
	public void user_select_the_yes_or_no_button_for_registered_uk_gp_and_select_the_address() throws Throwable {
		btnClick(si.gettop_page().getYesgp());
		sleep(2000);
		String findubrn = FileReaderManager.getInstanceFRM().getInstanceCR().getLarcphone();
		enterText(si.getvas_page().getFindubrn(), findubrn);
		sleep(6000);
		// btnClick(si.gettop_page().getNogp());
		btnClick(si.gettop_page().getGpdetails1());
		sleep(4000);
//		btnClick(si.getsignPage().getNoukadd());
//		btnClick(si.gettop_page().getYesukadd());
		sleep(2000);

//		String flatno = FileReaderManager.getInstanceFRM().getInstanceCR().getFlatno();
//		enterText(si.gettop_page().getFlatno(), flatno);
//
//		String streets = FileReaderManager.getInstanceFRM().getInstanceCR().getStreets();
//		enterText(si.gettop_page().getStreet(), streets);
//
//		String cities = FileReaderManager.getInstanceFRM().getInstanceCR().getCities();
//		enterText(si.gettop_page().getTown(), cities);
//
//		String postcodes = FileReaderManager.getInstanceFRM().getInstanceCR().getPostcodes();
//		enterText(si.gettop_page().getPostcode(), postcodes);
//		sleep(1500);

		btnClick(si.gettop_page().getYesornoperiodnext());

	}

	@When("User select the yes button for local provider and enter the text and click arrange a call back button")
	public void user_select_the_yes_button_for_local_provider_and_enter_the_text_and_click_arrange_a_call_back_button()
			throws Throwable {
		sleep(62000);
		btnClick(si.gettop_page().getLocalyes());

		String localenter = FileReaderManager.getInstanceFRM().getInstanceCR().getLocalenter();
		enterText(si.gettop_page().getLocaltext(), localenter);
		sleep(2000);

		btnClick(si.gettop_page().getSubmit());
		sleep(2000);
		btnClick(si.gettop_page().getArrangecall());

	}

	@When("User select the prefrence for call back radio buttons and click book call back button")
	public void user_select_the_prefrence_for_call_back_radio_buttons_and_click_book_call_back_button()
			throws Throwable {
		sleep(12000);
		btnClick(si.gettop_page().getAnytime());
		sleep(1500);
		btnClick(si.gettop_page().getCallback());
		sleep(7000);

	}

	@When("User Launch the external site {string} for edit history purpose")
	public void user_launch_the_external_site_for_edit_history_purpose(String string) throws Throwable {
		String url1 = FileReaderManager.getInstanceFRM().getInstanceCR().geturl1();
		getDrive(url1);
	}

	@When("User enter the microsoft email {string} in email id field for edit history purpose")
	public void user_enter_the_microsoft_email_in_email_id_field_for_edit_history_purpose(String string)
			throws Throwable {
		sleep(2000);
		btnClick(si.getQuesPage().getstafflogin());
		sleep(3000);
		String email = FileReaderManager.getInstanceFRM().getInstanceCR().getemail();
		enterText(si.getQuesPage().getexternalemail(), email);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(2000);
	}

	@When("User enter the password {string} in password field and click signin button for edit history purpose")
	public void user_enter_the_password_in_password_field_and_click_signin_button_for_edit_history_purpose(
			String string) throws Throwable {
		String password = FileReaderManager.getInstanceFRM().getInstanceCR().getpassword();
		enterText(si.getQuesPage().getexternalPassword(), password);
		btnClick(si.getQuesPage().getexnext());
		sleep(2000);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(8000);
	}

	@When("User click logout button and landed in login page")
	public void user_click_logout_button_and_landed_in_login_page() throws Throwable {
		sleep(37000);
		btnClick(si.gettop_page().getUserlogout());
	}

	@When("User Launch the external <url1>")
	public void user_launch_the_external_url1() throws Throwable {
		String url1 = FileReaderManager.getInstanceFRM().getInstanceCR().geturl1();
		getDrive(url1);
	}

	@When("User enter the microsoft <exemail> in email id field")
	public void user_enter_the_microsoft_exemail_in_email_id_field() throws Throwable {
		sleep(2000);
		btnClick(si.getQuesPage().getstafflogin());
		sleep(3000);
		String email = FileReaderManager.getInstanceFRM().getInstanceCR().getemail();
		enterText(si.getQuesPage().getexternalemail(), email);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(2000);
	}

	@When("User enter the password <expassword> in password field and click signin button")
	public void user_enter_the_password_expassword_in_password_field_and_click_signin_button() throws Throwable {

		String password = FileReaderManager.getInstanceFRM().getInstanceCR().getpassword();
		enterText(si.getQuesPage().getexternalPassword(), password);
		btnClick(si.getQuesPage().getexnext());
		sleep(2000);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(8000);

	}

	@When("User click the all client button and select account setting button")
	public void user_click_the_all_client_button_and_select_account_setting_button() throws Throwable {
		btnClick(si.gettop_page().getAllclients());
		sleep(4000);
		btnClick(si.gettop_page().getAccount());
		sleep(2000);
	}

	@When("User select the completed forms in account setting page")
	public void user_select_the_completed_forms_in_account_setting_page() throws Throwable {
		btnClick(si.gettop_page().getCompletedforms());
		sleep(2000);

	}

	@When("User click edit button and edit the completed forms and submit")
	public void user_click_edit_button_and_edit_the_completed_forms_and_submit() throws Throwable {
		btnClick(si.gettop_page().getEdit());
		btnClick(si.gettop_page().getEdityes());
		WebElement test = (si.gettop_page().getEdityes());
		test.sendKeys(Keys.CONTROL + "a");
		test.sendKeys(Keys.DELETE);

		sleep(2000);
		String edit = FileReaderManager.getInstanceFRM().getInstanceCR().getedit();
		enterText(si.gettop_page().getEdityes(), edit);
		sleep(2000);

		btnClick(si.gettop_page().getEdituk());
		WebElement test1 = (si.gettop_page().getEdituk());
		test1.sendKeys(Keys.CONTROL + "a");
		test1.sendKeys(Keys.DELETE);
		sleep(2000);
		String edit1 = FileReaderManager.getInstanceFRM().getInstanceCR().getedit1();
		enterText(si.gettop_page().getEdituk(), edit1);
		sleep(5000);

		btnClick(si.gettop_page().getEditsubmit());
		sleep(2000);
		btnClick(si.gettop_page().getGoback());

	}

	@When("User click the preview button and find the edits in preview page")
	public void user_click_the_preview_button_and_find_the_edits_in_preview_page() throws Throwable {
		sleep(2000);
		btnClick(si.gettop_page().getCompletedforms());
		btnClick(si.gettop_page().getEditpreview());
		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(3000);
		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(3000);

		btnClick(si.gettop_page().getClosepreview());
		sleep(4000);

	}

	@When("User click the client information and edit the details")
	public void user_click_the_client_information_and_edit_the_details() throws Throwable {
		btnClick(si.gettop_page().getInfoedit1());

		btnClick(si.gettop_page().getEditname());
		WebElement test2 = (si.gettop_page().getEditname());
		test2.sendKeys(Keys.CONTROL + "a");
		test2.sendKeys(Keys.DELETE);
		sleep(2000);

		String infoname = FileReaderManager.getInstanceFRM().getInstanceCR().getinfoname();
		enterText(si.gettop_page().getEditname(), infoname);

		btnClick(si.gettop_page().getEditpostcode());
		WebElement test3 = (si.gettop_page().getEditpostcode());
		test3.sendKeys(Keys.CONTROL + "a");
		test3.sendKeys(Keys.DELETE);
		sleep(2000);

		String infocode = FileReaderManager.getInstanceFRM().getInstanceCR().getinfocode();
		enterText(si.gettop_page().getPostcode(), infocode);

		btnClick(si.gettop_page().getEditsave());
		sleep(6000);
		btnClick(si.gettop_page().getAudit());
		sleep(1000);
		btnClick(si.gettop_page().getSafe());
		sleep(1000);
		btnClick(si.gettop_page().getRightcare());
		sleep(4000);

	}

	@When("User click logout button and landed in login page for TOP eligibility")
	public void user_click_logout_button_and_landed_in_login_page_for_top_eligibility() throws Throwable {
		sleep(30000);
		btnClick(si.gettop_page().getUserlogout());
	}
}
