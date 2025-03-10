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

Mobile.tap(findTestObject('ObjectDangNhap/btn_dang_ky'), 0)

Mobile.setText(findTestObject('ObjectDangNhap/ObjectManDangKy/txtfield_nhap_ten_nguoi_dung'), GlobalVariable.username_register, 
    0)

Mobile.setText(findTestObject('ObjectDangNhap/ObjectManDangKy/txtfield_nhap_so_cccd_cmnd'), GlobalVariable.cccd_register, 
    0)

Mobile.setText(findTestObject('ObjectDangNhap/ObjectManDangKy/txtfield_so_dien_thoai (1)'), GlobalVariable.phone_register, 
    0)

Mobile.setText(findTestObject('ObjectDangNhap/ObjectManDangKy/txtfield_nhap_mat_khau'), GlobalVariable.password_register, 
    0)

Mobile.clearText(findTestObject('ObjectDangNhap/ObjectManDangKy/txtfield_nhap_mat_khau'), 0)

Mobile.setText(findTestObject('ObjectDangNhap/ObjectManDangKy/txtfield_xac_nhan_mat_khau (1)'), GlobalVariable.password_register, 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('ObjectDangNhap/ObjectManDangKy/txt_mat_khau_xac_nhan_khong_chinh_xac'), 'Mật khẩu xác nhận không chính xác.')

Mobile.tap(findTestObject('ObjectDangNhap/ObjectManDangKy/chk_dong_y_dieu_khoan_dich_vu'), 0)

Mobile.verifyElementAttributeValue(findTestObject('ObjectDangNhap/ObjectManDangKy/btn_dang_ky_tai_khoan'), 'enabled', 'false', 
    0)

Mobile.closeApplication()

