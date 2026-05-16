#tuple is immutable i.e. cannot be changed
#in ordered manner
#identified by "()"
#item seprated by comma
#methods like pop, append, remove, delete will not work for tuple
#no copy method for tuple
#tuple with only one value is written as (x,)....comma must be there to know it is tuple

mytuple= (1,3,"Venkat",True)    #here true is boolean so dont required double comma
print(mytuple)
print(len(mytuple))
print(mytuple[2])

#mytuple[2]= "Ramesh"
#print(mytuple)         #beacuse tuple is immutable so cant change

mylist= ["pune", "mumbai",  "delhi"]
prachil= tuple(mylist)
print("prachil")              #convert [] into () so that tuple
print(type(prachil))