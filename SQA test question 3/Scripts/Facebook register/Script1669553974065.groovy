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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://en-gb.facebook.com/reg/')

WebUI.setText(findTestObject('Firstname'), 'kiki')

WebUI.setText(findTestObject('Surname'), 'amalia')

WebUI.setText(findTestObject('Emailaddress'), 'abcd@gmail.com')

WebUI.setText(findTestObject('Confirmemail'), 'abcd@gmail.com')

WebUI.setEncryptedText(findTestObject('Password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.selectOptionByValue(findTestObject('SelectDate'), '21', false)

WebUI.selectOptionByValue(findTestObject('SelectMonth'), 'Nov', false)

WebUI.selectOptionByValue(findTestObject('SelectYear'), '1998', false)

if(Jeniskelamin == 'Female'){
WebUI.click(findTestObject('input_Female_sex'))}
else if (Jeniskelamin == 'Male'){
WebUI.click(findTestObject('input_Male_sex'))}
else if(Jeniskelamin == 'Custom'){
WebUI.click(findTestObject('input_Custom_sex'))}

WebUI.click(findTestObject('button_Sign Up'))

