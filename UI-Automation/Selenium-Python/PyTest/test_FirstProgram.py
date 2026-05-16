# --> Any pytest file's name should be start with 'test_'
# --> In Pytest, every code of line should be written in a function -- That function we called in pytest as 'Pytest Method' -- And every
#     pytest method name should start with test_
import pytest

# When you want to run test case by using some tag like 'smoke'
@pytest.mark.smoke
def test_first_program():
    print("Hello")

# When you want to run the test case but don't want to show in report is it paased or failed
# This test case's status will be always XFails
@pytest.mark.xfail
def test_greetings():
    print("Good Morning")