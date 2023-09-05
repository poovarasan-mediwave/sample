package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class QB_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for the purpose of QB consultation for creation")
	public void launch_the_external_site_for_the_purpose_of_qb_consultation_for_creation(String string)
			throws Throwable {
		browserLaunch("chrome");
		wait(20);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		sleep(1500);
	}

	@When("User click the Staff login button for the purpose of QB consultation for creation")
	public void user_click_the_staff_login_button_for_the_purpose_of_qb_consultation_for_creation() throws Throwable {
		btnClick(si.getQuesPage().getstafflogin());
		sleep(1500);
	}

	@When("User enter the superadmin email {string} and click the next button")
	public void user_enter_the_superadmin_email_and_click_the_next_button(String string) throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getemail());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		sleep(2000);
	}

	@When("User enter the superadmin password {string} and click the signup button")
	public void user_enter_the_superadmin_password_and_click_the_signup_button(String string) throws Throwable {
		enterText(si.getQuesPage().getexternalPassword(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
		btnClick(si.getQuesPage().getexnext());
		sleep(6000);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(8000);
	}

	@When("User can click the forms&questionnaire option and click the create a new form button")
	public void user_can_click_the_forms_questionnaire_option_and_click_the_create_a_new_form_button()
			throws Throwable {
		btnClick(si.getQuesPage().getqb());
		sleep(21000);
		btnClick(si.getQuesPage().getcreate());
		sleep(10000);
	}

	@When("USer enter the Questionnaire name and internal questionnaire name field")
	public void u_ser_enter_the_questionnaire_name_and_internal_questionnaire_name_field() throws Throwable {
		String displayname = FileReaderManager.getInstanceFRM().getInstanceCR().getdisplayname();
		enterText(si.getQuesPage().getdisplayname(), displayname);

		wait(10);
		String internalques = FileReaderManager.getInstanceFRM().getInstanceCR().getinternalques();
		enterText(si.getQuesPage().getinternalques(), internalques);
		sleep(9000);

	}

	@When("User can select the questionnaire type and services for form creation")
	public void user_can_select_the_questionnaire_type_and_services_for_form_creation() throws Throwable {
		btnClick(si.getQb().getQuestionnaire_Type());
		sleep(2000);
		clickon_Listelement(si.getQb().getSelect_QuestionnaireType(), 3);
//		0 - Demographic
//		1 - Medical history
//		2 - Eligibility
//		3 - Consultation
//		4 - Counselling 
		wait(20);

		btnClick(si.getQb().getServices());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_Service(), 2);
//		0 - TOP
//		1 - VAS
//		2 - LARC
		sleep(1500);
	}

	@When("User can enter the estimated completion time field and click the next button")
	public void user_can_enter_the_estimated_completion_time_field_and_click_the_next_button() throws Throwable {
		enterText(si.getQuesPage().getESTtime(), FileReaderManager.getInstanceFRM().getInstanceCR().getESTtime());
		wait(10);
		btnClick(si.getQuesPage().getnext());
	}

	@When("User can add the multiple choice question and enter the question name and options")
	public void user_can_add_the_multiple_choice_question_and_enter_the_question_name_and_options() throws Throwable {
		sleep(8000);
		btnClick(si.getQuesPage().getmultichoice());
		wait(10);
		enterText(si.getQuesPage().getMCque(), FileReaderManager.getInstanceFRM().getInstanceCR().getmultichoice());
		wait(10);
		enterText(si.getQuesPage().getsupporttext(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getsupporttext());
		wait(10);
		enterText(si.getQuesPage().getoption1(), FileReaderManager.getInstanceFRM().getInstanceCR().getoption1());
		wait(10);
		enterText(si.getQuesPage().getoption2(), FileReaderManager.getInstanceFRM().getInstanceCR().getoption2());
		wait(10);

	}

	@When("User can add the freetext question and enter the question name")
	public void user_can_add_the_freetext_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getfreetext());
		btnClick(si.getQuesPage().getoptional());
		wait(10);
		enterText(si.getQuesPage().getMCque1(), FileReaderManager.getInstanceFRM().getInstanceCR().getfreetext());
		wait(10);
	}

	@When("User can add the Yes\\/No question and enter the question name")
	public void user_can_add_the_yes_no_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getyesorno());
		enterText(si.getQuesPage().getMCque2(), FileReaderManager.getInstanceFRM().getInstanceCR().getyesorno());
		wait(10);

	}

	@When("User can add the date input question and enter the question name")
	public void user_can_add_the_date_input_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getdateinput());
		btnClick(si.getQuesPage().getdatecondi());
		wait(10);
		enterText(si.getQuesPage().getMCque3(), FileReaderManager.getInstanceFRM().getInstanceCR().getdateinput());
		wait(10);
		btnClick(si.getQuesPage().getbeforedate());
		btnClick(si.getQuesPage().getBdate());
		wait(10);
		btnClick(si.getQuesPage().getafterdate());
		btnClick(si.getQuesPage().getAdate());

	}

	@When("User add the Number input question and enter the question name")
	public void user_add_the_number_input_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getnumbertype());
		btnClick(si.getQuesPage().getnumcondi());
		wait(10);
		enterText(si.getQuesPage().getMCque4(), FileReaderManager.getInstanceFRM().getInstanceCR().getnumberinput());
		enterText(si.getQuesPage().getgreater(), FileReaderManager.getInstanceFRM().getInstanceCR().getgreater());
		enterText(si.getQuesPage().getlesser(), FileReaderManager.getInstanceFRM().getInstanceCR().getlesser());
		sleep(2000);
		enterText(si.getQuesPage().getrange(), FileReaderManager.getInstanceFRM().getInstanceCR().getrange());
		wait(10);

	}

	@When("User add the dropdown question and enter the question name")
	public void user_add_the_dropdown_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getdropdown());
		enterText(si.getQuesPage().getMCque6(), FileReaderManager.getInstanceFRM().getInstanceCR().getdropdown());
		wait(10);
		enterText(si.getQuesPage().getdrop1(), FileReaderManager.getInstanceFRM().getInstanceCR().getdrop1());
		enterText(si.getQuesPage().getdrop2(), FileReaderManager.getInstanceFRM().getInstanceCR().getdrop2());
		wait(10);

	}

	@When("User add the section question and enter the question name")
	public void user_add_the_section_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getsection());
		enterText(si.getQuesPage().getMCque7(), FileReaderManager.getInstanceFRM().getInstanceCR().getsection());
		wait(10);

	}

	@When("User add the Opening statement question and enter the question name")
	public void user_add_the_opening_statement_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getopening());
		enterText(si.getQuesPage().getMCque8(), FileReaderManager.getInstanceFRM().getInstanceCR().getopening());
		wait(10);

	}

	@When("User add the Closing statement question and enter the question name")
	public void user_add_the_closing_statement_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getclosing());
		enterText(si.getQuesPage().getMCque9(), FileReaderManager.getInstanceFRM().getInstanceCR().getclosing());
	}

	@When("User add the Conditional segment question and enter the question name")
	public void user_add_the_conditional_segment_question_and_enter_the_question_name() throws Throwable {
		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getsegment());
		btnClick(si.getQuesPage().getselectfield());
		btnClick(si.getQuesPage().getgestation());
		sleep(2000);
		btnClick(si.getQuesPage().getselectfield());
		btnClick(si.getQuesPage().getabovegest());
		sleep(1000);
		// btnClick(si.getQuesPage().getselectfield());
		enterText(si.getQuesPage().getweeks(), FileReaderManager.getInstanceFRM().getInstanceCR().getweeks());

		// btnClick(si.getQuesPage().getselectfield());
//		sleep(3000);
//		String days = FileReaderManager.getInstanceFRM().getInstanceCR().getdays();
//		enterText(si.getQuesPage().getdays(), days);
		sleep(1000);

		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getsegment());
		btnClick(si.getQuesPage().getselectfield());
		btnClick(si.getQuesPage().getDOB());
		sleep(2000);
		btnClick(si.getQuesPage().getselectfield());
		btnClick(si.getQuesPage().getbelowdob());

		enterText(si.getQuesPage().getyears(), FileReaderManager.getInstanceFRM().getInstanceCR().getyears());
		sleep(2000);

		btnClick(si.getQuesPage().getquestype());
		wait(10);
		btnClick(si.getQuesPage().getsegment());
		btnClick(si.getQuesPage().getselectfield());
		btnClick(si.getQuesPage().getBMI());
		sleep(2000);
		// btnClick(si.getQuesPage().getselectfield());

		enterText(si.getQuesPage().getabovebmi(), FileReaderManager.getInstanceFRM().getInstanceCR().getabovebmi());
		sleep(3000);
		enterText(si.getQuesPage().getbelowbmi(), FileReaderManager.getInstanceFRM().getInstanceCR().getbelowbmi());
		sleep(6000);

		btnClick(si.getQuesPage().getsavedraft());
	}

	@When("User click continue editing and add the conditional questions and click save draft")
	public void user_click_continue_editing_and_add_the_conditional_questions_and_click_save_draft() throws Throwable {
		btnClick(si.getQuesPage().getconti());
		sleep(3000);
		btnClick(si.getQuesPage().getselectques2());
		sleep(2000);
		btnClick(si.getQuesPage().getconditional());

		btnClick(si.getQuesPage().getaddconditional1());
		sleep(2000);
		btnClick(si.getQuesPage().getquestype());
		btnClick(si.getQuesPage().getfreetext());
		sleep(2000);
		enterText(si.getQuesPage().getMCque1(), FileReaderManager.getInstanceFRM().getInstanceCR().getfreetext());
		sleep(2000);

		btnClick(si.getQuesPage().getbackbtn());
		btnClick(si.getQuesPage().getselectques1());
		sleep(1000);
		btnClick(si.getQuesPage().getyesornocondi());
		btnClick(si.getQuesPage().getaddconditional1());
		sleep(2000);
		btnClick(si.getQuesPage().getquestype());
		sleep(2000);
		btnClick(si.getQuesPage().getmultichoice());
		wait(10);
		enterText(si.getQuesPage().getMCque(), FileReaderManager.getInstanceFRM().getInstanceCR().getmultichoice());
		wait(10);
		enterText(si.getQuesPage().getsupporttext(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getsupporttext());
		wait(10);
		enterText(si.getQuesPage().getoption1(), FileReaderManager.getInstanceFRM().getInstanceCR().getoption1());
		wait(10);
		enterText(si.getQuesPage().getoption2(), FileReaderManager.getInstanceFRM().getInstanceCR().getoption2());
		sleep(2000);

		btnClick(si.getQuesPage().getsavedraft());
		sleep(6000);

	}

	@When("User click the back to dashboard and select preview")
	public void user_click_the_back_to_dashboard_and_select_preview() throws Throwable {
		sleep(6000);
		btnClick(si.getQuesPage().getbacktodashboard());
		sleep(10000);
		btnClick(si.getQuesPage().getpreview());
		sleep(4000);
		btnClick(si.getQuesPage().getclosepreview());
		sleep(2000);
	}

	@When("User can click delete button")
	public void user_can_click_delete_button() throws Throwable {
		btnClick(si.getQuesPage().getdeletebtn());
		sleep(2000);
		btnClick(si.getQuesPage().getdeleteque());
		sleep(10000);
	//	btnClick(si.getQuesPage().getapproval());
	}


}
