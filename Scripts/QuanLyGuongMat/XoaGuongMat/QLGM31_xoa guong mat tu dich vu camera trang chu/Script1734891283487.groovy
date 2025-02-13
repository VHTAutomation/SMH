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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.TapOptions as TapOptions
import io.appium.java_client.touch.offset.PointOption as PointOption

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/title_dich_vu_camera'), 0)

Mobile.scrollToText('Nhận diện hành vi', FailureHandling.STOP_ON_FAILURE)

TestObject SeeMoreButton = new TestObject('SeeMoreButton')

SeeMoreButton.addProperty('xpath', ConditionType.EQUALS, '//android.widget.TextView[@text = \'Nhận diện gương mặt\']/following-sibling::android.widget.TextView[@text=\'Xem thêm\']')

'click vào button xem thêm'
Mobile.tap(SeeMoreButton, 20)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectManKichHoatDichVuAI/btn_trai_nghiem_mien_phi'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectManKichHoatDichVuAI/btn_kich_hoat'), 0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManTrangChu/ObjectManKichHoatDichVuAI/btn_quan_ly_guong_mat'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/opt_guong_mat'), 
    0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/btn_xoa_guong_mat'), 
    0)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/btn_xac_nhan_xoa_guong_mat'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectManHinhChinh/ObjectManCaNhan/ObjectManQuanLyChung/ObjectManQuanLyGuongMat/btn_them_guong_mat'), 
    0)

Mobile.closeApplication()

