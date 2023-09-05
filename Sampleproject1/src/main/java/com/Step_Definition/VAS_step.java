package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class VAS_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for VAS eligibility flow")
	public void launch_the_external_site_for_vas_eligibility_flow(String string) throws Throwable {
		browserLaunch("chrome");
		maximize();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getuserurl());
		sleep(1500);
	}

	@When("User enter the Email {string} and click the next button for VAS eligibility flow")
	public void user_enter_the_email_and_click_the_next_button_for_vas_eligibility_flow(String string)
			throws Throwable {
		String vasemail = FileReaderManager.getInstanceFRM().getInstanceCR().getVasemail();
		enterText(si.gettop_page().getLogemail(), vasemail);
	}

	@When("User enter the Password {string} and click recaptcha for VAS eligibility flow")
	public void user_enter_the_password_and_click_recaptcha_for_vas_eligibility_flow(String string) throws Throwable {
		String vaspass = FileReaderManager.getInstanceFRM().getInstanceCR().getVaspass();
		enterText(si.gettop_page().getLogpass(), vaspass);
	}

	@When("User enter the Memorable word and click login button for VAS eligibility flow")
	public void user_enter_the_memorable_word_and_click_login_button_for_vas_eligibility_flow() throws Throwable {
		String vasword = FileReaderManager.getInstanceFRM().getInstanceCR().getVasword();
		enterText(si.gettop_page().getPin(), vasword);
		sleep(3000);
		frameswitch(si.gettop_page().getRecaptchaframe());
		sleep(2000);
		btnClick(si.gettop_page().getRecaptcha());
		frame_out();
		sleep(4000);
		btnClick(si.gettop_page().getLogin());
		sleep(9000);
	}

	@When("User click the start button in the ashboard page for VAS eligibility flow")
	public void user_click_the_start_button_in_the_ashboard_page_for_vas_eligibility_flow() throws Throwable {
		// btnClick(si.gettop_page().getStart());
		btnClick(si.gettop_page().getCompletenow());
		sleep(2000);
	}

	@When("User enter the NHS number in find nhs field and click next")
	public void user_enter_the_nhs_number_in_find_nhs_field_and_click_next() throws Throwable {
		WebElement test = (si.getvas_page().getNHSno());
		test.sendKeys(Keys.CONTROL + "a");
		test.sendKeys(Keys.DELETE);
		String nhsno = FileReaderManager.getInstanceFRM().getInstanceCR().getNHSno();
		enterText(si.getvas_page().getNHSno(), nhsno);
		sleep(3000);
		btnClick(si.gettop_page().getYesornoperiodnext());

		sleep(2000);
		// btnClick(si.getvas_page().getNoNHS());

	}

	@When("User enter the DOB above 18years in date of birth field and click next")
	public void user_enter_the_dob_above_18years_in_date_of_birth_field_and_click_next() throws Throwable {
		btnClick(si.gettop_page().getDOB());

		String day = FileReaderManager.getInstanceFRM().getInstanceCR().getDay();
		enterText(si.gettop_page().getDay(), day);

		String month = FileReaderManager.getInstanceFRM().getInstanceCR().getMonth();
		enterText(si.gettop_page().getMonth(), month);

		String year = FileReaderManager.getInstanceFRM().getInstanceCR().getYear();
		enterText(si.gettop_page().getYear(), year);

		sleep(1500);
		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(4000);
	}

	@When("User enter the GP details in GP details field and click next")
	public void user_enter_the_gp_details_in_gp_details_field_and_click_next() throws Throwable {

		btnClick(si.getvas_page().getEntergp());

		// driver.findElement(By.xpath("//input[@class='react-select__input']")).sendKeys("CHANCERY");
		sleep(2000);
		String findubrn = FileReaderManager.getInstanceFRM().getInstanceCR().getFindubrn();
		enterText(si.getvas_page().getFindubrn(), findubrn);
		sleep(3000);
		btnClick(si.getvas_page().getGpdetails());
		sleep(2000);
		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(12000);

	}

	@When("User enter the UBRN number and passcode in ubrn and passcode field and click next")
	public void user_enter_the_ubrn_number_and_passcode_in_ubrn_and_passcode_field_and_click_next() throws Throwable {
		WebElement test = (si.getvas_page().getEnterUBRN());
		test.sendKeys(Keys.CONTROL + "a");
		test.sendKeys(Keys.DELETE);
		String vasubrn = FileReaderManager.getInstanceFRM().getInstanceCR().getVasubrn();
		enterText(si.getvas_page().getEnterUBRN(), vasubrn);
		sleep(2000);
		WebElement test1 = (si.getvas_page().getEnterpasscode());
		test1.sendKeys(Keys.CONTROL + "a");
		test1.sendKeys(Keys.DELETE);
		String vascode = FileReaderManager.getInstanceFRM().getInstanceCR().getVascode();
		enterText(si.getvas_page().getEnterpasscode(), vascode);

		btnClick(si.gettop_page().getYesornoperiodnext());
		sleep(2000);

	}

	@When("User click continue booking button it moves to dashboard page")
	public void user_click_continue_booking_button_it_moves_to_dashboard_page() throws Throwable {

		btnClick(si.getvas_page().getContibooking());
		sleep(2000);

	}
}
