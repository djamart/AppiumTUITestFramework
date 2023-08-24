Feature: Application Login

  @RegressionTest
  Scenario: User Login
    Given User is on the login page
    When User login into the application
    Then Samples List is displayed