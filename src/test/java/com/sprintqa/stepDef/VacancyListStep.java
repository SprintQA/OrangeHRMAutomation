package com.sprintqa.stepDef;

import com.sprintqa.pages.VacancyListPage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VacancyListStep extends BaseClass {
	
	VacancyListPage vacancyListPage = new VacancyListPage(getWebDriver());
	
	@Then("^verify user is on vacancy list page$")
	public void verify_user_is_on_vacancy_list_page() throws Throwable {
		vacancyListPage.verifyVacancyListPage();
	}

	@When("^user click on add button$")
	public void user_click_on_add_button() throws Throwable {
		vacancyListPage.clickOnAddBtn();
	}

}
