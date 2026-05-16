import selenium
from selenium import webdriver

print("Hello World")
a=10
print("My Roll No. is",a)

#format method --> To print different datatypes --> Concatenation of different datatypes
print("{} {}".format("My Roll No. is", a))
c= "ABC"
print(type(a))
print(type(c))
#print(a+ "is concatenated with" + c) --> This concatenation cannot be happened, two different datatypes ()for single datatype it can worked --> Use format method
print("{} {} {}".format(a, "is concatenated with", c))

#Complex datatype in Python
real = 100
imaginary = 10
z = complex(real, imaginary)
print("The complex number is", z)

#List
List1= [1, 2, 3,"Prachi", 12.10]
print(type(List1))
print(List1[1])
print(List1[-1])
print(List1[1:4]) #Last index is exclusive
print(len(List1))
List1.insert(3,"India")
print(List1)
List1.append("End")
print(List1)
List1[1]= "Pune" #Updating
del List1[0] #Delete
print(List1)

#Tuple
tuple= (1, 2, 3, "Mumbai", "Delhi", 10.33)
print(tuple[1])
#tuple[2]= "Rahul" --> Doesnot support for the updation

#Disctionary
dic= {1:"First Name", 2:"Last Name", "Age":24, "Company":"Medidata"}
print(dic[1]) #1 is the key here not the index
print(dic["Age"])

#How to create dictionary dynamically at run time and add data to them
dic1= {}
dic1["First Name"] = "Rahul"
dic1["Last Name"] = "Patil"
dic1[1] = 123
print(dic1)

#Strings
str = "RahulShettyacademy.com"
str1 = "consulting firm"
str2 = "RahulShetty"

print(str[1])
print(str[0:5])                     #0 is inclusive and 5 is exclusive
print(str + str1)                   #string concatenation
print(str2 in str)                  #is given string is present or not?, case sensetive --> bollean value

#Spliting of string
strvar = str.split(".")
print(strvar)
print(strvar[0])

#Trimming of string
str4= "great "
print(str4.strip())                  #removes all the white spaces from the string
str5 = " spacestring "
print(str5.lstrip())                 #removes only whitespaces present on the left side of string
print(str5.rstrip())                 #removes only whitespaces present on the right side of string
print(str5.strip())                  #removes all the whitespaces present in the string



