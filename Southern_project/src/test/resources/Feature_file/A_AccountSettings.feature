@AccountSettings @Smoke
Feature: Southern Parent Portal Login

  @Login
  Scenario Outline: Login to southern
    Given User2 launchs the chrome browser to view southern parent portal
    When User2 need to clicks AlreadySignUp link
    And User2 enter emailaddress in the "<email>" In Email Field
    And User2 enter password in the "<password>" In Password Field
    And User2 click now clicks the Login button
    Then User2 navigated to Home Page success

    Examples: 
      | email                       | password |
      | parent@mindwaveventures.com | Test@123 |

  Scenario: To submit feedback form
    Given User clicks bento menu
    Then user clicks feedback menu
    Then user enters "subject" for feedback
    Then user enter "suggestions" for feedback
    Then User clicks submit button
    Then user clicks Okay button

  Scenario: To update profile
    Given User clicks bento menu to click profile
    Then user clicks account settings
    Then user clicks profile menu
    Then users enters "lastname" to update
    And click update profile to update the changes made
