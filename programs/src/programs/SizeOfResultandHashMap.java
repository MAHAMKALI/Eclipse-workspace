package programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SizeOfResultandHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in))
		{
			int n = scanner.nextInt();
			HashMap<Integer, String> hm = new HashMap<Integer,String>();
			for(int i=0;i<n;i++) {
				int key=scanner.nextInt();
				String value = scanner.next();
				hm.put(key, value);
			}
			System.out.println(UserMainCode7.sizeOfResultandHashMap(hm));
			
		}
	}

}
class UserMainCode7
{
	static int sizeOfResultandHashMap(HashMap<Integer,String> hm) {
		int c=0;
		Set<Entry<Integer, String>> set =  hm.entrySet();
		for(Entry<Integer, String> e:set) {
			if(e.getKey() % 4 != 0) {
				c++;
			}
		}
		return c;
	}
}