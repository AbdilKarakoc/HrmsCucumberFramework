package com.hrms.testbase;

import com.hmrs.pages.AddEmployeePageElements;
import com.hmrs.pages.DashboardPageElements;
import com.hmrs.pages.LoginPageElements;
import com.hmrs.pages.PersonalDetailsPageElements;

public class PageInitiliazer extends BaseClass {

	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;

	public static void initializeAllPage() {

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
	}
}