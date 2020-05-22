Feature: Verify objects and drop down on homepage

  Background: 
    Given user open the website
    Then verify login page is displayed
    When user login with username "valid.username" and password "valid.password"
    Then verify login is successful

	@regression
  Scenario: Verify user management drop down menus
    When user hover mouse on admin menu
    And hover mouse on user management menu
    Then verify user is displayed with "users" menu

  @regression
  Scenario: Verify job drop down menus
    When user hover mouse on admin menu
    And hover mouse on jobs menu
    And verify following menus are displayed
      | Job Titles        |
      | Pay Grades        |
      | Employment Status |
      | Job Categories    |
      | Work Shifts       |
