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

Mobile.startExistingApplication(GlobalVariable.appID)

Mobile.tap(findTestObject('ObjectManThietBi/Tab_Thietbi'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/chon_cam_t2_trong_danh_sach'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ObjectManThietBi/btn_cai_dat'), 0)

<<<<<<< HEAD
Mobile.tap(findTestObject('Object Repository/ObjectCaiDatCamera/ObjectMaHoa/btn_doi_mat_khau_ma_hoa'), 0)
=======
Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/btn_doi_mat_khau_ma_hoa'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('Object Repository/ObjectCaiDatCamera/ObjectMaHoa/textbox_mat_khau_cu_ma_hoa'), 0)
=======
Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_mat_khau_cu_ma_hoa'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.setText(findTestObject('Object Repository/ObjectCaiDatCamera/ObjectMaHoa/textbox_mat_khau_cu_ma_hoa (1)'), GlobalVariable.ma_hoa_live, 
=======
Mobile.setText(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_mat_khau_cu_ma_hoa (1)'), GlobalVariable.ma_hoa_live, 
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH
    0)

<<<<<<< HEAD
Mobile.tap(findTestObject('Object Repository/ObjectCaiDatCamera/ObjectMaHoa/textbox_mat_khau_moi_ma_hoa'), 0)
=======
Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_mat_khau_moi_ma_hoa'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.sendKeys(findTestObject('ObjectCaiDatCamera/ObjectMaHoa/textbox_mat_khau_moi_ma_hoa'), 'Test@')
=======
Mobile.sendKeys(findTestObject('ObjectCaiDat/ma hoa/textbox_mat_khau_moi_ma_hoa'), 'Test@')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.tap(findTestObject('Object Repository/ObjectCaiDatCamera/ObjectMaHoa/textbox_nhap_lai_mat_khau_moi_ma_hoa'), 0)
=======
Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_nhap_lai_mat_khau_moi_ma_hoa'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

<<<<<<< HEAD
Mobile.sendKeys(findTestObject('ObjectCaiDatCamera/ObjectMaHoa/textbox_nhap_lai_mat_khau_moi_ma_hoa'), 'Test@1234')
=======
Mobile.sendKeys(findTestObject('ObjectCaiDat/ma hoa/textbox_nhap_lai_mat_khau_moi_ma_hoa'), 'Test@1234')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.hideKeyboard()

<<<<<<< HEAD
Mobile.tap(findTestObject('Object Repository/ObjectCaiDatCamera/ObjectMaHoa/btn_xac_nhan'), 0)
=======
Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/btn_xac_nhan'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

'get text trong popup báo lỗi'
<<<<<<< HEAD
String error_text = Mobile.getText(findTestObject('ObjectCaiDatCamera/ObjectMaHoa/popup_mat_khau_moi_khong_dung_dinh_dang'), 0)
=======
String error_text = Mobile.getText(findTestObject('ObjectCaiDat/ma hoa/popup_mat_khau_moi_khong_dung_dinh_dang'), 0)
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

'so sánh'
Mobile.verifyEqual(error_text, 'Mật khẩu phải có từ 8–16 ký tự, bao gồm: Chữ hoa, chữ thường, số và ký tự đặc biệt.', FailureHandling.STOP_ON_FAILURE)

'verify text inline'
<<<<<<< HEAD
Mobile.verifyElementText(findTestObject('ObjectCaiDatCamera/ObjectMaHoa/text_mat_khau_moi_khong_hop_le'), 'Mật khẩu mới không hợp lệ')
=======
Mobile.verifyElementText(findTestObject('ObjectCaiDat/ma hoa/text_mat_khau_moi_khong_hop_le'), 'Mật khẩu mới không hợp lệ')
>>>>>>> branch 'feature_quynhht13' of https://github.com/VHTAutomation/SMH

Mobile.closeApplication()

