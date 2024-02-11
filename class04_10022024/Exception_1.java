package class04_10022024;

public class Exception_1 {

	public static void main(String[] args) {
		
		//mandatory
		try {
			int a =0;
			System.out.println("value is::::"+(20/a));
			
		}
		//not mandatory
		catch(Exception e){
			System.out.println("there is an exception");
			
		}
		//not mandatory
		finally {
			System.out.println("inside in the finally");
		}

	}

}
