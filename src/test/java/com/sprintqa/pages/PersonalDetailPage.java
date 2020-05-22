package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sprintqa.utils.CommonMethods;

public class PersonalDetailPage extends CommonMethods {

	
	@FindBy(xpath  = "//img[@id= 'empPic']")
	public WebElement EmployeePhoto ;
	
	
	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement FirstName;
	
	@FindBy(id = "personal_txtEmpLastName")
	public WebElement LastName;
	
	
	
	public PersonalDetailPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	
	public void verifyPersonalDetailsPage() {
		Assert.assertTrue("Employee Photo is not displayed", EmployeePhoto.isDisplayed());
		
		
	}
	public void verifyEmployeeDetailsPage() {
		Assert.assertTrue(" Firstname is not correct", FirstName.getAttribute("value").equals(FirstName));
		Assert.assertTrue(" Lastname is not correct", LastName.getAttribute("value").equals(LastName));

	}
	
            
            

            
            
            

}