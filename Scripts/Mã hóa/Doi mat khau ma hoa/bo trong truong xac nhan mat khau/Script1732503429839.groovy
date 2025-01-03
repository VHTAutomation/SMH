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

Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/btn_doi_mat_khau_ma_hoa'), 0)

Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_mat_khau_cu_ma_hoa'), 0)

Mobile.sendKeys(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_mat_khau_cu_ma_hoa (1)'), 'Test@12345')

Mobile.tap(findTestObject('Object Repository/ObjectCaiDat/ma hoa/textbox_mat_khau_moi_ma_hoa'), 0)

Mobile.sendKeys(findTestObject('ObjectCaiDat/ma hoa/textbox_mat_khau_moi_ma_hoa'), 'Test@1234')

Mobile.hideKeyboard()

'verify trạng thái button xác nhận'
String xacnhan_display = Mobile.getAttribute(findTestObject('ObjectCaiDat/ma hoa/btn_xac_nhan'), 'enable', 10)

//println (xacnhan_display)
if (xacnhan_display == 'false') {
    println('button disable')
} else {
    println('button enable')
}

Mobile.closeApplication()

