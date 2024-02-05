package class03_03022024;

public class StringFunctions2 {

	public static void main(String[] args) {
		String courseName = "SoftwareTesting";
		//with start and end index
		System.out.println("the substring with start and end index from 0-7 is:::::"+courseName.substring(0, 7));
		System.out.println("the substring with start and end index from 0-8 is:::::"+courseName.substring(0, 8));
		//with only start index
		System.out.println("the substring with start index from 7 is:::::"+courseName.substring(7));
		int intVar = 5;
		float floatVar = 5.32f;
		String intVarString = String.valueOf(intVar);
		String floatVarString = String.valueOf(floatVar);
		System.out.println("the actual value of int::::"+intVar);
		System.out.println("the actual value of float::::"+floatVar);
		System.out.println("the string value of int::::"+intVarString);
		System.out.println("the string value of float::::"+floatVarString);
		int index = floatVarString.indexOf(".");
		System.out.println("before the decimal::::"+floatVarString.substring(0, index));
		System.out.println("after the decimal::::"+floatVarString.substring(index+1));
		String[] floatArray = floatVarString.split("\\.");
		for(String i : floatArray) {
			System.out.println(i);
		}
		
		
		

	}

}
