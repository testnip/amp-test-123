@automation
Feature: User Registration

  Background: User is on registration page
    Given User is on customer portal
    And User want to register

  Scenario Outline: User register successfully
    Given User has registration details "<registration details>"
    When User submits registration form
    Then User should login successfully

    Examples:
      | registration details |

