package com.Step_Definition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Import_function extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external <url>")
	public void launch_the_external_url() throws Throwable {

		browserLaunch("chrome");
		wait(20);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		sleep(1500);

	}

	@When("User click the Staff login button")
	public void user_click_the_staff_login_button() throws Throwable {
		btnClick(si.getQuesPage().getstafflogin());
		sleep(1500);

	}

	@When("User enter the microsoft email <email> and click the next button")
	public void user_enter_the_microsoft_email_email_and_click_the_next_button() throws Throwable {
		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getemail());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		sleep(2000);
	}

	@When("User enter the password <password> and click the signup button")
	public void user_enter_the_password_password_and_click_the_signup_button() throws Throwable {
		enterText(si.getQuesPage().getexternalPassword(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
		btnClick(si.getQuesPage().getexnext());
		sleep(2000);
		btnClick(si.getQuesPage().getexternalNext());
		sleep(8000);
	}

	@When("User click the forms and questionnaire button")
	public void user_click_the_forms_and_questionnaire_button() throws Throwable {
		btnClick(si.getQuesPage().getqb());
		sleep(19000);

	}

	@When("User click the import existing form button and external window pops up")
	public void user_click_the_import_existing_form_button_and_external_window_pops_up() throws Throwable {
		
		sleep(5000);
		btnClick(si.getuploadPage().getImportfile());
		StringSelection str = new StringSelection("C:\\Users\\Mediwave Digital\\Downloads\\AutoQB_Consultation_TOP");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb = new Robot();
		rb.delay(4000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		sleep(4000);

	}

	@When("User select particular file and import the file")
	public void user_select_particular_file_and_import_the_file() throws Throwable {

		String editqb = FileReaderManager.getInstanceFRM().getInstanceCR().getEditname();
		enterText(si.getuploadPage().getEditname(), editqb);
		sleep(1500);

	}

	@When("User edit the questionnaire name and services of the imported file")
	public void user_edit_the_questionnaire_name_and_services_of_the_imported_file() throws Throwable {

		btnClick(si.getuploadPage().getMoreopt());
		sleep(1500);
		btnClick(si.getuploadPage().getClickservices());
		sleep(2000);
		btnClick(si.getuploadPage().getVas());

		sleep(1500);
		btnClick(si.getuploadPage().getCreatenew());

	}

	@When("User edit the added questions and click save draft button")
	public void user_edit_the_added_questions_and_click_save_draft_button() throws Throwable {

		btnClick(si.getuploadPage().getEditmulti1());
		sleep(1500);
		String textedit = FileReaderManager.getInstanceFRM().getInstanceCR().getEdittext();
		enterText(si.getuploadPage().getEdittext(), textedit);
		sleep(3000);

		btnClick(si.getQuesPage().getsavedraft());
		sleep(6000);

	}
}
