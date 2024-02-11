package class04_10022024;

public class CallByValue {
	
	public static void incrementValue_2(float a) {
		System.out.println("this is call by value");
		a = a + 1;
		
	}

	public static void main(String[] args) {
		float val = 6.2f;
		System.out.println("the value of variable before the change is::::"+val);
		incrementValue_2(val);
		System.out.println("the value of variable after the change is::::"+val);
		

	}

}
