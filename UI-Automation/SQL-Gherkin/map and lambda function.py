#map function used to operate function on another item (iterable only i.e.list, tuple,set,dict)
#here add to sum is the function which is operated on mylist using map function
#map function is used to create the list, set, tuple, etc


# 1).
def addtosum(num):
    return num+num

mylist = [10,20,30,40]
mapresult = map(addtosum,mylist)
print(list(mapresult))


# 2).
def squaring(num):
    return (num*num)

mylist = [10,20,30,40]
map_result = map(squaring,mylist)
print(list(map_result))


######################################################################################################################
#lamda function returns the mathematical expression
                 #with whom  :  what to do
#myexp =lambda        x      :      x*x

myexp = lambda x:x*x
print(myexp(2))


a = lambda x,y:x**2+y       #only one operation (x**x+y) can done
print(a(5,9))

################################################################################################################

def mylambdafun(num):
    return lambda x:x*num

myfun= mylambdafun(3)             #num= 3
print(myfun(2))                   #x= 2

#################################################################################################################
def lambdafun(number):
    return lambda a:a*number

number = int(input("Enter the number: "))
b = lambdafun(number)
for i in range(1,11):                #we are taking the value of "a" from range(1,11) ie. 1 to 10
    print(number,"X",i,"=",b(i))

################################################################################################################
def lambdatest(num):
    return lambda a,b,c:a+b+c*num

lfun = lambdatest(2)
for i in range(1,6):
    print("Result of lambdatest: ",lfun(2,3,i))

##############################################################################################################
lstnum =(2,4,5,3)
sqr = tuple(map(lambda x:x**2, lstnum))
print(sqr)

#################################################################################################################
def double_the_value(x):
    return x*2

d_val= map(double_the_value, [2,3,4,5])
print(list(d_val))


##################################################################################################################
number1= [1,2,3]
number2= [4,5,6]

result = map(lambda x,y:x+y,number1,number2)
print(list(result))

##################################################################################################################
def change_upper_case(s):
    return str(s).upper()

char= {'g', 'b', 'c', 'd', 'f'}
result= map(change_upper_case,char)
print(list(result))


#####################################################################################################################
l= ['sat','bat','cat','mat']
test= list(map(list,l))
print(test)

