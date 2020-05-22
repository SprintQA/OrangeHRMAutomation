package com.sprintqa.stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.pages.AddEmployeePage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeMenu extends BaseClass {
	
	AddEmployeePage ep = new AddEmployeePage(getWebDriver());

	@Then("^verify user is on add employee page$")
	public void verify_user_is_on_add_employee_page() throws Throwable {
	    ep.verifyAddEmployeePage();
		
	}

	@When("^user fill all details of employee$")
	public void user_fill_all_details_of_employee() throws Throwable {
	   ep.fillAllDetails();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
	   ep.ClickBtn();
	}

	
}
