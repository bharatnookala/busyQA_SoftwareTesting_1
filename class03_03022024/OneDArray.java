package class03_03022024;

public class OneDArray {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = 3*i;
		}
		
		for(int i: intArray) {
			System.out.println("the int is::::"+i);
		}

	}

}
