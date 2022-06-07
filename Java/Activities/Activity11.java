package activities;

import java.util.HashMap;

public class Activity11 
{
	
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashMap = new HashMap<>() ;	
		hashMap.put(1, "blue");
		hashMap.put(2, "green");
		hashMap.put(3, "yellow");
		hashMap.put(4, "pink");
		hashMap.put(5, "red");
		
		//Print map values
		System.out.println("Printing map to the console: "+hashMap);
		
		hashMap.remove(5);
		//Print map after removing a color
		System.out.println("Printing the map after removing 'red': "+hashMap);
		
		//check if green color exists 
		System.out.println("Check if the green color exists in the map : "+hashMap.containsValue("green"));
		
		//Print size of the map
		System.out.println("Print the size of the hashmap: "+hashMap.size());
		
		
	}

}
