from selenium import webdriver
from selenium.webdriver import Chrome
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
import time
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

driver_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=driver_obj)
driver.get("https://rahulshettyacademy.com/angularpractice")

driver.find_element(By.XPATH, "//a[contains(@href, 'shop')]").click()
mobiles = driver.find_elements(By.XPATH, "//div[@class='card h-100']")
print(len(mobiles))
for mobile in mobiles:
    mobile_name = mobile.find_element(By.XPATH, "div/h4/a").text
    if mobile_name == "Blackberry":
        mobile.find_element(By.XPATH, "div[2]/button").click()
        driver.find_element(By.XPATH, "//a[@class='nav-link btn btn-primary']").click()
driver.find_element(By.XPATH, "//button[@class='btn btn-success']").click()
driver.find_element(By.ID, "country").send_keys("ind")
wait = WebDriverWait(driver, 10)
wait.until(expected_conditions.presence_of_element_located((By.LINK_TEXT, "India")))
driver.find_element(By.LINK_TEXT, "India").click()
driver.find_element(By.XPATH, "//div[@class='checkbox checkbox-primary']").click()
driver.find_element(By.XPATH, "//input[@value='Purchase']").click()
success_message = driver.find_element(By.CLASS_NAME, "alert-success").text
print(success_message)
assert "Success! Thank you! Your order will be delivered in next few weeks :-)." in success_message
