import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/index.php")

# mydate= driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")       #this path is called as "Absolute Path (/)"
mydate= driver.find_element(By.XPATH,"html//div//form//b")     #here we used unique term from the xpath i.e. form(term should be unique ...not be repeated..)
# mydate= driver.find_element(By.XPATH,"//form//b")     #this path is called as "Relative Path (//)"
print("Displayed date is",mydate.text)
time.sleep(2)

#TO CLICK ON FLIGHT BUTTON
driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a").click()
# driver.find_element(By.XPATH, "//a[@href=reservation.php]").click()
# driver.find_element(By.XPATH, "//a [contains (text(),'Flights')]").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]").click()
driver.find_element(By.XPATH,"//font//input[2][@name='tripType']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[3]").click()
driver.find_element(By.XPATH,"//option[@value='3']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[4]").click()
driver.find_element(By.XPATH,"//select[@name='fromPort']//option[@value='New York']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option[8]").click()
driver.find_element(By.XPATH,"//select//option[@value='8']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option[20]").click()
driver.find_element(By.XPATH,"//select[@name='fromDay']//option[@value='28']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[6]").click()
driver.find_element(By.XPATH,"//select[@name='toPort']//option[@value='Portland']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]/option[9]").click()
driver.find_element(By.XPATH,"//select[@name='toMonth']//option[@value='9']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]/option[6]").click()
driver.find_element(By.XPATH,"//select[@name='toDay']//option[@value='6']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]").click()
driver.find_element(By.XPATH,"//input[@value='First']").click()
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[4]").click()
driver.find_element(By.XPATH,"//select[@name='airline']//option[contains (text(),'Pangea Airlines')]").click()
            #value/name should be in single coat ('')   #contains is another method
time.sleep(2)

# driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input").click()
driver.find_element(By.XPATH,"//input[@name='findFlights']").click()
time.sleep(2)

time.sleep(5)
driver.close()