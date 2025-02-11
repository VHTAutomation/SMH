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

Mobile.tap(findTestObject('ObjectManHinhChinh/title_ngu_canh'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/btn_them_ngu_canh'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/txtfieldTenNguCanh'), 'Dieu kien khong thay doi tab ngu canh', 
    0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/btnNeu'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/objDieuKienKhongThayDoi'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienKhongThayDoi/txtfield_gio_dieu_kien'), 
    '18', 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienKhongThayDoi/txtfield_phut_dieu_kien'), 
    '30', 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienKhongThayDoi/txtfield_giay_dieu_kien'), 
    '30', 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucNeu/ObjectDieuKienKhongThayDoi/btn_luu_dieu_kien'), 
    0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/btnThi'), 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/objThongBaoDay'), 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectMucThongBaoDay/txtfieldTieuDeThongBao'), 
    'Thong bao day 1', 0)

Mobile.setText(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectMucThongBaoDay/txtfieldNoiDungThongBao'), 
    'Dieu kien khong thay doi', 0)

Mobile.tap(findTestObject('ObjectNguCanh/ObjectManThemNguCanh/ObjectMucThi/ObjectMucThongBaoDay/btnTiep_ThongBaoDay'), 0)

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

