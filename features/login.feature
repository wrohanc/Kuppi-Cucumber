Feature: Website Login
  Scenario Outline: Login with invalid credentials
    Given Open browser window
    When provide username "<username>" and password "<password>"
    Then User not logged in
    #When Display error message
    When New function

    Examples:
      | username| password|
      | rohan    |123      |