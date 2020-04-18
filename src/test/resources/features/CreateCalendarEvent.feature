@activities
Feature: Create clandar event
  As user, i want to be able to create calander events.
  Scenario: Create calendar event as sales manager
    Given user is on the login page
    When user logs in as a sales manager
    And  user navigates to "Avtivities" and "Calendar Event"
    Then user clicks on create calendar event button
    And user enters "sPRINT REC" as title
    And user enters "on this meeting we are talking something not really important"  as conversation
    Then user click on save and close button
    And user verifies that decription is "on this meeting we are talking something not really important"
    And user verifies that title is "sprint retropective"




