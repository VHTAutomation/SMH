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
Mobile.tap(SeeMoreButton, 20)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_tang_nguoi_than'), 0)

Mobile.setText(findTestObject('ObjectTangGoiCloud/txtbox_nhap_so_dien_thoi'), '0394361750', 0)

String SerialCamera = '0166aa5d010c7df9'

Mobile.setText(findTestObject('ObjectTangGoiCloud/txt_serial_camera'), SerialCamera, 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_Tiep'), 0)

TestObject dongtruoccuoc = new TestObject('dongtruoccuoc')

dongtruoccuoc.addProperty('xpath', ConditionType.EQUALS, '//android.widget.TextView[@text=\'5 phút\']')

Mobile.tap(dongtruoccuoc, 0)

Mobile.scrollToText('Điều khoản Viettel Home', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectTangGoiCloud/opt_thanh_toan_bang_viettel_paygate'), 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_thanh_toan'), 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/radio_viettel_money'), 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/txt_sdt'), 0)

Mobile.setText(findTestObject('ObjectTangGoiCloud/txtfield_sdt_thanh_toan'), '0983725525', 0)

Mobile.setText(findTestObject('ObjectTangGoiCloud/txtfield_mat_khau_thanh_toan'), '123123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_dang_nhap_tai_khoan_viettel_money'), 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/txt_mo_ta_otp'), 0)

Mobile.setText(findTestObject('ObjectTangGoiCloud/txtfiled_otp_dang_nhap'), '1111', 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_xac_nhan_otp_dang_nhap'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_thanh_toan_final'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('ObjectTangGoiCloud/txtfield_nhap_otp2'), '1234', 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/btn_xac_nhan_thanh_toan'), 0)

Mobile.tap(findTestObject('ObjectTangGoiCloud/icon_lich_su_mua_hang'), 0)

TestObject historyObject = new TestObject('historyObject')

// XPath để kiểm tra các điều kiện của ImageView và TextView
historyObject.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1][.//android.widget.ImageView and .//android.widget.TextView[1][@text=\'Lưu trữ sự kiện 3 ngày\'] and .//android.widget.TextView[2][@text=\'1.000đ\'] and .//android.widget.TextView[6][@text=\'Chưa kích hoạt\']]')

// Kiểm tra sự tồn tại của phần tử trong thời gian chờ 20 giây
Mobile.verifyElementExist(historyObject, 20)

Mobile.tap(historyObject, 0)

Mobile.verifyElementText(findTestObject('ObjectTangGoiCloud/txt_thiet_bi_dang_ky'), SerialCamera)

Mobile.verifyElementText(findTestObject('ObjectTangGoiCloud/txt_Goi_cuoc_luu_tru'), 'Lưu trữ sự kiện 3 ngày')

Mobile.verifyElementText(findTestObject('ObjectTangGoiCloud/txt_dong_truoc_cuoc'), '5 phút')

Mobile.verifyElementText(findTestObject('ObjectTangGoiCloud/txt_trang_thai_goi_cuoc'), 'Chưa kích hoạt')

Mobile.verifyElementText(findTestObject('ObjectTangGoiCloud/txt_tong_tien_thanh_toan'), '1.000đ')

Mobile.verifyElementText(findTestObject('ObjectTangGoiCloud/txt_sdt_duoc_tang'), '0394361750')

Mobile.closeApplication()

