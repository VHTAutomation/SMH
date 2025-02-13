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

Mobile.tap(findTestObject('ObjectThemGuongMat/Tab_Ca_Nhan'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/menu_Quan_Ly_Chung'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/menu_Quan_Ly_Guong_Mat'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectThemGuongMat/icon_them_guong_mat_tren_man_QLGM'), 0)

'Set tên gương mặt là Thu Giang'
Mobile.setText(findTestObject('ObjectThemGuongMat/txtbox_nhap_ten_guong_mat'), 'Thu Giang', 0)

Mobile.pressBack()

boolean isEnabled = Mobile.verifyElementAttributeValue(findTestObject('ObjectThemGuongMat/btn_Them_tren_man_them_guong_mat'), 
    'enabled', 'false', 10, FailureHandling.CONTINUE_ON_FAILURE)

if (isEnabled) {
    println('Button đang ở trạng thái disabled.')
} else {
    println('Button đang ở trạng thái enable.')
}

Mobile.closeApplication()

