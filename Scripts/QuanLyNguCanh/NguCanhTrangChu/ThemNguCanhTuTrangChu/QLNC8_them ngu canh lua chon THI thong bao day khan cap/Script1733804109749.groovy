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

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectTheYeuThich/tabTrangChu'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectTheYeuThich/btnOption'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/objThemNguCanh'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/txtfieldTenNguCanh'), 'Dieu kien thoi tiet thay doi 3', 
    0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/btnNeu'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/objDieuKienThoiTietThayDoi'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienThoiTiet/rdbtn_thanh_pho'), 0, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienThoiTiet/rdbtn_nhiet_do'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienThoiTiet/txt_so_sanh'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienThoiTiet/btn_luu_dieu_kien_thoi_tiet'), 
    0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/btnThi'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/objThongBaoDayKhanCap'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectThongBaoDayKhanCap/txtfield_tieu_de_thong_bao'), 
    'Thong bao khan cap 1', 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectThongBaoDayKhanCap/rdbtn_lua_chon_kieu_noi_dung_thong_bao'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectThongBaoDayKhanCap/txtfield_noi_dung_thong_bao_tuy_chinh'), 
    'Noi dung thong bao khan cap', 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectThongBaoDayKhanCap/btn_tiep_thong_bao_khan_cap'), 
    0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/btnThietLapThoiGianNguCanh'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/objBatDau'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/objGio'), '5', 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/objPhut'), '15', 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/objKetThuc'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/objGio'), '23', 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/objPhut'), '30', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucChonLichTrinh/btnLuuLichTrinh'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/btnLuuNguCanh'), 0)

Mobile.closeApplication()

