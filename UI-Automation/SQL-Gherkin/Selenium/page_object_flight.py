
from selenium import webdriver
from selenium.webdriver.common.by import By

class flightpage():
    trip_el= (By.NAME,"tripType")
    driver= None

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/")

flight_button= driver.find_elements(By.LINK_TEXT,"Flights").click()
