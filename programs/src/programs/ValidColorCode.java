package programs;

import java.util.Scanner;

public class ValidColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in)){
			String s = scanner.next();
			if(UserMainCode6.validColorCode(s)==1)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}

}
class UserMainCode6
{
	static int validColorCode(String s) {
		int B=0;
		String s1 = s.substring(1,s.length());
		if(s.charAt(0)=='#'&&s.length()==7) {
			if(s1.matches("[A-F0-9]{1,}")) 
			{
				B=1;
			}
			else
			{
				B=-1;
			}
		}
		else 
		{
			B=-1;
		}
		return B;
	}
}