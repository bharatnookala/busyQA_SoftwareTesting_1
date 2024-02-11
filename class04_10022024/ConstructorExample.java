package class04_10022024;

public class ConstructorExample {

	public static void main(String[] args) {
		//default constructor call
		Cars c1 = new Cars();
		//c1.wheels = 5;
		c1.make = "Benz";
		c1.length = 56.6f;
		System.out.println("wheels::::::"+Cars.wheels);
		System.out.println("make::::::"+c1.make);
		System.out.println("length::::::"+c1.length);
		//parameterized constructor call
		Cars c2 = new Cars("BMW",69.35f,20);
		System.out.println("wheels::::::"+Cars.wheels);
		System.out.println("make::::::"+c2.make);
		System.out.println("length::::::"+c2.length);

	}

}
