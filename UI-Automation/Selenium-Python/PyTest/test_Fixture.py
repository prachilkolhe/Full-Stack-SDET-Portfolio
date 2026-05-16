import pytest

# For the specific test case if you want to do some pre-requisite then we use fixture method
# The test method which do steps of pre-requisite we tagged them as @pytest.fixture()
# And for the method, pre-requisite is needed we give fixture method as arg for that method
# If you want do some post step after test case is executed, we use 'yield'
# In the same prerequite fixture method we mentioned after yeild statement that will execute when your required text case is execute


@pytest.fixture()
def prerequisite_setup():
    print("For the test case if prerequisite is needed then for that test case, I will execute first then that test method will execute")
    yield
    print("I will execute at last when the required test case is executed successfully")


# So for login_page test method I need to do some pre setup, so I'm calling the method which do steps of pre-requisite and pass it as arg
def test_login_page(prerequisite_setup):
    print("For this test case, I need to do pre-requisite so I called prerequisite first")