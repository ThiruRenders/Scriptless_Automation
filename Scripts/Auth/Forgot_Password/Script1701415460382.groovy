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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://qc.studysmart.sg/login')

WebUI.click(findTestObject('Object Repository/Auth/Forgot_Password/Forgot Your Password'))

String actualValidationMessage = WebUI.getText(findTestObject('Object Repository/Auth/Forgot_Password/Dont worry(msg)'))

String expectedValidationMessage = 'Don\'t worry! Enter your email below and we\'ll email you with instructions on how to reset your password.'

WebUI.verifyMatch(actualValidationMessage, expectedValidationMessage, false)

WebUI.setText(findTestObject('Object Repository/Auth/Forgot_Password/input_email'), 'moorthy@tagcs.in')

WebUI.click(findTestObject('Object Repository/Auth/Forgot_Password/Submit_button'))

String actualValidationMessage_1 = WebUI.getText(findTestObject('Object Repository/Auth/Forgot_Password/We are sorry(msg)'))

String expectedValidationMessage_1 = 'We are sorry! The given email address has not been registered with StudySmart. Please enter a registered email address.'

WebUI.verifyMatch(actualValidationMessage_1, expectedValidationMessage_1, false)

WebUI.click(findTestObject('Object Repository/Auth/Forgot_Password/Login'))

