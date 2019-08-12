import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class bookFlight {
	
	@Given("I am on the Mercury Tours Home Page")
	def iAmOnTheMercuryToursHomePage() {
		WebUI.openBrowser("http://newtours.demoaut.com/mercurywelcome.php")
		
		WebUI.verifyEqual(WebUI.getWindowTitle(), 'Welcome: Mercury Tours')
	}

	@When("I enter credentials (.*) and (.*)")
	def iEnterCredentials(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Welcome Mercury Tours/input_User                     Name_userName'), 
										username)

		WebUI.setText(findTestObject('Object Repository/Page_Welcome Mercury Tours/input_Password_password'), password)
	}
	
	@And("I click Sign In Button")
	def iClickSignInButton() {
		WebUI.click(findTestObject('Page_Welcome Mercury Tours/input_Password_login'))
	}

	@Then("I am navigated to Flight Finder page")
	def iAmNavigatedToFlightFinderPage() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyEqual(WebUI.getWindowTitle(), 'Find a Flight: Mercury Tours:', FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I click one way flight")
	def iClickOneWayFlight() {
		WebUI.click(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/input_Round TripOne Way_tripType'))
	}
	
	@And("I search for flights from (.*) to (.*)")
	def iSearchForFlights(String fromPort, String toPort) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondonNew YorkParisPortlandSan FranciscoSeattleSydneyZurich'),
			fromPort, true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondonNew YorkParisPortlandSan FranciscoSeattleSydneyZurich_1'),
			toPort, true)
	}
	
	@And("I click first class service")
	def iClickFirstClassService() {
		WebUI.click(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/input_Economy class Business classFirst class_servClass'))
	}
	
	@And("I click Find Flights Button")
	def iClickFindFlightsButton() {
		WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/input_Airline_findFlights'))
	}
	
	@Then("I am navigated to Select Flight page")
	def iAmNavigatedToSelectFlightPage() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyEqual(WebUI.getWindowTitle(), 'Select a Flight: Mercury Tours', FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("Flight information has text (.*) to (.*)")
	def flightInformationHasText(String fromPort, String toPort) {
		WebUI.verifyTextPresent(fromPort + ' to ' + toPort, false)
	}
	
	@When("I click the continue button")
	def iClickTheContinueButton() {
		WebUI.click(findTestObject('Object Repository/Page_Select a Flight Mercury Tours/input_Price               303_reserveFlights'))
	}
	
	@Then("I am navigated to Book Flight page")
	def iAmNavigatedToBookFlightPage() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyEqual(WebUI.getWindowTitle(), 'Book a Flight: Mercury Tours', FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I enter details (.*) (.*) and (.*)")
	def iEnterPersonalAndPaymentDetails(String firstName, String lastName, String ccNum) {
		WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passFirst0'), 'Hitesh')
		WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passLast0'), 'Bhugra')
		WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Expiration_creditnumber'), '123456')
	}
	
	@And("I click Ticketless Travel Checkbox")
	def iClickTicketlessTravelCheckbox() {
		WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Billing Address_ticketLess'))
	}
	
	@And("I click Secure Purchase Button")
	def iClickSecurePurchaseButton() {
		WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Country_buyFlights'))
	}
	
	@Then("I am navigated to Flight Confirmation page")
	def IAmNavigatedToFlightConfirmationPage() {
		WebUI.waitForPageLoad(5)
		WebUI.verifyEqual(WebUI.getWindowTitle(), 'Flight Confirmation: Mercury Tours', FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyTextPresent('Flight Confirmation', false)
		WebUI.click(findTestObject('Object Repository/Page_Flight Confirmation Mercury Tours/a_SIGN-OFF'))
		WebUI.closeBrowser()
	}
}