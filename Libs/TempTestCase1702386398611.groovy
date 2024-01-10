import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\03T068\\AppData\\Local\\Temp\\Katalon\\Test Cases\\New Test Case\\20231212_183638\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.setText(findTestObject('Object Repository/Temp/input_email'), 'admin@imperial.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Temp/input_password'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

not_run: WebUI.click(findTestObject('Object Repository/Temp/button_Sign In'))

not_run: WebUI.click(findTestObject('Object Repository/Temp/p_Dashboard'))

not_run: WebUI.click(findTestObject('Object Repository/Temp/p_Flashcards'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Temp/select_--Select Primary Level--            _25750d'), 
    'P1', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Temp/select_--Select Subject--                  _bec145'), 
    'English', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Temp/select_Grammar MCQVocabulary MCQGrammar Clo_993248'), 
    'Comprehension', true)

not_run: WebUI.setText(findTestObject('Object Repository/Temp/input_flashcard_name'), 'flash123')

not_run: WebUI.click(findTestObject('Object Repository/Temp/label_custom-control-label'))

WebUI.click(findTestObject('Object Repository/Temp/input_status'))

WebUI.click(findTestObject('Object Repository/Temp/input_status'))

WebUI.click(findTestObject('Object Repository/Temp/button_or select file to upload'))

WebUI.click(findTestObject('Object Repository/Temp/button_Add Study'))

WebUI.closeBrowser()

''', 'Test Cases/New Test Case', new TestCaseBinding('Test Cases/New Test Case',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
