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

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_so_dien_thoai'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_mat_khau'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('ObjectDangNhap/chk_ghi_nho_tai_khoan'), 0)

Mobile.tap(findTestObject('ObjectDangNhap/btn_dang_nhap (1)'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/title_ca_nhan'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/title_dang_xuat'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/btn_dong_y_dang_xuat'), 0)

Mobile.tap(findTestObject('ObjectDangNhap/btn_dang_nhap'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectTheYeuThich/btnOption'), 0)

Mobile.closeApplication()

