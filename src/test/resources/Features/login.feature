@FIR-68
Feature: Test login feature

  @FIR-TC-1
  Scenario: New Test Scenario
    Given I am on the login page
    When I enter email "test@test.com" and password "testpassword"
    And I click on login button
    Then I verify dashbord page is opened

  @FIR-TC-2
  Scenario: Verify logic with credentials
    Given I am on the login page
    When I enter email "test@test.com" and password "testpassword"
    And I click on login button
    Then I verify dashbord page is opened
