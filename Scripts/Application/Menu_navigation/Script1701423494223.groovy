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

not_run: WebUI.callTestCase(findTestCase('Common_functions/Authorized_user_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/2.User Privilege'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/1.SS_Dashboard'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/3.Email Configuration'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/4.Promo Code'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/5.Pricing'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/6.Flashcards'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/7.Qns_Dashboard'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/8.Qns_Create'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/9.Qns_View'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/10.MIS'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/11.Evaluation'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/12.Enquiry'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/13.Question Feedback'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/14.Referral management'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/15.Payments'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/16.Result'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/17.Prospective Clients'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Others/Studysmart_icon'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Others/Menu_bars'))

WebUI.mouseOver(findTestObject('Object Repository/Menu_navigation/Others/Studysmart_icon'))

WebUI.mouseOver(findTestObject('Menu_navigation/Modules/1.SS_Dashboard'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Modules/1.SS_Dashboard'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Others/Expand_icon'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Others/Compress_icon'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Others/Admin_Text'))

WebUI.click(findTestObject('Object Repository/Menu_navigation/Others/Settings'))

not_run: WebUI.callTestCase(findTestCase('Common_functions/Authorized_User_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

