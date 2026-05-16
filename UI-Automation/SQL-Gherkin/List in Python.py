str1 ="Dasssault Systems india"
for l in str1:
    print(l,end=" ,")     #It prints the str in hzl manner seprated by comma

for x in str1:
    print(x,"\n")         #It prints the str in vertical manner

print(str1[5:11])         #Prints the str from the given range

for i in range(5,11):     #Prints the str from given range using for
    print(str1[i])

print(str1.isalpha())     #it gives false if thers is no or space and shows true if all str is of alphabets
print(str1.zfill(25))     #it add no of zeros on L.H.S of str (str length is 23 so it will add 2 zero more) if no. is less than lenght of str it shows the whole str
print(str1.title())       #prints the tittle of string
print(str1.isalnum())     #alpha + numerical = True but no space in string if not it will show False
print(str1.isdigit())

