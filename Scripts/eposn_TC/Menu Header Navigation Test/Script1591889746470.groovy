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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

try {
    WebUI.openBrowser('')

    WebUI.deleteAllCookies()

    WebUI.navigateToUrl('https://epson.com/usa')

    WebUI.click(findTestObject('epson_OR/HP_AcceptCookies_Button/a_Accept'))

    WebUI.mouseOver(findTestObject('epson_OR/HP_Menu_Header_Link_FOR_HOME/a_FOR HOME_gParentLink'))

    WebUI.mouseOver(findTestObject('epson_OR/HP_Menu_Header_Link_FOR_HOME/a_Printers_parentLink'))

    WebUI.click(findTestObject('epson_OR/HP_Menu_Header_Link_FOR_HOME/a_Printers and All-in-Ones_childLink'))

    WebUI.takeScreenshot()
}
finally { 
    WebUI.closeBrowser()
}

