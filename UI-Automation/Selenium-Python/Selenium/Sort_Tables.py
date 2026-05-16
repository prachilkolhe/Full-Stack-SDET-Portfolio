from selenium import webdriver
from selenium.webdriver import Chrome, ActionChains
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.support.select import Select

service_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=service_obj)
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers")

# Verifying that table has properly sorting the values or not
# Click the column header which sort the column value in browser
driver.find_element(By.XPATH, "//span[text()='Veg/fruit name']").click()

# Get the browser sorted list
browser_sorted_list = []
vegetables = driver.find_elements(By.XPATH, "//tr/td[1]")
for vegetable in vegetables:
    browser_sorted_list.append(vegetable.text)

# Now again sort this list using sort function to cross verify that is it sorted properly or not
sorted_list = list(browser_sorted_list.copy())
print(sorted_list)
browser_sorted_list.sort()
print(browser_sorted_list)
assert browser_sorted_list == sorted_list

