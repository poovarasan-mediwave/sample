package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Consultation_form extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the service user url {string} for consultation form answer")
	public void launch_the_service_user_url_for_consultation_form_answer(String string) throws Throwable {
		browserLaunch("chrome");
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getuserurl());
		sleep(2000);
	}

	@When("User can enter the serviceuser email {string} for consultation form answer")
	public void user_can_enter_the_serviceuser_email_for_consultation_form_answer(String string) {
		
	}

	@When("User can enter the serviceuser password {string} for consultation form answer")
	public void user_can_enter_the_serviceuser_password_for_consultation_form_answer(String string) {
		
	}

	@When("User can enter the memorable word {string} and click the Rechapcha field")
	public void user_can_enter_the_memorable_word_and_click_the_rechapcha_field(String string) {
		
	}

	@When("User can click the login button and navigate to client dashboard")
	public void user_can_click_the_login_button_and_navigate_to_client_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User can click the start now option in consultation form for step3")
	public void user_can_click_the_start_now_option_in_consultation_form_for_step3() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User can answer all the questions")
	public void user_can_answer_all_the_questions() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User can click the save button and navigate to dashboard")
	public void user_can_click_the_save_button_and_navigate_to_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User again click the start now option")
	public void user_again_click_the_start_now_option() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User can answer remaining questions")
	public void user_can_answer_remaining_questions() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User can click the submit button")
	public void user_can_click_the_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
