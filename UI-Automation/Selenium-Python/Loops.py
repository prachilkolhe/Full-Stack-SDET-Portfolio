#if else Loop
greeting="Morning"
if greeting == ("Morning"):
    print("If loop executed successfully")
else:
    print("Else loop executed here")


#for Loop
nums = (1, 2, 3, 4)
sum_nums = 0
for num in nums:
    sum_nums = sum_nums + num
print(f'Sum of numbers is {sum_nums}')
print("Sum of numbers is", sum_nums)


#Nested for Loop
words= ["Apple", "Banana", "Car", "Dolphin" ]
for word in words:
        #This loop is fetching word from the list
        print ("The following lines will print each letters of "+word)
        for letter in word:
                #This loop is fetching letter for the word
                print (letter)
        print("") #This print is used to print a blank line


#for lopp with range function
for x in range(3):
    print("Printing:", x)

for n in range(1, 10, 3): #args --> intiate, end, step
    print("Printing with step:", n)

for i in range(100,0,-10):
   print(i)


#While loop
a=3
while a>1:
    print(a)
    a= a-1
print("While loop execution is done")


#Break statement
nums = [1, 2, 3, 4, 5, 6]
n = 2
found = False
for num in nums:
    if n == num:
        found = True
        break
print(f'List contains {n}: {found}')


#Continue statement
nums = [1, 2, -3, 4, -5, 6]
sum_positives = 0
for num in nums:
    if num < 0:
        continue
    sum_positives += num
print(f'Sum of Positive Numbers: {sum_positives}')

it =10
while it>1:
    if it ==9:
        # it = it -1
        continue #When the condition satifies at continue statement, then it skip all the execution below for that iteration and restart with new iteration
    if it ==3:
        break
    print(it)
    it = it-1
    print("While loop executed successfully")