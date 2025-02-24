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

Mobile.tap(findTestObject('ObjectThemGuongMat/txt_Dich_vu_Camera'), 0)

//int screenWidth = Mobile.getDeviceWidth()
//
//int screenHeight = Mobile.getDeviceHeight()
//
//// Tính toán tọa độ cho thao tác vuốt. Mục đích là vuốt theo trục dọc từ gần cuối màn hình (80%) lên gần đầu màn hình (20%).
//int startX = ((screenWidth / 2 // Vị trí ngang (trục X) của điểm bắt đầu vuốt, được đặt ở giữa màn hình (screenWidth / 2).
//    ) as int)
//
//int startY = ((screenHeight * 0.8 // Vị trí dọc (trục Y) của điểm bắt đầu vuốt, cách đỉnh màn hình 80% chiều cao màn hình (screenHeight * 0.8).
//    ) as int)
//
//int endY = ((screenHeight * 0.2 // Vị trí dọc (trục Y) của điểm kết thúc vuốt, cách đỉnh màn hình 20% chiều cao màn hình (screenHeight * 0.2).
//    ) as int)
//
//// Thực hiện thao tác vuốt
//Mobile.swipe(startX, startY, startX, endY)
Mobile.scrollToText('Nhận diện hành vi', FailureHandling.STOP_ON_FAILURE)

/* Dung TouchAction để vuốt
 def driver = MobileDriverFactory.getDriver()
TouchAction action = new TouchAction(driver)

// Thực hiện thao tác vuốt
action.press(PointOption.point(startX, startY))// Nhấn vào điểm bắt đầu
	  .moveTo(PointOption.point(startX, endY))// Kéo ngón tay đến điểm kết thúc
	  .release()// Thả ngón tay
	  .perform()// Thực thi chuỗi hành động
*/
TestObject SeeMoreButton = new TestObject('SeeMoreButton')

SeeMoreButton.addProperty('xpath', ConditionType.EQUALS, '//android.widget.TextView[@text = \'Nhận diện gương mặt\']/following-sibling::android.widget.TextView[@text=\'Xem thêm\']')

'click vào button xem thêm'
Mobile.tap(SeeMoreButton, 20)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectThemGuongMat/btn_Trai_nghiem_mien_phi'), 0)

//String cameraName = '3be642171135c7e8'
// XPath động để tìm Switch Button
//TestObject switchButton = new TestObject('dynamicSwitchButton')
//
//switchButton.addProperty('xpath', ConditionType.EQUALS, "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[.//android.widget.TextView[@text='$GlobalVariable.serialcamera_AI']]//android.widget.Switch")
//
//// Chạm vào Switch Button
//Mobile.tap(switchButton, 10)
Mobile.tap(findTestObject('ObjectThemGuongMat/btn_kich_hoat'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/btn_Quan_ly_GM_tren_man_kich_hoat_dich_vu_AI'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/icon_them_guong_mat_tren_man_QLGM'), 0)

'Set tên gương mặt'
Mobile.setText(findTestObject('ObjectThemGuongMat/txtbox_nhap_ten_guong_mat'), 'Thu Giang2', 0)

'Số ảnh muốn chọn'
int numberOfImages = 1

for (int i = 1; i <= numberOfImages; i++) {
    TestObject plusButton = new TestObject('plus_button')

    plusButton.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView[1]/*[last()]/android.widget.ImageView[1]')

    'Nhấn vào dấu + để thực hiện thêm ảnh'
    Mobile.tap(plusButton, 30)

    'Chọn ảnh từ bộ sưu tập'
    Mobile.tap(findTestObject('ObjectThemGuongMat/menu_chon_anh_tu_bo_suu_tap'), 0)

    // Tạo TestObject động với XPath rút gọn
    TestObject image = new TestObject('DynamicImage' + i)

    image.addProperty('xpath', ConditionType.EQUALS, ('//android.widget.GridView/android.widget.FrameLayout[' + i) + ']//android.widget.ImageView')

    'Nhấn vào ảnh chọn'
    Mobile.tap(image, 30)

    'Nhấn button thêm ảnh trên màn thay đổi kích thước ảnh'
    Mobile.tap(findTestObject('ObjectThemGuongMat/btn_them_man_thay_doi_size_anh'), 30)
}

TestObject nhomguongmat = new TestObject('nhomguongmat')

nhomguongmat.addProperty('xpath', ConditionType.EQUALS, '//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[@text=\'Gia đình\']')

// Kiểm tra xem nhóm "Gia đình" đã được chọn hay chưa
TestObject bottomsheetnhomguongmat = new TestObject('bottomsheet')

bottomsheetnhomguongmat.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[@text=\'Gia đình\']')

// Kiểm tra xem nhóm "Gia đình" đã được chọn hay chưa
boolean isSelected = Mobile.verifyElementExist(nhomguongmat, 15, FailureHandling.OPTIONAL)

if (!(isSelected)) {
    // Nếu chưa chọn, thực hiện tap vào nhóm gương mặt "Gia đình"
    println('Nhóm \'Gia đình\' chưa được chọn, tiến hành tap.')

    Mobile.tap(findTestObject('ObjectThemGuongMat/icon_xem_thong_tin_nhom_GM'), 0)

    Mobile.tap(bottomsheetnhomguongmat, 30 // Nếu đã chọn, ghi log và bỏ qua thao tác
        )
} else {
    println('Nhóm \'Gia đình\' đã được chọn, bỏ qua thao tác tap.')
}

'Nhấn button thêm gương mặt trên màn thêm gương mặt'
Mobile.tap(findTestObject('ObjectThemGuongMat/btn_Them_tren_man_them_guong_mat'), 0)

TestObject groupNguoiNha = findTestObject('ObjectThemGuongMat/txt_Nhom_guong_mat_Nguoi_Nha')

TestObject face = new TestObject('face')

face.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup//android.widget.TextView[@text=\'Thu Giang2\']')

// Kiểm tra sự tồn tại của nhóm "Gia đình"
if (Mobile.waitForElementPresent(groupNguoiNha, 15, FailureHandling.CONTINUE_ON_FAILURE)) {
    println('Nhóm \'Gia đình\' tồn tại.')

    // Kiểm tra sự tồn tại của "Thu Giang" trong nhóm "Gia đình"
    if (Mobile.waitForElementPresent(face, 10, FailureHandling.CONTINUE_ON_FAILURE)) {
        println('Gương mặt \'Thu Giang2\' tồn tại trong nhóm \'Gia đình\'.')
    } else {
        println('Gương mặt \'Thu Giang2\' không tồn tại trong nhóm \'Gia đình\'.')
    }
} else {
    println('Nhóm \'Gia đình\' không tồn tại.')
}

Mobile.tap(face, 0)

Mobile.verifyElementText(findTestObject('ObjectThemGuongMat/txtbox_ten_guong_mat_tren_man_thong_tin_GM'), 'Thu Giang2')

Mobile.verifyElementText(findTestObject('ObjectThemGuongMat/txt_so_luong_anh_tai_len'), ('Tải lên: ' + numberOfImages) + 
    '/15')

Mobile.verifyElementText(nhomguongmat, 'Gia đình')

Mobile.closeApplication()

