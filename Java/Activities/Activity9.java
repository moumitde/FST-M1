package activities;

import java.util.ArrayList;

public class Activity9 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("China");
		arrList.add("Japan");
		arrList.add("Russia");
		arrList.add("India");
		arrList.add("Nepal");
		
		System.out.println("Printing all the names in the arraylist: ");
		for(int i=0 ; i<arrList.size() ; i++)
		{
			System.out.println(arrList.get(i));
		}
		
		//Retrieve the 3rd element in the arraylist
	   System.out.println("Retrieving the 3rd element in the Arraylist:-"+arrList.get(2));
	   
	   //Using contains() to check if a name exists in the arraylist
	   System.out.println("Is 'China' in the arraylist? : "+arrList.contains("China"));
	   
	   //Print number of values in the arraylist
	   System.out.println("The number of values in the arraylist is: "+arrList.size());
	   
	   //Remove an element and print the list contents
	   arrList.remove("China");
	   System.out.println("Printing list after removing 'China' from the array: "+arrList);
	 
	}

}
