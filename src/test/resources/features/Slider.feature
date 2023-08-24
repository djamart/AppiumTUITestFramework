Feature: Slider

  Background:
    Given User is on the login page
    When User login into the application
    Then Samples List is displayed

  @RegressionTest
  Scenario: Slider works properly
    Given Slider button is displayed
    When User clicks the Slider button
    Then Slider page is displayed
    And User can slide to the right
    And User can slide to the left