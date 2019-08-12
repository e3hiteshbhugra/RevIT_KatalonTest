Feature: Test to Login to Mercury Tours and Book A Flight

  Scenario Outline: Login to Mercury Tours
    Given I am on the Mercury Tours Home Page
    When I enter credentials <username> and <password>
    And I click Sign In Button
    Then I am navigated to Flight Finder page
    When I click one way flight
    And I search for flights from <fromPort> to <toPort>
    And I click first class service
    And I click Find Flights Button
    Then I am navigated to Select Flight page
    And Flight information has text <fromPort> to <toPort>
    When I click the continue button
    Then I am navigated to Book Flight page
    When I enter details <firstName> <lastName> and <ccNum>
    And I click Ticketless Travel Checkbox
    And I click Secure Purchase Button
    Then I am navigated to Flight Confirmation page

    Examples: 
      | username | password | fromPort | toPort | firstName | lastName | ccNum  |
      | mercury  | mercury  | Sydney   | London | Hitesh    | Bhugra   | 123456 |
