package class02_27012024;

public class Loop_While {

	public static void main(String[] args) {
		/*int i = 20;
		while(i>=0) {
			//System.out.println("the value of i is:::::"+i);
			System.out.println(i);
			i--;
		}*/
		
		String strVar = "Sample";
		while(strVar.length()<10) {
			System.out.println(strVar);
			strVar = strVar.concat("d");
		}

	}

}
