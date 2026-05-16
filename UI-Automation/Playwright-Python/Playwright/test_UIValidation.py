import time
from pydoc import text
from playwright.sync_api import Playwright, Page, expect


def test_UI_validation_dynamic(playwright: Playwright, page: Page):
    page.goto("https://rahulshettyacademy.com/loginpagePractise/")
    page.get_by_label("Username:").fill("rahulshettyacademy")
    page.get_by_label("Password:").fill("Learning@830$3mK21")                                                # get_by_label only work when element has <label> attribute and its input filed ie, <input> should be embedded in <label> attribute only, or either value of the 'for' of the <label> attribute should be same to the value of 'id' of the <input> attribute
    page.get_by_role("combobox").select_option("teach")                      # In web development, dropdown element is referred as combobox in playwright
    page.locator("#terms").check()                                           # If you dont want to use inbuilt method created, then use .locator and pass your locator inside and perform operation
    page.get_by_role("link", name="terms and conditions").click()       # get_by_role is applicable for the some attribute as mentioned in hover tooltip, that only we pass as argument
    page.get_by_role("button", name="Sign In").click()                  # and to uniquely identify that attribute we pass more argument like name
    # Assertion for incorrect credentials
    expect(page.get_by_text("Incorrect username/password.")).to_be_visible()
    page.get_by_label("Password:").fill("Learning@830$3mK2")
    page.get_by_role("button", name="Sign In").click()
    product1 = page.locator("app-card").filter(has_text="iphone X")          # .filter method will go through all the element found by locator and comparing with given text
    product1.get_by_role("button").click()                                                                 # page.locator() will find the element's locator in whole page, while product1.locator() will the find the element locator within that product1 locator only
    product2 = page.locator("app-card").filter(has_text="Nokia Edge")
    product2.get_by_role("button").click()
    page.get_by_text("Checkout").click()
    expect(page.locator("//div[contains(@class, 'media-body')]")).to_have_count(2)


def test_handle_child_browser_windows(page: Page):
    page.goto("https://rahulshettyacademy.com/loginpagePractise/")
    with page.expect_popup() as new_page_info:                              # .expect_popup() means a child page will be appeared on next operation, and giving this knowledge to new_page_info, .expect_popup() this will triggered only when popup will appear, if not open on first step then will check for next further steps
        page.locator("//a[@class='blinkingText' and contains(text(), 'Interview')]").click()                  # This will trigger the new sub/child page after clicking
        child_page = new_page_info.value                                    # Passing the value of nnew_page_info to child_page, which will work as object for child_page
        text = child_page.locator("//p[@class='im-para red']").text_content()
        print("Whole Text is: ", text)
        subtext = text.split("at")
        raw_email = subtext[1].split("with")
        req_email = raw_email[0].strip()
        print("Email is: ", req_email)
        assert req_email == "mentor@rahulshettyacademy.com"


def test_ui_checks(page: Page):
    page.goto("https://rahulshettyacademy.com/AutomationPractice/")
    expect(page.get_by_placeholder("Hide/Show Example")).to_be_visible()
    page.get_by_role("button", name="Hide").click()
    expect(page.get_by_placeholder("Hide/Show Example")).not_to_be_visible()
    page.get_by_role("button", name="Show").click()
    expect(page.get_by_placeholder("Hide/Show Example")).to_be_visible()
    page.get_by_placeholder("Hide/Show Example").fill("Prachil Kolhe")


def test_handle_alerts_popup(page: Page):
    page.goto("https://rahulshettyacademy.com/AutomationPractice/")
    page.on("dialog", lambda dialog:dialog.accept())               # The second arg for the .on method is to be function, so we dont want to write a new function for small
                                                                                   # That function we can declare in single line, called as 'Anonymous function' and declare using 'lambda' keyword, basically it's a listener
    page.get_by_role("button", name="Confirm").click()
    page.get_by_role("button", name="Alert").click()
    page.on("dialog", lambda dialog: dialog.accept())
    page.get_by_role("button", name="Confirm").click()
    page.on("dialog", lambda dialog: dialog.dismiss())
    page.get_by_role("button", name="Alert").click()


def test_handle_iframes(page: Page):
    page.goto("https://rahulshettyacademy.com/AutomationPractice/")
    iframe = page.frame_locator("#courses-iframe")
    iframe.get_by_role("link", name="All Access plan").click()
    expect(iframe.locator("body")).to_contain_text("Happy Subscibers!")             # Passed body as locator, so it will go through all the body content of html page and will check of required text


def test_web_table_elements(page: Page):
    page.goto("https://rahulshettyacademy.com/seleniumPractise/#/offers")
    for index in range(page.locator("//th").count()):
        if page.locator("//th").nth(index).filter(has_text="Price").count()>0:
            price_col_value = index
            print(f"Index of Price Column is: {price_col_value}")
            break

    rice_row = page.locator("//tr").filter(has_text="Rice")
    expect(rice_row.locator(" td").nth(price_col_value)).to_have_text("37")


def test_handle_hover_tooltip(page: Page):
    page.goto("https://rahulshettyacademy.com/AutomationPractice/")
    page.get_by_role("button", name="Mouse Hover").hover()
    time.sleep(5)
    page.get_by_role("link", name="Top").click()
