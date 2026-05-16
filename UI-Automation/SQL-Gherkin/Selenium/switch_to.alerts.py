# alert
# Javascript Alert
# promt alert
# confirm alert
# driver.switch_to.alert
# driver.switch_to.frames
# driver.switch_to.windows

#################################################################################################################################
import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html")

#to identify the element
l= driver.find_element(By.XPATH,"//*[@id='content']/button")
#to click the button
l.click()

#to switch the alert
a=driver.switch_to.alert
time.sleep(5)

#to get alert text
print(a.text)

#to accept the alert   ----> click on ok button
a.accept()
time.sleep(5)

#again producing the alert
l= driver.find_element(By.XPATH,"//*[@id='content']/button")


#to click the button
l.click()
time.sleep(3)

#to dismiss the alert ---> click on cancel button
a.dismiss()
time.sleep(3)

driver.close()