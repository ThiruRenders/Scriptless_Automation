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

WebUI.click(findTestObject('Menu_navigation/Modules/5.Pricing'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/P1_Action'))

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P1_Actual_Price'), '49.90')

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P1_Offer_Price'), '30')

WebUI.click(findTestObject('Object Repository/Application/Pricing/P1_Update_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/OK_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/P2_Action'))

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P2_Actual_Price'), '74.90')

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P2_Offer_Price'), '30')

WebUI.click(findTestObject('Object Repository/Application/Pricing/P2_Update_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/OK_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/P3_Action'))

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P3_Actual_Price'), '249.90')

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P3_Offer_Price'), '50')

WebUI.click(findTestObject('Object Repository/Application/Pricing/P3_Update_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/OK_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/P4_Action'))

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P4_Actual_Price'), '249.90')

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P4_Offer_Price'), '50')

WebUI.click(findTestObject('Object Repository/Application/Pricing/P4_Update_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/OK_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/P5_Action'))

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P5_Actual_Price'), '349.90')

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P5_Offer_Price'), '40')

WebUI.click(findTestObject('Object Repository/Application/Pricing/P5_Update_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/OK_button'))

WebUI.scrollToElement(findTestObject('Object Repository/Application/Pricing/P6_Action'), 0)

WebUI.click(findTestObject('Object Repository/Application/Pricing/P6_Action'))

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P6_Actual_Price'), '349.90')

WebUI.setText(findTestObject('Object Repository/Application/Pricing/P6_Offer_Price'), '40')

WebUI.click(findTestObject('Object Repository/Application/Pricing/P6_Update_button'))

WebUI.click(findTestObject('Object Repository/Application/Pricing/OK_button'))

