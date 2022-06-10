#User  will enter the Tuple elements

tup = tuple(input("Enter the Tuple elements:- ").split(", "))
print("Print the tuple elements:- {}".format(tup))

#iterate over the tuple and print elements divisible by 5
for num in tup:
    if(int(num)%5==0):
        print("Numbers divisible by 5 are:- ", num)