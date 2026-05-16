#Encapsulation
# class helloclass():
#     def __init__(self, city, location,):
#         self.city= city                   #"self." is used to enter the other object in our class
#         self.location= location
#
#
#     def enquiry(self,cname):              #here cname is external object it is not of self
#         print("Hello", cname, "are you from", (self.city), "and", (self.location), "location.")
#
#
#
# pune_enquiry= helloclass("Pune","Hinjewadi")       #we made object of pune_enquiry
# pune_enquiry.enquiry("Rocky Bhai")         #and here we are giving the cname
#
#
# chennai_enquiry= helloclass("Chennai","Tirumalla")
# chennai_enquiry.enquiry("Venkat")

#################################################################################################################

# class college_selection():
#     def __init__(self,college1,college2):
#         self.c1= college1
#         self.c2= college2
#
#     def enquiry(self,sname):
#         print("Hii",sname,"are you from",(self.c1),"or",(self.c2),"?")
#         cname= str(input("I'm from college: "))
#         if cname==self.c1:
#             print("Thanks...Your interview is scheduled on 5 May")
#
#         elif cname!= self.c1 and cname!=self.c2:
#             print("Select the college from PCCOE and PCCOER only")
#
#         else:
#             print("Sorry.....Your interview is not scheduled yet.")
#
# senquiry= college_selection("PCCOE","PCCOER")
# senquiry.enquiry("Prachil")

####################################################################################################################
class helloclass:
    def __init__(self, city,location,colleges):
        self.city= city
        self.location= location
        self.colleges= colleges

    def enquiry(self,cname,college):
        print("Hello",cname,"are your from",(self.city),"and location",(self.location),".")

        if (self.colleges.index(college)<=5):
            print("You are from A grade college")
        else:
            print("You are from B grade college")

pune_colleges= ["pc1","pc2","pc3","pc4","pc5","pc6"]
chennai_colleges= ["cc1","cc2","cc3","cc4","cc5","cc6"]
pune= helloclass("Pune","Hinjewadi",pune_colleges)
chennai= helloclass("Chennai","Tirumalla",chennai_colleges)

pune.enquiry("Ramesh","pc3")

###################################################################################################################



########################################################################################################################
