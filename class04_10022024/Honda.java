package class04_10022024;

public class Honda extends CarsInherit{
	
	public Honda() {
		super();
		System.out.println("this is the constructor in the child class");
	}
	
	
	public void increaseSpeed() {
		
		System.out.println(super.wheels);
		super.increaseSpeed();
		System.out.println("this is in the class Honda and method increaseSpeed");
	}

	

}
