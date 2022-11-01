package LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(al);
		
		//System.out.println(hs);  [10, 20, 30, 60, 45]
		
	}

}
