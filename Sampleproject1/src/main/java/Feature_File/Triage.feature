@Triage_flow
Feature: 

  Scenario: 
    Given Launch the external site "<url>" for triage flow purpose
    When User click the Staff login button for triage flow purpose
    And User enter the microsoft email "<email>" and click the next button for triage flow purpose
    And User enter the password "<password>" and click the signup button for triage flow purpose
    And User click the Triage worklist button in pending page
    And User click the select button and IG raised SG 
    And User click the Assign to me and mark completed button and click save
    And User click completed button and landed in completed page and select pending page
    And User click the search option and Enter the particular User ID and click pending button 
    And User click the filter by button and select TOP option 
    And User select the category and rightcare status and safegaurding 
    And User select the status and click the submit button
    And User click the Reset button and shows the pending page
