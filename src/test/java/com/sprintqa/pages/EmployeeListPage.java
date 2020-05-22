package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

	@FindBy(id = "empsearch_employee_name_empId")
	public WebElement EmployeeName;
	
	@FindBy(id = "empsearch_supervisor_name")
	public WebElement SupervisiorName;
	
	
	@FindBy(id = "empsearch_id")
	public WebElement EmployeeID;
	
	@FindBy (id = "menu_pim_viewEmployeeList")
	public WebElement EmployeeList;
	
	
	@FindBy (id ="searchBtn")
	public  WebElement ClickSearch;
	
	
	public EmployeeListPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);

	}


	public void clickEmployeeList() {
		EmployeeList.click();
		
	}

      public void populateEmployeeList () {
    	  EmployeeName.sendKeys("Anvar");
    	  SupervisiorName.sendKeys("Nodira");
    	  EmployeeID.sendKeys("12345");
      }
	
	

	public void verifyFilterWorks() {
		Assert.assertTrue("EmployeeName is not displayed", EmployeeName.isDisplayed());
		Assert.assertTrue("SupervisiorName is not displayed", SupervisiorName.isDisplayed());
		Assert.assertTrue("EmployeeID is not displayed", EmployeeID.isDisplayed());

		
	}

	
	
	
	
} 


