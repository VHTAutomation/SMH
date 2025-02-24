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

Mobile.tap(findTestObject('ObjectThemGuongMat/Tab_Ca_Nhan'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/menu_Quan_Ly_Chung'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/menu_Quan_Ly_Guong_Mat'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectThemGuongMat/icon_them_guong_mat_tren_man_QLGM'), 0)

'Nhập toàn space vào trường tên gương mặt\r\n'
Mobile.setText(findTestObject('ObjectThemGuongMat/txtbox_nhap_ten_guong_mat'), '             ', 0)

TestObject plusButton = new TestObject('plus_button')

plusButton.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView[1]/*[last()]/android.widget.ImageView[1]')

'Nhấn vào dấu + để thực hiện thêm ảnh'
Mobile.tap(plusButton, 30)

'Chọn ảnh từ bộ sưu tập'
Mobile.tap(findTestObject('ObjectThemGuongMat/menu_chon_anh_tu_bo_suu_tap'), 0)

// Tạo TestObject động với XPath rút gọn
TestObject image = new TestObject('DynamicImage')

image.addProperty('xpath', ConditionType.EQUALS, '//android.widget.GridView/android.widget.FrameLayout[1]//android.widget.ImageView')

'Nhấn vào ảnh chọn'
Mobile.tap(image, 30)

'Nhấn button thêm ảnh trên màn thay đổi kích thước ảnh'
Mobile.tap(findTestObject('ObjectThemGuongMat/btn_them_man_thay_doi_size_anh'), 30)

Mobile.verifyElementVisible(findTestObject('ObjectThemGuongMat/txt_Vui_long_khong_de_trong_ten_guong_mat'), 0)

boolean isEnabled = Mobile.verifyElementAttributeValue(findTestObject('ObjectThemGuongMat/btn_Them_tren_man_them_guong_mat'), 
    'enabled', 'false', 10, FailureHandling.CONTINUE_ON_FAILURE)

if (isEnabled) {
    println('Button đang ở trạng thái disabled.')
} else {
    println('Button đang ở trạng thái enable.')
}

Mobile.closeApplication()

