

class myfunc():
    def __init__(self,name,city):
        self.name=name
        self.city=city
        print("Hello from init function")

    def cust(self):
        print("Customer",self.name,"is from city",self.city,"in buissness of",self.busi_type)

    def otherdata(self,busi_type):
        self.busi_type=busi_type

    def __call__(self, location):
        # self.location=location
        # print("Customer", self.name, "is from city", self.city, "and Location is", self.location)
        print("Customer",self.name,"is from city",self.city,"and Location is",location)



myfunjob= myfunc("Krishna","Delhi")        #ceating the object
myfunjob.otherdata("Garments")             #calling the object
myfunjob.cust()
myfunjob("Wakad")       #here we made object (myfunjob) callable so Wakad will go to call function ....also you can used this by second last line using call function directly
myfunjob.cust()
myfunjob("Wakad")                           #this and below both are same way to call object using different values
myfunjob.__call__("Hinjawadi")
myfunjob.cust()
