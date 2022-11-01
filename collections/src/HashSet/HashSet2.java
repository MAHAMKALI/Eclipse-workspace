package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(30);
		al.add(20);
		al.add(60);
		al.add(45);
		
		//System.out.println(al);  [10, 20, 30, 30, 30, 20, 60, 45]
		
		//removing duplicates from arraylist using hashset
		
		HashSet<Integer> hs = new HashSet<Integer>(al);
		
		//System.out.println(hs);   [20, 10, 60, 45, 30]
		
		
		
		
	}

}
