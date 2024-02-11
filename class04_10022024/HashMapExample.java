package class04_10022024;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "dev");
		hashMap.put(2, "parth");
		hashMap.put(3, "dipal");
		hashMap.put(4, "arsh");
		
		for(Map.Entry m:hashMap.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		hashMap.remove(4);
		System.out.println("after removal");
		for(Map.Entry m:hashMap.entrySet()) {
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

	}

}
