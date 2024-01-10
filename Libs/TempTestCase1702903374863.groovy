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


RunConfiguration.setExecutionSettingFile('C:\\Users\\03T068\\AppData\\Local\\Temp\\Katalon\\20231218_181254\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://qc.studysmart.sg/login\')\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/input_email\'), \'admin@imperial.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Study Smart - Imperial EduTech/input_password\'), \'lt7kXPiIKwaT+RdC1Uoh9g==\')\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/button_Sign In\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/p_Create\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Select Level\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Primary 1\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Select Subject\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/English\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Select Exam\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/CA 1\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Select Marks \'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/1_Mark\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Study Smart - Imperial EduTech/Select_Topic\'), \'Vocabulary MCQ\', true)\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Question_type\'))\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/MCQ\'))\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/div_Temp Question\'), \'Temp Question\')\n\nWebUI.scrollToPosition(0, 500)\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Single_Option\'))\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/Single_option_1\'), \'A1\')\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/Single_option_2\'), \'A2\')\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/Single_option_3\'), \'A3\')\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/Single_option_4\'), \'A4\')\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/Single_option_1_check\'))\n\nWebUI.setText(findTestObject(\'Page_Study Smart - Imperial EduTech/input_manual_id\'), \'Temp1\')\n\nWebUI.click(findTestObject(\'Page_Study Smart - Imperial EduTech/button_Save\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

