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

WebUI.click(findTestObject('Menu_navigation/Modules/7.Qns_Dashboard'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Primary Level'), 'P1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Subject'), 'English', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Topic'), 'Grammar MCQ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Status'), 'approved', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Question Level'), '0', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Application/Question/Dashboard/div_Total No. of Question'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Application/Question/Dashboard/div_MCQ'))

WebUI.verifyElementVisible(findTestObject('Application/Question/Dashboard/div_Open Ended Question'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Application/Question/Dashboard/div_Short Question'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Application/Question/Dashboard/div_Open Ended-Sub Question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Primary Level'), 'P2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Primary Level'), 'P3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Primary Level'), 'P4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Primary Level'), 'P5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Primary Level'), 'P6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Subject'), 'Mathematics', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Subject'), 'Science', true)

WebUI.selectOptionByValue(findTestObject('Application/Question/Dashboard/Select Topic'), 'Electrical System', true)

WebUI.selectOptionByValue(findTestObject('Application/Question/Dashboard/Select Topic'), 'Energy Conversion', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Status'), 'rework', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Status'), 'pendingqc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Status'), 'approved', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Question Level'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Dashboard/Select Question Level'), '2', true)

