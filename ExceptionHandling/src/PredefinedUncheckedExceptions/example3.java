package PredefinedUncheckedExceptions;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter number to divide 100");
			int n = scanner.nextInt();
			System.out.println(100/n);
			int[] array = {10,50,60,90,34,56};
			System.out.println("enter index to retrive data");
			int index = scanner.nextInt();
			System.out.println(array[index]);
			System.out.println("Enter a string to find length");
			String s = scanner.next();
			System.out.println(s.length());
			System.out.println("enter index to retrive character \'s\' from kishore ");
			int index1 = scanner.nextInt();
			System.out.println("kishore".charAt(index1));
			System.out.println("enter numeric string that you want to convert to number");
			String s1 = scanner.next();
			System.out.println(Integer.valueOf(s1));
		}
		catch(ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException|NumberFormatException|
				NullPointerException|ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

}
