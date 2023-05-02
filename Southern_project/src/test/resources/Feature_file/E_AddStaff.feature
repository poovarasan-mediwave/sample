@StaffOverview
Feature: To add staff users
  

 @AddAdmin
  Scenario: To add admin user
  	Given User needs to launch the browser
    When User then clicks AlreadySignUp link
   And User needs to enter The "<email>" In Email Field
  And User needs to enter The "<password>" In Password Field
  And User needs to click the Login button
  Then User should be navigated to Home Page
  Then click Staff Overview icon
  Then click add staff button
  Then  user needs to click the user role dropbox
  Then  user selects admin user option
  Then enter "<firstname1>" in firstname field
  Then enter "<lastname1>" in lastname field
  Then enter  "<RIOID1>" in rioid field
  And  user clicks on create profile button
  Then get confirmation text1
  And click ok1 to exit
  Then take screenshot of the added admin user
  
  
  @AddSuperAdmin
  Scenario: To add admin user
  Then click to add staff button to add superadmin user
  Then  user now clicks the user role dropbox
  Then  user now selects superadmin user option
  Then user enters "<firstname2>" in firstname field
  Then user enters "<lastname2>" in lastname field
  Then user enters  "<RIOID2>" in rioid field
  And  user then clicks on create profile button
  Then User gets confirmation text1
  And User clicks ok2 to exit
  Then user takes screenshot of the added superadmin user
  
  
  @AddStaff
  Scenario: To add admin user
  Then User clicks to add staff button to add staff user
  Then  user then clicks the user role dropbox
  Then  user then selects staff user option
  Then user must enter "<firstname3>" in firstname field
  Then user must enter "<lastname3>" in lastname field
  Then user must enter  "<RIOID3>" in rioid field
  And  user has to click on create profile button
  Then User should get confirmation text1
  And User must click ok3 to exit
  Then user takes screenshot of the added staff user
  
  