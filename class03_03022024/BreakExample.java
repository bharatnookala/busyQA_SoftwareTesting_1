package class03_03022024;

public class BreakExample {

	public static void main(String[] args) {
		//while loop
		int a = 10;
		while(a>0) {
			
			a--;
			if(a==4) {
				//break;
				continue;
			}
			System.out.println(a);
			
		}
		
		//for loop
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i == 1 && j == 2) {
					//break;
					continue;
				}
				System.out.println("the value of i is:::::"+i+ " the value of j is::::"+j);
			}
		}

	}

}
