package PredefinedCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}

}
