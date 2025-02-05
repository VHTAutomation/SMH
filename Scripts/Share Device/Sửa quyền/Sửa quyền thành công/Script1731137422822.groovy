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

Mobile.tap(findTestObject('ObjectChiaSeThietBi/tab_ca_nhan'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/title_quanlychung'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/tab_quan_ly_chia_se (1)'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/title_thiet_bi_da_chia_se'), 0)

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectChiaSeThietBi/ObjectHuyChiaSe/chon_tb_da_chap_nhan- 46674403b7b6e043'), 0)
=======
Mobile.tap(findTestObject('ObjectChiaSeThietBi/Huy chia se/chon_tb_da_chap_nhan- 46674403b7b6e043'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectChiaSeThietBi/icon_next_thong_tin_chia_se'), 0)
=======
Mobile.tap(findTestObject('ObjectChiaSeThietBi/Thong_tin_chia_se_btn_Next'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.tap(findTestObject('ObjectChiaSeThietBi/checkbox_dam_thoai'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/Thong_tin_chia_se_btn_Luu'), 0)

Mobile.verifyElementExist(findTestObject('ObjectChiaSeThietBi/popup_Cap nhat quyen thanh cong'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btnBack'), 0)

Mobile.verifyElementExist(findTestObject('ObjectChiaSeThietBi/chi_tiet_chia_se_icon_dam_thoai'), 0)
<<<<<<< HEAD
=======

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btnBack'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btnBack'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btnBack'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btnBack'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.closeApplication()

WebUI.callTestCase(findTestCase('Đăng xuất/Đăng xuất thành công'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Đăng nhập/Đăng nhập thành công'), [('username') : '0969073634', ('password') : 'Matkhau@1'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectManThietBi/Tab_Thietbi'), 0)

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectManThietBi/opt_cam_duoc_chia_se'), 0)
=======
Mobile.tap(findTestObject('ObjectManThietBi/chon_cam - 46674403b7b6e043'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
String damthoai_display = Mobile.getAttribute(findTestObject('Object Repository/ObjectCaiDatCamera/liveview_btn_dam_thoai'), 'enabled', 
=======
String damthoai_display = Mobile.getAttribute(findTestObject('Object Repository/ObjectCaiDat/liveview_btn_dam_thoai'), 'enabled', 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    10)

//println (damthoai_display)
if (damthoai_display == 'false') {
    println('button disable')
} else {
    println('button enable')
}

Mobile.closeApplication()

