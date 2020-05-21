package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;
import com.sprintqa.utils.ConfigsReader;

public class PersonalDetailsPage extends CommonMethods {

	@FindBy(id = "empPic")
	public WebElement employeeImage;

	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement firstName;

	@FindBy(id = "personal_txtEmpLastName")
	public WebElement lastName;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;

	public PersonalDetailsPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void verifyPersonalDetailsPage() {
		Assert.assertTrue("Employee image is not displayed on personal detail page", employeeImage.isDisplayed());
	}

	public void verifyEmployeeDetails() {
		Assert.assertTrue("Firstname is not correct",
				firstName.getAttribute("value").equalsIgnoreCase(ConfigsReader.getProperty("firstname")));
		Assert.assertTrue("Last name is not correct",
				lastName.getAttribute("value").equalsIgnoreCase(ConfigsReader.getProperty("lastname")));
		Assert.assertTrue("employee id is not correct",
				employeeId.getAttribute("value").equalsIgnoreCase(ConfigsReader.getProperty("employeeid")));
	}

}
