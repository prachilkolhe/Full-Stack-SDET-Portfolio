import inspect
import logging

class BaseClass():
    def test_logger(self):
        filehandle_obj = logging.FileHandler('logfilename.log')
        format_obj = logging.Formatter("%(asctime)s :%(levelname)s :%(name)s :%(message)s")
        logger = logging.getLogger(__name__)
        # logger_name = inspect.stack()[1][3]           # in above code, it is printing the file name of base class in log
        # logger = logging.getLogger(logger_name)       #  but I want the file name should be the file which I am running
                                                        # --> Need to add logger_name = inspect.stack()[1][3] in base class

        logger.addHandler(filehandle_obj)
        filehandle_obj.setFormatter(format_obj)
        logger.setLevel(logging.INFO)               # Set level to info so it will not print debug level's log
        return logger

# In log the file name is disaplying is the file where this base class is present but in logs I want the file name where this class is used