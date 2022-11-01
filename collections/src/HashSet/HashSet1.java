package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10); //duplicate
		hs.add(20); //duplicate
		//System.out.println(hs); [20, 10, 30] -> insertion order not preserved
		
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
