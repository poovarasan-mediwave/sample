Feature: Approver approve and creator publish and unpublish flow

  Scenario: Test the Creator create resources and Approver approve and then publish
    When user enter CCusername "<CreatorUser>" and CCpassword "<CreatorPassword>"
    And Click login for Content creator credentials
    Then user navigate resource page and click the create new resource option
    And user should  select the video in Resources Type
    And user should  enter the resource title and then user should select the topic
    And user select the ageGroup
    And user enter the video caption "<caption>" and then user click the video source
    And user add the  video content link in creator page and then click the save button
    And user enter tags and then click the list of current tags in that click add tag button
    #And user should click the publisher option
    And user select the approvers list and then click the submit for approval button
    And user take screenshot and then click profile option
    And user click the logout option in creator credentials
    And user should enter the ApproverEmailAddress "<ApproverUser>" and ApproverPassword"<ApproverPass>" in approvers credentials
    And user click the Login button in approver credentials and user click the Mynotification
    And user click the newly added resources and then click the approve button
    And users click the profile and users click logout button in approver credential
    And user should enters the creator credential "<CreatorUser>" and  "<CreatorPassword>" and login the creator page
    And user click the my Notification by creater in that user click the newly added resource
    And user click the publish button in creator credentials
    And user cick newest one and also click unpublish
    And user logout the creator credentials
