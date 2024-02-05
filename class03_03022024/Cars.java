package class03_03022024;

public class Cars {
	//variables
	int wheelsVar;
	int seatsVar;
	String colorVar;
	int gearVar;
	float lengthVar;
	//constructor
	Cars() {
		
		System.out.println("this is a constructor");
	}
	
	public Cars(int wheel, int seats, String color, int gear, float length ) {
		this.wheelsVar = wheel;
		this.colorVar = color;
		this.lengthVar = length;
		this.seatsVar = seats;
		this.gearVar = gear;
		
	}
	
	//methods
	public void increaseSpeed() {
		System.out.println("inside increaseSpeed");
	}
	
	public void decreaseSpeed() {
		System.out.println("inside decreaseSpeed");
	}
	
	public void initCars(int wheel, int seats, String color, int gear, float length ) {
		this.wheelsVar = wheel;
		this.colorVar = color;
		this.lengthVar = length;
		this.seatsVar = seats;
		this.gearVar = gear;
		
	}

}
