import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select


driver= webdriver.Chrome(r"/Selenium/chromedriver.exe")
driver.get("https://demoqa.com/webtables")

#here we used "elements" so it will print a list
x= driver.find_elements(By.XPATH,"//div[@class='rt-td'][4]")
# x = driver.find_elements(By.XPATH,"//div[contains(text(),'@')]")
for i in range(len(x)):
    print(x[i].text)

##################################################################################################################################
#suppose here we dont know where the email column is...so that we need to print all mails inside the Email column

a = driver.find_elements(By.XPATH,"//div[@class='rt-resizable-header-content']")        #it will give 7 entities in one hzl line

d="//div[@role='gridcell']"        #it will total 70 nos of cells in this div

len1 = len(a)


for i in range(len1):
    if a[i].text == "Email":
        print(i)
        break
j=i+1            #because i is index of that 7 values (0 to 6) so to start from 1 we add 1 to it
print(j)
f="[{}]".format(j)
print(f)
c=d+f
print(c)
b = driver.find_elements(By.XPATH,"{}".format(c))

len2 = len(b)
for x in range(len2):
    print(b[x].text)

print("******")

################################################################################################################################
driver.close()


#this is ancestors Xpath: to get all emails
# //div[@class='rt-resizable-header-content'][contains(text(),'Email')]/ancestor::div[3]/following-sibling::div[position()=1]//div[@class="rt-td"][4]
