@QB
Feature: Test the QB flow and create VAS Consultation form

  Scenario: Login to the External site
    Given Launch the external site "<url>" for the purpose of QB testing 
    When User click the Staff login button for the purpose of QB testing 
    And User can enter the microsoft login email "<email>" and click the next button
    And User can enter the microsoft login password "<password>" and click the next and signup button

  Scenario: Verify the next button while user didnt select the catagory and services
    Given User can click the forms&questionnaire option
    When User can click the Create a new form button
    And User can enter Questionnaire display name and Internal questionnaire name fields
    Then User verify the next button and user take screenshot

  Scenario: Verify the Save draft button while user didnt complete upto selected questions
    Given User can clear and enter the new questionnaire display name and internal questionnaire name
    When User can select the catagory and services for the purpose of VAS consultation form creation
    And User can click the next button
    And User can add the different types of questions in QB
    And User can give the lengthy content in question name field or option name field
    When User can click the save draft button
    And User can click the continue editing button
    And User can add different types of questions and user didnt enter the question name in any one of the question
    And User can click Save draft button
    Then Verify the error popup message
    And User can click continue editing button
    And User can enter the question name for empty field
    And User can click save draft button after adding the questions
    And User can click the back to dashboard button and navigate to forms&questionnaire page
    And User can click the edit option for the same question

  Scenario: Verify the add conditional question option while user didnt complete upto selected questions
    Given User can add different types of questions
    When User can add one question that question name going to be empty
    And User can click the conditional option
    And User can click the add conditional questional option
    Then Verify the error message
    And User can enter the value in empty field

  Scenario: Test the conditional based questions while user uncheck the conditional option
    Given User can randomly select the question 
    When User can click the conditional option 
		And User can add different types of questions under the conditional option
		And User can uncheck the conditional option
		And User click the add conditional question option
		Then Verify that there is no question display under the conditional 
		And User can logout the super and login to admin credentials for approval 
		
		