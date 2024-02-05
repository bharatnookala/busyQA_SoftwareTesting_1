package class03_03022024;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		long time = date.getTime();
		System.out.println("the time is:::::"+time);

	}

}
