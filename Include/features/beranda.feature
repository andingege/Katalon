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
@Beranda
Feature: Beranda
  Sebagai User, saya ingin memvalidasi gambar, judul, kategori dan nominal pada katalog di Halaman Beranda

  @BRD001
  Scenario: BRD001 - Pengguna melakukan validasi ui icon Home
    Given Pengguna berada di Halaman Beranda
    Then Pengguna validasi UI icon Home

	@BRD002
  Scenario: BRD002 - Pengguna melakukan validasi UI Gambar pada Katalog
    Given Pengguna berada di Halaman Beranda
    Then Pengguna melakukan validasi UI Gambar pada Katalog

	@BRD003
  Scenario: BRD003 - Pengguna melakukan validasi Judul dan Kategori produk pada Katalog
    Given Pengguna berada di Halaman Beranda
    Then Pengguna melakukan validasi Judul dan Kategori produk pada Katalog

	@BRD004
  Scenario: BRD004 - Pengguna melakukan validasi Mata Uang dan Nominal pada Katalog
    Given Pengguna berada di Halaman Beranda
    Then Pengguna melakukan validasi Mata Uang dan Nominal pada Katalog

   