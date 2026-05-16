#matching char in two str are replace by int '9'. e.g. 'i' is matching in both str so replace 'i' by int '9'
mystr1 = "This is the python programming session"
mystr2 = "Phishing is punishable,Ransom cessation....."

if (len(mystr1) < len(mystr2)):
    strlen = len(mystr1)
else:
    strlen = len(mystr2)
    print(strlen)

mynewstr= ""
for x in range (strlen):
    if (mystr1[x].lower()==mystr2[x].lower() and mystr1[x]!= " "):     #"1="/ "<>" : indicates mnot equal to
        mynewstr+= "9"
    else:
        mynewstr += mystr1[x]

print(mynewstr)