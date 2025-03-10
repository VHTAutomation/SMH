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
Mobile.tap(findTestObject('ObjectManTrangChu/ObjectManDichVuCamera/btn_Dich_vu_camera'), 0)
=======
Mobile.tap(findTestObject('ObjectManTrangchu/Dich vu Camera/btn_Dich_vu_camera'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementExist(findTestObject('ObjectManTrangChu/ObjectManDichVuCamera/title_thiet_bi_ho_tro'), 0)
=======
Mobile.verifyElementExist(findTestObject('ObjectManTrangchu/Dich vu Camera/title_thiet_bi_ho_tro'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectManTrangChu/ObjectManDichVuCamera/thiet_bi_ho_tro_chon_cam_1'), 0)
=======
Mobile.tap(findTestObject('ObjectManTrangchu/Dich vu Camera/thiet_bi_ho_tro_chon_cam_1'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
ten_cam = Mobile.getText(findTestObject('ObjectManTrangChu/ObjectManDichVuCamera/thiet_bi_ho_tro_chon_cam_1'), 0)
=======
ten_cam = Mobile.getText(findTestObject('ObjectManTrangchu/Dich vu Camera/thiet_bi_ho_tro_chon_cam_1'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectLuuTruCloud/Dich vu Cloud/dich_vu_camera_ten_camera'), ten_cam)
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/Luu tru Cloud/Dich vu Cloud/dich_vu_camera_ten_camera'), ten_cam)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.tap(findTestObject('ObjectDichVuCamera/btn_Dang_ky_ngay'), 0)

WebUI.callTestCase(findTestCase('Mua gói Cloud/TC Re-use/Man dang ky luu tru cloud/Khong gia han tu dong bang VTPay Gate'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mua gói Cloud/TC Re-use/Man Dich vu Cloud/Dich vu Cloud_khi dang ky tat gia han'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mua gói Cloud/TC Re-use/Man Lich su mua hang - Chi tiet mua hang'), [:], FailureHandling.STOP_ON_FAILURE)

