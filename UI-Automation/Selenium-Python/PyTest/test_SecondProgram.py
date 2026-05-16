import pytest

# Every test method's name should start with test_
# If any test method's is not with test_ then it will not be included in pytest execution
def test_second_program():
    mssg = "Hello"
    assert mssg == "Hi" , "two strings does not matched"        # When assertion condition is not matched, then message after ',' will be print

# 'skip' is the tag which use to skip the pytest file from execution
@pytest.mark.smoke
@pytest.mark.skip
def test_third_program():
    a = 4
    b = 6
    assert a+2 == 6, "Addition does not matched"