from playwright.sync_api import Page, expect, Playwright  # to get the auto-suggestion for methods


def test_pw_basics(playwright):
    browser = playwright.chromium.launch(headless=False)
    context = browser.new_context()       # opened browser will remain in this context
    page = context.new_page()
    page.goto("https://www.rahulshettyacademy.com")


# Assumption: Chrome browser, Single Context, Headless mode
def test_launch_shortcut(page: Page):               # By importing above (from playwright.sync_api import Page) and (page: Page) in function arg means creating page obj for Page class we imported above, gives us auto-suggestion for methods
    page.goto("https://www.rahulshettyacademy.com")


def test_launch_firefox(playwright: Playwright):            # Not required but just to get auto-suggestion, we imported Playwright class and created a obj playwright for that class, playwright: Playwright
    browser = playwright.firefox.launch(headless=False)
    context = browser.new_context()
    page = context.new_page()
    page.goto("https://www.rahulshettyacademy.com")


def test_core_locators(page: Page):
    page.goto("https://rahulshettyacademy.com/loginpagePractise/")
    page.get_by_label("Username:").fill("rahulshettyacademy")
    page.get_by_label("Password:").fill("Learning@830$3mK21")                # get_by_label only work when element has <label> attribute and its input filed ie, <input> should be embedded in <label> attribute only, or either value of the 'for' of the <label> attribute should be same to the value of 'id' of the <input> attribute
    page.get_by_role("combobox").select_option("teach")                     # In web development, dropdown element is referred as combobox in playwright
    page.locator("#terms").check()                                          # If you dont want to use inbuilt method created, then use .locator and pass your locator inside and perform operation
    page.get_by_role("link", name="terms and conditions").click()      # get_by_role is applicable for the some attribute as mentioned in hover tooltip, that only we pass as argument
    page.get_by_role("button", name="Sign In").click()                 # and to uniquely identify that attribute we pass more argument like name
    # Assertion for incorrect credentials
    expect(page.get_by_text("Incorrect username/password.")).to_be_visible()
    page.get_by_label("Password:").fill("Learning@830$3mK2")
    page.get_by_role("button", name="Sign In").click()
