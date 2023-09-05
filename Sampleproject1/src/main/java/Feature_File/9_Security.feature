@Security_flow
Feature: 

  Scenario: 
    Given Launch the external "<url>" for the security flow purpose
    When User click the Staff login button for the security flow purpose
    And User enter the microsoft login email "<email>" and click the next button
    And User enter the microsoft login password "<password>" and click the signup button
    And User click all clients and account setting button 
    And User click security button and enter temporary memorable word and save button
    And User Enter temporary password and save button
    And User click logout button 
    And User launch the serviceuser url "<userurl>"
    And User enter the email "<useremail>" in email field
    And User enter the password "<userpassword>" in password field 
    And User enter memorable word and click login buttpn
    And User enter the new password and confirm password and click next 
    And User enter the memorable word and confirm memorable word and click next
    And User click the login button