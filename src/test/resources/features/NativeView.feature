Feature: Native View

  Background:
    Given User is on the login page
    When User login into the application
    Then Samples List is displayed

  @RegressionTest
  Scenario: Views are successfully displayed
    Given Native View button is displayed
    When User clicks the Native View button
    Then View one is displayed
    And View two is displayed
    And View tree is displayed