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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.callTestCase(findTestCase('androidJual/login/TCJL001 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('andro jual/formJual/namaProduk'), ' drone serbabisa', 0)

Mobile.setText(findTestObject('andro jual/formJual/hargaProduk'), ' ', 0)

Mobile.tap(findTestObject('andro jual/formJual/pilihKategori'), 0)

Mobile.tap(findTestObject('andro jual/formJual/kategoriElektronik'), 0)

Mobile.setText(findTestObject('andro jual/formJual/lokasiProduk'), 'jakarta selatan', 0)

Mobile.setText(findTestObject('andro jual/formJual/Deskripsi'), 'drone serbabisa, canggih dan bagus', 0)

WebUI.callTestCase(findTestCase('androidJual/uploadGambar/TCJU001 - Upload Gambar'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('andro jual/formJual/buttonTerbitkan'), 0)

Mobile.verifyElementText(findTestObject('andro jual/formJual/inlineError - Harga tidak boleh kosong'), 'Harga tidak boleh kosong')

Mobile.takeScreenshot()

