package com.sprintqa.stepDef;

import com.sprintqa.pages.EmployeeListPage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeListSteps  extends BaseClass{
   
	EmployeeListPage ep = new EmployeeListPage(getWebDriver()) ;
	
	
	@When("^click on Employee List menu$")
	public void click_on_Employee_List_menu() throws Throwable {
	   ep.clickEmployeeList();
		
		
		
	}

	@Then("^verify search  filter works as expected$")
	public void verify_search_filter_works_as_expected() throws Throwable {
	   ep.populateEmployeeList();
		ep.verifyFilterWorks();		
	}
	
	
}
