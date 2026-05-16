class interview (helloclass):
    def __init__(self,city,location,colleges,techs):
        self.techs= techs
        helloclass.__init__(self,city,location,colleges)

    def category(self):
        collnum= self.colleges.index(self.college)
        technum= self.techs.index(self.techno)*2
        expnum= self.marks//10
        return (collnum+technum+expnum)/3

#send the interview letter if the category return value, is graeter than

    def sendletter(self,cname,city,location,college,exp,techno,marks):
