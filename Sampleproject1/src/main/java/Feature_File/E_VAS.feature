@VAS_eligibility
Feature: 
 
 Scenario: 
    Given Launch the external site "<url>" for VAS eligibility flow
    When User enter the Email "<email>" and click the next button for VAS eligibility flow
    And User enter the Password "<password>" and click recaptcha for VAS eligibility flow
    And User enter the Memorable word and click login button for VAS eligibility flow
    And User click the start button in the ashboard page for VAS eligibility flow
    And User enter the NHS number in find nhs field and click next 
    And User enter the DOB above 18years in date of birth field and click next
    And User enter the GP details in GP details field and click next
    And User enter the UBRN number and passcode in ubrn and passcode field and click next
    And User click continue booking button it moves to dashboard page