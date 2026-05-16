import json
import pytest
from playwright.sync_api import Playwright, expect
from PlaywrightFramework.FWutils.FW_web_API import FWAPIutils
from PlaywrightFramework.PageObjects.login import Login

# Create a JSON data file contains user login credentials --> Create one utils method to extract that data and use in test
with open("PlaywrightFramework/data/creadentials.json") as f:
    test_data = json.load(f)
    user_credentials_list = test_data['login_credentials']

# parametrize will pull one by one value from user_credentials_list dataset and that value it will store in get_user_credentials_fixture variable and will execute the test
# indirect=True, you are telling Pytest: Hey, do not give this data to the test yet. Pass it to my fixture first, let the fixture do its job, and then give the fixture's result to the test
@pytest.mark.parametrize('get_user_credentials_fixture', user_credentials_list, indirect=True)                         # user_credentials_list is retrieving the list of dict from the JSON file, and its one by one value will be set in get_user_credentials_fixture variable using the get_user_credentials_fixture fixture so both variable name and fixture method should be same, number of param = number of test run
def test_framework_e2e_web_api(playwright: Playwright, get_user_credentials_fixture, browserInstance_fixture):                                  # Passed get_user_credentials_fixture, it's a fixture method which returns the request.param which will have the knowledge to pass that value to parameter means return value of fixture method will be stored in same name variable get_user_credentials_fixture that we are passing to this test, this is happening because we add parametrize annotation to this test
                                                                                                                       # test_framework_e2e_web_api method has fixture method get_user_credentials_fixture as argument, this fixture method will return the value for get_user_credentials_fixture variable which we pass in annotation argument, so that test will run on the basis of this parametrize params
    username = get_user_credentials_fixture["userEmail"]
    password = get_user_credentials_fixture["userpassword"]

    # Create order and grab order ID
    utils = FWAPIutils()
    orderID = utils.create_order(playwright, get_user_credentials_fixture)

    login = Login(browserInstance_fixture)             # Passing page object using fixture method which returns page object
    login.navigation()
    dashboard = login.sign_in(username, password)
    # dashboard = DashboardPage(page)       # Instead of creating page object of every class, created the object of next page class to in previous class and return that and capture that in line 44
    orderHistoryPage = dashboard.got_to_orders()
    order_details_page = orderHistoryPage.view_order_history(orderID)
    order_details_page.verify_order_success
