# Read the text file and store all the lines in list format
# Reverse the list
# Write the list back to the same txt file

# To open the txt file in read only mode --> file.open(<file_path>, 'r') --> 'r' indicates that the file is opened in read only mode
# To open the txt file in edit mode --> file.open(<file_path>, 'w') --> 'w' indicates that the file is opened in edit mode

#Without using open() and close() method to open and close the txt file use
with open('/Users/pkolhe/PycharmProjects/PythonSelenium/Test_Text.txt', 'r') as read_file:
    content = read_file.readlines()
    # print(content)                      #['animal\n', 'ball\n', 'cat\n', 'dog\n', 'elephant\n', 'fish\n', 'goat\n']
    # reversed(content)                   #reveresed() --> method is used to reversed the given string
    with open('/Users/pkolhe/PycharmProjects/PythonSelenium/Test_Text.txt', 'w') as write_file:
        for line in reversed(content):
            write_file.write(line)

