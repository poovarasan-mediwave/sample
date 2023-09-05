package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LARC_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the service user url {string} for LARC eligibility flow")
	public void launch_the_service_user_url_for_larc_eligibility_flow(String string) throws Throwable {

		browserLaunch("chrome");
		wait(20);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getuserurl());
		sleep(2000);
	}

	@When("User enter the serviceuser Email {string} and click the Next button")
	public void user_enter_the_serviceuser_email_and_click_the_next_button(String string) throws Throwable {
		enterText(si.gettop_page().getLogemail(), FileReaderManager.getInstanceFRM().getInstanceCR().getLarcemail());
		wait(20);
	}

	@When("User enter the serviceuser Password {string} and click Recaptcha and next button")
	public void user_enter_the_serviceuser_password_and_click_recaptcha_and_next_button(String string)
			throws Throwable {
		enterText(si.gettop_page().getLogpass(), FileReaderManager.getInstanceFRM().getInstanceCR().getLarcpass());

		sleep(2000);
		enterText(si.gettop_page().getPin(), FileReaderManager.getInstanceFRM().getInstanceCR().getLarccode());
	}

	@When("User click logout button and landed in login page for LARC eligibility flow")
	public void user_click_logout_button_and_landed_in_login_page_for_larc_eligibility_flow() {
		btnClick(si.gettop_page().getUserlogout());
	}

	@When("User enter the Memorable word and Click Login button")
	public void user_enter_the_memorable_word_and_click_login_button() throws Throwable {

		frameswitch(si.gettop_page().getRecaptchaframe());
		sleep(2000);
		btnClick(si.gettop_page().getRecaptcha());
		frame_out();
		sleep(4000);
		btnClick(si.gettop_page().getLogin());
		sleep(14000);

	}

	@When("User click the Start button in the dashboard page")
	public void user_click_the_start_button_in_the_dashboard_page() throws Throwable {
		// btnClick(si.gettop_page().getStart());
		btnClick(si.gettop_page().getCompletenow());
		sleep(2000);

	}

	@When("User click Yes or No button for last 3months")
	public void user_click_yes_or_no_button_for_last_3months() throws Throwable {

		// btnClick(si.getlarc_page().getYesbtn());
//		btnClick(si.gettop_page().getArrangecall());
//		btnClick(si.gettop_page().getAnytime());
//		btnClick(si.gettop_page().getCallback());
		sleep(5000);
		btnClick(si.getlarc_page().getNobtn());
		sleep(1500);

	}

	@When("User click select the treatment type and click next button")
	public void user_click_select_the_treatment_type_and_click_next_button() throws Throwable {

		btnClick(si.getlarc_page().getChange());
		sleep(2000);

		btnClick(si.getlarc_page().getSubmit());
		sleep(2000);

	}

	@When("User click DOB and enter below {int} years and Yes or no for sexually active button")
	public void user_click_dob_and_enter_below_years_and_yes_or_no_for_sexually_active_button(Integer int1)
			throws Throwable {

		btnClick(si.gettop_page().getDOB());

		String day = FileReaderManager.getInstanceFRM().getInstanceCR().getDay();
		enterText(si.gettop_page().getDay(), day);

		String month = FileReaderManager.getInstanceFRM().getInstanceCR().getMonth();
		enterText(si.gettop_page().getMonth(), month);

		String year = FileReaderManager.getInstanceFRM().getInstanceCR().getYear();
		enterText(si.gettop_page().getYear(), year);

		sleep(1500);

		btnClick(si.getlarc_page().getYesbtn());
		sleep(2000);

		btnClick(si.gettop_page().getYesornoperiodnext());

	}

	@When("User click Yes or No in GP details and registred uk address and Uk resident")
	public void user_click_yes_or_no_in_gp_details_and_registred_uk_address_and_uk_resident() throws Throwable {
		sleep(60000);

		btnClick(si.gettop_page().getYesgp());

		// btnClick(si.gettop_page().getNogp());
		sleep(2000);

		// btnClick(si.getlarc_page().getNo2());

		// btnClick(si.getlarc_page().getNo4());

		// btnClick(si.getlarc_page().getNo6());
		btnClick(si.getvas_page().getEntergp());
		sleep(2000);
		String findubrn = FileReaderManager.getInstanceFRM().getInstanceCR().getLarcphone();
		enterText(si.getvas_page().getFindubrn(), findubrn);
		sleep(5000);
		btnClick(si.getlarc_page().getAddress1());

		sleep(2000);
		btnClick(si.gettop_page().getYesornoperiodnext());

	}

	@When("User click Yes or No for UK address and moves to enter GP details or arrange call back")
	public void user_click_yes_or_no_for_uk_address_and_moves_to_enter_gp_details_or_arrange_call_back()
			throws Throwable {
		// btnClick(si.getlarc_page().getYes7());

		// btnClick(si.getlarc_page().getNo8());
		sleep(6000);

		btnClick(si.gettop_page().getArrangecall());
		sleep(6000);

//		String flatno = FileReaderManager.getInstanceFRM().getInstanceCR().getFlatno();
//	enterText(si.getlarc_page().getHouseno(), flatno);
//
//		String streets = FileReaderManager.getInstanceFRM().getInstanceCR().getStreets();
//		enterText(si.gettop_page().getStreet(), streets);
//
//	String cities = FileReaderManager.getInstanceFRM().getInstanceCR().getCities();
//	enterText(si.gettop_page().getTown(), cities);
//
//	String postcodes = FileReaderManager.getInstanceFRM().getInstanceCR().getPostcodes();
//	enterText(si.gettop_page().getPostcode(), postcodes);

//		btnClick(si.gettop_page().getYesornoperiodnext());
	}

	@When("User click arrange call back button and anytime radio button")
	public void user_click_arrange_call_back_button_and_anytime_radio_button() throws Throwable {
		sleep(6000);
		// btnClick(si.getlarc_page().getYesbtn());

		btnClick(si.gettop_page().getAnytime());
		sleep(2000);

	}

	@When("User click the book call back button and moves to dashboard page")
	public void user_click_the_book_call_back_button_and_moves_to_dashboard_page() throws Throwable {

		btnClick(si.gettop_page().getCallback());
		sleep(3000);

	}
}
