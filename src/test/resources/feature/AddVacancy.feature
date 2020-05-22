Feature: Verify add vacancy functionality

  Background: 
    Given user open the website
    Then verify login page is displayed
    When user login with username "valid.username" and password "valid.password"
    Then verify login is successful

  @regression
  Scenario: Verify admin user can add employee
    When user hover mouse on Recruitment menu
    And user click on Vacancies menu
    Then verify user is on vacancy list page
    When user click on add button
    Then verify add vacancy page is displayed
    When user fill all details for new vacancy
    And click on save button
    Then verify user is on vacancy list page
