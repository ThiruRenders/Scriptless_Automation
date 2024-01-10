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

WebUI.click(findTestObject('Menu_navigation/Modules/8.Qns_Create'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Primary Level/Primary_Level'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Primary Level/Primary 1'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Subject/button_Select Subject'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Subject/English'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Exam/Select Exam'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Exam/CA 1'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Mark/Select Marks'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Mark/1_Mark'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Qn_create/Topic/select_Topic'), 'Vocabulary MCQ', 
    true)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Qn Type/Select Q and A Type -'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Qn Type/MCQ'))

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Temp question'), 
    'A paragraph is a series of sentences that are organized and coherent, and are all related to a single topic. Almost every piece of writing you do that is longer than a few sentences should be organized into paragraphs')

WebUI.scrollToElement(findTestObject('Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Answers'), 0)

WebUI.findWebElement(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Answers'), 
    0)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Option Type'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Single_1'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Single_2'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/input_answer_check'))

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/input_answer0'), 
    'A1')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/input_answer1'), 
    'B1')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/input_answer2'), 
    'C1')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/input_answer3'), 
    'D1')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Description'), 
    'Description')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/manual_id'), 'Temp0001')

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/button_Save'))

