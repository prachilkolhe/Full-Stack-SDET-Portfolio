from Playwright_Python_Automation.OOPSbasics import Calculator


class ChildClass(Calculator):           # Default constructor is working here, as we haven't created a constructor
    num2= 200                           # If we create a constructor here then need to declare the conscrutor of parent class in this constructor

    # def __init__(self):
    #     Calculator.__init__(self, 10, 12)     # Output --> 422

    def getCompleteData(self):
        return self.num2 + self.num + self.sumation()


obj3 = ChildClass(4, 1)
print(obj3.getCompleteData())

