package class02_27012024;

public class Conditional_Switch_Case {

	public static void main(String[] args) {
		String weekDay = "Saturday1111";
		switch(weekDay) {
		case "Monday": 
			System.out.println("Monday Blues!!!!");
			break;
		case "Tuesday": 
			System.out.println("Hectic Tuesday:(");
			break;
		case "Wednesday": 
			System.out.println("Mid of the week");
			break;
		case "Thursday": 
			System.out.println("Almost at the end");
			break;
		case "Friday": 
			System.out.println("TGIF");
			break;
		case "Saturday": 
			System.out.println("Yaaayyyyyyyyyy!!!!");
			break;
		case "Sunday": 
			System.out.println("Not again");
			break;
		default:
			System.out.println("Check your weekday");
		}

	}

}
