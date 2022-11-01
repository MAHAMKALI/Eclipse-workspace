package programs;
import java.util.*;
public class getElementPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String strings[] = new String[num];
		for(int i=0;i<num;i++) {
			strings[i]=sc.next();
		}
		String element = sc.next();
		System.out.println(UserMainCode5.getElementPosition(strings,element));
		sc.close();
	}

}
class UserMainCode5{
	static int getElementPosition(String[] strings,String element) {
		int idx=0;
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<strings.length;i++) {
			arr.add(strings[i]);
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		for(int i=0;i<arr.size();i++) {
			if(element.equals(arr.get(i))) {
				idx = i+1;
				break;
			}
			
		}
		return idx;
	}
}