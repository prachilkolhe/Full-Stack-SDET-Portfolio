from PlaywrightFramework.PageObjects.orderhistory import OrderHistory


class DashboardPage:

    def __init__(self, page):
        self.page = page

    def got_to_orders(self):
        self.page.get_by_role("button", name="ORDERS").click()
        orderHistoryPage = OrderHistory(self.page)
        return orderHistoryPage                   # Created the object for next page instead of creating it in test file and returning it here