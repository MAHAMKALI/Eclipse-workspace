package PredefinedUncheckedExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)){
			int[] arr = {10,20,30};
			
			System.out.println("enter index");
			
			int index = scanner.nextInt();
			
			System.out.println(arr[index]);  //(Index 10 out of bounds for length 3) if index = 10
			
			System.out.println("enter value");
			
			@SuppressWarnings("unused")
			int number1=scanner.nextInt(); //(java.util.InputMismatchException)   if i was enter null
			
			String s=null;  
			System.out.println(s.length());//NullPointerException  
			
			@SuppressWarnings("unused")
			int number2=Integer.valueOf("ten"); //java.lang.NumberFormatException: For input string: "ten"
			
			
			System.out.println("kishore".charAt(10));  //java.lang.StringIndexOutOfBoundsException: String index out of range: 10
			
			System.out.println("remaing code will not execute after exception line");
		}
		catch(StringIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());	//String index out of range: 10
			//e.printStackTrace();
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai.getMessage());
		}
		catch(InputMismatchException im) {
			//System.out.println(im.getMessage());  null
			//im.printStackTrace();
			System.out.println(im);
		}
		catch(NumberFormatException aa) {
			System.out.println(aa);
		}
		catch(NullPointerException ne) {
			System.out.println(ne.toString());
		}
	}

}
