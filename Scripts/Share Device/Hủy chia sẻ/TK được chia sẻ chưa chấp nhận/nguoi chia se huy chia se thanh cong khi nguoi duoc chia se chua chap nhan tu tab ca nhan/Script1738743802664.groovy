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

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectManHinhChinh/title_ca_nhan'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/title_quan_ly_chung'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/title_quan_ly_chia_se'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/title_thiet_bi_da_chia_se (1)'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/thiet_bi_da_chia_se- CNME00000586'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_huy_thong_tin_chia_se'), 0)

Mobile.verifyElementText(findTestObject('ObjectChiaSeThietBi/txt_popup_huy_chia_se'), 'Bạn có chắc muốn hủy chia sẻ đến tài khoản 0356573351')

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_xac_nhan_popup_huy_chia_se'), 0)

Mobile.verifyElementText(findTestObject('ObjectChiaSeThietBi/popup_da_ngung_chia_se_thiet_bi'), 'Đã thu hồi lời mời chia sẻ thiết bị 1ada05b73c0dfa39 đến tài khoản 0356573351')

Mobile.verifyElementVisible(findTestObject('ObjectChiaSeThietBi/title_man_thiet_bi_da_chia_se'), 0)

Mobile.verifyElementNotExist(findTestObject('ObjectChiaSeThietBi/thiet_bi_da_chia_se- CNME00000586'), 0)

Mobile.closeApplication()

