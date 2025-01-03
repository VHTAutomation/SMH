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

Mobile.tap(findTestObject('ObjectManThietBi/chon_cam_dau_tien_danh_sach'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ObjectManThietBi/btn_cai_dat'), 0)

Mobile.tap(findTestObject('Object Repository/ObjectManThietBi/icon_mo_rong_ten_cam'), 0)

Mobile.tap(findTestObject('Object Repository/ObjectManThietBi/title_doi_ten_cam'), 0)

Mobile.clearText(findTestObject('Object Repository/ObjectManThietBi/edit_ten_cam'), 0)

Mobile.sendKeys(findTestObject('ObjectManThietBi/edit_ten_cam(1)'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/ObjectManThietBi/btn - OK_doi_ten_cam'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/ObjectManThietBi/title_doi_ten_cam_thanh_cong'), 0)

String reName = Mobile.getText(findTestObject('ObjectCaiDatCamera/cai_dat_ten_cam'), 0)

Mobile.verifyMatch(reName, 'Test@123', false)

Mobile.tap(findTestObject('ObjectManThietBi/cai_dat_icon_back'), 0)

Mobile.verifyElementText(findTestObject('ObjectManThietBi/liveview_title_ten_cam'), reName)

Mobile.tap(findTestObject('ObjectManThietBi/liveview_icon_back'), 0)

Mobile.verifyElementText(findTestObject('ObjectManThietBi/chon_cam_dau_tien_danh_sach'), reName)

Mobile.closeApplication()

