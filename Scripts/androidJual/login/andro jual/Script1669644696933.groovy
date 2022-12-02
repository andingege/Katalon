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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.startApplication('C:\\Users\\Aditia Angga Perdana\\Katalon Studio\\Platinum-Challenge\\binar-platinum-challenge-team2\\Apk\\secondhand.apk', 
    true)

Mobile.tap(findTestObject('andro jual/login/buttonPlus'), 0)

Mobile.tap(findTestObject('andro jual/login/buttonMasuk'), 0)

Mobile.setText(findTestObject('andro jual/login/inputEmail'), 'studentqa4@binar.id', 
    0)

Mobile.setText(findTestObject('andro jual/login/inputPassword'), 'studentQA4', 
    0)

Mobile.tap(findTestObject('andro jual/login/buttonMasukInLoginPage'), 0)

Mobile.setText(findTestObject('andro jual/formJual/namaProduk'), ' ', 0)
Mobile.setText(findTestObject('andro jual/formJual/hargaProduk'), ' ', 0)
Mobile.tap(findTestObject('andro jual/formJual/pilihKategori'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.selectListItemByIndex(findTestObject('andro jual/formJual/pilihKategori'), 1, 10)

