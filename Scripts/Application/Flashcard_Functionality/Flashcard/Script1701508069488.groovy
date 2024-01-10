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

WebUI.click(findTestObject('Menu_navigation/Modules/6.Flashcards'))

WebUI.click(findTestObject('Object Repository/Application/Flashcard/div_Active Status'))

WebUI.click(findTestObject('Object Repository/Application/Flashcard/div_custom-control custom-switch enable che_3dc359'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/div_custom-control custom-switch enable che_3dc359'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/div_custom-control custom-switch enable che_3dc359'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Flashcard/select_--Select Primary Level--'), 'P6', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Flashcard/select_--Select Subject--'), 'Science', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Flashcard/select--Topic--'), 'Plant System', true)

WebUI.setText(findTestObject('Object Repository/Application/Flashcard/input_flashcard_name'), 'F_Name_1')

WebUI.setText(findTestObject('Object Repository/Application/Flashcard/input_description'), 'Des_01')

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

WebUI.click(findTestObject('Application/Flashcard/button_Reset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Flashcard/select_--Select Primary Level--'), 'P6', 
    true)

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Flashcard/select_--Select Subject--'), 'English', 
    true)

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Flashcard/select_Vocabulary Cloze MCQVisual Comprehen_671494'), 
    'Comprehension Open-Ended', true)

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

WebUI.setText(findTestObject('Object Repository/Application/Flashcard/input_description'), 'Des_1_1')

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

WebUI.setText(findTestObject('Object Repository/Application/Flashcard/input_flashcard_name'), 'Name_11_1_1')

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Application/button_OK'))

not_run: WebUI.click(findTestObject('Application/Flashcard/Upload_click'))

WebUI.uploadFile(findTestObject('Application/Flashcard/upload_image'), 'C:\\Users\\03T068\\Pictures\\1684820554_10.png')

WebUI.click(findTestObject('Object Repository/Application/Flashcard/Save Study Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

not_run: WebUI.closeBrowser()

