@Import_file
Feature: 

  Scenario: 
    Given Launch the external <url>
    When User click the Staff login button
    And User enter the microsoft email <email> and click the next button
    And User enter the password <password> and click the signup button
    And User click the forms and questionnaire button
    And User click the import existing form button and external window pops up
    And User select particular file and import the file
    And User edit the questionnaire name and services of the imported file 
    And User edit the added questions and click save draft button
    
