Feature: Verify add employee functionality

  Background: 
    Given user open the website
    Then verify login page is displayed
    When user login with username "valid.username" and password "valid.password"
    Then verify login is successful

  Scenario: Verify admin user can add employee
    When user hover mouse on PIM menu
    And click on Add Employee menu
    Then verify user is on add employee page
    When user fill all details of employee
    And click on save button
    Then verify user is on personal details page
    And verify employee details on personal details page
