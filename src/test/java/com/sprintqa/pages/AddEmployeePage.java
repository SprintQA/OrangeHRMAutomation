package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class AddEmployeePage  extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement FirstName;
	
	@FindBy(id = "lastName")
	public WebElement LastName;
	
	@FindBy(id = "employeeId")
	public WebElement EmployeeID;
	
	@FindBy(id = "chkLogin")
	public WebElement chkLogin;
	
	@FindBy(id = "user_name")
	public WebElement UserName;
	
	@FindBy(id = "user_password")
	public WebElement Password;
	
	@FindBy(id = "re_password")
	public WebElement ConfirmPassword;
	
	@FindBy(id = "status")
	public WebElement BtnSave;
	
	
	public AddEmployeePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public void verifyAddEmployeePage() {
		Assert.assertTrue("FirstName is not displayed", FirstName.isDisplayed());
		Assert.assertTrue("LastName is not displayed", LastName.isDisplayed());
	}
	
	
	public void fillAllDetails () {
		
		FirstName.sendKeys("Anvar");
		LastName.sendKeys("Rakhimov");
		EmployeeID.clear();
		EmployeeID.sendKeys("12345");
		chkLogin.click();
		UserName.sendKeys("Anvar2401");
		Password.sendKeys("Ahwatukee676767");
		ConfirmPassword.sendKeys("Ahwatukee676767");
	    
	}
	
	  public void ClickBtn () {
		  BtnSave.click();
		  
		  
	  }
	
	
}