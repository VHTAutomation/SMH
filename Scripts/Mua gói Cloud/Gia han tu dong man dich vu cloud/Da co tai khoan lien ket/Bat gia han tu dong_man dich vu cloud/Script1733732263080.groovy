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

<<<<<<< HEAD
Mobile.verifyElementVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/title_dich_vu_cloud'), 0)
=======
Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/title_dich_vu_cloud'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_text_dang_su_dung'), 'Đang sử dụng')
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_text_dang_su_dung'), 'Đang sử dụng')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_text_tra_truoc'), 'Trả trước')
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_text_tra_truoc'), 'Trả trước')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_text_Viettel_money'), 'Viettel Money')
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_text_Viettel_money'), 'Viettel Money')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_title_gia_han_tu_dong'), 0)
=======
Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_title_gia_han_tu_dong'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
dvcloud_giahan = Mobile.getAttribute(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_switch_btn_gia_han_tu_dong'), 
=======
dvcloud_giahan = Mobile.getAttribute(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_switch_btn_gia_han_tu_dong'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    'checked', 10)

if (dvcloud_giahan == false) {
    println('off gia han tu dong')
}

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_switch_btn_gia_han_tu_dong'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_switch_btn_gia_han_tu_dong'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/popup_chon_tai_khoan_tru_tien'), 0)
=======
Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/popup_chon_tai_khoan_tru_tien'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/popup_chon_tk_tru_tien_btn_Xac_nhan'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/popup_chon_tk_tru_tien_btn_Xac_nhan'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.sendKeys(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/textbox_nhap_otp'), '123123')
=======
Mobile.sendKeys(findTestObject('ObjectCaiDat/Luu tru Cloud/textbox_nhap_otp'), '123123')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/btn_xac_nhan_otp'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/btn_xac_nhan_otp'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/text_Bat_thanh_toan_tu_dong_thanh_cong'), 'Bật thanh toán tự động thành công')
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/text_Bat_thanh_toan_tu_dong_thanh_cong'), 'Bật thanh toán tự động thành công')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/title_dich_vu_cloud'), 0)
=======
Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/title_dich_vu_cloud'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
dvcloud_giahan = Mobile.getAttribute(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_switch_btn_gia_han_tu_dong'), 
=======
dvcloud_giahan = Mobile.getAttribute(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_switch_btn_gia_han_tu_dong'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    'checked', 10)

if (dvcloud_giahan == true) {
    println('on gia han tu dong')
}

<<<<<<< HEAD
Mobile.verifyElementNotVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
=======
Mobile.verifyElementNotVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

