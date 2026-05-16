import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from newtoors_login_page_object1 import *



def login_function(uname_val,passw_val):
    driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
    driver.get("https://www.demo.guru99.com/selenium/newtours/")

    # "*" is used to exposed that element inside this file
    driver.find_element(*uname).send_keys(uname_val)
    time.sleep(2)

    driver.find_element(*passw).send_keys(passw_val)
    time.sleep(2)

# login_function("Prachil","12134543")
#if we uncomment this it will run ...just try!

# driver.close()





