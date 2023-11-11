Feature: Facebook login

  Scenario:  User login in with valid data
    Given the user is on the Facebook login page
    When the user enters their valid username
    And the user enters their valid password
    And the user clicks the login button
    Then the user should be logged into their Facebook account
