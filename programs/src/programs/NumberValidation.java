package programs;
import java.util.*;
public class NumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int val = UserMainCode1.validateNumber(str);
		if(val==1)
			System.out.println("Valid number format");
		else 
			System.out.println("Invalid number format");
		sc.close();
	}

}
class UserMainCode1{
	static int validateNumber(String s) {
		if(s.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
			return 1;
		else
			return -1;
	}
}