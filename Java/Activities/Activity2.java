package activities;

public class Activity2 
{
	static int sum = 0 ;
	public static boolean result(int num[], int expectedsum , int numValue)
	{
		for(int i=0 ; i<num.length ; i++)
		{
			if(num[i]==numValue)
			{
				sum+=numValue;
			}
		}
		
		if(sum==expectedsum)
		{
			return true ;
		}
		else
		    return false ;
	}
	
	public static void main(String[] args) 
	{
		int num[] = new int[]{10, 77, 10, 54, -11, 10};
		int expectedSum = 30 ;
		int numValue = 10 ;
		
		System.out.println("Result is: "+result(num, expectedSum , numValue));
		
		
	}

}
