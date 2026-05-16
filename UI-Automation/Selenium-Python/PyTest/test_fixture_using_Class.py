# When a single test files contains multiple test methods which all required the same fixture method
# then we create one class of all of those test method
# mark the tag to that class '@pytest.mark.usefixtures(<fixture_method_name>)'
import pytest


# In this, it is class of different test methods which requires the same fixture method
# So for every test method, fixture method will called and pre and post part of fixture method will run
@pytest.mark.usefixtures("test_set_login_credentials")      #this test_set_login_credential is the fixture method declared in conftest file
class TestApplication:                                      #class name should be start with 'Test'

    def test_page1_details(self):           #self paramater is must
        print("This is first page of application after login")

    def test_page2_details(self):
        print("This is second page")

    def test_page3_details(self):
        print("This is third page")

    def test_page4_details(self):
        print("This is last page of application")


# In above code, for every test method, pre and post ie. yield part of fixture method is executing seperatly
# Now, if you want to execute the pre part of fixture method only once at the start of run and yield part at the end of execution of test methods
# So we in conftest file, we maintained the scope of 'test_application2_details' as scope="class"

@pytest.mark.usefixtures("test_application2_details")
class TestApplication2:

    def test_page5_details(self):
        print("This is first page of application after login")

    def test_page6_details(self):
        print("This is second page")

    def test_page7_details(self):
        print("This is third page")

    def test_page8_details(self):
        print("This is last page of application")
