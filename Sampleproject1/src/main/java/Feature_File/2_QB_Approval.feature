
Feature: 

  @Questionnaire
  Scenario: 
    Given Launch the external site "<url>" for the purpose of QB consultation for creation
    When User click the Staff login button for the purpose of QB consultation for creation
    And User enter the superadmin email "<email>" and click the next button
    And User enter the superadmin password "<password>" and click the signup button
    And User can click the forms&questionnaire option and click the create a new form button
    And USer enter the Questionnaire name and internal questionnaire name field
    And User can select the questionnaire type and services for form creation
    And User can enter the estimated completion time field and click the next button
    And User can add the multiple choice question and enter the question name and options
    And User can add the freetext question and enter the question name
    And User can add the Yes/No question and enter the question name
    And User can add the date input question and enter the question name
    And User add the Number input question and enter the question name
    And User add the dropdown question and enter the question name
    And User add the section question and enter the question name
    And User add the Opening statement question and enter the question name
    And User add the Closing statement question and enter the question name
    And User add the Conditional segment question and enter the question name
    And User click continue editing and add the conditional questions and click save draft
    And User click the back to dashboard and select preview 
    And User can click delete button

  @Approval_flow
  Scenario: 
    Given Launch the external site "<url>" for approval flow 
    When User click the Staff login button for approval flow 
    And User can enter the superadmin email "<email>" and click the next button
    And User can enter the superadmin password "<password>" and click the signup button
    And User can click the forms and questionnaire option  and also click the create a new form button
    And USer can enter Questionnaire display name and internal questionnaire name field
    And User can select the questionnaire type and services for approval flow
    And User enter the estimated completion time field and click the next button
    And User can add the multiple choice question and enter the question name and options and add conditional question
    And User can add the freetext question and enter the question name and click the mark as optional
    And User can add the Yes/No question and enter the question name and click conditional and add conditional question
    And User can add the date input question and enter the question name and click conditional and add conditional question
    And User add the Number input question and enter the question name and click conditional and add conditional question
    And User add the dropdown question and enter the question name and click conditional and add conditional question
    And User can add the section question and enter the question name
    And User add the Opening statement question
    And User add the Closing statement question
    And User add the Conditional segment question and enter the question name and click conditional and add conditional question
    And User click preview button and select submit for approval
    And User click logout button and login as admin
    And Launch the admin external "<url>"
    And User click the Staff login button for admin approval purpose
    And User enter the admin email "<email>" and click the next button
    And User enter the admin Password "<password>" and click the signup button
    And User click the forms&questionnaire and form approvals and approve the form
