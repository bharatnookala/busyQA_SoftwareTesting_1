package class04_10022024;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayVar = new ArrayList<String>();
		//add value
		arrayVar.add("dev");
		arrayVar.add("parth");
		//add value index
		arrayVar.add(2, "dipal");
		arrayVar.add(3, "arsh");
		
		for(String s: arrayVar) {
			System.out.println("the value is::::"+s);
		}
		
		//size
		System.out.println("the size of the arraylist is:::"+arrayVar.size());
		
		//remove
		arrayVar.remove(3);
		for(String s: arrayVar) {
			System.out.println("the value after removal is::::"+s);
		}
		

	}

}
