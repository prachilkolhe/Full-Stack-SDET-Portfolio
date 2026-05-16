#sets also in "{}" seprated by ,
#no ":" used
#no list and dictionary can not be added in sets

myset = {"venkat","krishna","prasad",10,20,"delhi",700,2.56,567,"Pune"}
print(myset)        #set is unordered!!   so has no index

#dictionary and List cannot be added in sets
mydict = {1:"you",2:"me"}
mylist = [1,2,3,"bamboo"]
# myset.add(mydict)
# print(myset)
# myset.add(mylist)
# print(myset)

#tuple can be added but if tuple has list inside it...then tuple cannot be added
mytuple = (1,10,20,30,"raman")
myset.add(mytuple)
print(myset)


# mytuple1 = (10,20,30,["yoyo"])          #this tuple cannot added in set beacuse it has list inside it
# myset.add(mytuple1)
# print(myset)



#LIST AND DICTIONARY CAN BE ADDED IF WE USE "UPDATE" FUNCTION
myset.update(mylist)
print(myset)

myset.update(mydict)           #it will add only key
print(myset)
myset.update(mydict.items())   #it will add only both key and value in the form of tuple
print(myset)



#pop
myset.pop()      #randomly pop
print(myset)
myset.pop()
print(myset)       #here it pop the first item


#########################################################################################################

cities_set = set(("pune","delhi","mumbaiM","noida"))
print(cities_set)

print("count of the items in the list :",len(cities_set))

for x in cities_set:
    print(x)

#boolean
print("krishna" in myset)

##################################################################################################################
#union of sets

set1= {10,643,"prachil"}
set2 = {"kolhe",9,"chopda"}
set3 = set1.union(set2)
print(set3)
# print(set1.union(set2))


#intersection and difference
set5 = {1,2,3,4,5}
set6 = {4,5,6,7,8}
s = set5.intersection(set6)     #prints items which are common to set6
s1 = set5.difference(set6)      #prints items which are uncommon i.e. not in set 6
print(s)
print(s1)

#intersection update= it find the common item of set5 in set6 and make the set5 of intersection items
set5.intersection_update(set6)
print(set5)


#discard
set3.discard("prachil")
print(set3)


