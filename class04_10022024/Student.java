package class04_10022024;

public class Student {
	
	int stNo;
	String stuName;
	int stAge;
	static String status;
	
	public static void staticMethod() {
		System.out.println("inside the staticMethod");
	}
	
	public void nonstaticMethod() {
		System.out.println("inside the nonstaticMethod");
	}

}
