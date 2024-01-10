import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open Browser : Chrome'
WebUI.openBrowser('')

'Navigate URL : QC-SS'
WebUI.navigateToUrl('https://qc.studysmart.sg/login')

'Windows Size : Maximize'
WebUI.maximizeWindow()

'Auth : Forgot password'
WebUI.callTestCase(findTestCase('Auth/Forgot_Password'), [:], FailureHandling.STOP_ON_FAILURE)

'Auth : Login'
WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Menu Navigation'
WebUI.callTestCase(findTestCase('Application/Menu_navigation'), [:], FailureHandling.STOP_ON_FAILURE)

'Promo_Menu'
WebUI.callTestCase(findTestCase('Application/Promo code'), [:], FailureHandling.STOP_ON_FAILURE)

'Subscription_Menu'
WebUI.callTestCase(findTestCase('Application/Pricing'), [:], FailureHandling.STOP_ON_FAILURE)

'Flashcard_Menu'
WebUI.callTestCase(findTestCase('Application/Flashcard_Functionality/Flashcard'), [:], FailureHandling.STOP_ON_FAILURE)

'Question : Dashboard'
WebUI.callTestCase(findTestCase('Application/Question Bank/Question_Dashboard/Filter'), [:], FailureHandling.STOP_ON_FAILURE)

'Question : MCQ Question creation'
WebUI.callTestCase(findTestCase('Application/Question Bank/Question_Create/MCQ Create'), [:], FailureHandling.STOP_ON_FAILURE)

'Question : SAQ Question creation'
WebUI.callTestCase(findTestCase('Application/Question Bank/Question_Create/SAQ Create'), [:], FailureHandling.STOP_ON_FAILURE)

'Question : OE Question creation'
WebUI.callTestCase(findTestCase('Application/Question Bank/Question_Create/OE answer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

