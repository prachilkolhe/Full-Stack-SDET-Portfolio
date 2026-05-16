import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

driver= webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')

driver.maximize_window()
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html")


#when we dont know where is company name and contact person so here is the logic to find company and its respective
#contact person using XPATH method

# x = driver.find_elements(By.CSS_SELECTOR,"table[id='customers']>tbody>tr:nth-of-type(1)>th")
# counter=0
# for i in x:
#     counter=counter+1
#     if i.text=="Contact":
#         print(i.text)
#         print(type(i))
#         break




headers = driver.find_elements(By.CSS_SELECTOR, "table[id='customers'] th")
colname = "Contact"
counter = 0

for h in headers:
    counter+=1
    if h.text == colname:
        break

my_col = driver.find_elements(By.CSS_SELECTOR, 'table[id="customers"] td:nth-of-type('+str(counter)+')')

for x in my_col:
    print(x.text)

time.sleep(3)
driver.close()





