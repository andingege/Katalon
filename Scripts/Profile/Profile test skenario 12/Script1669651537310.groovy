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

WebUI.callTestCase(findTestCase('WEB/SecondHandJual/TcLogin/TC001 - loginMine'), [('username') : 'binarqae1@gmail.com', ('password') : 'students1234'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('profile/Profile button'))

WebUI.click(findTestObject('profile/Profile menu'))

WebUI.selectOptionByValue(findTestObject('profile/Kota'), 'Bandung', false)

WebUI.setText(findTestObject('profile/nama'), '')

WebUI.setText(findTestObject('profile/Alamat'), 'Jekardah')

WebUI.setText(findTestObject('profile/No Handphone'), 'Jekardah')

WebUI.click(findTestObject('profile/btnSubmit'))

WebUI.verifyElementVisible(findTestObject('profile/AlertFail'))

WebUI.takeScreenshot()

