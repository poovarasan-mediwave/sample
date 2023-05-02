@cancel
Feature: Test the Approver cancel flow

  Scenario: Creator create and approver approve and cancel
    When user enter the cretor username "<CreatorUser>" and creatorpassword "<CreatorPassword>"
    And user click the Login button in creator user
    Then user navigate to resource page and user click the create new resource option
    And user should select the article in resource type form
    And user enter the resource titles and then user should select the topics
    And user should select ageGroups
    And user add the content links and click the save button
    And user enter tag and click the list of current tags
    #And user click the publishers 
    And user should select the approver list and click the submit for approval button
    And user take screenshot and click the profile option
    And user click the logout option in creator 
    When user Enter the Email Address in User text box
    And user Enter the Password in password text box
    Then user Click the Login Button and It Navigates to current resource list page
     And user click the my notification button in dashboard and navigates to my notifiaction
    And user click the recently added notification button
    And user click the approve button and success message pops up
    And user click the approved notification button and navigates to cancel approve page
    And user click the cancel approve button and select okay button
