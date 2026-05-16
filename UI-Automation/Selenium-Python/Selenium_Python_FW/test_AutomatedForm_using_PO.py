from selenium.webdriver.support.select import Select

from Selenium_Python_FW.Utility.BaseClass import ParentClass
from Selenium_Python_FW.PageObjects.HomePage import HomePage
import pytest


class TestForm(ParentClass):

    def test_formSubmission(self):
    # def test_formSubmission(self, multiple_data):           # To run with multiple dataset
        #object of HomePage class
        homepage = HomePage(self.driver)

        # driver.find_element(By.NAME, "name").send_keys("I am Robot")
        homepage.getName().send_keys("Rahul")
        # To run with multiple dataset
        # homepage.getName().send_keys(multiple_data[0])
        # Using dict
        # homepage.getName().send_keys(multiple_data["Firstname"])

        # driver.find_element(By.NAME, "email").send_keys("hello@gmail.com")
        homepage.getEmail().send_keys("hello@gmail.com")
        # To run with multiple dataset
        # homepage.getEmail().send_keys(multiple_data[1])
        # Using dict
        # homepage.getEmail().send_keys(multiple_data["Email ID"])

        # driver.find_element(By.ID, "exampleInputPassword1").send_keys("Password1")
        homepage.getPassword().send_keys("Password1")
        # To run with multiple dataset
        # homepage.getPassword().send_keys(multiple_data[2])
        # Using dict
        # homepage.getPassword().send_keys(multiple_data["Password"])

        # driver.find_element(By.ID, "exampleCheck1").click()
        homepage.clickCheckbox()

        # STATIC DROPDOWN --> Using 'Select' class and need to import it
        # options = Select(driver.find_element(By.ID, "exampleFormControlSelect1"))

        # options = Select(homepage.selectGender())
        # options.select_by_visible_text("Male")

        # More Optimize --> Create method in BaseClass and call it here
        self.selectOption(homepage.selectGender(), "Male")          # selectoption is Parent class method so access it with self keyword
        # To run with multiple dataset
        # self.selectOption(homepage.selectGender(), multiple_data[3])
        # Using dict
        # self.selectOption(homepage.selectGender(), multiple_data["Gender"])

        # driver.find_element(By.XPATH, "//input[@type='submit']").click()
        homepage.submitForm()

        # driver.find_element(By.ID, "inlineRadio2").click()
        homepage.employmentStatus()

        # 'text' is the method to grab the text present in the inspected element
        # message = driver.find_element(By.CLASS_NAME, "alert.alert-success.alert-dismissible").text
        message = homepage.successBannerMsg()
        print(message)
        assert "Success" in message
        self.driver.refresh()

# To run above test case with multiple datasets
# Passed multiple args as tuples in list, and it takes one tuple for single run
    @pytest.fixture(params=[("Rahul", "hello@gmail.com", "Password1", "Male"), ("Prachil", "hello123@gmail.com", "Password123", "Female")])
    def multiple_data(self, request):
        return request.param

# We can pass dict as args also
#     @pytest.fixture(params=[{"Firstname":"Rahul", "Email ID":"hello@gmail.com", "Password":"Password1", "Gender":"Male"}])
#     def multiple_data(self, request):
#         return request.param
    # Instead of passign whole data dict as params in fixture, we can store this all data in one variable under one class in another file.
    # and call that class variable using <class name>.<var name> in params=



# To load the data from excel file
    @pytest.fixture(params=HomePage.getExcelData("Testcase 2"))
    def excel_data(self, request):
        return request.param

    def test_form_usingExcel(self, excel_data):
        homepage = HomePage(self.driver)
        # Using dict
        homepage.getName().send_keys(excel_data["First Name"])
        homepage.getEmail().send_keys(excel_data["Email"])
        homepage.getPassword().send_keys(excel_data["Password"])
        homepage.clickCheckbox()
        self.selectOption(homepage.selectGender(), excel_data["Gender"])
        homepage.submitForm()
        homepage.employmentStatus()
        message = homepage.successBannerMsg()
        print(message)
        assert "Success" in message
        self.driver.refresh()