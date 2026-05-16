mylist = ["Sham", "Ram", "Mango", "Apple", "Ball", "Banana", "Chikoo", "Kesar", "Sharad"]
newlist = ["Mumbai", "Pune"]

#using insert function= No replacing just add
mylist.insert(3, newlist)
print(mylist)

#using slicing= Direct replacing
mylist[3:6] = newlist
print(mylist)

#extend= extending the list with another list
mylist.extend(newlist)
print(mylist)

#add the list
print(mylist + newlist)

#remove
print(mylist)
mylist.remove("Mumbai")           #sequentially first mumbai will removed
print(mylist)

#count
numlist= ["Milind","Chetan","Chetan",5,5,4,4,4,4]
for x in numlist:
    while (numlist.count(x)>1):
           numlist.remove(x)
    print(numlist)


# append
# dont run this pc will hang up
# append means it add the x into list
# alist= ["a","b","c","d"]
# for x in alist:
#      if x != int:
#         alist.append(x)
#  print(alist)

###########################################################################################
listnew = ["Chopda", "jalgaon", "Pachora", "Mumbai","Pune", 1,3,5,53,25.456]
print(listnew[0:4])

#print the list using "x"
for x in listnew:
    print(x)

#print the list using count and count as index
count = 0
while count<len(listnew)-1:
        print(listnew[count])
        count += 1

#print the list only of integers
for x in range (len(listnew)):
    if type(listnew[x]) == int:
        print(listnew[x], end=" ")           #end= is for to get input on hzl line

#sort: arrange the list in alphabetical order, and if str is of int then it arrange in acsending order
#reverse= arrange the sorted list in reverse manner
plist= ["sharath", "satish","maanish", "sandesh"]
plist.sort()
print("\n", plist)                            #\n is for new line

plist.sort(reverse=True)       #reverse true= means it puts the string in reverse manner after sorting
                               #reverse false(default)= string in sorted manner i.e. alphabetical order
print(plist)

numlist = ["a","sdfh","gfj",10,76,4,3,6,89,45,56,76,3,2,5,23]
numlist.sort(key= str)
print(numlist)


##############################################################
mynum = [50, 20, 450, 30,610,70]
mynum.sort()
print(mynum)      #by default in acsending order
mynum.sort(reverse=True)
print(mynum)      #reverse=True = it prints the list in reverse manner

################################################################

#Pop= removes the last item of list if index not mentioned in pop (if mentioned index in pop it remove the item from starting)
numberlist = [1,2,3,4,5,6,7]
print(numberlist.pop())          #eliminate last item i.e.7
print(numberlist)
print(numberlist.pop(1))         #here we mentioned index 1 in pop so it eliminate the item of index 1
print(numberlist)
print(numberlist.pop(2))         #eliminate index 2 item
print(numberlist)

###################################################################