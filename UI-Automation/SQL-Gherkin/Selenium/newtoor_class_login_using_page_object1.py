import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver= None
uname= (By.NAME,"userName")
passw= (By.NAME,"password")
loginbutton= (By.NAME,"submit")

flight_link= (By.LINK_TEXT,"Flights")

all_link= (By.TAG_NAME,"a")

def login_function(uname_val,passw_val):

    # "*" is used to exposed that element inside this file
    driver.find_element(*uname).send_keys(uname_val)
    time.sleep(2)

    driver.find_element(*passw).send_keys(passw_val)
    time.sleep(2)