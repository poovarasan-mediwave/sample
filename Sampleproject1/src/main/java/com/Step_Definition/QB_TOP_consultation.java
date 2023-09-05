package com.Step_Definition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.Configuration_Reader.Configure_Reader;
import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class QB_TOP_consultation extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for TOPconsultation form creation")
	public void launch_the_external_site_for_to_pconsultation_form_creation(String string) throws Throwable {
		browserLaunch("chrome");
		getDrive(FileReaderManager.getInstanceCR().getURL());
		sleep(1500);
	}

	@When("User can click Staff login button for TOPconsultation form creation")
	public void user_can_click_staff_login_button_for_to_pconsultation_form_creation() throws Throwable {
		ClickOnElement(si.getExternal_Login().getStafflogin_Button());
		sleep(2000);
		System.out.println("Enter the microsoft account page");
	}

	@When("User can enter the microsoft email {string} and click the next button for TOPconsultation form creation")
	public void user_can_enter_the_microsoft_email_and_click_the_next_button_for_to_pconsultation_form_creation(
			String string) throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(), FileReaderManager.getInstanceCR().getEmail());
		sleep(2000);
		ClickOnElement(si.getExternal_Login().getExternalNext());
		sleep(2000);
	}

	@When("User can enter the password {string} and click the signup button for TOPconsultation form creation")
	public void user_can_enter_the_password_and_click_the_signup_button_for_to_pconsultation_form_creation(
			String string) throws Throwable {
		enterText(si.getExternal_Login().getExternalPassword(), FileReaderManager.getInstanceCR().getpassword());
		sleep(2000);
		ClickOnElement(si.getExternal_Login().getExternalNext());
		ClickOnElement(si.getExternal_Login().getExternalNext());
		System.out.println("Successfully login to the Microsaoft account");
		sleep(10000);
	}

	@When("User click the formsandquestionnaire option and also click the create a new form button for TOPconsultation form creation")
	public void user_click_the_formsandquestionnaire_option_and_also_click_the_create_a_new_form_button_for_to_pconsultation_form_creation()
			throws Throwable {
		System.out.println("User enter the forms&questionnaire page");
		ClickOnElement(si.getQb().getFormsquestionnaire());
		sleep(20000);
		ClickOnElement(si.getQb().getCreateNew_button());
		sleep(10000);
	}

	@When("USer can enter the Questionnaire name and internal questionnaire name fields for TOPconsultation form creation")
	public void u_ser_can_enter_the_questionnaire_name_and_internal_questionnaire_name_fields_for_to_pconsultation_form_creation()
			throws Throwable {
		enterText(si.getQb().getQuestionnaire_Name(), FileReaderManager.getInstanceCR().getQuestionnaireName());
		wait(20);

		enterText(si.getQb().getInternalQuestionnaire_name(),
				FileReaderManager.getInstanceCR().getInternalquestionnairename());
		sleep(4000);
	}

	@When("User can select the questionnaire type and services for TOPconsultation form creation")
	public void user_can_select_the_questionnaire_type_and_services_for_to_pconsultation_form_creation()
			throws Throwable {
		ClickOnElement(si.getQb().getQuestionnaire_Type());
		sleep(2000);
		clickon_ListElement_indexbased(si.getQb().getSelect_QuestionnaireType(), 3);
//		0 - Demographic
//		1 - Medical history
//		2 - Eligibility
//		3 - Consultation
//		4 - Counselling 
		wait(20);

		ClickOnElement(si.getQb().getServices());
		sleep(1500);
		clickon_ListElement_indexbased(si.getQb().getSelect_Service(), 0);
//		0 - TOP
//		1 - VAS
//		2 - LARC
		sleep(1500);
	}

	@When("User click the next button for TOPconsultation form creation")
	public void user_click_the_next_button_for_to_pconsultation_form_creation() throws Throwable {
		jsScrollDownElement(si.getQb().getNext_Button());
		ClickOnElement(si.getQb().getNext_Button());
		sleep(5000);
	}

//	0 - Multiplechoice Question;
//	1 - Free text input Question
//	2 - Yes/No Question
//	3 - Date input Question
//	4 - Number input Question
//	5 - Picture type Question
//	6 - Likert
//	7 - Dropdown Question
//	8 - Section
//	9 - Opening Statement 
//	10 - Closing Statement
//	11 - Conditional Segment

	@When("User can add Q.No1 Opening Statement type question")
	public void user_can_add_q_no1_opening_statement_type_question() throws Throwable {
		clickon_ListElement_indexbased(si.getQb().getSelect_DifferentTypesofQuestion(), 9);
		sleep(1500);
		enterText(si.getQb().getOpeningstatementquestion_textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getOpening_Statement());
		sleep(1500);
	}

	@When("User can add Q.No2 Section question")
	public void user_can_add_q_no2_section_question() throws Throwable {
		jsScrollDownElement(si.getQb().getSelectquestion_Type());
		sleep(1500);
		ClickOnElement(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_ListElement_indexbased(si.getQb().getSelect_DifferentTypesofQuestion(), 8);
		sleep(1500);

	}

	@When("User can enter question name")
	public void user_can_enter_question_name() throws Throwable {
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getSection_Question1());
		sleep(1500);
	}

	@When("User can add Q.No3 Yes\\/No question")
	public void user_can_add_q_no3_yes_no_question() throws Throwable {
		jsScrollDownElement(si.getQb().getSelectquestion_Type());
		sleep(1500);
		ClickOnElement(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_ListElement_indexbased(si.getQb().getSelect_DifferentTypesofQuestion(), 2);
		sleep(1500);

	}

	@When("User can enter question name and supporting text")
	public void user_can_enter_question_name_and_supporting_text() throws Throwable {
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion1());
		sleep(1500);
		enterText(si.getQb().getSupporting_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion1_supportingtext1());
		sleep(1500);
		ClickOnElement(si.getQb().getTriggers());
		sleep(1500);
		triggers(si.getQb().getQuestionHeading(), "1", "Rightcare", 1, 3);
		sleep(1500);
	}

	@When("USer can add Q.No4 Yes\\/No question")
	public void u_ser_can_add_q_no4_yes_no_question() throws Throwable {
		user_can_add_q_no3_yes_no_question();

		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion2());
		sleep(1500);
	}

	@When("User can add Q.No5 Section question")
	public void user_can_add_q_no5_section_question() throws Throwable {
		user_can_add_q_no2_section_question();
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getSection_Question2());
		sleep(1500);

	}

	@When("User can add Q.No6 Yes\\/No question")
	public void user_can_add_q_no6_yes_no_question() throws Throwable {
		user_can_add_q_no3_yes_no_question();
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion3());
		sleep(1500);
		enterText(si.getQb().getSupporting_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion3_supportingtext());
		sleep(1500);
	}

	@When("User can add Q.No7 Section question")
	public void user_can_add_q_no7_section_question() throws Throwable, Throwable {
		user_can_add_q_no2_section_question();
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getSection_Question3());
		sleep(1500);
	}

	@When("User can add Q.No8 Yes\\/No question")
	public void user_can_add_q_no8_yes_no_question() throws Throwable, Throwable {

		user_can_add_q_no3_yes_no_question();
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion4());
		sleep(1500);
		enterText(si.getQb().getSupporting_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion4_supportingtext());
		sleep(1500);

	}

//	@When("User can add conditional based question under the Yes\\/No question")
//	public void user_can_add_conditional_based_question_under_the_yes_no_question() throws Throwable {
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickon_ListElement_indexbased(si.getQb().getAddConditional_Questions(), 0);
//		sleep(1500);
//	}
//
//	@When("User can add Multiple choice question under the conditional based question")
//	public void user_can_add_multiple_choice_question_under_the_conditional_based_question() throws Throwable {
//		javascriptScrollDown(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		btnClick(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		clickon_ListElement_indexbased(si.getQb().getSelect_DifferentTypesofQuestion(), 0);
//		sleep(1500);
//	}
//
//	@When("User can enter MCQ question name")
//	public void user_can_enter_mcq_question_name() throws Throwable {
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion4());
//		sleep(1500);
//
//	}
//
//	@When("User can add Muliple choice questions options")
//	public void user_can_add_muliple_choice_questions_options() throws Throwable {
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(12, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion4_Options());
//		sleep(1500);
//		clickon_ListElement_indexbased(si.getQb().getAddConditional_Questions(), 13);
//		sleep(3000);
//	}
//
//	@When("User can add Freetext question under the conditional based question")
//	public void user_can_add_freetext_question_under_the_conditional_based_question() throws Throwable {
//		javascriptScrollDown(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		btnClick(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		clickon_ListElement_indexbased(si.getQb().getSelect_DifferentTypesofQuestion(), 1);
//		sleep(1500);
//	}
//
//	@When("User can enter freetext question name")
//	public void user_can_enter_freetext_question_name() {
//
//	}
//
//	@When("User can click the back option")
//	public void user_can_click_the_back_option() throws Throwable {
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion4_Option7());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No9 Dropdown question")
//	public void user_can_add_q_no9_dropdown_question() throws Throwable {
//		javascriptScrollDown(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		btnClick(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		clickon_ListElement_indexbased(si.getQb().getSelect_DifferentTypesofQuestion(), 7);
//		sleep(1500);
//	}
//
//	@When("User can add conditional based question under the dropdown")
//	public void user_can_add_conditional_based_question_under_the_dropdown() throws Throwable {
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdownQuestion1());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdownQuestion1_supportingtext());
//		sleep(1500);
//		clickonAddoptions(2, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdownQuestion1_Options());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no9_dropdown_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_DropdownQuestion1_Option1());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(), FileReaderManager.getInstanceFRM().getInstanceCR()
//				.getDropdown_DropdownQuestion1_Option1_supportingtext());
//		sleep(1500);
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_DropdownQuestion1_Option1_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("USer can add Q.No10 Yes\\/No question and add the triggers")
//	public void u_ser_can_add_q_no10_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion5());
//
//	}
//
//	@When("User can add the triggers")
//	public void user_can_add_the_triggers() throws Throwable {
//		btnClick(si.getQb().getTriggers());
//		sleep(1500);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 1);
//		sleep(1500);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 3);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 4);
//		sleep(1500);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 9);
//		sleep(1500);
//	}
//
//	@When("USer can add Q.No11 Yes\\/No question and add the triggers")
//	public void u_ser_can_add_q_no11_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 5);
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion6());
//		btnClick(si.getQb().getTriggers());
//		sleep(1500);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 1);
//		sleep(1500);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 3);
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No12 Section question")
//	public void user_can_add_q_no12_section_question() throws Throwable, Throwable {
//		user_can_add_q_no2_section_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getSection_question4());
//
//	}
//
//	@When("User can add Q.No13 Yes\\/No question and add conditional based question")
//	public void user_can_add_q_no13_yes_no_question_and_add_conditional_based_question() throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion7());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo1_YesorNoQuestion7());
//		sleep(1500);
//		user_can_add_the_triggers();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo2_YesorNoQuestion7());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 1);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 3);
//		wait(20);
//
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 4);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 9);
//		wait(20);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No14 Dropdown question and the triggers")
//	public void user_can_add_q_no14_dropdown_question_and_the_triggers() throws Throwable {
//		user_can_add_q_no9_dropdown_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdownQuestion2());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdownQuestion2_Options());
//		sleep(1500);
//
//	}
//
//	@When("User can add triggers under the q.no14")
//	public void user_can_add_triggers_under_the_q_no14() throws Throwable {
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 1);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 4);
//		wait(20);
//
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 4);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 8);
//		wait(20);
//	}
//
//	@When("User can add Q.No15 Yes\\/No question and add the triggers")
//	public void user_can_add_q_no15_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion8());
//		sleep(1500);
//		user_can_add_the_triggers();
//	}
//
//	@When("User can add Q.No16 Yes\\/No question and add the triggers")
//	public void user_can_add_q_no16_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion9());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion9_supportingtext());
//		sleep(1500);
//		user_can_add_triggers_under_the_q_no14();
//	}
//
//	@When("User can add Q.No17 Yes\\/No question and add the triggers")
//	public void user_can_add_q_no17_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion10());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion10_supportingtext());
//		sleep(1500);
//		user_can_add_triggers_under_the_q_no14();
//
//	}
//
//	@When("User can add Q.No18 Yes\\/No question and add the triggers")
//	public void user_can_add_q_no18_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion11());
//		sleep(1500);
//		user_can_add_triggers_under_the_q_no14();
//
//	}
//
//	@When("User can add Q.No19 Yes\\/No question and add the triggers")
//	public void user_can_add_q_no19_yes_no_question_and_add_the_triggers() throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion12());
//		sleep(1500);
//		user_can_add_triggers_under_the_q_no14();
//	}
//
//	@When("User can add Q.No20 Yes\\/No question and add different types of conditional based question and add the triggers")
//	public void user_can_add_q_no20_yes_no_question_and_add_different_types_of_conditional_based_question_and_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion13());
//		sleep(1500);
//		user_can_add_triggers_under_the_q_no14();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNoQuestion13());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		sleep(1500);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 9);
//		wait(20);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No21 Yes\\/No question and the conditional based question")
//	public void user_can_add_q_no21_yes_no_question_and_the_conditional_based_question() throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion14());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion14());
//		sleep(1500);
//		clickonAddoptions(7, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion14_Options());
//		sleep(2000);
//		javascriptScrollUp(si.getQb().getConditional());
//		wait(20);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickon_ListElement_indexbased(si.getQb().getAddConditional_Questions(), 8);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion14());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No22 Multiple choice question")
//	public void user_can_add_q_no22_multiple_choice_question() throws Throwable {
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(), FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ1());
//		sleep(1500);
//		clickonAddoptions(6, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ1_Options());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No23 Section question")
//	public void user_can_add_q_no23_section_question() throws Throwable, Throwable {
//		user_can_add_q_no2_section_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getSection_question5());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No24 Yes\\/No question and add the different types of conditional based questions")
//	public void user_can_add_q_no24_yes_no_question_and_add_the_different_types_of_conditional_based_questions()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion15());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//	}
//
//	@When("User can add Number input question under the conditional based question")
//	public void user_can_add_number_input_question_under_the_conditional_based_question() throws Throwable {
//		javascriptScrollDown(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		btnClick(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 4);
//		sleep(1500);
//	}
//
//	@When("User can add conditional based questions under the Q.No24")
//	public void user_can_add_conditional_based_questions_under_the_q_no24() throws Throwable, Throwable {
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput1_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo1_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput2_YesorNoQuestion15());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput2_YesorNoQuestion15_supportingtext());
//		sleep(1500);
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput3_YesorNoQuestion15());
//		sleep(1500);
//	}
//
//	@When("User can add Dateinput question under the conditional based question")
//	public void user_can_add_dateinput_question_under_the_conditional_based_question() throws Throwable {
//		javascriptScrollDown(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		btnClick(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 3);
//		sleep(1500);
//	}
//
//	@When("User can add remaining conditional based questions under the Q.No24")
//	public void user_can_add_remaining_conditional_based_questions_under_the_q_no24() throws Throwable, Throwable {
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDateinput1_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput4_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_dateinput_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDateinput2_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_q_no9_dropdown_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_YesorNoQuestion15());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_YesorNoQuestion15_Options());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 6);
//		wait(20);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo2_YesorNoQuestion15());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo2_YesorNoQuestion15_supportingtext());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 0);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 1);
//		wait(20);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNo2_YesorNoQuestion15());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput5_YesorNoQuestion15());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput5_YesorNoQuestion15_supportingtext());
//		sleep(1500);
//
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput6_YesorNoQuestion15());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput6_YesorNoQuestion15_supportingtext());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo3_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput1_YesorNo3_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput2_YesorNo3_YesorNoQuestion15());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNo3_YesorNoQuestion15());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNo_YesorNo3_YesorNoQuestion15());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No25 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no25_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion16());
//		sleep(1500);
//
//	}
//
//	@When("User can add the triggers under q.no25")
//	public void user_can_add_the_triggers_under_q_no25() throws Throwable {
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 0);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 1);
//		wait(20);
//
//	}
//
//	@When("User can add conditional based questions under q.no25")
//	public void user_can_add_conditional_based_questions_under_q_no25() throws Throwable {
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNoQuestion16());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNoQuestion16());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No26 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no26_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion17());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion17());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion17_Options());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion17_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 1);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion17_Options());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 2);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion17_Options());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(2000);
//		btnClick(si.getQb().getBackoption());
//		sleep(2000);
//
//	}
//
//	@When("User can add Q.No27 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no27_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion18());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no9_dropdown_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_YesorNoQuestion18());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 6);
//		wait(20);
//
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_YesorNoQuestion18_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No28 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no28_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion19());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion19_supportingtext());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion19());
//		sleep(1500);
//		clickonAddoptions(6, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 1);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 2);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 3);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 4);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 5);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 6);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 7);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion19_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No29 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no29_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion20());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNoQuestion20());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreeText_YesorNo_YesorNoQuestion20());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_dateinput_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDateinput_YesorNoQuestion20());
//		sleep(1500);
//
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput_YesorNoQuestion20());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreeText_YesorNoQuestion20());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No30 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no30_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion21());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNoQuestion21());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext1_YesorNoQuestion21());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext2_YesorNoQuestion21());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No31 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no31_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion22());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion22());
//		sleep(1500);
//		clickonAddoptions(7, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion22_Options());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNoQuestion22());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No32 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no32_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion23());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion23());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(5, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion23_Options());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 6);
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion23_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNoQuestion23());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No33 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no33_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion24());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo1_YesorNoQuestion24());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNo_YesorNoQuestion24());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo2_YesorNoQuestion24());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNo2_YesorNoQuestion24());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNo2_YesorNoQuestion24());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo3_YesorNoQuestion24());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNo3_YesorNoQuestion24());
//		sleep(1500);
//		clickonAddoptions(2, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNo3_YesorNoQuestion24_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_dateinput_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getDateinput_YesorNoQuestion24());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo4_YesorNoQuestion24());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo5_YesorNoQuestion24());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo6_YesorNoQuestion24());
//		sleep(1500);
//
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNo6_YesorNoQuestion24());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No34 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no34_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion25());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion25());
//		sleep(1500);
//		clickonAddoptions(5, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion25_Options());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_YesorNoQuestion25());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No35 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no35_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable, Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion26());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion26());
//		sleep(1500);
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion26_Options());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo1_YesorNoQuestion26());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNo1_YesorNoQuestion26());
//		sleep(1500);
//
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNo1_YesorNoQuestion26_supportingtext());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(2, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNo1_YesorNoQuestion26_Options());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 3);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(), FileReaderManager.getInstanceFRM().getInstanceCR()
//				.getFreetext_MCQ_YesorNo1_YesorNoQuestion26_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput1_YesorNo1_YesorNoQuestion26());
//		sleep(1500);
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinput2_YesorNo1_YesorNoQuestion26());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo2_YesorNoQuestion26());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext1_YesorNo2_YesorNoQuestion26());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext2_YesorNo2_YesorNoQuestion26());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext3_YesorNo2_YesorNoQuestion26());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No36 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no36_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNoQuestion27());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion27());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(5, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getMCQ_YesorNoQuestion27_Options());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 6);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 2, si.getQb().getTrigger_Options(), 6);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 11);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 3, si.getQb().getTrigger_Options(), 9);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 16);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 4, si.getQb().getTrigger_Options(), 12);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 21);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 5, si.getQb().getTrigger_Options(), 15);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 26);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 6, si.getQb().getTrigger_Options(), 18);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 31);
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 0);
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo1_MCQ_YesorNoQuestion27_Option1());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 2);
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo2_MCQ_YesorNoQuestion27_Option3());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(), FileReaderManager.getInstanceFRM().getInstanceCR()
//				.getFreetext1_YesorNo2_MCQ_YesorNoQuestion27_Option3());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 6);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getFreetext_MCQ_YesorNoQuestion27_Option7());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().getYesorNo_YesorNoQuestion27());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion27());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion27());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No37 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no37_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion28());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion28());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion28());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion28());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No38 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no38_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion29());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion29());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(3, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion29_Options());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 7);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 2, si.getQb().getTrigger_Options(), 6);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 11);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 3, si.getQb().getTrigger_Options(), 9);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 16);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 4, si.getQb().getTrigger_Options(), 12);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 21);
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 4);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().FreeText_MCQ_YesorNoQuestion29_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion29());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion29());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No39 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no39_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion30());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion30());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(4, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion30_Options());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 0);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 2);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 7);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 2, si.getQb().getTrigger_Options(), 6);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 12);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 3, si.getQb().getTrigger_Options(), 9);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 16);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 4, si.getQb().getTrigger_Options(), 12);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 21);
//		sleep(1500);
//
//		triggers(si.getQb().getTrigger_Selection(), 5, si.getQb().getTrigger_Options(), 15);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 26);
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 5);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_MCQ_YesorNoQuestion30_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion30());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion30());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No40 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no40_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion31());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo1_YesorNoQuestion31());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo1_YesorNoQuestion31());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo2_YesorNoQuestion31());
//		sleep(1500);
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion31());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion31());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No41 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no41_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion32());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion32_supportingtext());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion32());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion32_Options());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 2);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_MCQ_YesorNoQuestion32_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion32());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion32());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion32());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion32());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(2000);
//	}
//
//	@When("User can add Q.No42 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no42_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion33());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion33());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion33());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion33());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion33());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext3_YesorNoQuestion33());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No43 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no43_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion34());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo1_YesorNoQuestion34());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion34());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo2_YesorNoQuestion34());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 6);
//		wait(20);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion34());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion34());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion34_supportingtext());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext3_YesorNoQuestion34());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo3_YesorNoQuestion34());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo3_YesorNoQuestion34_supportingtext());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo3_YesorNoQuestion34());
//		sleep(1500);
//
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo4_YesorNoQuestion34());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo4_YesorNoQuestion34());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo5_YesorNoQuestion34());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo5_YesorNoQuestion34());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion34());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No44 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no44_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion35());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion35());
//		sleep(1500);
//		clickonAddoptions(6, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion35_Options());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 6);
//		wait(20);
//
//		triggers(si.getQb().getTrigger_Selection(), 2, si.getQb().getTrigger_Options(), 6);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 11);
//		wait(20);
//		javascriptScrollUp(si.getQb().getConditional());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_MCQ_YesorNoQuestion35_Options());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_MCQ_YesorNoQuestion35_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion35());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion35());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion35());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No45 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no45_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion36());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion36());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion36());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion36());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion36());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No46 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no46_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion37());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion37());
//		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
//		clickonAddoptions(4, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion37_Options());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 5);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_MCQ_YesorNoQuestion37_Options());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion37());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion37());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion37());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion37());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext3_YesorNoQuestion37());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No47 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no47_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion38());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 0);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 2);
//		wait(20);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion38());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_YesorNoQuestion38());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion38());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion38());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No48 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no48_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion39());
//		sleep(1500);
//
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo1_YesorNoQuestion39());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo1_YesorNoQuestion39());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo2_YesorNoQuestion39());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion39());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No49 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no49_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion40());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_multiple_choice_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion40());
//		sleep(1500);
//		clickonAddoptions(2, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().MCQ_YesorNoQuestion40_Options());
//		sleep(1500);
//		user_can_add_q_no9_dropdown_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Dropdown_YesorNoQuestion40());
//		sleep(1500);
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Dropdown_YesorNoQuestion40_Options());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion40());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No50 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no50_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion41());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion41_supportingtext());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion41());
//		sleep(1500);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo1_YesorNoQuestion41());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 2);
//		wait(20);
//
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo2_YesorNoQuestion41());
//		sleep(1500);
//
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 6);
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 5);
//		wait(20);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo3_YesorNoQuestion41());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo3_YesorNoQuestion41());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion41());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext3_YesorNoQuestion41());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No51 Yes\\/No question and add the different types of conditional based questions and also add the triggers")
//	public void user_can_add_q_no51_yes_no_question_and_add_the_different_types_of_conditional_based_questions_and_also_add_the_triggers()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion42());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 2);
//		wait(20);
//
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext1_YesorNoQuestion42());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo1_YesorNoQuestion42());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo2_YesorNoQuestion42());
//		sleep(1500);
//		user_can_add_the_triggers_under_q_no25();
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 2);
//		wait(20);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo2_YesorNoQuestion42());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext2_YesorNoQuestion42());
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext3_YesorNoQuestion42());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No52 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no52_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion43());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_number_input_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Numberinput_YesorNoQuestion43());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No53 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no53_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion44());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion44_supportingtext());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion44());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion44());
//		sleep(1500);
//		enterText(si.getQb().getSupporting_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo_YesorNoQuestion44_supportingtext());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No54 Dropdown question and add the conditional based question and add the triggers")
//	public void user_can_add_q_no54_dropdown_question_and_add_the_conditional_based_question_and_add_the_triggers()
//			throws Throwable, Throwable {
//		user_can_add_q_no9_dropdown_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Dropdown_Question3());
//		sleep(1500);
//		clickonAddoptions(1, si.getQb().getAddOptions());
//		sleep(1500);
//		InputvalueofOptions(si.getQb().getOptions_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Dropdown_options());
//		sleep(1500);
//		btnClick(si.getQb().getTriggers());
//		wait(20);
//		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 0);
//		wait(20);
//		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 2);
//		wait(20);
//		javascriptScrollUp(si.getQb().getConditional());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo1_Dropdown_option1());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo_Dropdown_option1());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNo2_Dropdown_option1());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNo2_Dropdown_option1());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getAddConditional_Questions(), 1);
//		sleep(1500);
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_Dropdown_option2());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No55 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no55_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion45());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion45());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//
//	}
//
//	@When("User can add Q.No56 Freetext question and click on mark as optional")
//	public void user_can_add_q_no56_freetext_question_and_click_on_mark_as_optional() throws Throwable, Throwable {
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetextquestion());
//		sleep(1500);
//		;
//		btnClick(si.getQb().getMultiplechoice_MarkasOptional());
//		sleep(1500);
//	}
//
//	@When("User can add Q.No57 Yes\\/No question and add the different types of conditional based question")
//	public void user_can_add_q_no57_yes_no_question_and_add_the_different_types_of_conditional_based_question()
//			throws Throwable, Throwable {
//		user_can_add_q_no3_yes_no_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().YesorNoQuestion46());
//		sleep(1500);
//		user_can_add_conditional_based_question_under_the_yes_no_question();
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetext_YesorNoQuestion46());
//		sleep(1500);
//		btnClick(si.getQb().getBackoption());
//		sleep(1500);
//
//	}
//
//	@When("User can add Q.No58 Freetext question")
//	public void user_can_add_q_no58_freetext_question() throws Throwable, Throwable {
//		user_can_add_freetext_question_under_the_conditional_based_question();
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Freetextquestion1());
//
//	}
//
//	@When("User can add Q.No59 Conditional segment Gestation question and add the conditional based question")
//	public void user_can_add_q_no59_conditional_segment_gestation_question_and_add_the_conditional_based_question()
//			throws Throwable {
//
//	}
//
//	@When("User can add Q.No60 Conditional segment DOB question and add the conditional based question")
//	public void user_can_add_q_no60_conditional_segment_dob_question_and_add_the_conditional_based_question() {
//
//	}
//
//	@When("User can add Q.No61 Conditional segment BMI question and add the conditional based question")
//	public void user_can_add_q_no61_conditional_segment_bmi_question_and_add_the_conditional_based_question() {
//
//	}
//
//	@Then("User can add Q.No59 Closing Statement question")
//	public void user_can_add_q_no59_closing_statement_question() throws Throwable {
//		javascriptScrollDown(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		btnClick(si.getQb().getSelectquestion_Type());
//		sleep(1500);
//		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 9);
//		sleep(1500);
//		enterText(si.getQb().getQuestion_Textarea(),
//				FileReaderManager.getInstanceFRM().getInstanceCR().Closing_Statement());
//		sleep(1500);
//	}

}
