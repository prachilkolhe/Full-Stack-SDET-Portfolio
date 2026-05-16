number1 = int(input("Enter first number: "))      #input should be outside of the function
number2 = int(input("Enter second number: "))

def addition(number1, number2):                   #name the function
   print(number1 - number2)

addition(number1, number2)                        #dont forgot to call the function

#####################################################################################
def myworld(cname):
   print("Hello", cname)

myworld("Prasad")

######################################################################################
#fibonocci number series
def fib(n):
   a,b = 0,1
   while a<n:
      a,b=b,a+b
      print(a)

fib(30)

#######################################################################################