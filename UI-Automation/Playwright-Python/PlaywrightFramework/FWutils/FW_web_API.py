from playwright.sync_api import Playwright

order_payload = {"orders":[{"country":"India","productOrderedId":"6960eac0c941646b7a8b3e68"}]}
class FWAPIutils:

    def get_login_token(self, playwright: Playwright, get_user_credentials_fixture):
        user_mail = get_user_credentials_fixture['userEmail']
        user_pass = get_user_credentials_fixture['userpassword']
        api_request_context = playwright.request.new_context(base_url="https://rahulshettyacademy.com")         # For every new API request new_context() is required like we do in browser launch
        response = api_request_context.post(
                        "/api/ecom/auth/login",             # Base URL
                        data = {"userEmail":user_mail,"userPassword":user_pass},
                        headers={"Content-Type": "application/json"}            # Not mandatory but safe to pass

        )
        assert response.ok             # Status code 200 is verified by response.ok
        token = response.json().get("token")        # Fetching token value using key value dict concept
        return token


    def create_order(self, playwright: Playwright, get_user_credentials_fixture):
        token = self.get_login_token(playwright, get_user_credentials_fixture)                # Calling the method of same class using self. keyword and storing it's return value in token obj so to give the knowledge to token obj of current method
        api_request_context = playwright.request.new_context(base_url="https://rahulshettyacademy.com")
        response = api_request_context.post(
                        "/api/ecom/order/create-order",
                        data = order_payload,
                        headers = {"Authorization": token, "Content-Type": "application/json"}
        )
        print(response.json())
        orderId = response.json().get("orders")[0]
        return orderId


