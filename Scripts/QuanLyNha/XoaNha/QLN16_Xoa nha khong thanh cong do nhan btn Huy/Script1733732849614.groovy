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

tapDynamicObject('//android.widget.TextView[1]', 0)

Mobile.tap(findTestObject('ObjectXoaNha/popup_chon _nha_Quan_Ly_Nha'), 0)

String house_delete = 'home_delete'

TestObject houseItem = new TestObject('houseItem')

houseItem.addProperty('xpath', ConditionType.EQUALS, "//android.widget.TextView[@text='$house_delete']")

Mobile.tap(houseItem, 0)

Mobile.tap(findTestObject('ObjectXoaNha/btn_Xoa_nha'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectXoaNha/popup_confrim_xoa_noi dung'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectXoaNha/popup_confirm_xoa_btn_huy_bo'), 0)

Mobile.verifyElementVisible(findTestObject('ObjectXoaNha/popup_confirm_xoa_btn_xoa'), 0)

Mobile.tap(findTestObject('ObjectXoaNha/popup_confirm_xoa_btn_huy_bo'), 0)

Mobile.tap(findTestObject('ObjectSuaNha/icon_back_man_quan_ly_nha'), 0)

'Kiểm tra nhà vừa huỷ bỏ xoá trên màn hình quản lý nhà'
Mobile.verifyElementExist(houseItem, 0)

Mobile.tap(findTestObject('ObjectXoaNha/icon_back'), 0)

tapDynamicObject('//android.widget.TextView[1]', 0)

Mobile.tap(houseItem, 0)

Mobile.tap(findTestObject('ObjectXoaNha/Tab_Thiet_Bi'), 0)

'Kiểm tra nhà vừa huỷ bỏ xoá trên tab thiết bị'
Mobile.verifyElementExist(houseItem, 0)

Mobile.closeApplication()

def tapDynamicObject(String xpath, int timeout) {
    TestObject dynamicObject = new TestObject('dynamicObject')

    dynamicObject.addProperty('xpath', ConditionType.EQUALS, xpath)

    Mobile.tap(dynamicObject, 0)
}

