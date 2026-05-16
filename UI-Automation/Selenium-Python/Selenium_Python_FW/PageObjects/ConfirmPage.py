from selenium.webdriver.common.by import By


class ConfirmPage:
    country = (By.ID, "country")
    country_click = (By.LINK_TEXT, "India")
    checkbox = (By.XPATH, "//div[@class='checkbox checkbox-primary']")
    purchase_button = (By.XPATH, "//input[@value='Purchase']")
    success_mssg = (By.CLASS_NAME, "alert-success")

    def __init__(self, driver):
        self.driver = driver

    def country_name(self):
        return self.driver.find_element(*ConfirmPage.country)

    def select_country(self):
        return self.driver.find_element(*ConfirmPage.country_click)

    def select_checkbox(self):
        return self.driver.find_element(*ConfirmPage.checkbox)

    def click_purchase(self):
        return self.driver.find_element(*ConfirmPage.purchase_button)

    def verify_success(self):
        return self.driver.find_element(*ConfirmPage.success_mssg)