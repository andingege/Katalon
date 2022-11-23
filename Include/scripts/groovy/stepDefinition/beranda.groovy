package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then

public class beranda {

	@Given("Pengguna berada di Halaman Beranda")
	public void pengguna_berada_di_Halaman_Beranda() {
		WebUI.callTestCase(findTestCase('beranda/login/TCBL001_login'), [('urlLogin') : 'https://secondhand-store.herokuapp.com/login'
			, ('email') : 'aditia.anggaperdana@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Pengguna validasi UI icon Home")
	public void pengguna_validasi_UI_icon_Home() {
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB001_icon_Homepage'))
		WebUI.takeScreenshot()
	}

	@Then("Pengguna melakukan validasi UI Gambar pada Katalog")
	public void pengguna_melakukan_validasi_UI_Gambar_pada_Katalog() {
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB002_gambar_Sepeda'))
		WebUI.takeScreenshot()
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB003_gambar_TVSamsung'))
		WebUI.takeScreenshot()
	}

	@Then("Pengguna melakukan validasi Judul dan Kategori produk pada Katalog")
	public void pengguna_melakukan_validasi_Judul_dan_Kategori_produk_pada_Katalog() {
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB004_judulKamera'))
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB006_kategoriElektronik'))
		WebUI.takeScreenshot()
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB005_judulMobil'))
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB007_kategoriKendaraan'))
		WebUI.takeScreenshot()
	}

	@Then("Pengguna melakukan validasi Mata Uang dan Nominal pada Katalog")
	public void pengguna_melakukan_validasi_Mata_Uang_dan_Nominal_pada_Katalog() {
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB008_nominalTensi_Rp300.000,00'))
		WebUI.takeScreenshot()
		WebUI.verifyElementVisible(findTestObject('beranda/beranda_Secondhand Store/ORBB009_nominalVario150_Rp30.000.000,00'))
		WebUI.takeScreenshot()
	}
}
