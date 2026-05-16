class helloclass:
    def __init__(self,city,location,colleges):
        self.city=city
        self.location=location
        self.colleges=colleges
    def enquiry(self,cname,college):
        print(f"hello {cname} are you from {self.city} and {self.location} location")
        if (self.colleges.index(college)<=5):
            print("college is Grade A")
        else:
            print("college is Grade B")

#here we passing the functions of helloclass to interview class   -----> Inheritance

class interview(helloclass):
    def __init__(self,city,location,colleges,experience,techs,marks):
        self.experience=experience
        self.techs = techs
        self.marks = marks
        helloclass.__init__(self,city,location,colleges)

    def experience2(self):
        print(f"hello your experience is {self.experience}")
        print(f"total techs You know is {self.techs}")
        print(f"your marks out of 10 is {self.marks}")
        a= self.experience+self.techs+self.marks

        if (a >= 10):
            print("You Got {} Marks that's Why you are selected".format(a))

        else:
            print("You Got {} Marks that's Why you are Rejected".format(a))



pune_colleges=["pc1","pc2","pc2","pc3","pc4","pc5","pc6","pc7","pc8","pc9"]
chennai_colleges=["cc1","cc2","cc2","cc3","cc4","cc5","cc6","cc7","cc8","cc9"]
pune = helloclass("pune","hinjewadi",pune_colleges)
chennai = helloclass("chennai","triplicane",chennai_colleges)

pune3 = interview("pune","hinjewadi",pune_colleges,10,2,3)
pune3.experience2()
pune.enquiry("Akas","pc3")
