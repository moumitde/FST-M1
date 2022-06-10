#add all integers in  the list 

def calculate_Total(numbers):
    sum = 0 
    for i in numbers:
        sum= sum+i
    return sum


#Define the list the numbers
num=[1,2,6,7]
print("Print the list:- ", num)

#Calculate the sum
res = calculate_Total(num)

#print the sum of elements from the list
print("The sum of elements in the list:- ", res)