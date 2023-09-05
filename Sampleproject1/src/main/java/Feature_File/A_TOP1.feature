@TOP_eligibility
Feature: 

  Scenario: 
    Given Launch the external site "<url>" for TOP eligibility
    When User can enter the top serviceuser email "<email>" and click the next button
    And User enter the top serviceuser password "<password>" and click recaptcha
    And User enter the memorable word and click login button for TOP eligibility
    And User click the start button in the dashboard page for TOP eligibility
    And User click yes radio button for pregnancy test and yes for last menstrual period
    And User enter the date of first day of last period and click next button
    And User enter the DOB above18 years and select yes for feel safe and click next button
    And User select the yes or no button for registered UK gp and select the address
    And User select the yes button for local provider and enter the text and click arrange a call back button
    And User select the prefrence for call back radio buttons and click book call back button
    And User click logout button and landed in login page for TOP eligibility
    And User Launch the external site "<url1>" for edit history purpose
    And User enter the microsoft email "<exemail>" in email id field for edit history purpose
    And User enter the password "<expassword>" in password field and click signin button for edit history purpose
    And User click the all client button and select account setting button
    And User select the completed forms in account setting page
    And User click edit button and edit the completed forms and submit
    And User click the preview button and find the edits in preview page
    And User click the client information and edit the details
