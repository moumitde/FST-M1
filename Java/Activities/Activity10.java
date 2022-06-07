package activities;

import java.util.HashSet;

public class Activity10 
{
	
	public static void main(String[] args) 
	{
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("apple");
		hashSet.add("mango");
		hashSet.add("banana");
		hashSet.add("pineapple");
		hashSet.add("kiwi");
		hashSet.add("watermelon");
		
		System.out.println("Print the initial contents of hashset: "+hashSet);
		
		System.out.println("Size of the hashset is: "+hashSet.size());
		
		//Remove 'kiwi' from the hashset
		hashSet.remove("kiwi");
		System.out.println("HashSet contents after removing 'kiwi': "+hashSet);
		
		System.out.println("Removing an element 'berry' that is not present in the hashSet: "+hashSet.remove("berry"));
		
		//Check if 'apple' is present in the hashset
		System.out.println("Check whether 'apple' is present in the hashset: "+hashSet.contains("apple"));
		
		//Print the updated HashSet
		System.out.println("Printing the updated set: "+hashSet);
		
		
	}

}
