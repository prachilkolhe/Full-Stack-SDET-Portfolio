managers= {"Pune":"Patil", "Mumbai":"Kiron","Delhi":"Kapoor"}
print(managers)

#copy of dictionary
new_mgrs= managers
managers_copy= managers.copy()
print(new_mgrs)
print(managers_copy)

#convert to tuple and list
tuple_managers= [[x,y] for x,y in managers.items()]
print(tuple_managers)
list_managers= [(x,y) for x,y in managers.items()]
print(list_managers)
print(type(managers.items()))

#pop, delete and clear
managers.pop("Mumbai")
print(managers)

managers.popitem()
print(managers)

del managers["Pune"]
print(managers)

managers.clear()
print(managers)


#for loop
for x,y in managers.items():
    print(y ,"is project manager of city",x)


###########################################################################################################
myDict = {"PUNE": {"MEDIDATA": {1: "Aaditya", 2: "Mahesh", 3: "Manas"}, "CATIA": "Prachil", "SWORKS": "Akash"},
          "PARIS": {"Project 1": "John", "Project 2": "CHARLES", "Project 3": "ANDREI"},
          "NASHIK": {"Project A": "Manager 1", "Project B": "Manager 2", "Project C": "Manager 3"}}

print(myDict["PUNE"]["MEDIDATA"][2])


for x in myDict:
    for y in myDict["PUNE"]:
        for z in myDict["PUNE"]["MEDIDATA"]:
            if z == 1:
                print(myDict["PUNE"]["MEDIDATA"][1], "is working in", x)
                break
        break
    break

##############################################################################################################

# simdict= {"Pune":{"Solidworks":{1:"Satish",2:"Rahul",3:"Akash"}, "Inovia":{1:"Ram", 2:"Sham",3:"Gotu"} },
#          "Bangalore":{"3DS":{1:"Jitu",2:"Sonu"},"Medidata":{1:"Shubham",2:"Aditya"}},
#          "singapore":{1:"Manish",2:"Sandy"}}






