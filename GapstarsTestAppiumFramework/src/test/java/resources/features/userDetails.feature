Feature: userDetails

  Scenario Outline: Entering user details
    When User enter username as "<UserName>"
    And User selects gender as "<Gender>"
    And User selects country as "<CountryName>"
    Then User clicks on Submit button

    Examples:
      | UserName    | Gender | CountryName |
      | nilmini ama | female | Angola      |

  Scenario: Fill the eCommerce form with test data
    When I fill the form with the data
    Then Form is submitted successfully


