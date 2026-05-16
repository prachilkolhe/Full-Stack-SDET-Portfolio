import pytest


# Fixture method with scope="function" will execute before every test, need to pass as an arg to test function
@pytest.fixture(scope="function")
def credentials():
    print("Providing the Login Credentials")


# Fixture method with scope="module" will execute only once for entire suite/file, need to pass as an arg to test function
# When we write function under a class, then we give scope="class" which runs only single time for entire class
# @pytest.fixture(scope="function") -> run for every function
# @pytest.fixture(scope="module") -> run for single time for single file/suite
# @pytest.fixture(scope="session") -> run for single time for entire execution, so when we run multiple file then this will run single time only
# @pytest.mark.skip -> skips the test in execution
# @pytest.mark.<tag_name> -> Tagging the test like smoke, regression
@pytest.fixture(scope="module")
def suite_setup():
    print("Activating Suite Setup Step")


def test_access():
    print("Executing Access Step")


def test_login(suite_setup):
    print("Executing Login Step")


def test_toast_message(suite_setup):
    print("Executing Toast Message Step")


def test_navigation(credentials):
    print("Executing Navigation Step")


def test_home_page(credentials):
    print("Executing Home Page Step")


def test_success(conftest_fixture1):
    print("Executing Success Method for conftest Fixture")


def test_loading(conftest_fixture1):
    print("Executing Loading Method for conftest Fixture")


def test_failed(conftest_fixture2):
    print("Executing Failed Method for conftest Fixture")


def test_timeout(conftest_fixture2):
    print("Executing Timeout Method for conftest Fixture")


@pytest.mark.skip
def test_skipping():
    print("Skipping this Test Using skip Annotation")


@pytest.mark.smoke
def test_smoke():
    print("Running this Test as Smoke Test")


@pytest.mark.regresion
def test_regression():
    print("Running this Test as Regression Test")
# -----------------------------return value, multiple fixture args, yield keyword-----------------------------


@pytest.fixture(scope="function")
def prework():
    print("Executing Pre Work Method")
    return "Pass"


@pytest.fixture(scope="function")
def postwork():
    print("Executing Post Work Method")
    yield
    print("Executing yeild Content")


def test_method(prework, postwork):
    print("Executing Timeout Method for conftest Fixture")
    assert prework == "Pass"

# In above test --> we can pass multiple fixture to single test
#               --> we can fetch the return value of fixture method to use in test
#               --> yeild keyword is use for the post execution or teardown purpose like logging out/cookie or cache clearing
#               --> Test will first execute prework fixture method and will store the return value and
#               --> then will execute postwork fixture method and execute everything till yeild keyword and will stop at yeild keyword
#               --> then will go to the test method and execute test method and after completion it will execute steps after yeild keyword



