package programs;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in))
		{
			String s = scanner.next();
			if(UserMainCode8.validatePassword(s) == 1)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}

}
class UserMainCode8
{
	public static int validatePassword(String s) {
		int b= -1;
		if(s.length()>=8) 
		{
			if(s.contains("#") || s.contains("@")|| s.contains("_"))
			{
				if(Character.isAlphabetic(s.charAt(0))) 
				 {
					if(Character.isAlphabetic(s.charAt(s.length()-1)) || Character.isDigit(s.charAt(s.length()-1)))
					{
						if(s.matches(".*[0-9]{1,}.*") || s.matches(".*[a-zA-Z]{1,}.*"))
						{
							b=1;
						}
					}
					
				 }
				
			}
		}
		return b;
	}
}