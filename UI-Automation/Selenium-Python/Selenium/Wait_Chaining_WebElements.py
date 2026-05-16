from selenium import webdriver
from selenium.webdriver import Chrome
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time

from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait

service_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=service_obj)
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/")
driver.implicitly_wait(2)           # when expected element element is not displaying then it will wait for 5 seconds, still if its not appearing then it will failed

driver.find_element(By.XPATH, "//input[@type='search']").send_keys("ber")
# Verifying expected item list with actual item list
expected_item_list = ["Cucumber - 1 Kg", "Raspberry - 1/4 Kg", "Strawberry - 1/4 Kg"]
actual_item_list = []
time.sleep(2)
results = driver.find_elements(By.XPATH, "//div[@class='products']/div")
count = len(results)
print(count)
assert count > 0
for result in results:
    actual_item_list.append(result.find_element(By.XPATH, "h4").text)       # Chaining of webelements --> it will add 'h4' css to css of results and will find the elements
    result.find_element(By.XPATH, "div/button").click()            #Chaining of webelements --> It will check button attribute for each results which are getting from line no 14
print(actual_item_list)
assert actual_item_list == expected_item_list

driver.find_element(By.XPATH, "//a[@class='cart-icon']").click()
driver.find_element(By.XPATH, "//button[text()= 'PROCEED TO CHECKOUT']").click()
driver.find_element(By.XPATH, "//input[@class='promoCode']").send_keys("rahulshettyacademy")
driver.find_element(By.XPATH, "//button[text()='Apply']").click()
wait = WebDriverWait(driver, 10)           # Explicit wait -- When a specific step is taking a lot time then we add explicit wait instead of increasing the implicit wait
wait.until(expected_conditions.presence_of_element_located((By.CSS_SELECTOR, ".promoInfo")))            # By.CSS_SELECTOR, ".promoInfo" -- should be in seperate bracket
print(driver.find_element(By.XPATH, "//span[@class='promoInfo']").text)

# Verifying the total amount
prices = driver.find_elements(By.XPATH, "//tr/td[5]/p")
sum = 0
for price in prices:
    sum = sum + int(price.text)
print(sum)
total_amount = int(driver.find_element(By.XPATH, "//span[@class='totAmt']").text)
assert sum == total_amount

# Verifying that discounted prices should be less than actual price
discounted_price = float(driver.find_element(By.CSS_SELECTOR, ".discountAmt").text)         #float because after discount price may be in decimal
print(discounted_price)
assert total_amount > discounted_price

