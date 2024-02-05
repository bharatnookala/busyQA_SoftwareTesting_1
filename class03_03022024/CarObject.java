package class03_03022024;

public class CarObject {

	public static void main(String[] args) {
		//object 1
		Cars honda = new Cars();
		//honda.colorVar = "white";
		//honda.gearVar = 5;
		honda.lengthVar = 300.785f;
		honda.seatsVar = 5;
		honda.wheelsVar = 4;
		//object 2
		Cars nissan = new Cars();
		nissan.colorVar = "red";
		nissan.gearVar = 6;
		nissan.lengthVar = 320.67f;
		nissan.seatsVar = 7;
		nissan.wheelsVar = 4;
		
		System.out.println("the color for honda is:::::"+honda.colorVar);
		System.out.println("the color for nissan is:::::"+nissan.colorVar);
		honda.increaseSpeed();
		nissan.decreaseSpeed();
		
		

	}

}
