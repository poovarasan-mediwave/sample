Feature: This is Resources create feature

  Scenario: This is Superadmin credentials in that create systemadmin user
    Then User enters valid "<emailaddress>" in Emailaddress field super admin
    Then user enter valid "<password>" in password field super admin
    And user clicks Login button in super admin
    When user clicks on Add System Admin button
    Then user enters system admin Username
    Then user enters system admin Emailaddress
    And user clicks Create System admin button
    And user logout super admin credentials

  @Super_Admin1
  Scenario: Systemadmin credentials deactivate and activate
    When user enter the Email Address in text field
    And user enter the Password in text field
    Then user click the Login Button and it navigates to Trust management
    When user click the deactivate button and confirm pop up occurs
    When user click the yes button and success message pops up
    And user click the current resources list button and take screenshot
    And user click the Trust management button and navigates to trust management page
    And user click the activate button and confirm pop up occurs
    And user click Yes Button and success message pop up
    And user click the Current resources List button and Take screenshots
    And user logout trust admin credentials
  #Scenario: This is Systemadmin credentials in that create trust
    #Then User enters the  valid "<createdemailaddress>" in Emailaddress field
    #Then user enter the valid "<createdpassword>" in password field
    #And user then clicks Login button
    #When User clicks Add Trust button
    #Then user enters trustname
    #Then user enters trustemailaddress
    #And user clicks create trust button
