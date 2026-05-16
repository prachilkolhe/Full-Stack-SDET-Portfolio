# Use of fixture method by declaring it in conftest file
def test_login_page(test_set_login_credentials):
    print("For this test case, I need to call fixture method from conftest file to do some pre-requisites, by passing it as arg")
