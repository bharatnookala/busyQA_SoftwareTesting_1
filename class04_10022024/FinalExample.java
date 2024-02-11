package class04_10022024;

public class FinalExample {
	
	public final static float piValue = 3.14f;
	
	public static void circumference(int rad) {
		float circum = 2 * piValue * rad;
		System.out.println("the circumference of the circle is:::"+circum);
	}
	
	

	public static void main(String[] args) {
		
		circumference(2);
		
		
		

	}

}
