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

Mobile.tap(findTestObject('ObjectManThietBi/Tab_Thietbi'), 0)

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectManThietBi/opt_chon_cam'), 0)
=======
Mobile.tap(findTestObject('ObjectManThietBi/choncam - CNME00000586'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.tap(findTestObject('ObjectManThietBi/tab_tinh_nang'), 0)

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectManThietBi/btn_chia_se_thiet_bi'), 0)
=======
Mobile.tap(findTestObject('ObjectManThietBi/btn_chiaseTB'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.verifyElementVisible(findTestObject('ObjectChiaSeThietBi/title_chia_se_thiet_bi'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/chiaseTB_btn_huychiase'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/chitietchiase_btn_huy'), 0)

<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectChiaSeThietBi/txt_popup_xac_nhan_huy_chia_se'), 'Bạn có chắc muốn hủy chia sẻ đến tài khoản 0969073634')
=======
Mobile.verifyElementText(findTestObject('ObjectChiaSeThietBi/popup_xac_nhan_huy_sdt0969073634'), 'Bạn có chắc muốn hủy chia sẻ đến tài khoản 0394361750')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_xac_nhan_popup_huy_chia_se'), 0)
=======
Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_Xac_nhan_Huy'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
// Mobile.verifyElementText(findTestObject('ObjectChiaSeThietBi/popup_thu_hoi_chia_se_tbi_X_den_tk_A'), 'Đã thu hồi lời mời chia sẻ thiết bị 755464c536defb73 đến tài khoản 0969073634')
=======
Mobile.verifyElementText(findTestObject('ObjectChiaSeThietBi/popup_thu_hoi_chia_se_tbi_X_den_tk_A'), 'Đã thu hồi lời mời chia sẻ thiết bị CNME00000586 đến tài khoản 0394361750')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('ObjectChiaSeThietBi/btnBack'), 0)
=======
Mobile.verifyElementVisible(findTestObject('ObjectChiaSeThietBi/title_chia_se_thiet_bi'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.verifyElementVisible(findTestObject('ObjectChiaSeThietBi/title_chia_se_thiet_bi'), 0)

=======
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
Mobile.verifyElementNotExist(findTestObject('ObjectChiaSeThietBi/title_thiet_bi_da_chia_se_den'), 0)

Mobile.closeApplication()

