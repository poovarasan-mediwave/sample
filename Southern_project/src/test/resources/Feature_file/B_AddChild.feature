@AddChild 
Feature: Southern Parent Portal Login

  @Login
  Scenario: Login to southern
    Given User launchs the browser
    When User clicks AlreadySignUp link
	And User enter The "<email>" In Email Field
    And User enter The "<password>" In Password Field
    And User click the Login button
    Then User navigated to Home Page

Scenario: Add Child to parent portal

		#Given User is on the HomePage
		When User click button to Add Child
		Then User enters "<ChildNHSNumber>" in Child NHS Number Field
		Then Users enters "<Date>" in Date field
		Then Users enters "<Month>" in Month field
		Then Users enters "<Year>" in Year field
		And click Add child button
		Then verify success message
		Then user taken to Dashboard page
		Then take screen of the child added page