package class03_03022024;

public class ObjectExample {

	public static void main(String[] args) {
		Object[] obj = new Object[4];
		obj[0] = 1;
		obj[1] = "Dev";
		obj[2] = 168.324;
		obj[3] = 'A';
		
		for(Object o: obj) {
			System.out.println("the object value is:::::"+o);
		}
		
		
		
		

	}

}
