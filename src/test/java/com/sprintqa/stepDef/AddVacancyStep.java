package com.sprintqa.stepDef;

import com.sprintqa.pages.AddVacancyPage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddVacancyStep extends BaseClass {
	
	AddVacancyPage vacancyPage = new AddVacancyPage(getWebDriver());

	@Then("^verify add vacancy page is displayed$")
	public void verify_add_vacancy_page_is_displayed() throws Throwable {
		vacancyPage.verifyAddVacancyPage();
	}

	@When("^user fill all details for new vacancy$")
	public void user_fill_all_details_for_new_vacancy() throws Throwable {
		vacancyPage.fillNewVacancyDetails();
	}

}
