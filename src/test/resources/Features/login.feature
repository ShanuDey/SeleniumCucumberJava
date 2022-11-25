Feature: Verify logic with credentials

  @TEST_FIR-4
	Scenario: Verify logic with credentials 
		Given I am on the login page
		When I enter email "test@test.com" and password "testpassword"
		And I click on login button
		Then I verify dashbord page is opened

  @TEST_FIR-54
	Scenario: New Test Scenario 
		Given I am on the login page
		When I enter email "test@test.com" and password "testpassword"
		And I click on login button
		Then I verify dashbord page is opened
