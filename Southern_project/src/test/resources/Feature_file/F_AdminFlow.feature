@AdminFlow
Feature: This is admin flow to view superadmin permissions
  

  @SearchUser
  Scenario: To login as Superadmin and Search user
    Given User should  navigate to the Home page
    When User then click AlreadySignUp link
	  And User entered The "<adminemail>" In Email UI Field
    And User entered The "<adminpassword>" In Password UI Field
    And User has clicked the Login button
    Then Take screenshot of admin home page 
    Then Click on Parent overview icon
    Then Type the parent you want to "<search>" text
    Then press enter key to view the search result
    #Then click on namecard to view parent details
    Then Take screenshot of the page displayed
    
    
   @ChangeRole
   Scenario: To login as Superadmin and Chnage Role of the user
   When User click on Home Link to navigate to Home page
   Then User needs to click on StaffOverview icon
   Then user clicks on 3dots to change user role 
   Then user selects Change role
   Then user select the user to be changed
#   Then user click confirm role
#   And verify confirmation text on user changed
#   Then click close icon on success pop
   Then take screenshot of the page after userrole changed
   