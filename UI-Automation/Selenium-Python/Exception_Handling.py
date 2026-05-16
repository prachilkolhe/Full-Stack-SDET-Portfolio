ItemInCart = 0

#required Condition --> I want only 2 item in the cart
#raise Exception method
# if ItemInCart != 2:
#     raise Exception("Items in cart does not matches")

#assert method
#In assert method, condition should be always true, when it gets false it raises assertion error
# assert(ItemInCart == 2)


#try-except(catch) method
#as 'dummyxyz.txt' file doesnot exists so it will throw an error and stop the further execution, so we put it in try block
#Even if it fails it will go to the except block and will display the reason of failure and further test suit execution will go on
try:
    with open('/Users/pkolhe/PycharmProjects/PythonSelenium/dummyxyz.txt', 'r') as read_file:
    # with open('/Users/pkolhe/PycharmProjects/PythonSelenium/Test_Text.txt', 'r') as read_file:    #as given file path exist so it will read file successfully and won't go to the except block
        read_file.read()

except:
    print("'dummyxyz.txt' file doesnot exist in directory, so executed the except block")

#Here you are displaying your own customized error message to user but ff you don't want to
#display your own customized failure message -- use 'Exception' keyword, this key has it's own message given by python
try:
    with open('/Users/pkolhe/PycharmProjects/PythonSelenium/dummyabc.txt') as file2:
        file2.read()

except Exception as e:
    print(e)

finally:
    print("This finally block executes always, no matter we get error in try block or not, it executes always")