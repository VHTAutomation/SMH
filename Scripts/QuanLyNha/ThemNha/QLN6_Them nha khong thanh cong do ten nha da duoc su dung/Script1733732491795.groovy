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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidElement as AndroidElement
import org.openqa.selenium.NoSuchElementException as NoSuchElementException
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.By as By

// Tạo Test Object động
//Tạo một Test Object với tên dynamicObject.Test Object này chỉ tồn tại trong bộ nhớ trong khi script chạy và không được lưu trong Object Repository.
// Sử dụng Khi không muốn lưu trữ quá nhiều Test Object trong Object Repository
//Khi phần tử có vị trí, tên, hoặc thuộc tính thay đổi theo ngữ cảnh.
// Khi cần kiểm thử động và linh hoạt với các điều kiện khác nhau
//XPath của phần tử đầu tiên cần thao tác.
// Thực hiện tap khi phần tử đã xuất hiện
//  //Hành động "tap" (nhấn) lên phần tử được đại diện bởi dynamicObject.Thời gian chờ (timeout) là 0 giây.
Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

tapDynamicObject('//android.widget.TextView[1]', 0)

//Mobile.tap(findTestObject('ObjectThemNha/icon_xoa_ten_nha_tren_txtbox_ten_nha'), 0)
Mobile.tap(findTestObject('ObjectThemNha/popup_chon _nha_Quan_Ly_Nha'), 0)

'Cuộn đến phần tử có text là:" Thêm nhà" '
Mobile.scrollToText('Thêm nhà', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectThemNha/btn_them_nha_tren_man_quan_ly_nha'), 0)

Mobile.setText(findTestObject('ObjectThemNha/txtbox_nhap_ten_nha'), 'Nhà Giang xih', 0)

Mobile.tap(findTestObject('ObjectThemNha/btn_Luu_tren_man_them_nha'), 0)

AndroidDriver<?> driver = ((MobileDriverFactory.getDriver()) as AndroidDriver<?>)

String expectedPartialMessage = GlobalVariable.toasttennhadasudung // Nội dung toast hiển thị

//Khối try-catch giúp quản lý lỗi trong quá trình kiểm tra. Nếu không tìm thấy Toast,
// mã sẽ ném ra ngoại lệ NoSuchElementException và in ra thông báo "Toast message không xuất hiện hoặc không tìm thấy XPath".
/*try {
    WebDriverWait wait = new WebDriverWait(driver, 15)

    AndroidElement toastElement = driver.findElementByXPath('//android.widget.Toast[1]')

    // AndroidElement toastElement = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast[1]")))
    assert toastElement.getText().equals(expectedPartialMessage): "Nội dung của toast không đúng! Nội dung chính xác là:" + toastElement.getText()

    println('Toast message chứa nội dung mong đợi.')
}
catch (NoSuchElementException e) {
    println('Toast message không xuất hiện hoặc không tìm thấy XPath.')
} */
WebDriverWait wait = new WebDriverWait(driver, 15)

AndroidElement toastElement = driver.findElementByXPath('//android.widget.Toast[1]')

if (toastElement.getText().equals(expectedPartialMessage)) {
    println('Toast message chứa nội dung mong đợi.') // Có thể thêm logic xử lý lỗi hoặc tiếp tục chương trình
} else {
    println('Toast message chứa nội dung không mong đợi.')
}

// Đóng ứng dụng
Mobile.closeApplication()

def tapDynamicObject(String xpath, int timeout) {
    TestObject dynamicObject = new TestObject('dynamicObject')

    dynamicObject.addProperty('xpath', ConditionType.EQUALS, xpath)

    Mobile.tap(dynamicObject, 0)
}

