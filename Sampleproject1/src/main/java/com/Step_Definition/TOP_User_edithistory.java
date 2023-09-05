package com.Step_Definition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Singleton_Design_Pattern.Singleton_Design_Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TOP_User_edithistory extends Base_Class{

	public static Singleton_Design_Pattern si = new Singleton_Design_Pattern();

	@Given("user launch the url")
	public void user_launch_the_url() throws IOException {
		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserurl();
		getDrive(url);
	}

	@When("user enters the email_password & click on login button")
	public void user_enters_the_email_password_click_on_login_button() throws IOException, InterruptedException {
		String email = FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuseremail();
		enterText(si.gettopedithistory().getEmail(), email);
		sleep(3000);
		String password = FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserpassword();
		enterText(si.gettopedithistory().getPassword(), password);
		sleep(3000);
		String pin = FileReaderManager.getInstanceFRM().getInstanceCR().getserviceuserpin();
		enterText(si.gettopedithistory().getPin(), pin);
		sleep(3000);
		frameswitch(si.gettopedithistory().getRecaptchaframe());
		sleep(5000);
		btnClick(si.gettopedithistory().getRecaptcha());
		sleep(5000);
		frame_out();
		btnClick(si.gettopedithistory().getLogin());
		sleep(3000);
	}

	@When("user answers the eligibility form")
	public void user_answers_the_eligibility_form() throws InterruptedException, IOException {
		btnClick(si.gettopedithistory().getStart());
		sleep(3000);
//		btnClick(si.gettopedithistory().getComplete());
//		sleep(3000);
		btnClick(si.gettopedithistory().getYes());
		sleep(3000);
		btnClick(si.gettopedithistory().getPeriodyes());
		sleep(3000);
		btnClick(si.gettopedithistory().getPerioddatepicker());
		sleep(3000);
		btnClick(si.gettopedithistory().getCalendarback());
		sleep(3000);
		btnClick(si.gettopedithistory().getPerioddate());
		sleep(3000);
		btnClick(si.gettopedithistory().getYesornoperiodnext());
		sleep(3000);
		btnClick(si.gettopedithistory().getPerioddatepicker());
		sleep(3000);
        calendaryearback();
        sleep(3000);
        btnClick(si.gettopedithistory().getDateofbirth());
        sleep(3000);
		btnClick(si.gettopedithistory().getFeelsafeyes());
		sleep(3000);
		btnClick(si.gettopedithistory().getYesornoperiodnext());
		sleep(5000);
		btnClick(si.gettopedithistory().getRegisteredUKGPno());
		sleep(3000);
		btnClick(si.gettopedithistory().getRegisteredUKaddressno());
		sleep(3000);
		btnClick(si.gettopedithistory().getEnterregisteredUKGPno());
		sleep(3000);
		btnClick(si.gettopedithistory().getChoosecallbackslot());
		sleep(3000);
		btnClick(si.gettopedithistory().getAnytimecallback());
		sleep(8000);
		btnClick(si.gettopedithistory().getBookcallback());
		sleep(3000);

	}

	@When("Super admin log in to the account & view edit history")
	public void super_admin_log_in_to_the_account() throws InterruptedException, IOException {
		WebDriver driver1 = new ChromeDriver();
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
		sleep(6000);
		driver1.findElement(By.xpath("(//a[@href='/admin/dashboard/all-clients'])[1]")).click();
		sleep(5000);
		driver1.findElement(By.xpath("//input[@name='searchTxt']")).sendKeys("MSITOPDBBE");
		sleep(5000);
		driver1.findElement(By.xpath("//div[contains(text(),'Account settings')][1]")).click();
		sleep(3000);
		driver1.findElement(By.xpath("//span[contains(text(),'Completed forms')]")).click();
		sleep(3000);
		driver1.findElement(By.xpath("//span[contains(text(),'EDIT')]")).click();
		sleep(10000);
		driver1.findElement(By.xpath("(//div[@class='view-data-group']/pre/span)[1]")).click();
		sleep(6000);
	}
}
