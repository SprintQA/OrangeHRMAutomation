package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;
import com.sprintqa.utils.ConfigsReader;

public class AddEmployeePage extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "chkLogin")
	public WebElement createLoginDetailsChkBx;

	@FindBy(id = "user_name")
	public WebElement userName;
	
	@FindBy(id = "user_password")
	public WebElement password;

	@FindBy(id = "re_password")
	public WebElement confirmPassword;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	public AddEmployeePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void verifyAddEmployeePage() {
		Assert.assertTrue("FirstName is not displayed on add employee page", firstName.isDisplayed());
		Assert.assertTrue("LastName is not displayed on add employee page", lastName.isDisplayed());
	}

	public void fillAllEmployeeDetails() {
		firstName.sendKeys(ConfigsReader.getProperty("firstname"));
		lastName.sendKeys(ConfigsReader.getProperty("lastname"));
		employeeId.clear();
		employeeId.sendKeys(ConfigsReader.getProperty("employeeid"));
		
		createLoginDetailsChkBx.click();
		
		userName.sendKeys(ConfigsReader.getProperty("username"));
		password.sendKeys(ConfigsReader.getProperty("passsword"));
		confirmPassword.sendKeys(ConfigsReader.getProperty("passsword"));
		

	}

	public void clickOnSaveBtn() {
		saveBtn.click();
	}

}
