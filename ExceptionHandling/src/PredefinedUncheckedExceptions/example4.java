package PredefinedUncheckedExceptions;
/*exception automaticaly propaged in unchecked exception.here m1 deligates exception to m2 and m2 deligates 
 * exception to main method .finally main method handled the exception which was raised at m1();
 */
class A
{
	void m1() {
		System.out.println(100/0);
	}
}
class B extends A
{
	void m2() {
		m1();
	}
}
public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		try {
			b.m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
	}

}