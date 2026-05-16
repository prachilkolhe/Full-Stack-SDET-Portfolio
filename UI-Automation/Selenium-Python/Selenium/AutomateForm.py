import time

from selenium import webdriver
from selenium.webdriver import Chrome
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

# General XPath--> //tagname[@attribute='value']       -->   //input[@type='submit']
# General CSS Selector--> tagname[attribute='value'] or #id or .classname

driver_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=driver_obj)
driver.get("https://rahulshettyacademy.com/angularpractice")

driver.find_element(By.NAME, "email").send_keys("hello@gmail.com")
driver.find_element(By.NAME, "name").send_keys("I am Robot")
# driver.find_element(By.CSS_SELECTOR, "input[name='name']").send_keys("I am Robot")
driver.find_element(By.ID, "exampleInputPassword1").send_keys("Password1")
driver.find_element(By.ID, "exampleCheck1").click()

# STATIC DROPDOWN --> Using 'Select' class and need to import it
options = Select(driver.find_element(By.ID, "exampleFormControlSelect1"))
options.select_by_index(1)
options.select_by_visible_text("Male")
# options.select_by_value()
time.sleep(5)

driver.find_element(By.XPATH, "//input[@type='submit']").click()
driver.find_element(By.ID, "inlineRadio2").click()

#'text' is the method to grab the text present in the inspected element
message = driver.find_element(By.CLASS_NAME, "alert.alert-success.alert-dismissible").text
print(message)
assert "Success" in message     #it passes if Success is present in message

driver.find_element(By.XPATH, "(//input[@type='text'])[3]").send_keys("I'm here")
driver.find_element(By.XPATH, "(//input[@type='text'])[3]").clear()

driver.close()