package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<LAPTOP> linkedList = new LinkedList<LAPTOP>();
		linkedList.add(new LAPTOP(101,"HP",2300.23f));
		linkedList.add(new LAPTOP(102,"DELL",1300.2f));
		linkedList.add(new LAPTOP(103,"SONY",4300.00f));
		linkedList.add(new LAPTOP(104,"SAMSAUNG",3412.56f));
		
		//PRINT USING FOREACH LOOP
		
		for(LAPTOP l:linkedList) {
			System.out.println(l.lid+" "+l.lname+" "+l.lcost);
		}
		
		System.out.println();
		//PRINT USING ITERATOR
		Iterator<LAPTOP> itr =  linkedList.iterator();
		
		while(itr.hasNext()) {
			LAPTOP l = itr.next();
			System.out.println(l.lid+" "+l.lname+" "+l.lcost);
			
		}
		System.out.println();
		//PRINT DATA USING LISTITERATOR
		
		ListIterator<LAPTOP> li =  linkedList.listIterator();
		
		
		while(li.hasNext()) {
			LAPTOP l = li.next();
			System.out.println(l.lid+" "+l.lname+" "+l.lcost);
		}
		
		System.out.println();
		
		//PRINT DATA IN REVERSE ORDER BY LISTITERATOR
		
		while(li.hasPrevious()) {
			LAPTOP l = li.previous();
			System.out.println(l.lid+" "+l.lname+" "+l.lcost);
		}
		
		
		
	}

}

class LAPTOP
{
	int lid;
	String lname;
	float lcost;
	LAPTOP(int x,String y,float z){
		lid = x;
		lname = y;
		lcost = z;
	}
}
