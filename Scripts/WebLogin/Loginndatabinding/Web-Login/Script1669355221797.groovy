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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_Seconhand)

WebUI.comment(description)

WebUI.setText(findTestObject('web-login/OR01 - EmailField'), email)

WebUI.setText(findTestObject('web-login/OR04 - PasswordField'), password)

WebUI.click(findTestObject('web-login/OR03 - LoginButton'))

if (flag == 'null') {
    WebUI.verifyElementText(findTestObject('Object Repository/web-login/button_Masuk'), 'Masuk')

    WebUI.delay(2)

    WebUI.takeScreenshot()
} else if (flag == 'usernamenull') {
    WebUI.waitForElementPresent(findTestObject('Object Repository/web-login/input_Email'), 10)

    WebUI.delay(2)

    WebUI.takeScreenshot()
} else if (flag == 'passwordnull') {
    WebUI.waitForElementPresent(findTestObject('Object Repository/web-login/input_Password'), 10)

    WebUI.delay(2)

    WebUI.takeScreenshot()
}

WebUI.closeBrowser()

