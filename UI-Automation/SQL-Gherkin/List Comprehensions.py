mylist = ["venkat", "krishna", ["grapes", "mangoes", "cheery"]]

print(mylist)

newlist = [item for item in mylist if type(item)==str]
print(newlist)

lista = [item for item in mylist if type(item)==list]
print(lista)

##########################################################
fruits= ["apple","banana","cherry","kiwi"]
newlist= [x for x in fruits if "a" in x]     #prints only the string who has "a" in it
print(newlist)


n= [x for x in fruits if x.count("a") > 1]    #prints the string which contains "a" >1
print(n)
