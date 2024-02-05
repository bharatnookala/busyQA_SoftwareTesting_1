package class03_03022024;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] intArray = new int[3][5];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				intArray[i][j] = (2*i) + (2*j);
			}
		}
		
		for(int i =0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("the value of i is::::"+i+" the value of j is:::"+j);
				System.out.println(intArray[i][j]);
			}
		}
		
		
	}

}
