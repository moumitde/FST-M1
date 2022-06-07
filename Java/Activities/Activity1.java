package activities;

public class Activity1 
{
	public static void main(String[] args) 
	{
		Car carName = new Car() ;
		carName.make = 1;
		carName.color = "blue";
		carName.transmission = "automatic";
		
		//calling the car class methods 
		carName.displayCharacteristics();
		carName.accelerate();
		carName.brake();
		
	}

}


class Car 
{
	//Car class member variables
	String color ;
	String transmission ;
	int make ;
	int tyres ;
	int doors ;
	
	//Car class no-arg constructor
	Car()
	{
		this.tyres = 4 ;
		this.doors = 4 ;
	}
	
	//Car class methods 
	void displayCharacteristics()
	{
		System.out.println("Number of tyres on the car: "+tyres);
		System.out.println("Number of doors on the car: "+doors);
		System.out.println("Transmission of the car: "+transmission);
		System.out.println("Color of the car: "+color);
		System.out.println("Make of the car: "+make);
	}
	
	void accelerate()
	{
		System.out.println("Car is moving ");
	}

	void brake()
	{
		System.out.println("Car stopped");
	}
}

