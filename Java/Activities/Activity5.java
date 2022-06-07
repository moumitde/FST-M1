package activities;

public class Activity5 
{
	public static void main(String[] args) 
	{
		//create object for MyBook
		Book newNovel = new MyBook() ;	
		String name = "Alice in wonderland";
		//set title of the book
		newNovel.setTitle(name);
		System.out.println("The Title of the book is: " +newNovel.getTitle());
	}

}

abstract class Book 
{
	String title ;
	
	//Concrete method
	public String getTitle()
	{
		return title ;
	}
	
	//Abstract method
	public abstract void setTitle(String title) ;
	

}

class MyBook extends Book
{
	//Abstract method definition
	public void setTitle(String s)
	{
		title=s;
	}
	
}
