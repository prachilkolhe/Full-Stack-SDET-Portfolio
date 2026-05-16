from PlaywrightFramework.PageObjects.dashboard import DashboardPage


class Login:

    def __init__(self, page):
        self.page = page

    def navigation(self):
        self.page.goto("https://rahulshettyacademy.com/client")             # page object passed from test file is pass to constructor method as well so that it will be accessible by any method of this class using self keyword

    def sign_in(self, userEmail, userPassword):
        self.page.get_by_placeholder("email@example.com").fill(userEmail)  # Its taking the email from the dict of list
        self.page.get_by_placeholder("enter your passsword").fill(userPassword)
        self.page.get_by_role("button", name="Login").click()
        dashboard = DashboardPage(self.page)                                # Instead of creating page object of every class, we can create in previous class only and will return that as part of this method
        return dashboard