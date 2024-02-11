package class04_10022024;

public class ClassFile {
	
	float f1 = 2.03f;
	
	
	
	
	public static void incrementValue_1(ClassFile c1) {
		System.out.println("this is call by reference");
		c1.f1 = c1.f1 + 1;
	}
	
	

}
