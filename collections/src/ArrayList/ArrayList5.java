package ArrayList;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(30);
		l1.add(60);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>(l1);
		l2.add(40);
		l2.add(80);
		
		//System.out.println(l2); [10, 30, 60, 40, 80]
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(101);
		l3.add(102);
		
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(103);
		l4.add(104);
		
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		l5.addAll(l3);
		l5.add(23);
		l5.addAll(l4);
		//System.out.println(l5); [101, 102, 23, 103, 104]
		
		//check l1 is contained in l2 are not
		System.out.println(l2.containsAll(l1));  //true
		
		l2.removeAll(l1);
		//System.out.println(l2); [40, 80]
		
		l1.retainAll(l2);
		//System.out.println(l2);  [40,80];
		
		
		
		
		
		
		
	}

}
