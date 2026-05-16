from selenium.webdriver.common.by import By


class CheckoutPage:
    checkout = (By.XPATH, "//button[@class='btn btn-success']")

    def __init__(self, driver):
        self.driver = driver

    def confirm_checkout(self):
        return self. driver.find_element(*CheckoutPage.checkout)