package activities;

public class Activity12 
{
	public static void main(String[] args) 
	{
		//Lambda expression without the return keyword
		Addable ad1 = (a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
		
		//Lambda expression with the return keyword
		Addable ad2 = (int a, int b)->{
			return(a+b);
		};
		System.out.println(ad2.add(30, 30));
	}

}

interface Addable
{
	int add(int num1, int num2);
}
