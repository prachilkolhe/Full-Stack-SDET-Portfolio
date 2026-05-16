import pytest
from selenium import webdriver
from selenium.webdriver.chrome.service import Service


@pytest.fixture(scope="class")
def setupBrowser(request):
    service = Service("/Users/pkolhe/PycharmProjects/PythonSelenium/drivers/chromedriver")
    driver = webdriver.Chrome(service=service)
    driver.get("https://rahulshettyacademy.com/angularpractice")
    driver.maximize_window()
    request.cls.driver = driver             # whichever the class which is using this fixture, if that class has 'driver'then that class will use the driver of this fixture method
    yield
    driver.quit()




