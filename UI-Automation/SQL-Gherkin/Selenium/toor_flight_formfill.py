import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

# s= Service(ChromeDriverManager().install())
# driver = webdriver.Chrome(service=s)


driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/index.php")

mylink = driver.find_elements(By.TAG_NAME,"a")
# driver.find_element(By.LINK_TEXT,"Flights").click()

for i in mylink:

    if i.text == "Flights":
        print("Flights found and clicked ")
        i.click()
        break

time.sleep(3)

a= driver.find_elements(By.NAME,"tripType")

for j in a:
    print(j.get_attribute("value"))
    # if i.text == oneway:
    if (j.is_selected != True):
        j.click()

time.sleep(3)


b= driver.find_elements(By.NAME,"servClass")

for j in b:
    print(j.get_attribute("value"))
    # if i.text == oneway:
    if j.get_attribute("value") == "Business":
    # if j.get_attribute("value") == "First":

        if (j.is_selected != True):
            j.click()
            break

time.sleep(3)


# mydate= driver.find_element(By.XPATH,"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")
# print(mydate.text)


driver.close()






