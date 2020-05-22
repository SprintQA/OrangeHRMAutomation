package com.sprintqa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class HomePage extends CommonMethods {

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminMenu;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimMenu;

	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveMenu;

	@FindBy(id = "menu_time_viewTimeModule")
	public WebElement timeMenu;

	@FindBy(id = "menu_admin_UserManagement")
	public WebElement userManagementMenu;

	@FindBy(id = "menu_admin_viewSystemUsers")
	public WebElement usersMenu;

	@FindBy(id = "menu_admin_Job")
	public WebElement jobMenu;

	@FindBy(xpath = "//a[@id='menu_admin_Job']/../ul/li/a")
	public List<WebElement> listOfJobSubMenuEle;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmployeeMenu;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	public WebElement recruimentTab;
	
	@FindBy(id="menu_recruitment_viewJobVacancy")
	public WebElement vacanciesMenu;

	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void verifyHomePage() {
		waitForElementToPresent(adminMenu);
		Assert.assertTrue("Admin menu is not present on home page", adminMenu.isDisplayed());
		Assert.assertTrue("pim menu is not present on home page", pimMenu.isDisplayed());
	}

	public void hourMouseOnAdminMenu() {
		hoverMouseToElement(adminMenu);
	}

	public void hourMouseOnUserManagementMenu() {
		hoverMouseToElement(userManagementMenu);
	}

	public void verifyMenu(String menu) {
		Assert.assertTrue("user menu is not displayed", usersMenu.isDisplayed());
		Assert.assertTrue("User menu text is not correct", usersMenu.getText().equalsIgnoreCase(menu));
	}

	public void hoverMouseOnJobsMenu() {
		hoverMouseToElement(jobMenu);
	}

	public void verifyJobSubMenu(List<String> listOfSubMenu) {
		for (int i = 0; i < listOfJobSubMenuEle.size(); i++) {
			Assert.assertTrue("Jobs sub menu are not displayed", listOfJobSubMenuEle.get(i).isDisplayed());
			Assert.assertTrue("Jobs sub menu text is not correct",
					listOfJobSubMenuEle.get(i).getText().equalsIgnoreCase(listOfSubMenu.get(i)));
		}
	}

	public void hoverMouseOnPIMMenu() {
		hoverMouseToElement(pimMenu);
	}

	public void clickOnAddEmployeeMenu() {
		addEmployeeMenu.click();
	}

	public void hoverMouseOnRecruitmentMenu() {
		hoverMouseToElement(recruimentTab);
	}

	public void clickOnVacanciesMenu() {
		vacanciesMenu.click();
	}

}
