# Example of log of an error
# 2024-07-12 12:20:14, 718 : ERROR : <testcasename>: Fatal error in submitting credit card payment on step 4. cannot continue

import logging

def test_logging_method():
    filehandle_obj = logging.FileHandler('logfilename.log')         # Here we passed the file name where these all logs will stored and need to create object of file handle method
    format_obj = logging.Formatter("%(asctime)s :%(levelname)s :%(name)s :%(message)s")
    # When we log the message we need a format in which format it should print
    # % -- used to print and will take value at run time error
    # s -- used to take given parameter as string so that concatenation will take place successfully
    # asctime -- its standard keyword in python which will print time in log
    # levelname -- it is type of log like debug, error, info, warning, critical -- it will take level from logger.debug or logger.error or logger.critical
    # name -- it take the name of testcase at which we are logging the log
    # message -- what message we have saved for that level that will print here

    logger = logging.getLogger(__name__)                            # __name__ -- it will print the name of testcase at which we are logging a message
    logger.addHandler(filehandle_obj)                               # Here logger obj get the file in which logs will be print
    filehandle_obj.setFormatter(format_obj)                         # setting the format for the given file

    # it will print info, warning, error and critical log, it won't print debug log
    # if you set it to critical then only critical log will print
    logger.setLevel(logging.INFO)                                   # Leveling is used to print he log from which leg level. Here its setted as INFO then it will print all the log excluding the log which are coming before info level -- it depends on hierarchy of level

    # Hierarchy of log levels with there messages
    # logger.levelname("message") -- this will used in format -- Ln.7
    logger.debug("Debug message will print here")
    logger.info("Informative message will print here")
    logger.warning("Warning message will print here")
    logger.error("Error message will print here")
    logger.critical("Critical message will print here")