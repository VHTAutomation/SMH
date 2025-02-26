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

WebUI.callTestCase(findTestCase('Đăng nhập/Đăng nhập thành công'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ObjectChiaSeThietBi/title_ban_dang_co_thiet_chi_cho_chap_nhan'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/icon_chon_cam'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/icon_chon_nha_nhan_chia_se'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/opt_nha_nhan_chia_se (1)'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_chap_nhan_chia_se'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ObjectChiaSeThietBi/title_Ban_da_chap_nhan_ TB_46674403b7b6e043 c chia s t ti khon 0969992895'), 
    0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_back_thiet_bi_doi_chap_nhan'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/Tab_Thietbi'), 0)

Mobile.verifyElementExist(findTestObject('ObjectManThietBi/opt_chon_cam'), 0)

Mobile.closeApplication()

