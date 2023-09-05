@LARC_eligibility
Feature: 
 
 Scenario: 
    Given Launch the service user url "<url>" for LARC eligibility flow
    When User enter the serviceuser Email "<email>" and click the Next button
    And User enter the serviceuser Password "<password>" and click Recaptcha and next button
    And User enter the Memorable word and Click Login button
    And User click the Start button in the dashboard page
    And User click Yes or No button for last 3months
    And User click select the treatment type and click next button
    And User click DOB and enter below 55 years and Yes or no for sexually active button 
    And User click Yes or No in GP details and registred uk address and Uk resident 
    And User click Yes or No for UK address and moves to enter GP details or arrange call back 
    And User click arrange call back button and anytime radio button 
    And User click the book call back button and moves to dashboard page
    And User click logout button and landed in login page for LARC eligibility flow
    