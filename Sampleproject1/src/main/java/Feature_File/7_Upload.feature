@upload_flow
Feature: 

  Scenario: 
    Given Launch the external site "<url>" for GPpostcode upload flow
    When User click the Staff login button for GPpostcode upload flow
    And User enter the microsoft email "<email>" and click the next button for GPpostcode upload flow
    And User enter the password "<password>" and click the signup button for GPpostcode upload flow
    And User click the admin functions button and landed in database page
    And User click the download button for GP practices and edit it and Upload the edited gp practices file
    And User click the download button for contracts list and edit it and Upload the edited contracts list file 