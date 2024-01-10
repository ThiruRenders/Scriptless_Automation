import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.lang.runtime.SwitchBootstraps as SwitchBootstraps
import javax.persistence.criteria.CriteriaBuilder.Case as Case
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

WebUI.click(findTestObject('Menu_navigation/Modules/4.Promo Code'))

WebUI.setText(findTestObject('Object Repository/Application/Promo_code/Mode of Promo'), 'Whatsapp')

WebUI.click(findTestObject('Object Repository/Application/Promo_code/Discount'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application/Promo_code/Discount'), 'percentage', true)

WebUI.setText(findTestObject('Object Repository/Application/Promo_code/discount_rate'), '70')

/*----------------------------------------------------------------------------------------------*/
//Dublicate Entry
//from date
WebUI.click(findTestObject('Application/Promo_code/From_date'))

String desiredDate = '2023-12-15'

WebUI.executeJavaScript("document.getElementById('from_date').value = '$desiredDate';", null)

//To date
WebUI.click(findTestObject('Application/Promo_code/To_date'))

String desiredDate_to = '2023-12-18' // Change this to the date you want to select

WebUI.executeJavaScript("document.getElementById('to_date').value = '$desiredDate_to';", null)

/*----------------------------------------------------------------------------------------------*/
WebUI.setText(findTestObject('Object Repository/Application/Promo_code/promo_code'), 'Demo12')

WebUI.click(findTestObject('Object Repository/Application/Promo_code/button_Submit'))

String Promo = WebUI.getText(findTestObject('Object Repository/Application/Promo_code/promoCode_Validation'), FailureHandling.CONTINUE_ON_FAILURE)

Set<String> valueSet = new HashSet()

// Add values to the set
valueSet.add('Demo12')

valueSet.add('Demo24')

valueSet.add('Demo25')

valueSet.add('Demo26')

// String fieldValue = WebUI.getAttribute(findTestObject('Object Repository/Application/Promo_code/promo_code'), 'value')
String enteredValue = 'Demo12'

// Handle exception if no alert is present
if ((Promo.equalsIgnoreCase('The promo code is already exists in upcoming or active.') || Promo.equalsIgnoreCase('The mode of promotion field is required.')) || 
Promo.equalsIgnoreCase('The promo code must be 3 to 9 characters.')) {
    WebUI.click(findTestObject('Object Repository/Common_functions/Accept_ok'))

    String anotherValue = null

    if (valueSet.contains(enteredValue)) {
        // Use another value from the set
        anotherValue = getAnotherValue(valueSet, enteredValue)

        WebUI.setText(findTestObject('Object Repository/Application/Promo_code/promo_code'), anotherValue)

        WebUI.click(findTestObject('Object Repository/Application/Promo_code/button_Submit'))

        WebUI.click(findTestObject('Object Repository/Common_functions/Accept_ok'))
    }
}

private static String getAnotherValue(Set<String> set, String currentValue) {
    for (String value : set) {
        if (!(value.equals(currentValue))) {
            return value
        }
    }
    
    return currentValue
}

// Replace YourClassName with the actual name of your class