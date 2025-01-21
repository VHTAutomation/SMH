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


Mobile.tap(findTestObject('ObjectManThietBi/opt_chon_cam'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/tab_tinh_nang'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/btn_chia_se_thiet_bi'), 0)


Mobile.verifyElementVisible(findTestObject('ObjectChiaSeThietBi/title_chia_se_thiet_bi'), 0)

Mobile.setText(findTestObject('ObjectChiaSeThietBi/textbox_st'), GlobalVariable.user_share, 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/nhap_sdt_btn_Tiep_tuc'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/chon_quyen_xem_lai'), 0)

Mobile.tap(findTestObject('ObjectChiaSeThietBi/btn_hoan_thanh'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectChiaSeThietBi/popup_guichiasethanhcong'), 0)

Mobile.tap(findTestObject('ObjectManThietBi/btn_chia_se_thiet_bi'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectManThietBi/title_chiaseTBden'), 0)

Mobile.verifyElementText(findTestObject('ObjectManThietBi/chia se TB den_sdt chia se'), GlobalVariable.user_share)

Mobile.closeApplication()


