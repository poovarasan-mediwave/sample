Feature: Image insert and approver approve

  Scenario: Test the Creator create resources insert image and approver approve, creator publish and unpublish
    When user enter the CUser "<CreatorUser>" and CPassword "<CreatorPassword>"
    And user login creator credentials
    Then user should be on resource page and click the create new resource option
    And user select the video in Resources Type
    And user should enter the resource title and user should select the Topic
    And user select ageGroup
    And user enter video caption in image "<CaptionImage>" and user click the video source button
    #And user insert the image page in video content option
    And user enter the tags
    #And user should click the publisher button
    And user should select the approvers and also click the submit for approval button
    And user click the profile option and then user click the logout button in creator
    And user should enter the "<ApproverUser>" and "<ApproverPass>" and user click the Login button in approver credentials
    And user should click the Mynotification option and user click the newly added resources
    And users click the approve button
    And users click the profile and users click logout button approver credential
    And user should enters the "<CreatorUser>" and  "<CreatorPassword>" and login the creator page
    And user click the my Notification by creater and user click the newly added resource
    And user click the publish button and user logout the creator credentials
    And user enters the "<TrustUser>" and "<TrustPassword>" in trust admin and user click login button
    And user should click the Mynotification option and user search the already create contentor name and click the newest one
    And user should take screenshot for present creator
