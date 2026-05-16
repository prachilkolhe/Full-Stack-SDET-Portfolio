import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(r'C:\Users\pkolhe\PycharmProjects\pythonProject\Selenium\chromedriver.exe')
driver.get('https://login-sandbox.imedidata.net/login')

#LOGIN
driver.find_element(By.ID,"session_username").send_keys("prachil_sandbox")
time.sleep(2)
driver.find_element(By.ID,"session_password").send_keys("Prachilpkolhe@97")
time.sleep(2)
driver.find_element(By.ID,"create_session_link").click()
time.sleep(2)

#CLICK ON LINK
count=0
studylinks= driver.find_elements(By.TAG_NAME,"a")
for x in studylinks:

    if x.text=="Study Group 2020":
        count = count + 1
        if count==2:
            print(x.text)
            x.click()
            break
time.sleep(2)

#CREATE STUDY
driver.find_element(By.XPATH,"//*[contains(text(),'Manage Studies')]").click()
time.sleep(1)
driver.find_element(By.XPATH,"//*[contains(@id,'create_new_study')]").click()
time.sleep(1)

#FORM FILLING

time.sleep(1)
driver.find_element(By.ID,"study_name").send_keys("atpk_auto")
driver.find_element(By.ID,"study_oid").send_keys("atpk_auto1233")
driver.find_element(By.XPATH,"//*[contains(@id,'study_environment_id')]/option[@value='1']").click()
driver.find_element(By.XPATH,"//*[contains(@id,'study_phase_uuid')]/option[contains(text(),'II-III')]").click()
driver.find_element(By.XPATH,"//*[contains(@id,'select2-indication_select-container')]").click()
driver.find_element(By.XPATH,"//*[contains(@type,'sear')]").send_keys("fever")
time.sleep(1)
driver.find_element(By.XPATH,"//*[contains(@type,'sear')]").send_keys(Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER)
driver.find_element(By.ID,"submit").click()
time.sleep(3)

driver.close()

