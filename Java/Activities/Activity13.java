package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Activity13 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>() ;
		Random indexGen = new Random() ;
		
		System.out.println("Enter Integer values for Scanner object: ");
		//Accepting use input and adding integer values to the arraylist
		while(scan.hasNextInt())
		{
			list.add(scan.nextInt());
		}
		scan.close();
		
		System.out.println("Values in the List object: "+list);
		
		//Converting the arraylist to an array
		Integer nums[] =list.toArray(new Integer[0]);
		System.out.println("Values in the array object: "+Arrays.toString(nums));
		
		//Generate a random number with the bound values as nums.length
		int index = indexGen.nextInt(nums.length);
		
		System.out.println("Random Index value generated: "+index);
		System.out.println("Value of array at generated index: "+nums[index]);
		
		
	}
}
