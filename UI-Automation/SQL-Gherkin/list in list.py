mydata= [10,20,"krishna",354, "true",[1,2,3,["a","b","c"],4]]

print(mydata)

print(mydata[3])
print(mydata[5][3][1])
print(len(mydata[2]))
mydata[2]="Robert"
print(mydata)

#################################################################
persons = ["ramesh", "krishna", "ram"]
fruits = ["mango","banana", "cherry"]

#persons[2]= "John"
#print(persons)

persons[2] = fruits
print(persons)

persons_fruits = persons
print(persons_fruits)

persons_fruits[1] = "Pedha"
print(persons)

#persons[2] = "Pedha"
#print(persons_fruits)

print(persons)
[print(*item) for item in persons]           #* removes the square brackets and inserts the space between chars in str


newlistx = [x for x in fruits if len(x)==6 ]
#newlistx = [x for x in fruits if len(x)>3]
print(newlistx)

newlisty = [x for x in fruits if "r" in x]
print(newlisty)

newlistm = [x for x in fruits if x != "cherry"]
print(newlistm)
##########################################################
abc = ["string"]
newabc = abc.copy()
print(abc)

#########################################################
mycust = ["Ramesh", "Pune", 8568624]
Name, City, No = mycust
#print(Name)
#print(City)
#print(No)

mycustomers = [mycust, ["Salman", "Hyderabad", 66768474], ["Rohit", "Delhi", 875729]]
for cname, city, phone in mycustomers:
    print(cname, city, phone)


##################################################################
mynums1 = [1,2,3,3,1,3,5,2,3,2,5]
[print(item) for item in mynums1 if item > 3]

#####################################################################
glist= ["grapes", "magoes",["sita","rama"]]
print(glist)

hlist= [item for item in glist if type(item)==str]
flist= [item for item in glist if type(item) ==list]
print(hlist)
print(flist)

########################################################################

# list = []                       #this is the way by which we can make blank list and using append we are adding nos. in it
# for x in range(1, 21):
#     list.append(x)

oddNumSqrList = [x**2 for x in range(1,21) if x%2==1]
print(oddNumSqrList)

########################################################################
#add two list using map and lambda
#map object

def double_the_value(x):
    return 2*x
d_val= map(double_the_value,[2,3,4,5,9])
print(list(d_val))



numbers1= [1,2,3]
numbers2= [4,5,6]
result = map(lambda x,y: x+y, numbers1, numbers2)
print(list(result))
########################################################################


