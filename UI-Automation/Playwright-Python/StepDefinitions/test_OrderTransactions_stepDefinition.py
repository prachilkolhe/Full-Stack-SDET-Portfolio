from pytest_bdd import given, when, then, parsers, scenarios

import pytest
from PlaywrightFramework.FWutils.FW_web_API import FWAPIutils
from PlaywrightFramework.PageObjects.login import Login

# To link the gherkin test with this step definitions, we need to pass the path of gherkin test feature file to scenarios
# This will go to given path and map the gherking step syntax to here in this file to execute it's code
scenarios('../Features/OrderTransactions.feature')

@pytest.fixture
def shared_data_fixture():
    return {}


# In feature file we pass the argument in <> while in step definition file we pass in {} and add parsers.parse in @given() annotation
@given(parsers.parse('Create an Order Using {Username} and {Password} Using API'))               # parser.parse will analyse the string and treat the string in {} as variable not normal string
def place_order_using_api(playwright, Username, Password, shared_data_fixture):
    user_credentials = {}
    user_credentials["userEmail"] = Username
    user_credentials["userpassword"] = Password
    utils = FWAPIutils()
    orderID = utils.create_order(playwright, user_credentials)          # Instead of passing the fixture file, we are passing the username and password by creating user_credentials dict runtime and adding both value from feature file example section input values
    shared_data_fixture["orderID_key"] = orderID                        # Storing the retrieved orderID in the dict of fixture method with key orderID_key


@given('The User is on Login Page')
def login_page(browserInstance_fixture, shared_data_fixture):
    login = Login(browserInstance_fixture)                              # browserInstance_fixture fixture method is declared in coftest.py file so it will be applicable here just by passing it as argument
    login.navigation()
    shared_data_fixture["login_page_obj_key"] = login                   # after execution shared_data_fixture method will append the login page object to empty dict of fixture method which can be used by other method where this login object is needed to navigate to other pages


@when(parsers.parse('I Login to Portal With {Username} and {Password}'))
def login_to_portal(Username, Password, shared_data_fixture):
    login = shared_data_fixture["login_page_obj_key"]                    # login object which we stored in login_page_obj_key key will be used here and store that in variable login, using this we will be able to navigate login portal page
    dashboard = login.sign_in(Username, Password)                        # login object is returning in login_page method only and its scope in that method only, so to access that in this method we created one shared_data_fixture fixture method
    shared_data_fixture["dashboard_page_key"] = dashboard                # Storing the retrieved dashboard page object in the dict of fixture method with key dashboard_page_key


@when('I Navigate to Orders Page')
def navigate_to_orders_page(browserInstance_fixture, shared_data_fixture):
    dashboard = shared_data_fixture["dashboard_page_key"]                # dashboard object which we stored in dashboard_page_key key will be used here and store that in variable dashboard, which will be used for further steps
    orderHistoryPage = dashboard.got_to_orders()
    shared_data_fixture["order_history_page_key"] = orderHistoryPage     # Storing the retrieved orderHistoryPage page object in the dict of fixture method with key order_history_page_key


@when('I Select the Order')
def select_order(browserInstance_fixture, shared_data_fixture):
    orderHistoryPage = shared_data_fixture["order_history_page_key"]             # orderHistoryPage object which we stored in order_history_page_key key will be used here and store that in variable orderHistoryPage, which will be used for further steps
    orderID = shared_data_fixture["orderID_key"]
    order_details_page = orderHistoryPage.view_order_history(orderID)            # Passing the value for orderID captured in place_order_using_api method using shared_data_fixture method using key orderID_key
    shared_data_fixture["order_details_page_key"] = order_details_page           # Storing the retrieved order_details_page page object in the dict of fixture method with key order_details_page_key


@then('I Verify Order Success Message is Successfully Displayed')
def verify_order_success_message(browserInstance_fixture, shared_data_fixture):
    order_details_page = shared_data_fixture["order_details_page_key"]                                      # order_details_page object which we stored in order_details_page_key key will be used here and store that in variable order_details_page, which will be used for further steps
    order_details_page.verify_order_success
