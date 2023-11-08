@Loginscenario
Feature: feature to test login 

Scenario: Check login is succesful with valid data

Given browser is open
And User is on login page
When User enter username and password
And click on login	 button
Then user proceed to home page