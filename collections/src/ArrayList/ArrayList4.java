package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			arrayList.add(i);
		}
		
		//print arraylist
		System.out.println(arrayList);
		
		//get size of arraylist
		
		System.out.println("size of arraylist is "+arrayList.size());
		
		//get 5th element
		System.out.println(arrayList.get(4));
		
		//remove 5th element
		
		arrayList.remove(4);
		System.out.println(arrayList);
		
		//set 4th element with 100
		
		arrayList.set(3, 100);
		System.out.println(arrayList);
		
		//check 100 element is there or not
		System.out.println(arrayList.contains(100));
		
		//get indexOf 100 element
		System.out.println(arrayList.indexOf(100));
		
		//get subList from 4th index to 8th index
		
		System.out.println(arrayList.subList(4, 8)); //[4 to 7]
		
		//sort all elements
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		//check list is empty or not
		System.out.println(arrayList.isEmpty());
		
		//delete all list elements
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
	}

}
