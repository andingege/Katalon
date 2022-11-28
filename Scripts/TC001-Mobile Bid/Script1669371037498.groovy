import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode
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

Mobile.startApplication('C:\\Users\\user\\Katalon Studio\\Second hand mobile\\data\\second-hand.apk', false)

Mobile.delay(26, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('OR0001-Mobile Bid/tap'), 0)

Mobile.tap(findTestObject('OR0001-Mobile Bid/btn nego'), 0)

Mobile.setText(findTestObject('OR0001-Mobile Bid/tap email'), 'demo-accounts@mailnesia.com', 0)

Mobile.setText(findTestObject('OR0001-Mobile Bid/tap password'), 'bagushary10', 0)

Mobile.checkElement(findTestObject('OR0001-Mobile Bid/btn masuk'), 0)

Mobile.checkElement(findTestObject('OR0001-Mobile Bid/btn negosiasi'), 0)

Mobile.setText(findTestObject('OR0001-Mobile Bid/harga bid'), '10000', 0)

Mobile.checkElement(findTestObject('OR0001-Mobile Bid/kirim'), 0)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.closeApplication()

