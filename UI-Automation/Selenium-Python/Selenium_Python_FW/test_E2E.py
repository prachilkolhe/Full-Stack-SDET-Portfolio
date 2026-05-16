from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from Selenium_Python_FW.Utility.BaseClass import ParentClass


# When you have no of test case for them you need to assign fixture method, so instead of assigning of seperately we create class and do inheritance
# @pytest.mark.usefixtures("setupBrowser")
# Here we created parentclass to which we assign fixture method and pass that class to here ie. inheritance
class TestE2E(ParentClass):

    def test_E2E(self):
        self.driver.find_element(By.XPATH, "//a[contains(@href, 'shop')]").click()          # driver is class object so using it in another test method with self
        mobiles = self.driver.find_elements(By.XPATH, "//div[@class='card h-100']")
        print(len(mobiles))
        for mobile in mobiles:
            mobile_name = mobile.find_element(By.XPATH, "div/h4/a").text
            if mobile_name == "Blackberry":
                mobile.find_element(By.XPATH, "div[2]/button").click()
                break

        self.driver.find_element(By.XPATH, "//a[@class='nav-link btn btn-primary']").click()
        self.driver.find_element(By.XPATH, "//button[@class='btn btn-success']").click()
        self.driver.find_element(By.ID, "country").send_keys("ind")
        wait = WebDriverWait(self.driver, 10)
        wait.until(EC.presence_of_element_located((By.LINK_TEXT, "India")))
        self.driver.find_element(By.LINK_TEXT, "India").click()
        self.driver.find_element(By.XPATH, "//div[@class='checkbox checkbox-primary']").click()
        self.driver.find_element(By.XPATH, "//input[@value='Purchase']").click()
        success_message = self.driver.find_element(By.CLASS_NAME, "alert-success").text
        print(success_message)
        assert "Success! Thank you! Your order will be delivered in next few weeks :-)." in success_message
