@clientdashboard
Feature: Client Dashboard

  Scenario: Login
    Given Launch the browser <url>
    When User click the Staff login button in page
    And User enter the super microsoft email <email> and click next button
    And User enter password <password>
    Then click signup button

  Scenario: In Admin function go to client dashboard
    When click Admin fucntion in dashboard
    And click client dashboard

  Scenario: Top
    When In dropdown default select Top
    And In dashboard heading click edit
    And edit the text
    When Dashboard description click edit
    And edit the text in dashboard description

  Scenario: Step one Top Eligibility
    When In step one top eligibility click preview button
    And opens a preview page and click close buttton
    And Click edit in Form description
    And edit the text in Form description
    Then Click edit to change the estimated completion time

  Scenario: Step two
    When click replace to change the form
    And select the form
    And click the submit button
    And click the close icon
    And click preview to view the form and close
    And click edit button to change the form description
    Then click edit to change the estimated time change

  Scenario: Step three
    When In step three click the replace button
    And select the replace form
    And Scroll down to submit and click the submit button
    And close the form tab
    And preview and close the tab
    And edit to change the description
    And change the estimated time

  Scenario: Step four
    When In step four replace the form
    And select the form
    And Scroll down to submit and click the submit
    And click close icon
    And preview the step four form
    And edit form description
    Then edit time estimation

  Scenario: Counselling and Consent form
    When click the preview in counselling form
    And close the counselling preview
    And edit form description in counselling
    And click Replace consent form
    And select the form and click the submit button
    And close the tab in consent replace
    And preview consent form and close
    And edit the consent form description
