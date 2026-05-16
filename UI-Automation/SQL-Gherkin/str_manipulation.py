mystr = "Dassault Systemes 002 location"
print(mystr)
print(len(mystr))
print("substring",mystr[1:5])
print("substring",mystr[-5:-1])
print(mystr.lower())
print(mystr.upper())
print(mystr.capitalize())
print('this is the string Systemes of the word')
myboolean= True
print(type(myboolean))
print("Dass" in mystr)

if ("Dass" in mystr):

    print("Dass is present in mystr string")
else:
    print(" Dass doesnot exist")

if ("Dass 002" in mystr):
    print("yes! you are learning now")

search_str= input("enter the value= ")
if (search_str in mystr):
    print("Dassa is present in mystr string")
else:
    print("Dassa doesnot present")

count=0
temp=0
for x in mystr:
    print(x, end=", ")
    count=count+1
    print("Number of character in mystr string", count)
    if x=="s":
        print("s is occured",count)
        temp=temp+1
print("total s",temp)

count=0
for x in mystr:
    if (x=="s"):
        print("\n Index of s ",count)
        count=count+1
        print("Number of character in mystr",count)
