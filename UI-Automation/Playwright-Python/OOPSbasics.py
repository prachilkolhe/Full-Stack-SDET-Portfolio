class Calculator:
    num=100

    def __init__(self, a, b):     # If the constructor is not defined then default constructor will work
        print("I'm called first as object is called")
        self.firstNumber = a
        self.secondNumber = b

    def sumation(self):
        print("Addition function is executing as a method in class")
        return self.firstNumber + self.secondNumber + Calculator.num                     # To call any variable in method of a class, we should use self
                                                                                         # To call class veriable use class name or self.


obj = Calculator(2, 3)          # Object creation for class
print(obj.num)
print(obj.sumation())

obj1 = Calculator(5, 7)
print(obj1.sumation())