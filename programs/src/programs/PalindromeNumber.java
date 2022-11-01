package programs;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp,reverse=0;
		temp=number;
		while(number!=0) {
			reverse = reverse * 10 + number%10;
			number = number/10;
		}
		if(reverse == temp) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		sc.close();
	}
}
