import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.support.wait import WebDriverWait



driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')

# class elem_has_text():
#
#     def __init__(self,expected_text):
#         self.expected_text=expected_text
#
#     def __call__(self, webelem):
#         str= webelem.text
#         print(str)
#
#         if(str.__contains__(self.expected_text)):
#             return True
#         else:
#             return None
#
# driver.get("file:///C:/Users/PKE17/Desktop/counter.html")
#
# counter= driver.find_element(By.ID,"demo")
# fwait= WebDriverWait(counter,poll_frequency=1,timeout=80)
# fwait.until(elem_has_text("20s"))                             #when time contains "20s" it will come outside if loop


######################################################################################################################
class elem_has_count():
    def __init__(self,locator,count):
        self.locator=locator
        self.count=count

    def __call__(self, driver):
        mylinks= driver.find_elements(*self.locator)
        if len(mylinks)==self.count:
            return True
        else:
            return None
driver.get("file:///C:/Users/PKE17/Desktop/fluentwaitsamplepage.html")
fwait= WebDriverWait(driver,poll_frequency=1,timeout=40)
fwait.until(elem_has_count((By.ID,"target"),5))


driver.close()