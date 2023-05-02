package com.Singleton;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Models.AddStaff;
import com.Page_Object_Models.AdminFlow;
import com.Page_Object_Models.ChildDetails;
import com.Page_Object_Models.AccountSettings;
import com.Page_Object_Models.AddChild;
import com.Page_Object_Models.SignUp;

public class Singleton_Design_Pattern {

	public WebDriver driver;

	private AddChild log_In;

	private SignUp sign_Up;

	private AddStaff Add_Staff;

	private AdminFlow Admin_Flow;

	private ChildDetails Child_Flow;

	private AccountSettings Feed_Form;

	public AddChild getInstanceLog_In() {
		log_In = new AddChild();
		return log_In;
	}

	public SignUp getInstanceSign_Up() {

		sign_Up = new SignUp();
		return sign_Up;
	}

	public AddStaff getInstanceAdd_Staff() {

		Add_Staff = new AddStaff();
		return Add_Staff;

	}

	public AdminFlow getInstanceAdmin_Flow() {

		Admin_Flow = new AdminFlow();
		return Admin_Flow;
	}

	public ChildDetails getInstanceChild_Flow() {

		Child_Flow = new ChildDetails();
		return Child_Flow;
	}

	public AccountSettings getInstanceFeed_Form() {

		Feed_Form = new AccountSettings();
		return Feed_Form;
	}

}
