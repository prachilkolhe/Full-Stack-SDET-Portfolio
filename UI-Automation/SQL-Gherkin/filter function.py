lst= [10,22,37,41,100,123,29]

mylist= tuple(filter(lambda x:(x%3==0),lst))
print(mylist)                    #tuple with only one value is presented like this (2,)

mylist1= list(filter(lambda x:(x%2==0), lst))
print(mylist1)