package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sprintqa.utils.CommonMethods;
import com.sprintqa.utils.ConfigsReader;

public class AddVacancyPage extends CommonMethods {

	@FindBy(xpath = "//h1")
	public WebElement pageTitle;

	@FindBy(id = "addJobVacancy_jobTitle")
	public WebElement jobTitleDropdownSelect;

	@FindBy(id = "addJobVacancy_name")
	public WebElement vacancyNameInput;

	@FindBy(id = "addJobVacancy_hiringManager")
	public WebElement hiringMangerInput;

	@FindBy(id = "addJobVacancy_noOfPositions")
	public WebElement noOfPosition;

	public AddVacancyPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void verifyAddVacancyPage() {
		waitForElementToPresent(pageTitle);
		Assert.assertTrue("Add vacancy page is not displayed",
				pageTitle.getText().equalsIgnoreCase(ConfigsReader.getProperty("add.vacancy.page.title")));
	}

	public void fillNewVacancyDetails() {
		Select jobTitleDropdown = new Select(jobTitleDropdownSelect);
		jobTitleDropdown.selectByVisibleText(ConfigsReader.getProperty("job.title"));
		vacancyNameInput.sendKeys(ConfigsReader.getProperty("vacancy.name"));
		hiringMangerInput.sendKeys(ConfigsReader.getProperty("hiring.manager"));
		noOfPosition.sendKeys(ConfigsReader.getProperty("no.of.position"));
	}

}
