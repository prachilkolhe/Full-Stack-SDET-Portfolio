import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("file:///C:/Users/PKE17/Desktop/frames.html")

driver.maximize_window()
f1= driver.find_element(By.ID,"frm1")
f2= driver.find_element(By.ID,"frm2")
driver.switch_to.default_content()
driver.switch_to.frame(f1)
mylinks= driver.find_elements(By.TAG_NAME,"a")

for x in mylinks:
    print(x.text)

driver.switch_to.default_content()
driver.switch_to.frame(f2)

mylinks1= driver.find_elements(By.TAG_NAME,"a")          #it will print all the link whoose attribute value is 'a'
for l in mylinks1:
    print(l.text)

print("Frame title is", driver.title)



time.sleep(5)
driver.close()