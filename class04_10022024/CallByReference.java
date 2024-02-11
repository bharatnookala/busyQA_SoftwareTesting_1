package class04_10022024;

public class CallByReference {

	public static void main(String[] args) {
		ClassFile c1 = new ClassFile();
		c1.f1 = 10;
		System.out.println("the value of the variable before change is::::"+c1.f1);
		ClassFile.incrementValue_1(c1);
		System.out.println("the value of the variable after change is::::"+c1.f1);

	}

}
