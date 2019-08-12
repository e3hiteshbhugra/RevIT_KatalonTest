$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/e3hit/Documents/GitHub/RevIT_KatalonTest/Include/features/bookFlight.feature");
formatter.feature({
  "name": "Test to Login to Mercury Tours and Book A Flight",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to Mercury Tours",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the Mercury Tours Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter credentials \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click Sign In Button",
  "keyword": "And "
});
formatter.step({
  "name": "I am navigated to Flight Finder page",
  "keyword": "Then "
});
formatter.step({
  "name": "I click one way flight",
  "keyword": "When "
});
formatter.step({
  "name": "I search for flights from \u003cfromPort\u003e to \u003ctoPort\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click first class service",
  "keyword": "And "
});
formatter.step({
  "name": "I click Find Flights Button",
  "keyword": "And "
});
formatter.step({
  "name": "I am navigated to Select Flight page",
  "keyword": "Then "
});
formatter.step({
  "name": "Flight information has text \u003cfromPort\u003e to \u003ctoPort\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click the continue button",
  "keyword": "When "
});
formatter.step({
  "name": "I am navigated to Book Flight page",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter details \u003cfirstName\u003e \u003clastName\u003e and \u003cccNum\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click Ticketless Travel Checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "I click Secure Purchase Button",
  "keyword": "And "
});
formatter.step({
  "name": "I am navigated to Flight Confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "fromPort",
        "toPort",
        "firstName",
        "lastName",
        "ccNum"
      ]
    },
    {
      "cells": [
        "mercury",
        "mercury",
        "Sydney",
        "London",
        "Hitesh",
        "Bhugra",
        "123456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to Mercury Tours",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the Mercury Tours Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "bookFlight.iAmOnTheMercuryToursHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter credentials mercury and mercury",
  "keyword": "When "
});
formatter.match({
  "location": "bookFlight.iEnterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Sign In Button",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.iClickSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am navigated to Flight Finder page",
  "keyword": "Then "
});
formatter.match({
  "location": "bookFlight.iAmNavigatedToFlightFinderPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click one way flight",
  "keyword": "When "
});
formatter.match({
  "location": "bookFlight.iClickOneWayFlight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for flights from Sydney to London",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.iSearchForFlights(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click first class service",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.iClickFirstClassService()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Find Flights Button",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.iClickFindFlightsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am navigated to Select Flight page",
  "keyword": "Then "
});
formatter.match({
  "location": "bookFlight.iAmNavigatedToSelectFlightPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flight information has text Sydney to London",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.flightInformationHasText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the continue button",
  "keyword": "When "
});
formatter.match({
  "location": "bookFlight.iClickTheContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am navigated to Book Flight page",
  "keyword": "Then "
});
formatter.match({
  "location": "bookFlight.iAmNavigatedToBookFlightPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter details Hitesh Bhugra and 123456",
  "keyword": "When "
});
formatter.match({
  "location": "bookFlight.iEnterPersonalAndPaymentDetails(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Ticketless Travel Checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.iClickTicketlessTravelCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Secure Purchase Button",
  "keyword": "And "
});
formatter.match({
  "location": "bookFlight.iClickSecurePurchaseButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am navigated to Flight Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "bookFlight.IAmNavigatedToFlightConfirmationPage()"
});
formatter.result({
  "status": "passed"
});
});