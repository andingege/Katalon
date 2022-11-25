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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('WEB/SecondHandJual/TcLogin/TC001 - loginMine'), [('username') : 'widyyy31@gmail.com', ('password') : 'Google31'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WEB/SecondHandJual/JualMenu/OOR001 - btnJual'))

String getRandomString = CustomKeywords.'notes.randomString' ()

WebUI.setText(findTestObject('WEB/SecondHandJual/JualMenu/OOR002 - fieldNama'), productName + getRandomString)

WebUI.setText(findTestObject('WEB/SecondHandJual/JualMenu/OOR003 - fieldHarga'), '100000')

WebUI.click(findTestObject('WEB/SecondHandJual/JualMenu/OOR004 - btnKategori'))

WebUI.selectOptionByValue(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR004 - btnKategori'), '4', false)

WebUI.setText(findTestObject('WEB/SecondHandJual/JualMenu/OOR005 - Deskripsi'), 'iphone 14 pro - ' + getRandomString)

String directory = RunConfiguration.getProjectDir()

pathFile = ((directory + '/images/') + 'iphone.jpg')

WebUI.comment(pathFile)

WebUI.uploadFile(findTestObject('WEB/SecondHandJual/JualMenu/OOR006 - UploadFile'), pathFile)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('WEB/SecondHandJual/JualMenu/OOR007 - btnTerbitkan'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('WEB/SecondHandJual/JualMenu/OOR008 - verifySucces'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

