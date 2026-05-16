import itertools

def calc():
    print("Welcome to My Repetative Calculator")

    from itertools import cycle
    for i in itertools.repeat(1):           #to repeat the cycle without terminating
                                            #in "()" we need put any object here we put 1

        select = int(input("Enter the number from 1,2,3,4,0 to choose add, sub, multiply, div, to exit from calculator ="))

        #if select != 0:
        if select in [1,2,3,4]:                 #we place the string of int here
            num1 = int(input("Enter the first number : "))
            num2 = int(input("Enter the second number : "))

        else:
            print("Enter the valid number from [1,2,3,4] or enter 0 to exit")


        if select == 1:
            print("The addition of", num1, "and", num2,"is",num1 + num2)

        elif select == 2:
            print("The substraction of",num1,"and",num2,"is",num1-num2)

        elif select == 3:
            print("The multiplication of",num1,"and",num2,"is",num1*num2)

        elif select == 4:
            print("The division of",num1,"and",num2,"is",num1/num2)

        elif select == 0:
            print("Thank you for using me!")
            #break       (if i put break here it will terminate the cycle)


calc()