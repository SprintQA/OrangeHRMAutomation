package com.sprintqa.stepDef;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.sprintqa.pages.PersonalDetailPage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;

public class PersonalDetailsMenu extends BaseClass {
              
	PersonalDetailPage pdp = new PersonalDetailPage(getWebDriver());
	
	@Then("^verify user is on personal details page$")
	public void verify_user_is_on_personal_details_page() throws Throwable {
	   pdp.verifyPersonalDetailsPage();
		
	
	}
	
	@Then("^verify employee details on personal details page$")
	public void verify_employee_details_on_personal_details_page() throws Throwable {
	   pdp.verifyEmployeeDetailsPage();
		
		
	}

   


}



