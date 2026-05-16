from Classes_Objects import calculator
#Inheritance --> Passing the properties of calculator (parent) class to childclass --> so import command
#by this we can access the object and variables of calculator class in this child class

class childclass(calculator):         #syntax of inheritance --> name of parent class in parenthesis of child class
    num2 = 200

    def __init__(self):
        calculator.__init__(self, 20, 30)

    def getfulldata(self):
        return self.num2 + self.Number2 +self.Number1 + self.multiply()         #by doing inheritance we can call the any variable or method in this child class


#object declaration is important
child_obj= childclass()
print(child_obj.getfulldata())