import pytest


# Here, before execution of this test method I want to load data which I stored in fixture method in conftest file
@pytest.mark.usefixtures("data_loading")
class TestApplication:
    def test_load_logindata(self, data_loading):      #data_loading arg is imp as we are returning data from that
        print(data_loading[0])
        print(data_loading[2])
        data_loading.append("Prachil")
        print(data_loading)
