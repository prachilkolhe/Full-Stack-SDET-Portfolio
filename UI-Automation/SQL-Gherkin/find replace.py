mystr= " Dassault Systemes "

#print the location of the lowest index of "SYS" between indexes 5 and 25
print(mystr.find("mes",0,19))  #we are finding "Sys" in str from the range of 5 to 12.....it will return the initial index of finding char
print(mystr.rfind("em"))       #syntax will run even if we are not mentioning the start and end index limits
print(mystr.replace("s","8",3))   #we are replacing the char 's' by '8' for 3 times from starting

#splitin: It rubbed the mentioned char and split the mystr from it
print(mystr.split("u"))

#partition: it do the partition of mystr from mentioned char
print(mystr.partition("u"))

#strip: left and right space of mystr will be cancelled
#lstrip: only left space will be cncelled and right space will remained as it is
#rstrip: right spaces is removed
print(mystr.strip())
print(mystr.lstrip())
print(mystr.rstrip())



mystr4 = "my name is prachil"
print(mystr4.find("pra",0,18))




