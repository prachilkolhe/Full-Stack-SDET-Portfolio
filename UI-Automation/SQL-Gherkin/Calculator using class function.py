import itertools


class calculate():
    def __init__(self):                         #init is constructor function
        print("Welcome to My Repetative Calculator")

    def myadd(self,num1,num2):
        return (num1 + num2)

    def mysub(self,num1,num2):
        return(num1-num2)

    def mymult(self,num1,num2):
        return(num1*num2)

    def mydiv(self,num1,num2):
        return(num1/num2)

    def hi(self):
        return "hello prachil"

    def calc(self):
        from itertools import cycle
        #for i in range (1,5)

        for i in range(1,5):

            select = int(input("Enter the number from 1,2,3,4,0 to choose add, sub, multiply, div, to exit from calculator ="))

        #if select != 0:
            if select in [1,2,3,4]:
                num1 = int(input("Enter the first number : "))
                num2 = int(input("Enter the second number : "))

            else:
                print("Enter the valid number from [1,2,3,4] or enter 0 to exit")


            if select == 1:
                print("Performing addition of", num1,"and", num2)
                print(self.myadd(num1,num2))

            elif select == 2:
                print("Performing substraction of",num1,"and",num2)
                print(self.mysub(num1,num2))

            elif select == 3:
                print("Performing the multiplication of",num1,"and",num2)
                print(self.mymult(num1,num2))

            elif select == 4:
                print("Performing multiplication of",num1,"and",num2)
                print(self.mydiv(num1,num2))

            elif select == 0:
                print("Thank you for using me!")
                break       #(if i put break here it will terminate the cycle)


mycalc = calculate()             #we assign the calculate function to as mycalc
print(mycalc.myadd(10,20))       #now I'm calling the function myadd of mycalc and giving input to num1 and num2 as 10 and 20
print(mycalc.calc())             #now it will going to calc function then asking for input and follow the loop
print(mycalc.hi())               ##now it is calling the function hi so it will print the return value of hi function
#print(calculate().hi())
