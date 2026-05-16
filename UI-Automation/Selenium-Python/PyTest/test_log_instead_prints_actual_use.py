import inspect

import pytest
from PyTest.test_log_instead_prints import BaseClass


@pytest.mark.usefixtures("data_loading")
class TestApplication(BaseClass):
    def test_load_logindata(self, data_loading):
        log = self.test_logger()
        log.info(data_loading[0])
        log.info(data_loading[2])
        print(data_loading[0])
        print(data_loading[2])

# in above code, it is printing the file name of base class in log
# but I want the file name should be the file which I am running
#         --> Need to add logger_name = inspect.stack()[1][3] in base class
