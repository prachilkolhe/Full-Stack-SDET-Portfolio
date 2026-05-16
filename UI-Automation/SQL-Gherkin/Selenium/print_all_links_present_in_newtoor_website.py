import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(r'C:\Users\PKE17\PycharmProjects\pythonProject\chromedriver.exe')
driver.get("https://www.demo.guru99.com/selenium/newtours/index.php")

mylink= driver.find_elements(By.TAG_NAME,"a")

count=0
for i in mylink:
    # print(i.text)          #i.text will print inner html of link between <a> ... </a>
    count +=1
    # print("Total links are", count)

    if i.text == "Destinations":
        print("Yes link is present at",count)
        i.click()
        time.sleep(2)

time.sleep(2)
driver.close()
