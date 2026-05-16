#opening the text file either using absolute path or directly by file name (when file is in same folder)
file = open('/Users/pkolhe/PycharmProjects/PythonSelenium/Test_Text.txt')
# file = open('Test_Text.txt')     #if text file is present in same folder

# file.read()                         #this method is used to read whole text file
# print(file.read())

# print(file.read(8))                 #2 is the no of character should read
                                      #it takes one character value to go to next line

# print(file.readline())                #reads first line of text file
# print(file.readline())                #reads second line of text file


# Print all the content line by line using readline method
#In this example--> Reading the line by line and prints line seperately
# line = file.readline()                 #this will store the first line of file
# while line != "":                      #this loop will break when line is blank
#     print(line)                        #will print the given first line
#     line = file.readline()             #will go to the next line of file

#In this example --> Reads all the lines at once and prints all the line in list format
lines = file.readlines()
print(lines)
for line in lines:                    #simple than while loop
    print(line)

file.close()                          #close the current text file to avoid currupt of file


#In this file we open and then close the file using open() and close() method --> Instead of using this, use -->
# with open('/Users/pkolhe/PycharmProjects/PythonSelenium/Test_Text.txt') as file:
#here file is object which stores the Test_Text.txt file