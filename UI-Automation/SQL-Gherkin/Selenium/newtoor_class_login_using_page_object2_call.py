import time
import newtoor_class_login_using_page_object1
from newtoor_class_login_using_page_object1 import *
from selenium.webdriver.common.by import By

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/")

#IN MENTIONED FILE WE DIDN'T ASSIGN DRIVER (i.e. driver=None) now here we assign above DRIVER to it
newtoor_class_login_using_page_object1.driver=driver

login_function("Akshay Kumar",27125375734)

print("We are calling the function from imported file...done it is!")

time.sleep(3)
driver.close()
