Feature: EmployeeList Functionality 

Background: 
    Given user open the website
    Then verify login page is displayed
    When user login with username "valid.username" and password "valid.password"
    Then verify login is successful

@123
Scenario:  Verify  Employee List
    
    When user hover mouse on PIM menu
    And click on Employee List menu
    Then verify search  filter works as expected