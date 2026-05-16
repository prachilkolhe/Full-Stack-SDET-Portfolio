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
driver.get("https://www.demo.guru99.com/selenium/newtours/reservation.php")
#here I provided direct link of 'flight' tab where the cities located in 'Departing from' tab

# a= Select(driver.find_element(By.NAME,"fromPort"))
# departcity= a.options
# print(type(departcity))
# print(departcity[2].text)
# #if we dont used .text then it will print list by address .....if we used it will print list by name/index
#
#
# for i in departcity:
#     # print(i.text)
#     print(i.get_attribute("value"))
#
# for j in departcity:
#     # print(i.text)
#     if j.get_attribute("value")== "London":
#         print("Yes! London is found")
#         break
#
# time.sleep(5)
# #to select london city in webpage-----> Using "select_by_value" method
# p=a.select_by_value("London")
#
# #select the city pune if it exits else select Portland:
#
# len = (len(departcity))
# len1=len-1
# count=0
# for j in departcity:
#     if j.get_attribute("value") == "Pune":
#         a.select_by_value("Paris")
#         break
#
#     elif(count == len1):
#             a.select_by_value("Portland")
#             print("Pune not founded in list")
#
#     count=count+1
# #####################################################################################################
# #above example using index value, empty list and append
# citylist=[]
#
# for i in range(len):
#     citylist.append((departcity[i].text))
#
# print(citylist)
#
# if "Pune" in citylist:
#     a.select_by_value("Pune")
# else:
#     a.select_by_value("Paris")
#     print("pune not found that's why paris is selected ")
#
# time.sleep(3)
################################################################################
#select unified airlines

airlines= Select(driver.find_element(By.NAME,"airline"))

airlines_option= airlines.options
print(type(airlines_option))
count = 0
fltindex= 0
for i in airlines_option:
    # if (i.text).__contains__("Unified Airlines"):
    #     i.click()
    # if (i.text).__contains__("Unified"):
    #     i.click()
    count=count+1

    if (i.text).__contains__("Blue"):
        i.click()
        fltindex=count                     #if i.text contains blue then I need to find index of that i.text so we assign count to the
        print(fltindex-1)                  # fltindex (flight index) which we initialise at begining
        #flt index obtained here is started with 1,2,3 not from 0 ...so we put fltindex-1, so that we get our proper index




time.sleep(5)
driver.close()