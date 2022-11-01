package programs;
import java.util.*;
public class SortMergedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			list1.add(sc.nextInt());
		}
		for(int i=0;i<5;i++) {
			list2.add(sc.nextInt());
		}
		list3 = UserMainCode3.sortMergeArrayList(list1,list2);
		for(int i=0;i<3;i++) {
			System.out.println(list3.get(i));
		}
		sc.close();
	}
}
class UserMainCode3{
	static ArrayList<Integer> sortMergeArrayList(ArrayList<Integer> list1,ArrayList<Integer> list2){
		list1.addAll(list2);
		Collections.sort(list1);
		ArrayList<Integer> res  = new ArrayList<Integer>();
		res.add(list1.get(2));
		res.add(list1.get(6));
		res.add(list1.get(8));
		return res;
	}
}
