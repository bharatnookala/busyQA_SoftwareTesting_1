package class04_10022024;

public class OverloadingExample {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.increaseSpeed(5);
		c1.increaseSpeed(6, "Benz");
		c1.increaseSpeed(5.6d);

	}

}
