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


RunConfiguration.setExecutionSettingFile('C:\\Users\\03T068\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Application\\Question Bank\\Question_Create\\Qn_Create\\20231219_175627\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Common_functions/Authorized_user_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/p_Create'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Select Level'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Primary 1'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Select Subject'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/English'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Select Exam'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/CA 1'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Select Marks'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/1_Mark'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Qn_create/Select_Topic'), 'Vocabulary MCQ', 
    true)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Question_type'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/MCQ'))

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/div_Temp Question'), 'Temp Question')

WebUI.scrollToPosition(0, 500)

WebUI.findWebElement(findTestObject('Temp/div_Single_layout_1'), 0)

WebUI.findWebElement(findTestObject('Temp/div_Single_layout_2'), 0)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Single_Option'))

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/Single_option_1'), 'A1')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/Single_option_2'), 'A2')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/Single_option_3'), 'A3')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/Single_option_4'), 'A4')

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Single_option_1_check'))

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/input_manual_id'), 'Temp1')

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/button_Save'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Single_Option'))

WebUI.click(findTestObject(null))

''', 'Test Cases/Application/Question Bank/Question_Create/Qn_Create', new TestCaseBinding('Test Cases/Application/Question Bank/Question_Create/Qn_Create',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
