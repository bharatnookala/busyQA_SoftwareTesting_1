package class04_10022024;

public class StaticExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stAge = 16;
		s1.stNo = 1;
		s1.stuName = "Dev";
		Student.status = "student";
		
		Student.staticMethod();
		s1.nonstaticMethod();

	}

}
