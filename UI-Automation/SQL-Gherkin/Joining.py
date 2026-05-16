mystr = "infosys"
mynum = ["2","3", "4", "5"]
newstr = mystr.join(mynum)
newstr1 = ",".join(mynum)
newstr2 = ",".join(mystr)
newstr3 = " -- ".join(mystr)
newstr4 = "--".join(",".join(mystr))     #firstly it will join str with comma between the letters of infosys and then it join with -- (i,n,f,o,s,y,s)     (i--,--n--,--f--,--o......
newstr5 = ",".join("--".join(mystr))
print(newstr)
print(newstr1)
print(newstr2)
print(newstr3)
print(newstr4)
print(newstr5)