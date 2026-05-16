import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get('https://www.demo.guru99.com/selenium/newtours/index.php')

driver.find_element(By.NAME,"userName").click()
driver.find_element(By.NAME,"userName").send_keys("prachilkolhe")
time.sleep(2)
driver.find_element(By.NAME,"password").click()
driver.find_element(By.NAME,"password").send_keys("prachil")
time.sleep(2)
driver.find_element(By.NAME,"submit").click()
time.sleep(5)

driver.close()

# This 'userName','password','submit' are obtained from inspecting that element in that website
