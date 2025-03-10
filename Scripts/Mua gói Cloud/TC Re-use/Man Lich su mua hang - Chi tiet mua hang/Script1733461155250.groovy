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

Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/Dich_vu_cloud_btn_Lich_su_mua_hang'), 0)

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/title_lich_su_mua_hang'), 'Lịch sử mua hàng')

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Lich su mua hang/lich_su_mua_hang_title_luu_tru_su_kien_x_ngay'), 
    'Lưu trữ sự kiện 3 ngày')

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Lich su mua hang/lich_su_mua_hang_text_dang_su_dung'), 
    'Đang sử dụng')

Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/Lich su mua hang/lich_su_mua_hang_gia_goi'), 0)

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/title_chi_tiet_thanh_toan'), 'Chi tiết thanh toán')

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Chi tiet thanh toan/chi_tiet_thanh_toan_ten_thiet_bi'), 
    GlobalVariable.serialcamera_AI)

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Chi tiet thanh toan/chi_tiet_thanh_toan_ten_goi_cuoc'), 
    'Lưu trữ sự kiện 3 ngày')

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Chi tiet thanh toan/txt_trang_thai_chi_tiet_thanh_toan'), 
    'Đang sử dụng')

Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Chi tiet thanh toan/chi_tiet_thanh_toan_gia_tien'), 
    '1.000đ')

Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/title_lich_su_mua_hang'), 0)

Mobile.tap(findTestObject('ObjectCaiDat/Luu tru Cloud/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectCaiDat/Luu tru Cloud/title_dich_vu_cloud'), 0)

