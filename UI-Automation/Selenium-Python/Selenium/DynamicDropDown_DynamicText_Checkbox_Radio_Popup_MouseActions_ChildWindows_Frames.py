from selenium import webdriver
from selenium.webdriver import Chrome, ActionChains
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time
from selenium.webdriver.support.select import Select

service_obj = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
driver = webdriver.Chrome(service=service_obj)
driver.get("https://rahulshettyacademy.com/AutomationPractice/")

# RADIO BUTTONS
radio_button = driver.find_element(By.XPATH, "//input[@value='radio2']")
radio_button.click()
assert radio_button.is_selected()


# CHECKBOXES
# driver.find_element(By.ID, "checkBoxOption1").click()
# If 'Id', 'name', 'value' attributes are not present
checkboxes = driver.find_elements(By.XPATH, "//input[@type='checkbox']")
print(len(checkboxes))
for checkbox in checkboxes:
    if checkbox.get_attribute("value") == "option3":
        checkbox.click()
        assert checkbox.is_selected()     #it return True if checkbox is selected
        break


# STATIC DROPDOWN
options = Select(driver.find_element(By.ID, "dropdown-class-example"))
options.select_by_index(1)
options.select_by_visible_text("Option3")
options.select_by_value("option2")


# DYNAMIC DROPDOWN
driver.find_element(By.ID, "autocomplete").send_keys("pa")
time.sleep(2)       #time required for dynamic dropdown to be displayed
countries = driver.find_elements(By.CSS_SELECTOR, "li[class='ui-menu-item'] div")
print(len(countries))
for country in countries:
    if country.text == "Pakistan":
        country.click()
        break


# DYNAMIC TEXT ON WEBPAGE (text gets disappeared after refresh) --> Checking the value selected in dropdown
print(driver.find_element(By.ID, "autocomplete").get_attribute("value"))
assert driver.find_element(By.ID, "autocomplete").get_attribute("value") == "Pakistan"


# ELEMENT IS DISPLAYING ON WEBPAGE OR NOT
assert driver.find_element(By.ID, "displayed-text").is_displayed()
driver.find_element(By.ID, "hide-textbox").click()
assert not driver.find_element(By.ID, "displayed-text").is_displayed()  # if not displaying then it return True --> Negative Assertion
driver.find_element(By.ID, "show-textbox").click()
assert driver.find_element(By.ID, "displayed-text").is_displayed()


# POPUP
# To go inside of alert popup, we need to switch from driver mode to alert mode
# .accept() --> used to accept the modal like clicking the buttons like OK, Done, Confirm --> Positive buttons
# .dismiss() --> used to discard the modal like clicking the buttons like No, Cancel --> Negative buttons
driver.find_element(By.ID, "name").send_keys("Robot")
driver.find_element(By.ID, "alertbtn").click()
alert = driver.switch_to.alert                          #to go to inside of alert
alert_text = alert.text
print(alert_text)
assert "Robot" in alert_text
alert.accept()                                          #clicking OK button of modal

#Another pop up which has two buttons
driver.find_element(By.ID, "name").send_keys("Robot")
driver.find_element(By.ID, "confirmbtn").click()
alert2 = driver.switch_to.alert
alert2_text = alert2.text
print(alert2_text)
assert "Robot" in alert_text
#accepting the alert
# alert2.accept()
#discarding the same alert
alert2.dismiss()

# MOUSE SWITCHING
action = ActionChains(driver)
driver.maximize_window()
# action.context_click(driver.find_element()).perform              # right click
# action.double_click(driver.find_element()).perform               # double click
# action.drag_and_drop(driver.find_element()).perform              # input -- source to destination
action.move_to_element(driver.find_element(By.ID, "mousehover")).perform()              # hover
# action.context_click(driver.find_element(By.LINK_TEXT, "Top")).perform()
action.move_to_element(driver.find_element(By.LINK_TEXT, "Reload")).click().perform()   # moved to one element to another element

# WINDOWS SWITCHING
driver.find_element(By.LINK_TEXT, "Open Tab").click()
Opened_Windows = driver.window_handles
driver.switch_to.window(Opened_Windows[1])
print(driver.find_element(By.LINK_TEXT, "Access all our Courses").text)
driver.close()
driver.switch_to.window(Opened_Windows[0])
print(driver.find_element(By.TAG_NAME, "h1").text)
assert driver.find_element(By.TAG_NAME, "h1").text == "Practice Page"

# FRAMES
# use below driver to run below code
# driver.get("https://www.hyrtutorials.com/p/frames-practice.html")
# driver.switch_to.frame("frm1")        # switching from main html to frame present in that html but putting 'Id' of frame
# print(driver.find_element(By.XPATH,"//h1[@class='post-title entry-title']").text)
# driver.switch_to.default_content()              # switching back to main html
# driver.find_element(By.LINK_TEXT, "Tech News").click()
# assert driver.find_element(By.LINK_TEXT, "Tech News").text == "Tech News"
# print(driver.find_element(By.LINK_TEXT, "Tech News").text)





