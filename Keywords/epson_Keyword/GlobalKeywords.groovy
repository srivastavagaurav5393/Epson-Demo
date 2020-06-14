package epson_Keyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class GlobalKeywords {

	@Keyword
	def homepage() {
		/*	KeywordUtil.logInfo("Refreshing")
		 WebDriver webDriver = DriverFactory.getWebDriver()
		 webDriver.navigate().refresh()
		 KeywordUtil.markPassed("Refresh successfully")*/

		WebUI.openBrowser('')
		WebUI.deleteAllCookies()
		WebUI.maximizeWindow()
		//WebUI.navigateToUrl(GlobalVariable.prodURL)
		WebUI.navigateToUrl('https://epson.com/usa')
		//WebUI.refresh()
		WebUI.click(findTestObject('epson_OR/HP_AcceptCookies_Button/a_Accept'))
	}

	@Keyword
	def doLogin(String userName, String password){
		try{
			WebUI.click(findTestObject('epson_OR/LoginForm/a_SIGN IN'))
			WebUI.setText(findTestObject('epson_OR/LoginForm/login_UserName'), userName)
			WebUI.setText(findTestObject('epson_OR/LoginForm/login_Password'), password)
			WebUI.click(findTestObject('Object Repository/epson_OR/LoginForm/input_Keep me logged in_j_spring_security_remember_me'))
			WebUI.click(findTestObject('epson_OR/LoginForm/button_Login'))
		}catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
	}
}