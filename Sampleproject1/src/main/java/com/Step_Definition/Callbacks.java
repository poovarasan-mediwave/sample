package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Callbacks extends Base_Class {

	public static WebElement driver1;
	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("user launch the url & log in to the account")
	public void user_launch_the_url_log_in_to_the_account() throws IOException, InterruptedException {
		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserurl();
		getDrive(url);
		si.getcallback().getEmail().sendKeys("ram+c@mindwaveventures.com");
		sleep(3000);
		si.getcallback().getPassword().sendKeys("Admin@123");
		sleep(3000);
		si.getcallback().getPin().sendKeys("Admin@123");
		sleep(3000);
		btnClick(si.getcallback().getRecaptchaframe());
		sleep(3000);
		// btnClick(si.getcallback().getRecaptcha());
		sleep(3000);
		btnClick(si.getcallback().getLogin());
		sleep(10000);

	}

	@When("user complete the eligibility form")
	public void user_complete_the_eligibility_form() throws InterruptedException {
		btnClick(si.getcallback().getStart());
		sleep(3000);
		btnClick(si.gettopedithistory().getComplete());
		sleep(3000);
		btnClick(si.getcallback().getYes());
		sleep(3000);
		btnClick(si.getcallback().getPeriodyes());
		sleep(3000);
		btnClick(si.getcallback().getPerioddatepicker());
		sleep(3000);
		btnClick(si.getcallback().getCalendarback());
		sleep(3000);
		btnClick(si.getcallback().getPerioddate());
		sleep(3000);
		btnClick(si.getcallback().getYesornoperiodnext());
		sleep(3000);
		btnClick(si.getcallback().getPerioddatepicker());
		sleep(3000);
		calendaryearback();
		sleep(3000);
		btnClick(si.getcallback().getDateofbirth());
		sleep(3000);
		btnClick(si.getcallback().getFeelsafeyes());
		sleep(3000);
		btnClick(si.getcallback().getYesornoperiodnext());
		sleep(5000);
		btnClick(si.getcallback().getRegisteredUKGPno());
		sleep(3000);
		btnClick(si.getcallback().getRegisteredUKaddressno());
		sleep(3000);
		btnClick(si.getcallback().getEnterregisteredUKGPno());
		sleep(3000);
		btnClick(si.getcallback().getChoosecallbackslot());
		sleep(6000);
		btnClick(si.getcallback().getAnytimecallback());
		sleep(8000);
		btnClick(si.getcallback().getBookcallback());
		sleep(3000);
	}

	@When("super admin log in to the account")
	public void super_admin_log_in_to_the_account() throws InterruptedException {
		ChromeDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://devmsi.mindwave.site/external");
		sleep(3000);
		driver1.manage().window().maximize();
		sleep(3000);
		driver1.findElement(By.xpath("//a[contains(text(),'Staff Login')]")).click();
		sleep(5000);
		driver1.findElement(By.xpath("//input[@type='email']")).click();
		sleep(3000);
		driver1.findElement(By.xpath("//input[@type='email']")).sendKeys("muthukumaran@mindwaveventures.com");
		sleep(5000);
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		sleep(5000);
		driver1.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Myazurepassword1$");
		sleep(5000);
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		sleep(5000);
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		sleep(10000);

	}

	@When("super admin edit the call back date")
	public void super_admin_edit_the_call_back_date() throws InterruptedException {
		driver1.findElement(By.xpath("(//a[@href='/admin/dashboard/callbacks'])[1]")).click();
		sleep(5000);
		driver1.findElement(By.xpath("//input[@placeholder='Search a user']")).sendKeys("MSITOP48E4");
		sleep(10000);
		driver1.findElement(By.xpath("//a[contains(text(),'MSITOP48E4')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//span[contains(text(),'Completed forms')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//span[contains(text(),'EDIT')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//textarea[@name='a14710fe-3292-4d25-ba35-1a502f168b77']")).click();
		WebElement test1 = driver1.findElement(By.xpath("//textarea[@name='a14710fe-3292-4d25-ba35-1a502f168b77']"));
		test1.sendKeys(Keys.CONTROL + "a");
		test1.sendKeys(Keys.DELETE);
		sleep(10000);
		driver1.findElement(By.xpath("//textarea[@name='a14710fe-3292-4d25-ba35-1a502f168b77']"))
				.sendKeys("05-06-2023");
		sleep(10000);
		driver1.findElement(By.xpath("//button[@type='submit']")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//button[contains(text(),'Go Back')]")).click();
		sleep(15000);

	}

	@When("super admin check the overflow callbacks & edit the callback date")
	public void super_admin_check_the_overflow_callbacks_edit_the_callback_date() throws InterruptedException {
		driver1.findElement(By.xpath("//li[contains(text(),'Overflow')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//input[@placeholder='Search a user']")).sendKeys("MSITOP48E4");
		sleep(10000);
		driver1.findElement(By.xpath("//a[contains(text(),'MSITOP48E4')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//span[contains(text(),'Completed forms')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//span[contains(text(),'EDIT')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//textarea[@name='a14710fe-3292-4d25-ba35-1a502f168b77']")).click();
		sleep(10000);
		WebElement test1 = driver1.findElement(By.xpath("//textarea[@name='a14710fe-3292-4d25-ba35-1a502f168b77']"));
		test1.sendKeys(Keys.CONTROL + "a");
		test1.sendKeys(Keys.DELETE);
		sleep(6000);
		driver1.findElement(By.xpath("//textarea[@name='a14710fe-3292-4d25-ba35-1a502f168b77']"))
				.sendKeys("07-06-2023");
		sleep(10000);
		driver1.findElement(By.xpath("//button[@type='submit']")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//button[contains(text(),'Go Back')]")).click();
		sleep(10000);

	}

	@When("Super admin check the pending callbacks & change the status to completed")
	public void super_admin_check_the_pending_callbacks_change_the_status_to_completed() throws InterruptedException {
		driver1.findElement(By.xpath("//li[contains(text(),'Pending')]")).click();
		sleep(5000);
		driver1.findElement(By.xpath("//input[@placeholder='Search a user']")).sendKeys("MSITOP1D90");
		sleep(10000);
		driver1.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//label[contains(text(),'Assign to me')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//label[contains(text(),'Attempt 1')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//label[contains(text(),'Mark completed')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		sleep(10000);

	}

	@When("super admin checks the completed callbacks")
	public void super_admin_checks_the_completed_callbacks() throws InterruptedException, IOException {

		driver1.findElement(By.xpath("//li[contains(text(),'Completed')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("//input[@placeholder='Search a user']")).sendKeys("MSITOP1D90");
		sleep(10000);
		screenShot("Completed callback");
	}
}
