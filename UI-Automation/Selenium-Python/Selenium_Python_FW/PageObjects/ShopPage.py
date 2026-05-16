from selenium.webdriver.common.by import By


class ShopPage:
    mobilename = (By.XPATH, "//div[@class='card h-100']")
    checkoutBtn = (By.XPATH, "//a[@class='nav-link btn btn-primary']")

    def __init__(self, driver):
        self.driver = driver

    def checkoutItems(self):
        return self.driver.find_elements(*ShopPage.mobilename)

    def clickCheckout(self):
        return self.driver.find_element(*ShopPage.checkoutBtn)