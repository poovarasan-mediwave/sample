Feature: Approver give flag for review flow

  Scenario: Test the Creator create resources and Approver gives error message
    When user enter the "<CreatorUser>" and "<CreatorPassword>"
    And user click the Login button in creator crendentials
    Then user should navigate to resource page and user click the create new resource option
    And user should select the article in resource type
    And user enter the resource title and then user should select the topic
    And user should select the ageGroup
    And user add the content link and then click the save button
    And user enter tags and then click the list of current tags
    #And user click the publisher option
    And user should select the approvers list and then click the submit for approval button
    And user take screenshot and then click the profile option
    And user click the logout option in creator crendentials
    And user should enters the ApprovaerEmail "<ApproverUser>" and ApproverPassword"<ApproverPass>"
    And user click the Login button and then click the my Notification option
    And user click the newly added resources name
    And user click the flag for review button and then enter notes after click the submit button
    And user should take screenshot and then click the profile option
    And user click the logout option in approver credentials
    When user enter the "<CreatorUser>" and "<CreatorPassword>" and then user click the Login button
    And user click the my notification button in creator login and then user take screenshot
