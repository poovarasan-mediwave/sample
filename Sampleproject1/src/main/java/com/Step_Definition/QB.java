package com.Step_Definition;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QB extends Base_Class {
	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for the purpose of QB testing")
	public void launch_the_external_site_for_the_purpose_of_qb_testing(String string) throws Throwable {
		browserLaunch("chrome");
		maximize();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());
		sleep(1500);
	}

	@When("User click the Staff login button for the purpose of QB testing")
	public void user_click_the_staff_login_button_for_the_purpose_of_qb_testing() throws Throwable {
		btnClick(si.getExternal_Login().getStafflogin_Button());
		sleep(2000);
		System.out.println("Enter the microsoft account page");
	}

	@When("User can enter the microsoft login email {string} and click the next button")
	public void user_can_enter_the_microsoft_login_email_and_click_the_next_button(String string) throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getEmail());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		sleep(2000);
	}

	@When("User can enter the microsoft login password {string} and click the next and signup button")
	public void user_can_enter_the_microsoft_login_password_and_click_the_next_and_signup_button(String string)
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

	@Given("User can click the forms&questionnaire option")
	public void user_can_click_the_forms_questionnaire_option() throws Throwable {
		System.out.println("User enter the forms&questionnaire page");
		btnClick(si.getQb().getFormsquestionnaire());
		sleep(20000);

	}

	@When("User can click the Create a new form button")
	public void user_can_click_the_create_a_new_form_button() throws Throwable {
		btnClick(si.getQb().getCreateNew_button());
		sleep(10000);

	}

	@When("User can enter Questionnaire display name and Internal questionnaire name fields")
	public void user_can_enter_questionnaire_display_name_and_internal_questionnaire_name_fields() throws Throwable {
		enterText(si.getQb().getQuestionnaire_Name(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getQuestionnaireName1());
		wait(20);

		enterText(si.getQb().getInternalQuestionnaire_name(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getInternalquestionnairename1());
		sleep(4000);
	}

	@Then("User verify the next button and user take screenshot")
	public void user_verify_the_next_button_and_user_take_screenshot() throws Throwable {
		javascriptScrollDown(si.getQb().getNext_Button());
		enabledMethod(si.getQb().getNext_Button());
		System.out.println(enabledMethod(si.getQb().getNext_Button()));
		btnClick(si.getQb().getNext_Button());
		sleep(5000);
		javascriptScrollUp(si.getQb().getQuestionnaire_Name());
		wait(20);
		screenShot("Next button verification");
		sleep(2000);
	}

	@Given("User can clear and enter the new questionnaire display name and internal questionnaire name")
	public void user_can_clear_and_enter_the_new_questionnaire_display_name_and_internal_questionnaire_name()
			throws Throwable {
		javascriptScrollUp(si.getQb().getQuestionnaire_Name());
		wait(20);
		clear(si.getQb().getQuestionnaire_Name());
		sleep(1500);
		enterText(si.getQb().getQuestionnaire_Name(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getQuestionnaireName2());
		sleep(1500);
		clear(si.getQb().getInternalQuestionnaire_name());
		sleep(1500);
		enterText(si.getQb().getInternalQuestionnaire_name(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getInternalquestionnairename2());
		sleep(4000);
	}

	@When("User can select the catagory and services for the purpose of VAS consultation form creation")
	public void user_can_select_the_catagory_and_services_for_the_purpose_of_vas_consultation_form_creation()
			throws Throwable {
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
		clickon_Listelement(si.getQb().getSelect_Service(), 1);
//		0 - TOP
//		1 - VAS
//		2 - LARC
		sleep(1500);
	}

	@When("User can click the next button")
	public void user_can_click_the_next_button() throws Throwable {
		javascriptScrollDown(si.getQb().getNext_Button());
		enabledMethod(si.getQb().getNext_Button());
		btnClick(si.getQb().getNext_Button());
		sleep(5000);
	}

	@When("User can add the different types of questions in QB")
	public void user_can_add_the_different_types_of_questions_in_qb() throws Throwable {
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 0);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getMultiplechoicequestion());
		wait(20);
		clickonAddoptions(2, si.getQb().getAddOptions());
		sleep(1500);
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getMultiplechoicequestion_Options());
		sleep(1500);

		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 1);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getfreetexttypequestion());
		wait(20);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 2);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesnotypequestion());
		wait(20);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 3);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDateinputtypequestion());
		wait(20);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 4);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getNumberinputtypequestion());
		wait(20);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 7);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdowntypequestion());
		wait(20);
		clickonAddoptions(7, si.getQb().getAddOptions());
		sleep(1500);
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdowntypequestion_Options());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 8);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getSectiontypequestion());
		wait(20);

	}

	@When("User can drag the particular question")
	public void user_can_drag_the_particular_question() throws Throwable {
		btnClick(si.getQb().getUniqueclick());
		sleep(3000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(si.getQb().getDrag_Options(), si.getQb().getDrop_Options()).build().perform();
		sleep(3000);
	}

	@When("User can drop the same question at any point")
	public void user_can_drop_the_same_question_at_any_point() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("User can give the lengthy content in question name field or option name field")
	public void user_can_give_the_lengthy_content_in_question_name_field_or_option_name_field() throws Throwable {
		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 1);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getfreetext_Lengthycontent());
		wait(20);

	}

	@When("User can click the save draft button")
	public void user_can_click_the_save_draft_button() throws Throwable {
		javascriptScrollUp(si.getQb().getSavedraft());
		sleep(1500);
		btnClick(si.getQb().getSavedraft());
		sleep(5000);
	}

	@When("User can click the continue editing button")
	public void user_can_click_the_continue_editing_button() throws Throwable {
		btnClick(si.getQb().getContinue_Editing());
		sleep(5000);
	}

	@When("User can add different types of questions and user didnt enter the question name in any one of the question")
	public void user_can_add_different_types_of_questions_and_user_didnt_enter_the_question_name_in_any_one_of_the_question()
			throws Throwable {
		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 0);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getMultiplechoicequestion1());
		sleep(1500);
		clickonAddoptions(2, si.getQb().getAddOptions());
		sleep(1500);
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getMultiplechoicequestion_Options1());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 2);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesnotypequestion1());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 1);
		sleep(1500);
		System.out.println("User give an empty question name");

	}

	@When("User can click Save draft button")
	public void user_can_click_save_draft_button() throws Throwable {
		javascriptScrollUp(si.getQb().getSavedraft());
		sleep(1500);
		btnClick(si.getQb().getSavedraft());
		sleep(5000);
	}

	@Then("Verify the error popup message")
	public void verify_the_error_popup_message() throws Throwable {
		verificationprocess(si.getQb().getSavedraft_errormessage(), "Update the missing fields");
		sleep(1500);

	}

	@Then("User can click continue editing button")
	public void user_can_click_continue_editing_button() throws Throwable {
		btnClick(si.getQb().getContinue_Editing());
		sleep(5000);
	}

	@Then("User can enter the question name for empty field")
	public void user_can_enter_the_question_name_for_empty_field() throws Throwable {
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getfreetext_Yesnotypequestion1());
		sleep(1500);
	}

	@Then("User can click save draft button after adding the questions")
	public void user_can_click_save_draft_button_after_adding_the_questions() throws Throwable {
		javascriptScrollUp(si.getQb().getSavedraft());
		sleep(1500);
		btnClick(si.getQb().getSavedraft());
		sleep(5000);
	}

	@Then("User can click the back to dashboard button and navigate to forms&questionnaire page")
	public void user_can_click_the_back_to_dashboard_button_and_navigate_to_forms_questionnaire_page()
			throws Throwable {
		btnClick(si.getQb().getBacktoQuestionnaires());
		sleep(10000);
		verificationprocess(si.getQb().getFormsquestionnairepage(), "Forms & Questionnaires");
		sleep(1500);

	}

	@Then("User can click the edit option for the same question")
	public void user_can_click_the_edit_option_for_the_same_question() throws Throwable {
		clickon_Listelement(si.getQb().getEdit_Options(), 0);
		sleep(5000);
	}

	@Given("User can add different types of questions")
	public void user_can_add_different_types_of_questions() throws Throwable {
		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 0);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getMultiplechoicequestion2());
		sleep(1500);
		clickonAddoptions(2, si.getQb().getAddOptions());
		sleep(1500);
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getMultiplechoicequestion2_Options());
		sleep(1500);
		javascriptScrollUp(si.getQb().getMultiplechoice_MarkasOptional());
		wait(20);
		btnClick(si.getQb().getMultiplechoice_MarkasOptional());
		sleep(1500);
		btnClick(si.getQb().getTriggers());
		sleep(1500);
		triggers(si.getQb().getTrigger_Selection(), 0, si.getQb().getTrigger_Options(), 0);
		sleep(1500);
		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 1);
		wait(20);

		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 3);
		sleep(1500);
		trigger_Selections(si.getQb().getRightcaretelemedicine_options(), 7);
		wait(20);
		triggers(si.getQb().getTrigger_Selection(), 1, si.getQb().getTrigger_Options(), 5);
		wait(20);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 2);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesnotypequestion2());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 3);
		wait(20);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDateinputtypequestion1());
		sleep(1500);

	}

	@When("User can add one question that question name going to be empty")
	public void user_can_add_one_question_that_question_name_going_to_be_empty() throws Throwable {
		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 7);
		wait(20);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdowntypequestion1());
		sleep(1500);
		clickonAddoptions(6, si.getQb().getAddOptions());
		sleep(1500);
		System.out.println("User didn't enter the Options");

	}

	@When("User can click the conditional option")
	public void user_can_click_the_conditional_option() throws Throwable {
		btnClick(si.getQb().getConditional());
		sleep(1500);

	}

	@When("User can click the add conditional questional option")
	public void user_can_click_the_add_conditional_questional_option() throws Throwable {
		clickon_Listelement(si.getQb().getAddConditional_Questions(), 0);

	}

	@Then("Verify the error message")
	public void verify_the_error_message() throws Throwable {
		screenShot("Add conditional error message");
		sleep(5000);
	}

	@Then("User can enter the value in empty field")
	public void user_can_enter_the_value_in_empty_field() throws Throwable, Throwable {
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdowntypequestion_Options());
		sleep(1500);
//		btnClick(si.getQb().getConditional());
//		sleep(1500);
		clickon_Listelement(si.getQb().getAddConditional_Questions(), 1);
		sleep(1500);
		btnClick(si.getQb().getSelectquestion_Type());
		sleep(1500);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 1);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getfreetext_Dropdowntypequestion1_Options());
		sleep(1500);
		btnClick(si.getQb().getBackoption());
		sleep(5000);

	}

	@Given("User can randomly select the question")
	public void user_can_randomly_select_the_question() throws Throwable {
		javascriptScrollUp(si.getQb().getSavedraft());
		wait(20);
		clickon_Listelement(si.getQb().getRandomlyclickthequestions(), 2);
		sleep(2500);
	}

	@When("User can add different types of questions under the conditional option")
	public void user_can_add_different_types_of_questions_under_the_conditional_option() throws Throwable {
		javascriptScrollDown(si.getQb().getConditional());
		btnClick(si.getQb().getConditional());
		sleep(1500);
		clickon_Listelement(si.getQb().getAddConditional_Questions(), 0);
		sleep(1500);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 2);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesNo1_Yesnotypequestion());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 7);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_Yesnotypequestion());
		sleep(1500);
		clickonAddoptions(2, si.getQb().getAddOptions());
		sleep(1500);
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown_Yesnotypequestion_Options());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 1);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getfreetext_Yesnotypequestion());
		sleep(1500);

		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 2);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getYesNo2_Yesnotypequestion());
		sleep(1500);

		javascriptScrollDown(si.getQb().getSelectquestion_Type());
		wait(20);
		btnClick(si.getQb().getSelectquestion_Type());
		wait(20);
		clickon_Listelement(si.getQb().getSelect_DifferentTypesofQuestion(), 7);
		sleep(1500);
		enterText(si.getQb().getQuestion_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown1_Yesnotypequestion());
		sleep(1500);
		clickonAddoptions(1, si.getQb().getAddOptions());
		sleep(1500);
		InputvalueofOptions(si.getQb().getOptions_Textarea(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getDropdown1_Yesnotypequestion_Options());
		sleep(1500);
		btnClick(si.getQb().getBackoption());
		sleep(1500);
	}

	@When("User can uncheck the conditional option")
	public void user_can_uncheck_the_conditional_option() throws Throwable {
		btnClick(si.getQb().getConditional());
		sleep(1500);
		System.out.println("Successfully uncheck the conditional option");
		btnClick(si.getQb().getConditional());
		sleep(1500);
	}

	@When("User click the add conditional question option")
	public void user_click_the_add_conditional_question_option() throws Throwable {
		clickon_Listelement(si.getQb().getAddConditional_Questions(), 0);
		sleep(1500);
	}

	@Then("Verify that there is no question display under the conditional")
	public void verify_that_there_is_no_question_display_under_the_conditional() throws Throwable {
		screenShot("No questions");
	}

	@Then("User can logout the super and login to admin credentials for approval")
	public void user_can_logout_the_super_and_login_to_admin_credentials_for_approval() throws Throwable {
		String Parenthandle = driver.getWindowHandle();
		btnClick(si.getQuesPage().getlogout());
		sleep(6000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
				btnClick(si.getQuesPage().getlogout2());
			}
			driver.switchTo().window(Parenthandle);
		}

		sleep(3000);

		String url = FileReaderManager.getInstanceFRM().getInstanceCR().geturl();
		getDrive(url);

		sleep(3000);

		btnClick(si.getQuesPage().getstafflogin());
		sleep(1500);
		btnClick(si.getQuesPage().getAddacc());
		sleep(2000);

		String Email = FileReaderManager.getInstanceFRM().getInstanceCR().getEmail();
		enterText(si.getQuesPage().getexternalemail(), Email);
		btnClick(si.getQuesPage().getexternalNext());

		String Password = FileReaderManager.getInstanceFRM().getInstanceCR().getPassword();
		enterText(si.getQuesPage().getexternalPassword(), Password);
		sleep(5000);
		btnClick(si.getQuesPage().getexnext());
		sleep(2000);
		// btnClick(si.getQuesPage().getexternalNext());
		sleep(8000);

		btnClick(si.getQuesPage().getqb());
		sleep(16000);
		btnClick(si.getQuesPage().getformapprovals());
		sleep(7000);
		btnClick(si.getQuesPage().getreceived());
		sleep(2000);
		btnClick(si.getQuesPage().getdatemodify());
		sleep(5000);
		btnClick(si.getQuesPage().getlastdate());
		sleep(6000);
		btnClick(si.getQuesPage().getapprovebtn());
		sleep(4000);
	}

}
