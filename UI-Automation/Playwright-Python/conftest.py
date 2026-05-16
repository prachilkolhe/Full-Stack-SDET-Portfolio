import pytest
from playwright.sync_api import Playwright


@pytest.fixture(scope="session")
def get_user_credentials_fixture(request):          # request is used to read global or local variable values, in pytest framework
    return request.param                                     # returns the param (parametrize annotation) used by the method for which this fixture is passed

@pytest.fixture
def browserInstance_fixture(playwright: Playwright):
    browser = playwright.chromium.launch(headless=False)
    context = browser.new_context()
    page = context.new_page()
    yield page                                                # This will return page object and will pause until further test file execution is done after completion it will execute next steps present here
    context.close()                                           # Setup and Teardown we manage in same method by adding yield keyword
    page.close()