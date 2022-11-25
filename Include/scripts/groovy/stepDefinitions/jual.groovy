package stepDefinitions

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import internal.GlobalVariable

public class jual {

	@Given("open browser and redirect to url")
	public void open_browser_and_redirect_to_url() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("input username {string}")
	public void input_username(String username) {
		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR001 - userField'), username)
	}

	@When("input password {string}")
	public void input_password(String password) {
		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR002 - passField'), password)
	}
	@When("click button login")
	public void click_button_login() {
		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR003 - btnLogin'))
	}

	@Then("user verify success to dashboard home")
	public void user_verify_success_to_dashboard_home() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR008 - verifySucces'))
	}

	@Then("click button jual")
	public void click_button_jual() {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR001 - btnJual'))
	}


	@Then("user input field produk {string}")
	public void user_input_field_produk(String field_produk) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR002 - fieldNama'), field_produk)
	}

	@Then("user input field harga {string}")
	public void user_input_field_harga(String field_harga) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR003 - fieldHarga'), field_harga)
	}


	@Then("user input pilih kategori {string}")
	public void user_input_pilih_kategori(String string) {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR004 - btnKategori'))
	}


	@Then("user input deskripsi {string}")
	public void user_input_deskripsi(String deskripsi) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR005 - Deskripsi'), deskripsi)
	}

	//	@Then("user upload produk {string}")
	//	public void user_upload_produk(String string) {
	//
	//		WebUI.uploadFile(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR006 - UploadFile'))
	//	}


	@Then("user click button terbitkan")
	public void user_click_button_terbitkan() {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR007 - btnTerbitkan'))
	}


	@Then("user take screenshot")
	public void user_take_screenshot() {

		WebUI.takeScreenshot()
	}


	@Then("the field is all required")
	public void show_comment_the_user() {

		WebUI.comment("the field is all required!")
	}

	@Then("close browser")
	public void close_browser() {

		WebUI.closeBrowser()
	}



	// user input with one field only


	@Given("open browser and redirect to url1")
	public void open_browser_and_redirect_to_url1() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("input username1 {string}")
	public void input_username1(String username) {
		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR001 - userField'), username)
	}

	@When("input password1 {string}")
	public void input_password1(String password) {
		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR002 - passField'), password)
	}
	@When("click button login1")
	public void click_button_login1() {
		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR003 - btnLogin'))
	}

	@Then("user verify success to dashboard home1")
	public void user_verify_success_to_dashboard_home1() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR008 - verifySucces'))
	}

	@Then("click button jual1")
	public void click_button_jual1() {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR001 - btnJual'))
	}


	@Then("user input field produk1 {string}")
	public void user_input_field_produk1(String field_produk) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR002 - fieldNama'), field_produk)
	}

	@Then("user input field harga1 {string}")
	public void user_input_field_harga1(String field_harga) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR003 - fieldHarga'), field_harga)
	}


	@Then("user input pilih kategori1 {string}")
	public void user_input_pilih_kategori1(String string) {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR004 - btnKategori'))
	}


	@Then("user input deskripsi1 {string}")
	public void user_input_deskripsi1(String deskripsi) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR005 - Deskripsi'), deskripsi)
	}

	//	@Then("user upload produk {string}")
	//	public void user_upload_produk(String string) {
	//
	//		WebUI.uploadFile(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR006 - UploadFile'))
	//	}


	@Then("user click button terbitkan1")
	public void user_click_button_terbitkan1() {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR007 - btnTerbitkan'))
	}


	@Then("user take screenshot1")
	public void user_take_screenshot1() {

		WebUI.takeScreenshot()
	}


	@Then("the field is all required1")
	public void show_comment_the_user1() {

		WebUI.comment("the field is all required!")
	}

	@Then("close browser1")
	public void close_browser1() {

		WebUI.closeBrowser()
	}

	// negative flow input field harga with string

	@Given("open browser and redirect to url2")
	public void open_browser_and_redirect_to_url2() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("input username2 {string}")
	public void input_username2(String username) {
		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR001 - userField'), username)
	}

	@When("input password2 {string}")
	public void input_password2(String password) {
		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR002 - passField'), password)
	}
	@When("click button login2")
	public void click_button_login2() {
		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/LoginSecondHand/OOR003 - btnLogin'))
	}

	@Then("user verify success to dashboard home2")
	public void user_verify_success_to_dashboard_home2() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR008 - verifySucces'))
	}

	@Then("click button jual2")
	public void click_button_jual2() {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR001 - btnJual'))
	}


	@Then("user input field produk2 {string}")
	public void user_input_field_produk2(String field_produk) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR002 - fieldNama'), field_produk)
	}

	@Then("user input field harga2 {string}")
	public void user_input_field_harga2(String field_harga) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR003 - fieldHarga'), field_harga)
	}


	@Then("user input pilih kategori2 {string}")
	public void user_input_pilih_kategori2(String string) {

		WebUI.selectOptionByValue(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR004 - btnKategori'), '2', false)

	}


	@Then("user input deskripsi2 {string}")
	public void user_input_deskripsi2(String deskripsi) {

		WebUI.setText(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR005 - Deskripsi'), deskripsi)
	}

	//	@Then("user upload produk {string}")
	//	public void user_upload_produk(String string) {
	//
	//		WebUI.uploadFile(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR006 - UploadFile'))
	//	}


	@Then("user click button terbitkan2")
	public void user_click_button_terbitkan2() {

		WebUI.click(findTestObject('Object Repository/WEB/SecondHandJual/JualMenu/OOR007 - btnTerbitkan'))
	}


	@Then("user take screenshot2")
	public void user_take_screenshot2() {

		WebUI.takeScreenshot()
	}


	@Then("the field is all required2")
	public void show_comment_the_user2() {

		WebUI.comment("the field is all required!")
	}

	@Then("close browser2")
	public void close_browser2() {

		WebUI.closeBrowser()
	}

}
