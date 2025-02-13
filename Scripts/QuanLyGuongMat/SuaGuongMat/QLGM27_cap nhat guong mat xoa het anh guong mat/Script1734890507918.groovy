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

Mobile.tap(findTestObject('ObjectManHinhChinh/title_thiet_bi'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManThietBi/opt_thiet_bi'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManThietBi/ObjectManChiTietThietBi/title_tinh_nang'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManThietBi/ObjectManChiTietThietBi/title_nhan_dien_guong_mat'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManThietBi/ObjectManChiTietThietBi/btn_quan_ly_guong_mat'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/opt_guong_mat'), 
    0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/opt_anh_guong_mat'), 
    0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/btn_xoa_anh_guong_mat'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/btn_luu_thay_doi_thong_tin_guong_mat'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/btn_xoa_guong_mat'), 
    0)

Mobile.closeApplication()

