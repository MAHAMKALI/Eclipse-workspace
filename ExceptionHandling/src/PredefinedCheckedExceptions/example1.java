package PredefinedCheckedExceptions;



public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
	}

}
