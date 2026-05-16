import time
from newtoors_login_page_object1 import *          #(* means import all)
from selenium import webdriver
from selenium.webdriver.common.by import By

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/")

# "*" is used to exposed that element inside this file
driver.find_element(*uname).send_keys(uname)
time.sleep(2)

driver.find_element(*passw).send_keys(passw)
time.sleep(2)

driver.find_element(*loginbutton).click()

driver.find_element(*flight_link).click()


##################################################################################################################
