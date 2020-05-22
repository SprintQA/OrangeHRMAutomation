package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class VacancyListPage extends CommonMethods {

	@FindBy(id = "resultTable")
	public WebElement vacancyListSection;

	@FindBy(id = "btnAdd")
	public WebElement addBtn;

	public VacancyListPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void verifyVacancyListPage() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertTrue("Vacancy list page is not displayed", isElementDisplayed(vacancyListSection));
	}

	public void clickOnAddBtn() {
		waitForElementToClickable(addBtn);
		addBtn.click();
	}

}
