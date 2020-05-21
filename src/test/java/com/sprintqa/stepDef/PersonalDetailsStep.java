package com.sprintqa.stepDef;

import com.sprintqa.pages.PersonalDetailsPage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;

public class PersonalDetailsStep extends BaseClass {

	PersonalDetailsPage personalDetailPage = new PersonalDetailsPage(getWebDriver());

	@Then("^verify user is on personal details page$")
	public void verify_user_is_on_personal_details_page() throws Throwable {
		personalDetailPage.verifyPersonalDetailsPage();
	}

	@Then("^verify employee details on personal details page$")
	public void verify_employee_details_on_personal_details_page() throws Throwable {
		personalDetailPage.verifyEmployeeDetails();
	}
}
