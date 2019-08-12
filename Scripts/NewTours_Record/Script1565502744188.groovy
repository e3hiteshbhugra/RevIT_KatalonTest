import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://newtours.demoaut.com/mercurywelcome.php')

WebUI.waitForPageLoad(5)

WebUI.verifyEqual(WebUI.getWindowTitle(), 'Welcome: Mercury Tours')

WebUI.setText(findTestObject('Object Repository/Page_Welcome Mercury Tours/input_User                     Name_userName'), 
    'mercury')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome Mercury Tours/input_Password_password'), 'Vo4qP0PVzw0=')

WebUI.click(findTestObject('Page_Welcome Mercury Tours/input_Password_login'))

WebUI.waitForPageLoad(5)

WebUI.verifyEqual(WebUI.getWindowTitle(), 'Find a Flight: Mercury Tours:', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/input_Round TripOne Way_tripType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondonNew YorkParisPortlandSan FranciscoSeattleSydneyZurich'), 
    'Sydney', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/select_AcapulcoFrankfurtLondonNew YorkParisPortlandSan FranciscoSeattleSydneyZurich_1'), 
    'London', true)

WebUI.click(findTestObject('Object Repository/Page_Find a Flight Mercury Tours/input_Economy class Business classFirst class_servClass'))

WebUI.click(findTestObject('Page_Find a Flight Mercury Tours/input_Airline_findFlights'))

WebUI.waitForPageLoad(5)

WebUI.verifyEqual(WebUI.getWindowTitle(), 'Select a Flight: Mercury Tours', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Sydney to London', false)

WebUI.click(findTestObject('Object Repository/Page_Select a Flight Mercury Tours/input_Price               303_reserveFlights'))

WebUI.waitForPageLoad(5)

WebUI.verifyEqual(WebUI.getWindowTitle(), 'Book a Flight: Mercury Tours', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passFirst0'), 'Hitesh')

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Meal_passLast0'), 'Bhugra')

WebUI.setText(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Expiration_creditnumber'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Billing Address_ticketLess'))

WebUI.click(findTestObject('Object Repository/Page_Book a Flight Mercury Tours/input_Country_buyFlights'))

WebUI.waitForPageLoad(5)

WebUI.verifyEqual(WebUI.getWindowTitle(), 'Flight Confirmation: Mercury Tours', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Flight Confirmation', false)

WebUI.click(findTestObject('Object Repository/Page_Flight Confirmation Mercury Tours/a_SIGN-OFF'))

WebUI.closeBrowser()

