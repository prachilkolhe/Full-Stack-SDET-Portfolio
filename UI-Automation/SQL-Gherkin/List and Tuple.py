mytuple= (9,10,37,"apple")
print(mytuple)

you_may_also_create_like_this= tuple((4,6,2,7,"Prachil"))          #double () is must to print tuple
print(you_may_also_create_like_this)

mylist= ["mango",6,8.9]       #list always in []
                              #range is in () and seprated by ","
print(mylist)
you_can_also= list((1,2,3,4,5.768,"Orange"))
print(you_can_also)

atuple= tuple(mylist)         #list to tuple
print(atuple)

alist= list(mytuple)        #tuple to list
print(alist)

# atuple.pop()                #tuple is immutable so cant change it
# print(atuple)

print(len(atuple))

# print(atuple.insert(1,"Inserted"))        #same tuple is immutable

for x in atuple:
    print(x, end= " ")

print( [x for x in atuple])
print([x for x in atuple if x in atuple ])

#also we cant copy a tuple


#tuple in tuple:   tuple is immutable so first convert in list the do required operation and agian convert into tupple
myt= ((1,3,5,6,4,5,("Okay","no"),6.576,74.64,("mango","orange","apple")))
print(myt)
print(list(myt))