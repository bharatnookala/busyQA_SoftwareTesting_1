package class03_03022024;

public class ThreeDArray {

	public static void main(String[] args) {
		int[][][] intArray = new int[2][2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					intArray[i][j][k] = i + j + k;
				}
				
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					System.out.println(intArray[i][j][k]);
				}
				
			}
		}
		
		
	}

}
