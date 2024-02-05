package class03_03022024;

public class CarObject2 {

	public static void main(String[] args) {
		//object 1
		Cars honda = new Cars();
		honda.initCars(4, 7, "Yellow", 7, 610.25f);
		
		//object 2
		Cars nissan = new Cars();
		nissan.initCars(4, 5, "Red", 5, 910.25f);
		
		System.out.println(honda.colorVar);
		System.out.println(nissan.colorVar);
		
		
		
		

	}

}
