package class01_20012024;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic + - * / % -------> output will be in the same datatype as input
		int num1 = 10;
		int num2 = 5;
		System.out.println("$$$$$$$$$$$$$Arthimetic$$$$$$$$$$$$$$");
		System.out.println("addition:::::::"+(num1 + num2));
		System.out.println("sub:::::"+ (num1 - num2));
		System.out.println("multi::::::" + (num1 * num2));
		System.out.println("div::::"+ (num1 / num2));
		System.out.println("mod:::::" + (num1 % num2));
		//Relational < > <= >= != ==-------> whatever is the input, output will always be boolean
		System.out.println("$$$$$$$$$$$$$Relational$$$$$$$$$$$$$$");
		System.out.println("Greater than::::"+(num1 > 10));
		System.out.println("Less than::::"+(num1 < 10));
		System.out.println("Greater than equal to::::"+(num1 >= 10));
		System.out.println("Less than equal to::::"+(num1 <= 10));
		System.out.println("Not equal to::::"+(num1 != 15));
		System.out.println("Equal to::::"+(num1 == 10));
		//Logical && || !---------input should be boolean and output will always be boolean
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("$$$$$$$$$$$$$Logical$$$$$$$$$$$$$$");
		System.out.println("AND:::::" + (bool1 && bool2));
		System.out.println("OR:::::" + (bool1 || bool2));
		System.out.println("NOT::::" + (!bool1));
		//Assignment += -= *= /= %= ==
		System.out.println("$$$$$$$$$$$$$Assignment$$$$$$$$$$$$$$");
		int num_add1 = 10;
		int num_add2 = 5;
		System.out.println("num_add1 before ::::::"+num_add1);
		System.out.println("num_add2 before ::::::"+num_add2);
		num_add1 += num_add2;
		System.out.println("addition");
		System.out.println("num_add1 after ::::::"+num_add1);
		System.out.println("num_add2 after ::::::"+num_add2);
		int num_sub1 = 10;
		int num_sub2 = 5;
		System.out.println("num_sub1 before ::::::"+num_sub1);
		System.out.println("num_sub2 before ::::::"+num_sub2);
		num_sub1 -= num_sub2;
		System.out.println("sub");
		System.out.println("num_add1 after ::::::"+num_sub1);
		System.out.println("num_add2 after ::::::"+num_sub2);
		//Increment ++ -- input can be in any datatype, output will also be in the same datatype
		System.out.println("$$$$$$$$$$$$$Increment/Decrement$$$$$$$$$$$$$$");
		int a1 = 2;
		int b1 = 3;
		int x1 = 5;
		int x2 = 6;
		System.out.println("Increment++::::" + (a1++));//3//2
		System.out.println("Decrement--::::" + (b1--));//2//3
		System.out.println("++Increment::::" + (++x1));//6
		System.out.println("--Decrement::::" + (--x2));//5
		

	}

}
