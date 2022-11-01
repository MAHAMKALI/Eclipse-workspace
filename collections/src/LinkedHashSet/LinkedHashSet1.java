package LinkedHashSet;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10); //duplicate
		hs.add(20); //duplicate
		//System.out.println(hs); [10, 20, 30] -> insertion order not preserved
		
		//print data using foreach
		for(Integer i:hs) {
			System.out.println(i);
		}
		System.out.println();
		//print using iterator
		
		Iterator<Integer> itr =  hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
