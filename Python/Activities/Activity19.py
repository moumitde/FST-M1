# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["A", "B", "C"],
	'LastName':["new", "last", "name"],
	'Email':["A.new@example.com", "B_last@example.com", "C.name@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.save()