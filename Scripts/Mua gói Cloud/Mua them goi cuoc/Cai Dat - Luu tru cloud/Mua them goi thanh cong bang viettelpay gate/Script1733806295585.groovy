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

Mobile.tap(findTestObject('ObjectManThietBi/tab_thiet_bi (1)'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/chon_cam_dau_tien_danh_sach'), 0)

ten_cam = Mobile.getText(findTestObject('ObjectManThietBi/liveview_title_ten_cam'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/btn_cai_dat'), 0)

Mobile.scrollToText('Dịch vụ Camera', FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/cai_dat_btn_dang_kich_hoat'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/cai_dat_btn_dang_kich_hoat'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/ten_thiet_bi_dang_ky'), ten_cam)
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/ten_thiet_bi_dang_ky'), ten_cam)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
goi_luu_tru = Mobile.getText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/btn_luu_tru_su_kien_3_ngay'), 0)
=======
goi_luu_tru = Mobile.getText(findTestObject('ObjectCaiDat/Luu tru Cloud/btn_luu_tru_su_kien_3_ngay'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/chon_5_phut'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/chon_5_phut'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
gia_goi_cuoc = Mobile.getText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dang ky luu tru cloud/Dang_ky_cloud_gia_goi'), 
=======
gia_goi_cuoc = Mobile.getText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dang ky luu tru cloud/Dang_ky_cloud_gia_goi'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    0)

Mobile.scrollToText('Điều khoản Viettel Home.', FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
Mobile.verifyElementNotExist(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/btn_gia_han_tu_dong'), 0)
=======
Mobile.verifyElementNotExist(findTestObject('ObjectCaiDat/Luu tru Cloud/btn_gia_han_tu_dong'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/chon_tk_viettelpay_gate'), 10)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/chon_tk_viettelpay_gate'), 10)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/btn_thanh_toan'), 0)
=======
Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/btn_thanh_toan'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

WebUI.callTestCase(findTestCase('Mua gói Cloud/TC Re-use/Man Viettel Pay Gate'), [:], FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
Mobile.verifyElementExist(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/title_dich_vu_cloud'), 0)
=======
Mobile.verifyElementExist(findTestObject('ObjectCaiDat/Luu tru Cloud/title_dich_vu_cloud'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_ten_goi_chua_kich_hoat'), 
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_ten_goi_chua_kich_hoat'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    goi_luu_tru)

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_trang_thai_chua_kich_hoat'), 
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_trang_thai_chua_kich_hoat'), 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    'Chưa kích hoạt')

<<<<<<< HEAD
Mobile.verifyElementExist(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
=======
Mobile.verifyElementExist(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_cloud_btn_mua_them_goi'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

WebUI.callTestCase(findTestCase('Mua gói Cloud/TC Re-use/Man Lich su mua hang - Chi tiet mua hang'), [:], FailureHandling.STOP_ON_FAILURE)

