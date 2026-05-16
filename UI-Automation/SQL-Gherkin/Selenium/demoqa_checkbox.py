import time

import selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://demoqa.com/automation-practice-form")

driver.find_element(By.ID,"firstName").send_keys("Prachil")
time.sleep(2)

driver.find_element(By.ID,"lastName").send_keys("Kolhe")
time.sleep(2)

driver.find_element(By.ID,"userEmail").send_keys("prachil972000@gmail.com")
time.sleep(2)

checkbox= driver.find_elements(By.CLASS_NAME,"custom-control-label")
checklist=[]
for i in checkbox:
    checklist.append(i.text)
    if i.text.__contains__("Male"):
        i.click()
print(checklist)
print(len(checklist))
time.sleep(2)

driver.find_element(By.ID,"userNumber").send_keys("1234567890")
time.sleep(2)

driver.find_element(By.ID,"dateOfBirthInput").send_keys(Keys.CONTROL+"A")
time.sleep(2)

driver.find_element(By.ID,"dateOfBirthInput").send_keys("10 Jan 2022")
driver.find_element(By.ID,"dateOfBirthInput").send_keys(Keys.ESCAPE)
time.sleep(2)

driver.find_element(By.ID,"subjectsInput").click()
driver.find_element(By.ID,"subjectsInput").send_keys("Hindi")
time.sleep(2)
driver.find_element(By.ID,"subjectsInput").send_keys(Keys.ENTER)
time.sleep(2)

for i in checkbox:
    if i.text.__contains__("Reading"):
        i.click()
time.sleep(2)


driver.find_element(By.ID,"currentAddress").send_keys("Dassault Systemes, Pune")
time.sleep(2)



driver.find_element(By.ID,"submit").click()
time.sleep(2)
driver.find_element(By.ID,"closeLargeModal").click()
time.sleep(5)
driver.close()