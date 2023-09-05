package com.Step_Definition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Upload_step extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("Launch the external site {string} for GPpostcode upload flow")
	public void launch_the_external_site_for_g_ppostcode_upload_flow(String string) throws Throwable {
		browserLaunch("chrome");
		maximize();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());
		sleep(1500);
	}

	@When("User click the Staff login button for GPpostcode upload flow")
	public void user_click_the_staff_login_button_for_g_ppostcode_upload_flow() throws Throwable {
		btnClick(si.getExternal_Login().getStafflogin_Button());
		sleep(2000);
		System.out.println("Enter the microsoft account page");
	}

	@When("User enter the microsoft email {string} and click the next button for GPpostcode upload flow")
	public void user_enter_the_microsoft_email_and_click_the_next_button_for_g_ppostcode_upload_flow(String string)
			throws Throwable {

		enterText(si.getExternal_Login().getExternalemail(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getemail());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		sleep(2000);

	}

	@When("User enter the password {string} and click the signup button for GPpostcode upload flow")
	public void user_enter_the_password_and_click_the_signup_button_for_g_ppostcode_upload_flow(String string)
			throws Throwable {
		enterText(si.getExternal_Login().getExternalPassword(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
		sleep(2000);
		btnClick(si.getExternal_Login().getExternalNext());
		wait(20);
		btnClick(si.getExternal_Login().getExternalNext());
		System.out.println("Successfully login to the Microsaoft account");
		sleep(10000);
	}

	@When("User click the admin functions button and landed in database page")
	public void user_click_the_admin_functions_button_and_landed_in_database_page() throws Throwable {

		btnClick(si.getuploadPage().getAdmin());
		sleep(8000);

	}

	@When("User click the download button for GP practices and edit it and Upload the edited gp practices file")
	public void user_click_the_download_button_for_gp_practices_and_edit_it_and_upload_the_edited_gp_practices_file()
			throws Throwable {
		btnClick(si.getuploadPage().getGpdownload());
		sleep(2000);
		btnClick(si.getuploadPage().getGpupload());
		StringSelection str = new StringSelection("C:\\Users\\Mediwave Digital\\Downloads\\gp-practices-1681458132607");
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

		sleep(2000);
		btnClick(si.getuploadPage().getUploadbtn());
	}

	@When("User click the download button for contracts list and edit it and Upload the edited contracts list file")
	public void user_click_the_download_button_for_contracts_list_and_edit_it_and_upload_the_edited_contracts_list_file()
			throws Throwable {
		btnClick(si.getuploadPage().getContractdownload());
		sleep(4000);

		btnClick(si.getuploadPage().getContractupload());
		StringSelection str = new StringSelection("C:\\Users\\Mediwave Digital\\Downloads\\Contracts-1681452138193");
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

		sleep(2000);
		btnClick(si.getuploadPage().getUploadbtn());

	}
}
