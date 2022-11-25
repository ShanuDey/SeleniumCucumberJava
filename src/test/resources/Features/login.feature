@FIR-68
Feature: Test login feature

  @TEST_FIR-66
  Scenario: New Test Scenario
    Given I am on the login page
    When I enter email "test@test.com" and password "testpassword"
    And I click on login button
    Then I verify dashbord page is opened

  @TEST_FIR-67
  Scenario: Verify logic with credentials
    Given I am on the login page
    When I enter email "test@test.com" and password "testpassword"
    And I click on login button
    Then I verify dashbord page is opened
