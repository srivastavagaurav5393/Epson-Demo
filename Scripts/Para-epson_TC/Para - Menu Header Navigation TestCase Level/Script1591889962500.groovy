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
    for (def rowNum = 1; rowNum <= findTestData('epson_DF/Menu Header Navigation Links').getRowNumbers(); rowNum++) {
        WebUI.openBrowser('')

        WebUI.deleteAllCookies()

        WebUI.maximizeWindow()

        WebUI.navigateToUrl('https://epson.com/usa')

        WebUI.refresh()

        WebUI.click(findTestObject('epson_OR/HP_AcceptCookies_Button/a_Accept'))

        WebUI.mouseOver(findTestObject('Para-epson_OR/Para-ForHome_Links/For Home _ Link', [('gParentLink') : findTestData(
                        'epson_DF/Menu Header Navigation Links').getValue(1, rowNum)]))

        WebUI.mouseOver(findTestObject('Para-epson_OR/Para-ForHome_Links/For Home _Parent Link', [('ParentLink') : findTestData(
                        'epson_DF/Menu Header Navigation Links').getValue(2, rowNum)]))

        WebUI.click(findTestObject('Para-epson_OR/Para-ForHome_Links/For Home _ ChildLink', [('ChildLink') : findTestData(
                        'epson_DF/Menu Header Navigation Links').getValue(3, rowNum)]))

        WebUI.takeScreenshot()
    }
}
finally { 
    WebUI.closeBrowser()
}

