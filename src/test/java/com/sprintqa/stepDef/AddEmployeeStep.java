package com.sprintqa.stepDef;

import org.junit.Assert;

import com.sprintqa.pages.AddEmployeePage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeStep extends BaseClass {
	
	AddEmployeePage employeePage = new AddEmployeePage(getWebDriver());
	
	@Then("^verify user is on add employee page$")
	public void verify_user_is_on_add_employee_page() throws Throwable {
		employeePage.verifyAddEmployeePage();
	}

	@When("^user fill all details of employee$")
	public void user_fill_all_details_of_employee() throws Throwable {
		employeePage.fillAllEmployeeDetails();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		employeePage.clickOnSaveBtn();
	}
}
