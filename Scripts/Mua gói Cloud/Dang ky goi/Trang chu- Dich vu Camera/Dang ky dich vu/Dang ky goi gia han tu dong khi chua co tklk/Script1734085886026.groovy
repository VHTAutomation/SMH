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

Mobile.tap(findTestObject('ObjectManTrangchu/Dich vu Camera/btn_Dich_vu_camera'), 0)

Mobile.tap(findTestObject('ObjectManTrangchu/Dich vu Camera/btn_dang_ky_dich_vu'), 0)

// XPath tìm phần tử có text 'ABC'
TestObject element = new TestObject('a')

'tạo xpath tìm text: camera chưa đăng ký dịch vụ'
element.addProperty('xpath', ConditionType.EQUALS, '//android.widget.TextView[@text=\'Camera chưa đăng ký dịch vụ\']')

// Kiểm tra và click
'tìm và click vào Camera chưa đăng ký dịch vụ'
if (Mobile.verifyElementExist(element, 10)) {
    Mobile.tap(element, 10)

    println('Tìm thấy và click vào đối tượng có text \'ABC\'')
} else {
    println('Không tìm thấy đối tượng có text \'ABC\'')
}

ten_cam = Mobile.getText(findTestObject('Dich vu Camera/ten_cam'), 0)

Mobile.tap(findTestObject('Dich vu Camera/btn_Dang_ky_ngay'), 0)

WebUI.callTestCase(findTestCase('Mua gói Cloud/TC Re-use/Man dang ky luu tru cloud/Gia han tu dong bang TKLK_ chua co TKLK'), 
    [:], FailureHandling.STOP_ON_FAILURE)

