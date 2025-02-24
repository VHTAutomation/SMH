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

Mobile.tap(findTestObject('ObjectThemGuongMat/txt_hien_thi_nha_dau_tien_tren_trang_chu'), 0)

TestObject houseItem = new TestObject('houseItem')

houseItem.addProperty('xpath', ConditionType.EQUALS, '//android.widget.TextView[contains(@text,\'nhà q\')]')

Mobile.tap(houseItem, 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/Tab_Thiet_Bi'), 0)

//String cameraName = '3be642171135c7e8'
//listCamera.addProperty('xpath', ConditionType.CONTAINS, "//android.widget.TextView[contains(@text,' "+ GlobalVariable.serialcamera_AI +" ')]")
//listCamera.addProperty('xpath', ConditionType.CONTAINS, "//android.widget.TextView[contains(@text,'${GlobalVariable.serialcamera_AI}')]")
//listCamera.addProperty('xpath', ConditionType.EQUALS, ('//android.widget.TextView[contains(@text,\'' + cameraName) + '\')]')
TestObject listCamera = new TestObject('listCamera')

listCamera.addProperty('xpath', ConditionType.CONTAINS, "//android.widget.TextView[contains(@text,'$GlobalVariable.serialcamera_AI')]")

Mobile.tap(listCamera, 0)

TestObject serviceAI = new TestObject('serviceAI')

serviceAI.addProperty('xpath', ConditionType.CONTAINS, '//android.widget.TextView[contains(@text,\'Nhận diện gương mặt\')]')

Mobile.tap(serviceAI, 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/menu_QLGM_tren_man_nhan_dien_GM'), 0)

Mobile.tap(findTestObject('ObjectThemGuongMat/icon_them_guong_mat_tren_man_QLGM'), 0)

'Set tên gương mặt'
Mobile.setText(findTestObject('ObjectThemGuongMat/txtbox_nhap_ten_guong_mat'), 'Thu Giang6', 0)

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

face.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup//android.widget.TextView[@text=\'Thu Giang6\']')

// Kiểm tra sự tồn tại của nhóm "Gia đình"
if (Mobile.waitForElementPresent(groupNguoiNha, 15, FailureHandling.CONTINUE_ON_FAILURE)) {
    println('Nhóm \'Gia đình\' tồn tại.')

    // Kiểm tra sự tồn tại của "Thu Giang" trong nhóm "Người nhà"
    if (Mobile.waitForElementPresent(face, 10, FailureHandling.CONTINUE_ON_FAILURE)) {
        println('Gương mặt \'Thu Giang6\' tồn tại trong nhóm \'Gia đình\'.')
    } else {
        println('Gương mặt \'Thu Giang6\' không tồn tại trong nhóm \'Gia đình\'.')
    }
} else {
    println('Nhóm \'Gia đình\' không tồn tại.')
}

Mobile.tap(face, 0)

Mobile.verifyElementText(findTestObject('ObjectThemGuongMat/txtbox_ten_guong_mat_tren_man_thong_tin_GM'), 'Thu Giang6')

Mobile.verifyElementText(findTestObject('ObjectThemGuongMat/txt_so_luong_anh_tai_len'), ('Tải lên: ' + numberOfImages) + 
    '/15')

Mobile.verifyElementText(nhomguongmat, 'Gia đình')

Mobile.closeApplication()

