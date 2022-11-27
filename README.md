I used katalon studio to record the test automation

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
