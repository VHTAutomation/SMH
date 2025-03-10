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

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/icon_tai_khoan_va_bao_mat'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/icon_doi_mat_khau'), 
    0)

Mobile.setText(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/txtfield_nhap_mat_khau_cu'), 
    GlobalVariable.password, 0)

Mobile.setText(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/txtfield_nhap_mat_khau_moi'), 
    GlobalVariable.password_register, 0)

Mobile.setText(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/txtfield_nhap_lai_mat_khau_moi'), 
    GlobalVariable.password_register, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/btn_xac_nhan'), 
    0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/btn_OK_doi_mat_khau_thanh_cong'), 
    0)

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_so_dien_thoai'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_mat_khau'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('ObjectDangNhap/btn_dang_nhap (1)'), 0)

Mobile.verifyElementText(findTestObject('ObjectDangNhap/txt_so_dien_thoai_hoac_mat_khau'), 'Số điện thoại hoặc mật khẩu không chính xác')

Mobile.clearText(findTestObject('ObjectDangNhap/txtfield_mat_khau'), 0)

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_mat_khau'), GlobalVariable.password_register, 0)

Mobile.tap(findTestObject('ObjectDangNhap/btn_dang_nhap (1)'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/title_ca_nhan'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/title_quan_ly_chung'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/icon_tai_khoan_va_bao_mat'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/icon_doi_mat_khau'), 
    0)

Mobile.setText(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/txtfield_nhap_mat_khau_cu'), 
    GlobalVariable.password_register, 0)

Mobile.setText(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/txtfield_nhap_mat_khau_moi'), 
    GlobalVariable.password, 0)

Mobile.setText(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/txtfield_nhap_lai_mat_khau_moi'), 
    GlobalVariable.password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/btn_xac_nhan'), 
    0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManTaiKhoanVaBaoMat/ObjectManDoiMatKhau/btn_OK_doi_mat_khau_thanh_cong'), 
    0)

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_so_dien_thoai'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('ObjectDangNhap/txtfield_mat_khau'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('ObjectDangNhap/btn_dang_nhap (1)'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectTheYeuThich/btnOption'), 0)

Mobile.closeApplication()

