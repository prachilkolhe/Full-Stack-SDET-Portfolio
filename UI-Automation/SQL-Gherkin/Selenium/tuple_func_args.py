# a,b=1,2
# (a,b)=1,2
# a,b=(1,2)
#Above all statements are valid declarations for tuple

#Below to the function, due to the * prefix on the args variable, all extra arguments are  passed to the function are

def powersum(power, *args):
    #return the sum of each arguments raised to the specified power.
    total = 0
    for i in args:
        total += pow(i, power)
    return total

#function call
print(powersum(2,3,4))
print(powersum(2,*(3,4)))           #give star to pass tuple inside args so that it will exposed...if not then error comes
#return 25= (3^2 + 4^2).
#first arguments (2) goes to power, remaining (3,4) are passed as tuple to *args

# print(powersum(2,3,4)) -----> 50
list= [1,2,3,4,5]
print(powersum(2,*list))

tuple= (1,2,3,4,5)
print(powersum(2,*tuple))