#list are mutable (changable)
#identified by []
#item seprated by comma

mydata= ["shyam", 11, 53.786, "prachil"]
print(mydata)

str= "Dassault Systemes"
mylist=list(str)
print(mylist)
print(mylist[0:5])      #The string present in list as each seprated letter double inverted comma and with comma ["D","a","s".....] but in strinmg it like as a whole "Dassault"
print(str[2:6])


#########################################################################
mylist1= ["Radha", 123, 88.63, "Manish", True]
mylist2= ["a","b","c","d","e"]

mylist1.insert(1, "Prasad")        #only insert not replacing
print(mylist1)

mylist2.insert(2,["Samartha", 7342, 65347])
print(mylist2)

newlist= mylist1 + mylist2
print(newlist)
########################################################################

lista= [1,2,3,2,2,1,4,5,6,2]
emptylist= []

for x in range(len(lista)):             #here we used x in range of list (list os of int, str) so x
                                        #sometimes we used i in range of len(list) so len is all about int so we used i
    if lista[x] not in emptylist:
        emptylist.append(lista[x])

print(emptylist)


#######################################################################
listx = ["Mango", "Orange", "Apple", "Banana"]
print(listx)
print(*listx)

a,b,c,d = listx
print(a)
print(b)
print(c)
print(d)
#print(e)       (a,b,c,d,e = listx)........not enough to packed!

mynewstr = ",".join(listx)
print(mynewstr)

for i in range(len(listx)):
    print(",".join(listx[i]))
    #print(",".join(listx[i]), end= ", ")

#####################################################################
#delete list= according to given index

listm = [1,2,3,4,5]
del listm[2]      #2 is index value
print(listm)




