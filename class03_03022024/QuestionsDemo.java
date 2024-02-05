package class03_03022024;

public class QuestionsDemo {

	public static void main(String[] args) {
		// 1. get a character at a specific index(5)
		// 2. compare the string with another string with case sensitivity
		// 3. replace a character
		// 4. reverse a string
		
		String strVar = "busyQA";
		System.out.println("get a character at a specific index(5):::"+strVar.charAt(5));
		String compareString = "busyqa";
		System.out.println("compare the string with another string with case sensitivity:::"+strVar.equals(compareString));
		System.out.println("replace a character::::"+strVar.replace('Q', 'q'));
		System.out.println("reverse a string:::");
		String[] charVar = strVar.split("");
		String revString = "";
		for(int i =charVar.length -1;i>=0;i--) {
			revString = revString.concat(charVar[i]);
			System.out.println(revString);
		}
		System.out.println("the reversed String is::::"+revString);
		

	}

}
