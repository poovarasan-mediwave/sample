package com.Step_Definition;

import java.io.IOException;
import java.util.Set;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Permissions_MSI_Staff extends Base_Class {

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("super admin launch the url & login to the account")
	public void super_admin_launch_the_url_login_to_the_account() throws IOException, InterruptedException {
		browserLaunch("chrome");
		// String url=FileReaderManager.getInstanceFRM().getInstanceCR().geturl();
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		btnClick(si.getpermissionmsistaff().getStafflogin());
		si.getpermissionmsistaff().getStaffemail().sendKeys("muthukumaran@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Myazurepassword1$");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(10000);
	}

	@When("super admin checks the MSI Staff page")
	public void super_admin_checks_the_msi_staff_page() throws InterruptedException, IOException {
		btnClick(si.getpermissionmsistaff().getMsistaff());
		sleep(5000);
		screenShot("MSI_staff");
	}

	@When("Admin log in to the active inactive diabled account")
	public void admin_log_in_to_the_active_inactive_diabled_account() throws InterruptedException, IOException {

		String Parenthandle = driver.getWindowHandle();
		sleep(10000);
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle);
		}
		sleep(5000);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		// Log in to Active user
		btnClick(si.getpermissionmsistaff().getStafflogin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("msi-oliver@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Joxa94724401");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
		String Parenthandle1 = driver.getWindowHandle();
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles1 = driver.getWindowHandles();
		for (String handle : handles1) {
			if (!handle.equals(Parenthandle1)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle1);
		}
		sleep(5000);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		// Log in to Disabled user
		btnClick(si.getpermissionmsistaff().getStafflogin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("lewissjohnsons@gmail.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Admin@12345");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		screenShot("Disabled_user");
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		// Log in to Inactive user
		si.getpermissionmsistaff().getStaffemail().sendKeys("msi-joe@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Lofo08380101");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
		screenShot("Inactive_user");
		String Parenthandle2 = driver.getWindowHandle();
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle : handles2) {
			if (!handle.equals(Parenthandle2)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle2);
		}
		sleep(5000);
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		// Log in to superadmin user
		btnClick(si.getpermissionmsistaff().getStafflogin());
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("muthukumaran@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Myazurepassword1$");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
	}

	@When("super admin switch admin account to super admin account")
	public void super_admin_switch_admin_account_to_super_admin_account() throws InterruptedException {
		btnClick(si.getpermissionmsistaff().getAdminfunctions());
		sleep(10000);
		btnClick(si.getpermissionmsistaff().getPermissions());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getAddsuperadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getSelectsuperadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getAddsuperadminconfirm());
		sleep(6000);
		String Parenthandle2 = driver.getWindowHandle();
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle : handles2) {
			if (!handle.equals(Parenthandle2)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle2);
		}
		sleep(5000);

	}

	@When("new Super admin log in to the account")
	public void new_super_admin_log_in_to_the_account() throws IOException, InterruptedException {
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStafflogin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("msi-oliver@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Joxa94724401");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
		screenShot("new_super_admin");
		sleep(6000);
		String Parenthandle2 = driver.getWindowHandle();
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle : handles2) {
			if (!handle.equals(Parenthandle2)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle2);
		}
		sleep(5000);

	}

	@When("super admin switch the account to admin account")
	public void super_admin_switch_the_account_to_admin_account() throws IOException, InterruptedException {
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStafflogin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("muthukumaran@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Myazurepassword1$");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
		btnClick(si.getpermissionmsistaff().getAdminfunctions());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getPermissions());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getSwitchtoadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getConfirm());
		sleep(6000);
		String Parenthandle2 = driver.getWindowHandle();
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle : handles2) {
			if (!handle.equals(Parenthandle2)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle2);
		}
		sleep(5000);

	}

	@When("super admin account changed to admin account")
	public void super_admin_account_changed_to_admin_account() throws IOException, InterruptedException {
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStafflogin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("msi-oliver@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Joxa94724401");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
		screenShot("Super_admin_to_admin");
		sleep(6000);
		String Parenthandle2 = driver.getWindowHandle();
		btnClick(si.getpermissionmsistaff().getLogout());
		sleep(4000);
		Set<String> handles2 = driver.getWindowHandles();
		for (String handle : handles2) {
			if (!handle.equals(Parenthandle2)) {
				driver.switchTo().window(handle);
				btnClick(si.getpermissionmsistaff().getLogout2());
			}
			driver.switchTo().window(Parenthandle2);
		}
		sleep(5000);

	}

	@When("super admin disable the new super admin account")
	public void super_admin_disable_the_new_super_admin_account() throws IOException, InterruptedException {
		getDrive(FileReaderManager.getInstanceFRM().getInstanceCR().geturl());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStafflogin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getUseanotheraccount());
		sleep(6000);
		si.getpermissionmsistaff().getStaffemail().sendKeys("muthukumaran@mindwaveventures.com");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
		si.getpermissionmsistaff().getStaffpassword().sendKeys("Myazurepassword1$");
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getStaffsubmit());
		sleep(5000);
//		btnClick(si.getpermissionmsistaff().getStaffsubmit());
//		sleep(5000);
		btnClick(si.getpermissionmsistaff().getAdminfunctions());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getPermissions());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getAddsuperadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getSelectsuperadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getAddsuperadminconfirm());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getDisableadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getConfirm());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getDashboard());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getMsistaff());
		sleep(6000);

	}

	@When("super admin enable the disabled admin account")
	public void super_admin_enable_the_disabled_admin_account() throws InterruptedException, IOException {
		btnClick(si.getpermissionmsistaff().getEnableadmin());
		sleep(6000);
		btnClick(si.getpermissionmsistaff().getConfirm());
		sleep(6000);
		screenShot("Enable_admin");

	}
}
