import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')

driver.get('https://www.google.com')

driver.find_element(By.NAME,"q").send_keys("Dassault Systemes")
# driver.find_element(By.NAME,"q").send_keys(Keys.ENTER)


driver.find_element(By.NAME,"q").send_keys(Keys.CONTROL+"A")
driver.find_element(By.NAME,"q").send_keys(Keys.BACKSPACE)
time.sleep(2)
driver.find_element(By.NAME,"q").send_keys("Infosys")
time.sleep(2)
# driver.find_element(By.NAME,"q").send_keys(Keys.ENTER)
driver.find_element(By.NAME,"btnK").click()


#To operate with 'Google Search' tab
# time.sleep(2)
# driver.find_element(By.NAME,"q").send_keys(Keys.ESCAPE)
# driver.find_element(By.XPATH,"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]").click()

time.sleep(5)

driver.close()