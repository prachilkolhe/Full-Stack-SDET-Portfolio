mystr= "Dassault Systemes"

#print all indexes of occurances of char 's' , case insensitive and print Hurray if it is capital S

count=-1
for x in mystr:
    count = count + 1
    myflag=False #Setting flag as false as capital S hasn't been encountered yet.
    if(x=='S'):
        myflag=True #Flag will be set as TRUE if capital S is encountered.
    if (x.lower()=="s"):
    #if (x == "s" or x=="S"):  #If x is s, whether small or capital.
        print("\n Index of s ", count)
    if(myflag): #If myFlag was set TRUE before, then that means capital S exists.  Therefore, HURRAY!
        print("Hurray it is capital S")
     #Now, increment counter as we have finished one cycle.

print("Number of character in string mystr", count)

#index is stared from '0' like 0,1,2,3,......