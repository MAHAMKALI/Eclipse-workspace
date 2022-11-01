package programs;
import java.util.Scanner;

public class FetchingMiddleCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(UserMainCode2.getMiddleChars(str));
		sc.close();
	}

}
class UserMainCode2{
	static String getMiddleChars(String s) {
		return s.substring(1,s.length()-1);
	}
}