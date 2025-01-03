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
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_ten_thiet_bi_dang_ky'), 
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_ten_thiet_bi_dang_ky'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    ten_cam)

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_gia_tien'), gia_goi_cuoc)
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_gia_tien'), gia_goi_cuoc)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_text_dang_su_dung'), 'Đang sử dụng')
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_text_dang_su_dung'), 'Đang sử dụng')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
trang_thai = Mobile.getText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_text_dang_su_dung'), 
=======
trang_thai = Mobile.getText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_text_dang_su_dung'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    0)

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
Mobile.verifyElementVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_title_gia_han_tu_dong'), 
=======
Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_title_gia_han_tu_dong'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    0)

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
Mobile.verifyElementVisible(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
=======
Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

