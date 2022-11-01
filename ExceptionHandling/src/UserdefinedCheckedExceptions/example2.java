package UserdefinedCheckedExceptions;

import java.util.Scanner;



@SuppressWarnings("serial")
class AgeLimitException1 extends Exception
{
	//parameterized constructor
	public AgeLimitException1(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class checkAge1
{
	void Age(int age) throws AgeLimitException1  {
		if(age>20)
			System.out.println("your are good to go to abroad");
		else
			throw new AgeLimitException1("your are not elligible bro");
	}
}

public class example2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		checkAge1 c = new checkAge1();
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter your age");
			int age = scanner.nextInt();
			c.Age(age);
		}
		catch(AgeLimitException1 e) {
			System.out.println(e.getMessage());
		}
	}

}