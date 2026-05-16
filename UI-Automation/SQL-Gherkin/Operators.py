num1 = 40
num2= 3
#Arithmatic Operators

print(num1/num2)
print(num1+num2)
print(num1-num2)
print(num1*num2)
print(num1//num2)
print(num1**num2)      #i.e. 40 raise to 3
print(num1%num2)
print((num1/num2)-(num1//num2))     #if i want only nos. before decimal point

#Comparision Operators
print(num1 == num2)       #equal to
print(num1 != num2)       #not equal to
print(num1 > num2)        #greater than
print(num1 < num2)        #less than
print(num1 >= num2)       #grater than and equal to
print(num1 <= num2)       #less than and equal to

#Assignment Operator
num1 = num2
print(num1)               #Assign value to variable

num1 += num2              #num1 + num2 this valuue will assign to num1
print(num1)

num1 -= num2
print(num1)

num1 *= num2
print(num1)

num1 /= num2
print(num1)

num1 %= num2               #3 divided by 3 so remainder will be zero
print(num1)

num3 = 6
num4 = 5
num3 //= num4
print(num3)                #6 divided by 5 = 1.2 so using //= it will show the int before the decimal pt. i.e. 1

num3 **= num4              #now num3 is 1 so 1 raise to 4 = 1
print(num3)


num = 14
for i in range (5):
    num //= 3
    print(num)



#Logial Operators
numx = 20
numy = 7
if (numx % 2) == 0:
    print("It is an even number")

else:
    print("It is an odd number")


i = int(input("Enter the number =="))
if (i%2 == 0):
        print("It is an even number")
else:
        print("It is an odd number")



