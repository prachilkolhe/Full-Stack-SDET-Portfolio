from selenium import webdriver
from selenium.webdriver import Chrome
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

service_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=service_obj)
driver.get("https://rahulshettyacademy.com/client")

driver.find_element(By.LINK_TEXT, "Forgot password?").click()
# driver.find_element(By.PARTIAL_LINK_TEXT, "Forgot").click()
driver.find_element(By.XPATH, "//form/div[1]/input").send_keys("hello@gamil.com")
driver.find_element(By.CSS_SELECTOR, "form div:nth-child(2) input").send_keys("Password@1")
driver.find_element(By.ID, "confirmPassword").send_keys("Password@1")
driver.find_element(By.XPATH, "//button[@type='submit']").click()
# driver.find_element(By.XPATH, "//button[text()='Save New Password']").click()
driver.close()