mychildren= {
    "first" : {
        "name" : "venkat",
        "year" : 2009
    },
    "second" : {
        "name" : "divya",
        "year" : 2012
    },
    "third" : {
        "name" : "krishna",
        "year" : 2015
    }
}
print(mychildren)
# print(mychildren["first"])

#looping
# for x in mychildren:
#     print(x)                      #it will print only key
#
# for x in mychildren.items():
#     print(x)                      #it will print key and value in tupple form


for x in mychildren.items():
    print(mychildren)






##############################################################################################################
#syntax can be like this

# first = {
#     "name" : "venkat",
#     "year" : 2009
# }
# second = {
#     "name" : "divya",
#     "year" : 2012
# }
# third = {
#     "name" : "krishna",
#     "year" : 2015
# }
#
# mychildren = {
#     "first child" : first,
#     "second child" : second,
#     "third child" : third
# }
#
# print(mychildren)