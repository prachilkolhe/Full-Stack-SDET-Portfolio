#tuple = immutabel so it can be used as keys for dictionary
#list= muttable so it can be used as key for dictionary

#dictionary= "{}"....dictionary is not ordered so it has no index.......seperation by ","
#right side of ":" ----> Key
#left side of ":" ----> Value
#every dictionary should have key and value


mydic = {1:"Pune", 2:'Hyderabad', 3:"Chennai", 4:"Delhi"}
print(mydic)
print(mydic[2])

         #key of dict     #value
mydatadic= {"names":["Mangesh","rahul","sonu"], "cities":{"first":"pune","second":"mumbai", "third":"delhi"}}
print(mydatadic)
# print(mydatadic["cities"][2])        #it has no index so call by reference/name directly
print(mydatadic["names"][1])           #names has list so it can call by index
print(type(mydatadic["names"]))
print(type(mydatadic))
print(type(mydatadic["cities"]))


###### Here we are changing the dictionary into set by removing the semicolon ":"
# mydatadic= {"names":["Mangesh","rahul","sonu"], "cities":{"first","pune","second","mumbai", "third","delhi"}}
# print(type(mydatadic["cities"]))                 #if curly bracket with no semicolan it will be set
# print(mydatadic["cities"][1])                    #set also not callable by index


managers={"pune": {"Project": ["satish","Mangesh"], "3DS":["rahul","sandesh","Mahesh"]},"mumbai": {"Project1": ["mr","mrs"], "faltu":{"bedi":"sharp","kapur and sons":["chinki","monu"]}}}
print(managers)
print(managers["mumbai"])
# ditems= mydatadic.items()
# print(type(ditems))
# print(ditems)
# mydatadic["Mangesh"]="Manish"
# print(ditems)
# mydatadic["Mangesh"]= "Senthil"
# print(ditems)