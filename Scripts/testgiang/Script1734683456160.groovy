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
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.AppiumDriver


Mobile.startExistingApplication(GlobalVariable.Environment_pro, FailureHandling.STOP_ON_FAILURE)
Mobile.scrollToText('Nhóm gương mặt')
TestObject nhomguongmat = new TestObject('nhomguongmat')

nhomguongmat.addProperty('xpath', ConditionType.EQUALS, '//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[@text=\'Người quen\']')

// Kiểm tra xem nhóm "Người nhà" đã được chọn hay chưa
TestObject bottomsheetnhomguongmat = new TestObject('bottomsheet')

bottomsheetnhomguongmat.addProperty('xpath', ConditionType.EQUALS, '//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[@text=\'Người quen\']')
boolean isSelected = Mobile.verifyElementExist(nhomguongmat,30, FailureHandling.OPTIONAL)

if (!(isSelected)) {
	// Nếu chưa chọn, thực hiện tap vào nhóm gương mặt "Người nhà"
	println('Nhóm \'Người quen\' chưa được chọn, tiến hành tap.')

	Mobile.tap(findTestObject('ObjectThemGuongMat/icon_xem_thong_tin_nhom_GM'), 0)

	Mobile.tap(bottomsheetnhomguongmat, 30 )// Nếu đã chọn, ghi log và bỏ qua thao tác
		
} else {
	println('Nhóm \'Người quen\' đã được chọn, bỏ qua thao tác tap.')
}