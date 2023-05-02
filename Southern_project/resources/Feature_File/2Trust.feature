@trust
Feature: Trustadmin login

  Scenario: Trustadmin Login
    When user enter the email address in user field
    And user enter the password in password field
    And user click the login Button and it navigates to current resource list page
    When user click the usermanagement button and naviagtes to user management page
    When user click add user button and add a new user popups
    And user enter the name and email address and click the creator button
    And user clicks the create user button and success message pops up
    And user click the Add user button and add a new User popups
    And user enter the Name and Email address and Click the approver button
    And user click the create User button and Success message pops up
    Then user click the logout button and naviagtes to login page
