#Self keyword is mandatory to call the variable name into the method

class Dog:
    #attributes of class
    #attr1 and attr2 are class variables, should be called either using class name or self parameter
    attr1 = "mammal"
    attr2 = "dog"

    #method in class
    def fun(self):                     #self variable is mandatory when you create method inside the class
        print("I'm a", self.attr1)
        print("I'm a", self.attr2)

# Object instantiation, calling a class as a variable is called as 'Object of Class'
Rodger = Dog() #here Rodger is object of class

# Accessing class attributes
# and method through objects
print(Rodger.attr1)
Rodger.fun()

#***********************************************************************************************************************************************

#constructor declaration
# In above code, there is no constructor declaration so default is being called while runtime
class Dog:
    attr1 = "mammal"
    attr2 = "dog"

    #constructor declaration
    def __init__(self):
        print("This is constructor which is nothing but a method which is called when object of class is declared")

    def fun(self):
        print("I'm a", self.attr1)
        print("I'm a", self.attr2)


Rodger = Dog() #here we are declaration Rodger is object of class, so here init methos print statement will be our o/p
# print(Rodger.attr1)
# Rodger.fun()


#***********************************************************************************************************************************************

class Car():

    # init method or constructor
    def __init__(self, model, color):
        self.model = model                  #self.model and self.color are two instance variables
        self.color = color

    def show(self):
        print("Model is", self.model)        #in python, we cannot call the variable directly with its name, always use self parameter
        print("color is", self.color)


# both objects have different self which contain their attributes
#when you are passing the value of variables to class, no. of args should be same for the init method i.e. constructor method
audi = Car("audi a4", "blue")
ferrari = Car("ferrari 488", "green")

audi.show()  # same output as car.show(audi)
ferrari.show()  # same output as car.show(ferrari)

print("Model for audi is ", audi.model)
print("Colour for ferrari is ", ferrari.color)

#***********************************************************************************************************************************************
class calculator:
    classvar= 100

    def __init__(self, num1, num2):               #in python constructor is always init method
        self.Number1 = num1
        self.Number2 = num2
        print("When we declare the obj of class then init method called first")

    def addition(self):
        return self.Number1 + self.Number2

    def multiply(self):
        return self.Number1*self.Number2*self.classvar     #we can declare class variable either using class name or self parameter
        # return self.Number1 * self.Number2 * calculator.classvar

object1 = calculator(10,20)
object1.addition()
print(object1.addition())
print(object1.multiply())

