@SignUp @Smoke
Feature: This is Southern SignUp page
  
@ParentUserSignUp
 Scenario: This is SignUp page to create user
					Given User is in Home Page
  				  When click on SignUp link
   					Then User enters valid "<firstname>" in FirstName field
     				Then User enters valid "<lastname>" in LastName field
     				Then User enters valid "<emailaddress>" in Emailaddres field
     				Then user enter valid "<phonenumber>" in PhoneNumber
     				Then User enters "<password>" in Passowrd
     				Then User enters "<passwordcombination>" in ConfirmPassword
     				Then Users selects the  Terms of Service field
     				Then User selects the Privacy Statement 
     				And Click SignUp to create account
    				Then Success pop up displays if child linked orelse error message displays
    				Then Take screenshot of the SignUp Page
    				
    				
  