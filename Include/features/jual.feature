#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@jual_test_negatif
Feature: Jual Produk
  user want ot sell product

  @negativeFlow
  Scenario: test case negatif jual tanpa isi semua field
    Given open browser and redirect to url
    When input username "widyyy31@gmail.com"
    And input password "Google31"
    And click button login
    Then user verify success to dashboard home
    And click button jual
    And user input field produk ""
    And user input field harga ""
    And user input pilih kategori ""
    And user input deskripsi ""
    # And user upload produk ""
    And user click button terbitkan
    And user take screenshot
    Then the field is all required
    Then close browser

  @negativeFlow
  Scenario: test case negatif jual with only input produk
    Given open browser and redirect to url1
    When input username1 "widyyy31@gmail.com"
    And input password1 "Google31"
    And click button login
    Then user verify success to dashboard home
    And click button jual
    And user input field produk1 "iphone"
    And user input field harga1 ""
    And user input pilih kategori1 ""
    And user input deskripsi1 ""
    # And user upload produk ""
    And user click button terbitkan1
    And user take screenshot1
    Then the field is all required1
    Then close browser

    
      @negativeFlow
  Scenario: test case negatif jual input harga with string
    Given open browser and redirect to url2
    When input username2 "widyyy31@gmail.com"
    And input password2 "Google31"
    And click button login
    Then user verify success to dashboard home
    And click button jual
    And user input field produk2 "iphone 14"
    And user input field harga2 "5 juta rupiah"
    And user input pilih kategori2 "kendaraan"
    And user input deskripsi2 "ini bukan kendaraan"
    # And user upload produk ""
    And user click button terbitkan2
    And user take screenshot2
    Then the field is all required2
    Then close browser
    