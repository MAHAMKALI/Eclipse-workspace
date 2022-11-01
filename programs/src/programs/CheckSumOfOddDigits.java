package programs;
import java.util.Scanner;
public class CheckSumOfOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int returnValue = UserMainCode.checkSum(number);
		if(returnValue == 1)
			System.out.println("Sum of Odd Digits of given number is Odd");
		else
			System.out.println("Sum of Odd Digits of given number is Even");
				
		sc.close();
		
	}

}
class UserMainCode{
	
	static int checkSum(int num) {
		int sum=0,rem;
		while(num!=0) {
			rem = num%10;
			if(rem%2!=0)
				sum+=rem;
			num/=10;
		}
		if(sum%2!=0)
			return 1;
		else
			return -1;
	}
	
	
	
}
