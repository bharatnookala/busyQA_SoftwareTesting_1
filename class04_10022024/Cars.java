package class04_10022024;

public class Cars {
	
	static int wheels = 4;
	String make = "Dummy";
	float length = 21.56f;
	int speed = 20;
	
	//default constructor
	public Cars() {
		System.out.println("this is a default constructor");
	}
	
	
	//parameterized constructor
	public Cars(String b, float c, int d) {
		System.out.println("this is a parameterized constructor");
		
		this.length = c;
		this.make = b;
		this.speed = d;
	}
	
	public void increaseSpeed(int a) {
		System.out.println("this is increaseSpeed which takes int value:::"+a);
	}
	
	public void increaseSpeed(int a, String s1) {
		System.out.println("this is increaseSpeed which takes int value "+a+ " and the string value is "+s1);
	}
	
	public void increaseSpeed(double a) {
		System.out.println("this is increaseSpeed which takes double value "+a);
	}
	
	
	
	
	

}
