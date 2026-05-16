import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver= webdriver.Chrome(r'/Selenium/chromedriver.exe')
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html")

x= driver.find_element(By.XPATH,"//th[contains(text(), 'Company')]/ancestor::tr[1]/following-sibling::tr[3]/td[contains(text(),'Microsoft')]/following-sibling::td[1]")
len
print(x.text)
driver.close()