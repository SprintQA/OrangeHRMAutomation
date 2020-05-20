package com.sprintqa.stepDef;

import java.util.List;

import com.sprintqa.pages.HomePage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStep extends BaseClass {
	// cntr + shft + O - to import classes

	HomePage homePage = new HomePage(getWebDriver());

	@When("^user hover mouse on admin menu$")
	public void user_hover_mouse_on_admin_menu() throws Throwable {
		homePage.hourMouseOnAdminMenu();
	}

	@When("^hover mouse on user management menu$")
	public void hover_mouse_on_user_management_menu() throws Throwable {
		homePage.hourMouseOnUserManagementMenu();
	}

	@Then("^verify user is displayed with \"([^\"]*)\" menu$")
	public void verify_user_is_displayed_with_menu(String menu) throws Throwable {
		homePage.verifyMenu(menu);
	}
	
	@Then("^hover mouse on jobs menu$")
	public void hover_mouse_on_jobs_menu() throws Throwable {
		homePage.hoverMouseOnJobsMenu();
	}

	@Then("^verify following menus are displayed$")
	public void verify_following_menus_are_displayed(DataTable data) throws Throwable {
		List<String> listOfSubMenu = data.asList(String.class);
		homePage.verifyJobSubMenu(listOfSubMenu);
	}

}
