
#Fibonacci sequence
n1= int(input("first number"))

n2= int(input("second number"))
upto= int(input("upto"))
count= 0
while count< upto:
    fnum = n1+n2
    n1=n2
    n2=fnum
    print(fnum)
    count +=1



n1= int(input("Enter the first number : "))
n2= int(input("Enter the second number : "))
max= int(input("Enter the maximum value into fibonocci sequence : "))

while n2< max:
    n1, n2 = n2, n1+n2
    if n2> max:
        break
        print(n2, end= " ")
