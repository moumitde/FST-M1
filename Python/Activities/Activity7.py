listElements = list(input("Enter a list of comma separated values:- ").split(", "))

sum = 0
for element in listElements:
    sum+=int(element)

print(sum)
