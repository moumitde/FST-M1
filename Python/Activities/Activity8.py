#User will enter the list of integers from the console
newList = list(input("Enter the list of integers:- ").split(", "))
print("print the list of integers:- {}".format(newList))

if (newList[0]==newList[-1]):
    print(True)
else:
    print(False)
