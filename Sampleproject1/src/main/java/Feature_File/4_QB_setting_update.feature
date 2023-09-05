@setting_update
Feature: Test the Form setting update option

  Scenario: Verify the Form setting update field
    Given Launch the exeternal site "<url>" for setting update
    When User can enter the super admin email "<email>" and click next button for setting update
    And User can enter the super admin password "<password>" and click the next button forsetting update
    And User can click the forms and questionnaire option for setting update purpose
    And User can click the setting option
    And User can reset the questionnaire name and internal questionnaire name
    And User can click the more option
    And User can reset the catagory and services
    And User can click the update button
    And User again click the setting option
