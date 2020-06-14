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

/*
WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

//WebUI.navigateToUrl(GlobalVariable.prodURL)
WebUI.navigateToUrl('https://epson.com/usa')

WebUI.refresh()

WebUI.click(findTestObject('epson_OR/HP_AcceptCookies_Button/a_Accept'))

//CustomKeywords.'epson_Keyword/GlobalKeywords/homepage'()
CustomKeywords.'epson_Keyword/GlobalKeywords/doLogin'()

WebUI.takeScreenshot()*/
CustomKeywords.'epson_Keyword.GlobalKeywords.homepage'()

CustomKeywords.'epson_Keyword.GlobalKeywords.doLogin'(userName, password)

