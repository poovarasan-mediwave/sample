@ChildDetails
Feature: This is child flow to view Child permissions
  

  Scenario: To login as parent user and view child details
    Given User now navigated to the Home page
    When User now click AlreadySignUp link
	And User now enters The "<email>" In Email Field
    And User now enters The "<password>" In Password Field
    And User now clicks the Login button to login
    Then user Verify Home text in dashboard page
    Then  user click on child User icon
    
#  Scenario: To view Child access details
#  	 Then verify child page text
#  	 Then click to view child acess details
#  	 Then take screenshot of the child parents carer page
#   	 And Navigate back to child overview
#    
#
#Scenario: To view appointment and reschedule appointments    
#    Then click to view appointment page
#    Then click to View details of appointments
#    Then Click to reschedule appointment 
#    Then click to select the location 
#    Then Click to select the date to be rescheduled
#    Then select time slot
#    And click confirm booking 
#    Then view the appointment success message
#    Then click Okay to view the rescheduled appointment
#    Then take screenshot of the appointment rescheduled
#  
# 
# Scenario: To View screening and Immnunization results   
#    And click child overview link
#    Then Click Newborn screening and immunisation icon
#    Then click to view immunisation
#    Then Take screenshot of immunisation page
#    Then click to view screening 
#    Then Take scrceenshot of the screening page
#    
 Scenario: To View appointment page
    And click child overview link again
    Then click letters and documents
    Then Click All button to view all documents
    Then Click View Document button to view the document
   	Then click Close icon to close the document
   	Then Click Filter icon to filter the documents
   	Then select checkboxes to select the document title
   	Then Click Apply button to view the filtered documents
   	Then click filter and clear the title to view all documents
   	Then Click Sort icon to sort filter
   	Then choose aplhabetically order to sort
    Then Take scrceenshot of the Documents page
    
#Scenario: TO view Resources page
#    And click Home link
#    Then click Resources icon
#    Then click findout more button
#    Then make as favourite
#    Then view the marked favourite card
#    And take screenshot of the resources page
    
