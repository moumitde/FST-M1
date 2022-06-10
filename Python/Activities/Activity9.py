#Given Lists
listOne = [1,4,5,8]
listTwo = [2,7,6,9]

#Print the lists
print("First List:- ", listOne)
print("Second List:- ",listTwo)

#Declare a third list that will store  values from the 2 lists 
thirdList = []

#iterate through the first list to get the odd elements
for num in listOne:
    if(num%2 != 0) :
      thirdList.append(num)

#iterate through the second list  to get the even elements
for num in listTwo:
    if(num%2==0):
        thirdList.append(num)

#print the third list 
print("Print the third list:- ", thirdList)