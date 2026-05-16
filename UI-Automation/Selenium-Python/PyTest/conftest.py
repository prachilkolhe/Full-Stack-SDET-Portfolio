import pytest


# When the fixture method is used in multiple file then we declare it in conftest file
# The fixture method declared in this file will be available to all the test cases
# For every fixture method @pytest.fixture() tag is mandatory
# Fixture method name can be anything, it not mandatory to be started with test_
@pytest.fixture()
def test_set_login_credentials():
    print("This is fixture method, which will execute first when its being called")
    yield
    print("This the yield part which will execute when the required test acse is passed successfully")

#By puting the scope of fixture method to 'class' --> whenever this method is called up then pre part will run at once at intial of run
# and then all test methods will run then post ie. yield will run
@pytest.fixture(scope="class")
def test_application2_details():
    print("This is pre part of fixture method")
    yield
    print("This is post part of fixture method")

@pytest.fixture()
def data_loading():
    print("User profile's data being loading")
    return ["Rahul", "Shetty", "rahulshettyacademy.com"]

# This fixture method is used to run the test case with multiple data sets parameters
# @pytest.fixture(params=["Chrome", "Firefox", "MD Edge"])            # here we have passed the multiple param in str as list, so with each param test case will run
@pytest.fixture(params=[("Chrome", "Username", "Password"), ("Firefox", "Time of Execution"), "Edge"])              # Also you pass multiple parametrs in single parameter also
def crossBrowser(request):                                          # request is nothing but instance/object of fixture, which will stored the parameter value one by one
    return request.param
