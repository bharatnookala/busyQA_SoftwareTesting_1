package class02_27012024;

public class StringFunctions {
	
	public static void main(String[] args) {
		String strVar_1 = "busyqa_softwaretesting";//String constant pool
		//String strVar_2 = new String("busyqa_softwaretesting");//Stack
		System.out.println(strVar_1);
		//System.out.println(strVar_2);
		//1. charAt()-------the character at a specific index in a string and output is character
		System.out.println("charAt:::::"+strVar_1.charAt(5));
		//for(int i =0;i<strVar_1.length();i++) {
			//System.out.println("the index is:::"+ i + " value is::::"+ strVar_1.charAt(i));
			//System.out.println(strVar_1.charAt(i));
		//}
		//2. length()----measure the number of characters in the string and output is int
		System.out.println("length()::::"+strVar_1.length());
		//3. contains()------check if a character pattern is present in the string and output is boolean
		System.out.println("contains(busyqa)::::"+strVar_1.contains("busyqa"));
		System.out.println("contains(busqya)::::"+strVar_1.contains("busqya"));
		//4. equals()-----compare the string----output will be boolean
		System.out.println("equals(busyqa_softwaretesting)::::::"+strVar_1.equals("busyqa_softwaretesting"));
		System.out.println("equals(BusyQA_SoftwareTesting)::::::"+strVar_1.equals("BusyQA_SoftwareTesting"));
		//5. equalsIgnoreCase()-----compare the string and it is case insensitive----output will be boolean
		System.out.println("equalsIgnoreCase(busyqa_softwaretesting)::::::"+strVar_1.equalsIgnoreCase("busyqa_softwaretesting"));
		System.out.println("equalsIgnoreCase(BusyQA_SoftwareTesting)::::::"+strVar_1.equalsIgnoreCase("BusyQA_SoftwareTesting"));
		//6. isEmpty()---check if the string is empty and output is in boolean
		System.out.println("isEmpty()::::::"+strVar_1.isEmpty());
		//7. replace()----replace one specific character in a string------output will be in string
		System.out.println("replace()::::::"+strVar_1.replace('q', 'Q'));
		//8. concat()-----add string at the end of another string-----output will be in string
		System.out.println("concat()::::::"+strVar_1.concat(" Good batch"));
		//9. toUpperCase()----convert the lowercase string to uppercase-------output will be in string
		System.out.println("toUpperCase()::::::"+strVar_1.toUpperCase());
		//10. tolowercase()----convert the lowercase string to lowercase-------output will be in string
		System.out.println("tolowercase()::::::"+strVar_1.toLowerCase());
		//11. subString()----cut the string based on the index-----output will be in string
		System.out.println("subString()::::::"+strVar_1.substring(5, 10));
		//12. split()------splitting the string based on a regex-----output will be in string[]
		String[] strplit = strVar_1.split("_");
		System.out.println("strplit[0]::::::::::::"+strplit[0]);
		System.out.println("strplit[1]::::::::::::"+strplit[1]);
		
		

	}

}
