package activities;

public class Activity8 
{
	public static void exceptionTest(String str) throws CustomException
	{
		if(str==null)
		   throw new CustomException("String value is null");
		else
			System.out.println(str);
	}
	
	public static void main(String[] args) 
	{
		
		try {
			//Entering correct input
			Activity8.exceptionTest("Valid String input");
			//Entering incorrect input
			Activity8.exceptionTest(null);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Inside the catch block: "+e.getMessage());
		}
		
	}

}

@SuppressWarnings("serial")
class CustomException extends Exception
{
	private String message = null;
	
	CustomException(String message)
	{
		this.message = message ;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}

}
