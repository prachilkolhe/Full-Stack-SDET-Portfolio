from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver import chrome

service_obj= Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")       #created a service object of service class where we stored the path pf chromedriver
driver= webdriver.Chrome(service=service_obj)                                           #this step is responsible for opening the browser
driver.maximize_window()                        #to maximize the window
driver.get("https://www.rahulshettyacademy.com")                                        #this step is responsible to get url in opened browser
print(driver.current_url)                       #to print current url
print(driver.title)                             #to print current tab name
driver.get("https://www.youtube.com")           #to get to another url
driver.back()                                   #to get back of page
driver.refresh()                                #to refresh the page
driver.minimize_window()                        #to minimize the window
driver.close()                                  #to close the opened browser


#How to run above script in another browsers like Firefox and MS Edge
#Just need to change to specific browser's driver path and browser name in driver object (Line No. 5 & 6)
#Firefox
# service_obj= Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/geckodriver")
# driver= webdriver.Firefox(service=service_obj)

#MS Edge
# service_obj= Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/msedgedriver")
# driver= webdriver.Edge(service=service_obj)