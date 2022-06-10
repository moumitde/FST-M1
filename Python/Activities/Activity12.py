#define function to calculate the sum

def calculateSum(num):
  if num:
      return num+calculateSum(num-1)
  else:
      return 0

#find sum of numbers from 0 to 10       
res= calculateSum(10)

print("Print the final sum:- ",res)
