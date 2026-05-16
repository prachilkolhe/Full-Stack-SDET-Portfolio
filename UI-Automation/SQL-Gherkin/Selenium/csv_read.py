import csv

#csv= comma seprated values
#csv file name

filename= "C:\exceldetails.csv"     #filwe path
fields= []
rows= []

#reading csv file
with open(filename, 'r') as csvfile:
    #creating a csv reader object
    csvreader= csv.reader(csvfile)
    #extracting fields names through first row, next returns the current row and advances to next row
    field= next(csvreader)
    #extracting each data in row one by one
    for row in csvreader:
        rows.append(row)

    #get total number of rows
    print("Total no. of rows: %d" % (csvreader.line_num))

#printing the field names
print('Field names are: ' + ','.join(field for field in fields))

#printing first 5 names
print('\nFirst 5 rows are:\n')
for row in rows [:5]:
    #parsing each column of a row

    for col in row:
        print("%10s"% col, end=" "),
    print('\n')