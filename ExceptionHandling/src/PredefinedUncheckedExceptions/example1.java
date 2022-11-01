package PredefinedUncheckedExceptions;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0); //java.lang.ArithmeticException: / by zero
			System.out.println("remaining code will not execute after exception");
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}

}
