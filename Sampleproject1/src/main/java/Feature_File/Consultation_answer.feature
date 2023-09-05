@Consultation
Feature: Test the user can answer the consultation form flow

  Scenario: Answer the consultation form
    Given Launch the service user url "<url>" for consultation form answer
    When User can enter the serviceuser email "<email>" for consultation form answer
    And User can enter the serviceuser password "<password>" for consultation form answer
    And User can enter the memorable word "<word>" and click the Rechapcha field
    And User can click the login button and navigate to client dashboard
    And User can click the start now option in consultation form for step3
    And User can answer all the questions
    And User can click the save button and navigate to dashboard
    And User again click the start now option
    And User can answer remaining questions
    And User can click the submit button
