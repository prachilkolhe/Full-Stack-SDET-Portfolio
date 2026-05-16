import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver import ActionChains
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.support.wait import WebDriverWait

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/")

mylinks= driver.find_elements(By.TAG_NAME,"a")         #all link whoose attribute value is 'a'
uname= driver.find_element(By.NAME,"userName")
actions= ActionChains(driver)

for link in mylinks:
    actions.move_to_element(link)
    actions.pause(1)

actions.key_down(Keys.LEFT_SHIFT)
actions.send_keys_to_element(uname,"dassault")
actions.key_up(Keys.LEFT_SHIFT)
actions.pause(3)


actions.perform()

driver.close()