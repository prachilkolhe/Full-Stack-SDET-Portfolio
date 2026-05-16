print("Hello World")

print("----------------------------------------Data Types----------------------------------------")

a=5
print(a)

str="Mumbai"
print(str)

print("My City Name is "+ str)   # + operator only supports for the same datatype concatenation
# Concatenation for different data types
print("{} {}".format("My City Name is", str))
print("{} {}".format(str, a))

print(type(a))
print(type(str))

# List[] allows same and different data types values
values = [1, 2.00, "Prachil", 4, 5]
print(values[0])
print(values[-1])
print(values[1:3])
values.insert(3, "Kolhe")
print(values)
values.append("Pune")       # append adds values at end while insert add value at given index
print(values)
values[2] = "PRACHIL"       # Updating the list
del values[1]               # Deleting the value from the list
print(values)

# Tuple()
val = (1, 2.00, "Prachil", 4, 5)
print(val[1])
# val[2] = "PRACHIL"        # Throws as error
print(val)

# Dictionary
dict = {1:"First Name", "Last Name":2, "City":"Chopda"}
print(dict.get(1))
print(dict[1])
print(dict.get("City"))
print(dict["City"])

dict1 = {}
dict1["FirstName"] = "Prachil"
dict1["LastName"] = "Kolhe"
dict1["City"] = "Chopda"
print(dict1)

print("----------------------------------------Loops----------------------------------------")

greetings = "Good Morning"
if greetings == "Morning":
    print("if condition got passed")
else:
    print("if condition got failed")
print("if else loop got executed")


objects = [1, 2, 3, 4, 5]
for i in objects:
    print(i*2)

sum=0
for j in range(1,6):
    sum=sum+j
print(sum)

for k in range(1, 10, 2):       # Range is 1 to 10 means 1 to 9 values and will jump by 2 index ie, 1,3,5,7,9
    print(k)

for m in range(10):             # By default range will start from 0 and till 10-1=9
    print(m)

it = 4
while it > 1:                  # Loop executes until condition finds false
    if it == 10:
        continue               # If continue condition matched then it skips all further steps and starts with first iteration
    if it == 3:
        break
    print(it)
    it = it - 1
print("while loop execution completed")

print("----------------------------------------Functions----------------------------------------")
# Function declaration
def greetMe(name):
    print("Good Morning " + name)


# Function calling
greetMe("Prachil")


def AddIntegers(a, b):
    return a + b


print(AddIntegers(3, 5))

print("--------------------------------Strings and it's functions--------------------------------")
str1 = "PrachilKolhe.google.com"
str2 = "Chopda"
str3 = "Kolhe"
str4 = " Good "

print(str[2])
print(str[0:7])
print("{} {}".format(str1, str2))
print(str1 + str2)
print(str1.__contains__(str3))
print(str3 in str2)
print(str1.split("."))
print(str4)
print(str4.strip())
print(str4.lstrip())
print(str4.rstrip())


print("-----------------------------------Read Write Text File-----------------------------------")
file = open('Notes.txt')            # Provide file path as a argument
# print(file.read())
# print(file.read(10))                # Reading and printing only 10 chars from the file
# print(file.readline())              # Reading file line by line
# print(file.readlines())               # Reading file line by line and will return list of every line
## Print all lines present in file using readline() method
# line = file.readline()
# while line !="":
#     print(line)
#     line = file.readline()
#
# file.close()


with open('TestingText.txt', 'r') as reader:        # Another way t open the file, no need to close this it handles internally
      content = reader.readlines()                  # r for reading and w for writing
      reversed(content)
      with open('TestingText.txt', 'w') as writer:
          for line in reversed(content):
              writer.write(line)

