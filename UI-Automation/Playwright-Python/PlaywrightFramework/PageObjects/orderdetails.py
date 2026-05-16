from playwright.sync_api import expect


class OrderDetailsPage():
    def __init__(self, page):
        self.page = page

    def verify_order_success(self):
        expect(self.page.locator("//div/p[@class='tagline']")).to_contain_text("Thank you for Shopping With Us")
