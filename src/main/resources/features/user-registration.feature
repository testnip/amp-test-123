@automation
Feature: User Registration

  Scenario: User is on registration page
    Given User is on customer portal
    And User want to register

  Scenario Outline: No postcode or address using enter
    Given User has address "<address>"
    When User performs address search
    Then User should see icon "<icon type>" and message "<address search message>"

    Examples:
      | address | icon type | address search message   |
      |         | INVALID   | Please enter an address. |

       