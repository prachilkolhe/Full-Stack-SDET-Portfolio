import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
driver= webdriver.Chrome(r"C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe")
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html")


#when we dont know where is company name and contact person so here is the logic to find company and its respective
#contact person using XPATH method

x = driver.find_elements(By.XPATH,"//tr[contains(@style,'box-sizing: inherit;')]//th")
y=0
z=0
u="Adobe"
len1 = len(x)
for i in range(len1):
    if x[i].text.__contains__("Company"):

        y=i+1

for j in range(len1):
    if x[j].text.__contains__("Contact"):

        z=j
o = driver.find_elements(By.XPATH,"//tr[contains(@style,'box-sizing: inherit;')]//td")
for e in range(len(o)):
    if o[e].text == (u):
        e=e+z
        t=o[e].text
        print(t)
        break

driver.close()
