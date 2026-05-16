city= "Pune"
id= 972000
cname= "Ramesh"
#various ways of formats used to print any output

print(cname+"  "+city)
print("Customer name is ",cname,"City is ",city,"and id num is",id)

print("customer name is %s city is %s id num is %s"%(cname,city,id))

print("customer name is {} city is {} and id num is{}".format(cname,city,id))

print(f"customer name is {cname} city is {city} and id num is {id}")

print(r"customer name is {cname} city is {city} and id num is {id}")       #r means raw string it doesnot know any syntax.....it prints all the string


#doc string: triple coat is compulsury (it prints the texts as same in input ....if we put only sinlge coat then it will print in single line....
#so using triple coat it prints the string in para pattern as same as input)
print("""kfhjwehdkqwliywi
;lfjwhegfjk
wdldnfwefjl
dfjwdofjl
msklflkjljlkd""")





cname= "Ramesh Patil"
city= "Pune"
age=21

print(f"Our customer name is {cname}. He is from the city {city} and he is {age} years old")
