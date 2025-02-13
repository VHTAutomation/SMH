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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectTangGoiCloud/txt_Dich_vu_Camera'), 0)

TestObject SeeMoreButton = new TestObject('SeeMoreButton')

SeeMoreButton.addProperty('xpath', ConditionType.EQUALS, '//android.widget.TextView[@text = \'Lưu trữ cloud\']/following-sibling::android.widget.TextView[@text=\'Xem thêm\']')

'clcik vào button xem thêm'
Mobile.tap(SeeMoreButton, 10)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_tang_nguoi_than'), 0)

Mobile.setText(findTestObject('ObjectTangGoiCloud/txtbox_nhap_so_dien_thoi'), '0866617796', 0)

//String SerialCamera = '755464c536defb73'
Mobile.setText(findTestObject('ObjectTangGoiCloud/txt_serial_camera'), '', 0)

Mobile.verifyElementVisible(findTestObject('ObjectTangGoiCloud/txt_ma_serial_camera_la_bat_buoc'), 0)

boolean isEnabled = Mobile.verifyElementAttributeValue(findTestObject('ObjectTangGoiCloud/btn_Tiep'), 'enabled', 'false', 
    10, FailureHandling.CONTINUE_ON_FAILURE)

if (isEnabled) {
    println('Button đang ở trạng thái disabled.')
} else {
    println('Button đang ở trạng thái enable.')
}

Mobile.closeApplication()

