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
import com.thoughtworks.selenium.webdriven.commands.GetText as GetText
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

WebUI.click(findTestObject('Application/Question/Qn_create/Mark/3_Mark'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Question/Qn_create/Topic/select_Topic'), 'Vocabulary MCQ', 
    true)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Qn Type/Select Q and A Type -'))

WebUI.click(findTestObject('Application/Question/Qn_create/Qn Type/Open Ended Question'))

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/MCQ_Create/div_Temp question'), 
    'A paragraph is a series of sentences that are organized and coherent, and are all related to a single topic. Almost every piece of writing you do that is longer than a few sentences should be organized into paragraphs')

WebUI.scrollToElement(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/OE Answer/div_NormalBlockquoteCodeHeader 1Header 2Hea_05b5cb_1'), 0)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/OE Answer/button_Keyword'))

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/OE Answer/button_Keyword_1'))

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/OE Answer/inputkeyword_1'), 'Test')

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/OE Answer/inputkeymark_1'), '2')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Application/Question/Qn_create/manual_id'), 'Temp0001')

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/button_Save'))

String Mark_err = WebUI.getText(findTestObject('Object Repository/Application/Question/Qn_create/_Question Creations/SAQ Create/Err_Opject'), 
    FailureHandling.CONTINUE_ON_FAILURE)

if (Mark_err.equalsIgnoreCase('Answers marks exceeded') || Mark_err.equalsIgnoreCase('Your answer marks or blank mismatched please check it')) {
    WebUI.click(findTestObject('Object Repository/Application/button_OK'))

    WebUI.scrollToPosition(0, 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Mark/Select Marks'))

    WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/Mark/2_Mark'))
}

WebUI.scrollToElement(findTestObject('Object Repository/Application/Question/Qn_create/manual_id'), 0)

WebUI.click(findTestObject('Object Repository/Application/Question/Qn_create/button_Save'))

