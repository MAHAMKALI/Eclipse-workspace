package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList<PROJECT> arrayList = new ArrayList<PROJECT>();
		arrayList.add(new PROJECT(101,"IOT"));
		arrayList.add(new PROJECT(102,"JAVA"));
		arrayList.add(new PROJECT(103,".NET"));
		
		//PRINT DATA USING ITERATOR CURSOR
		
		Iterator<PROJECT> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			PROJECT p = itr.next();
			System.out.println(p.pid+" "+p.pname);
		}
		
		System.out.println();
		//PRINT DATA USING LISTITERATOR
		ListIterator<PROJECT> li=  arrayList.listIterator();
		
		while(li.hasNext()) {
			PROJECT p1 = li.next();
			System.out.println(p1.pid+" "+p1.pname);
		}
		System.out.println();
		
		//PRINT DATA IN REVERSE ORDER USING LISTITERATOR
		
		while(li.hasPrevious()) {
			PROJECT p2 = li.previous();
			System.out.println(p2.pid+" "+p2.pname);
		}
	}
}

class PROJECT
{
	int pid;
	String pname;
	PROJECT(int p_id,String p_name){
		pid = p_id;
		pname=p_name;
	}
}