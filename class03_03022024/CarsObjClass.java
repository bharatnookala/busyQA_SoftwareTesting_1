package class03_03022024;

public class CarsObjClass {
	
	int speedVar;
	String brandVar;
	
	CarsObjClass(){
		System.out.println("inside the constructor");
	}
	
	public void increaseSpeed() {
		System.out.println("inside increaseSpeed");
	}
	

	public static void main(String[] args) {
		
		CarsObjClass obj = new CarsObjClass();
		obj.brandVar = "honda";
		obj.speedVar = 200;
		obj.increaseSpeed();
		System.out.println(obj.brandVar);
		

	}

}
