package programs;
import java.util.*;
public class StringEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(UserMainCode4.encrypt(str));
		sc.close();
	}

}
class UserMainCode4{
	static String encrypt(String str) {
		StringBuffer sb = new StringBuffer();
		char ch;
		int i;
		for(i=0;i<str.length();i++) {
			if(i%2==0) {
				if(str.charAt(i)=='z') {
					if(str.charAt(i)=='z' && i==0) {
						ch = 'A';
					}
					else {
						ch = (char)(str.charAt(i)-25);
					}
					sb.append(ch);
				}
				else {
					ch = (char)(str.charAt(i)+1);
					sb.append(ch);
				}
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}