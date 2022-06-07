package activities;

public class Activity7 
{
	
	public static void main(String[] args) 
	{
		MountainBike mb = new MountainBike(3, 0, 25);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBrake(5);
	}
}


class MountainBike extends Bicycle
{
	public int seatHeight ;
	
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc() + "\nSeat height is " + seatHeight);
    }  


}

class Bicycle implements BicycleParts , BicycleOperations
{

	public int gears;
    public int currentSpeed; 
    
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

	@Override
	public void applyBrake(int decrement) {
		 currentSpeed -= decrement;
	     System.out.println("Current speed: " + currentSpeed);		
	}

	@Override
	public void speedUp(int increment) {
		 currentSpeed += increment;
	     System.out.println("Current speed: " + currentSpeed);		
	}
	
	public String bicycleDesc()
	{
		return("Print the number of gears : "+ gears +" and the current speed of the Bicycle: "+ currentSpeed);
	}

}


interface BicycleOperations 
{
	public void applyBrake(int decrement) ;
	public void speedUp(int increment) ;
	

}

interface BicycleParts 
{
	public int gears = 0;
	public int speed = 0;

}