package activities;

import java.util.Arrays;

public class Activity4 
{
	//method handling the insertion sort
	static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
	
	public static void main(String[] args) 
	{
		int num[] = new int[] {1,6,8,4,5,9};
		ascendingSort(num);
		System.out.println("Sorted the array in ascending order");
		System.out.println(Arrays.toString(num));
		
	}

}
