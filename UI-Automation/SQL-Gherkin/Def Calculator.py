#def add(num1, num2):
    #return(num1+num2)         #return means what you want to do with num1 and num2
#def sub(num1, num2):
    #return(num1-num2)
#def multiply(num1, num2):
    #return(num1*num2)
#def div(num1, num2):
    #return(num1/num2)

def calc():
    print("Welcome to My Calculator")

    for i in range(0,5):              #range means how many times the 'for' loop has to execute.
                                      #it will execute for 5 times i.e. 6-1 time
                                      #range(6)= it will run for 6 times
                                      #range(1,6)= it will run for 5 times
                                      #range(0,5)= it will run for 5 times
                                      #why "i" only= because we are taking the input in the form of int
        select = int(input("Enter the number from 1,2,3,4,0 to choose add, sub, multiply, div, to exit from calculator ="))
#/n is for to break the line
        if select in [1,2,3,4]:
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
            break                   #break= terminates the loop



calc()                      #dont forgot to call the function at last!
#print(calc())              #or we can used this.....call the function using print func.