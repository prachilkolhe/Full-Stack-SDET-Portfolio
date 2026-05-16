from selenium import webdriver
from selenium.webdriver.common.by import By

uname= (By.NAME,"userName")
passw= (By.NAME,"password")
loginbutton= (By.NAME,"submit")

flight_link= (By.LINK_TEXT,"Flights")
# flight_link= (By.XPATH,"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")

all_link= (By.TAG_NAME,"a")





#we using this file in another file using import and there it will execute