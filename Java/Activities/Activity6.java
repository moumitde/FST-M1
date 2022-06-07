package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 
{
	
	public static void main(String[] args) 
	{
		//There are 10 people on the plane 
		Plane plane = new Plane(10) ;
		plane.onBoard("A");
		plane.onBoard("B");
		//Time at which plane took off 
		System.out.println("Plane took off at : "+plane.takeOff());
		System.out.println("People on the plane: "+plane.getPassesngers());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//plane landed
		plane.land();
		
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassesngers());
		
	}

}

class Plane 
{
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
	Plane(int maxPassengers)
	{
		this.maxPassengers = maxPassengers ;
		this.passengers = new ArrayList<>();
	}

	public void onBoard(String name)
	{
		this.passengers.add(name);
	}
	
	public Date takeOff()
	{
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf ;
	}
	
	public void land()
	{
		this.lastTimeLanded = new Date();
        this.passengers.clear();
	}
	
	public Date getLastTimeLanded()
	{
		return lastTimeLanded;
	}
	
	public List<String> getPassesngers()
	{
		return passengers ;
	}
}
