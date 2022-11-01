package PredefinedCheckedExceptions;
/* exception in m1() is deligated to m2() by throws keyword. and m2() also deligates exception to main method
 * by throws keyword and finally main method handled the exception raised in m1();
 * */
class A
{
	void m1() throws InterruptedException  {
		Thread.sleep(1000);
		System.out.println("remaining code executed");
	}
}
class B extends A
{
	void m2() throws InterruptedException {
		m1();
	}
}

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		try
		{
			b.m2();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}

	}

}
