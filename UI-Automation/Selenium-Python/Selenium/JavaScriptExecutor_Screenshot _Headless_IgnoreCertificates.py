from selenium import webdriver
from selenium.webdriver import Chrome, ActionChains
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.support.select import Select

# TO RUN SCENARIOS AS HEADLESS
chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument("Headless")

# To OPEN BROWSER IN MAXIMIZE WINDOW
chrome_options.add_argument("--start-maximized")

# WHEN USER LAND ON WEBPAGE BUT SOME CERTIFICATES ERROR COME UP SO TO IGNORE THAT ERROR AND GO AHEAD
chrome_options.add_argument("--ignore_certificate_errors")

service_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=service_obj, options=chrome_options)          # by passing values for service and options, driver will get given chromedriver and headless
driver.get("https://rahulshettyacademy.com/AutomationPractice/")

# TO EXECUTE JAVASCRIPT USING SELENIUM WEBDRIVER
driver.execute_script("window.scrollBy(0, document.body.scrollHeight);")        # it will scroll upto bottom of page
# driver.execute_script("window.scrollBy(0, 800);")                               # it will scroll the page by 800 px
driver.get_screenshot_as_file("first_screenshot.png")                           # captured ss will be saved as given file name