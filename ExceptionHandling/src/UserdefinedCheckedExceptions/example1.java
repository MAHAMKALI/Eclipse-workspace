package UserdefinedCheckedExceptions;

import java.util.Scanner;


@SuppressWarnings("serial")
class AgeLimitException extends Exception
{

	
	//default constructor
}

class checkAge
{
	void Age(int age) throws AgeLimitException  {
		if(age>20)
			System.out.println("your are good to go to abroad");
		else
			throw new AgeLimitException();
	}
}

public class example1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		checkAge c = new checkAge();
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter your age");
			int age = scanner.nextInt();
			c.Age(age);
		}
		catch(AgeLimitException e) {
			System.out.println("opps!!..your not elligible to go for abroad");
		}
	}

}

