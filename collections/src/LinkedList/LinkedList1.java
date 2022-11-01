package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList li = new LinkedList();
		li.add(10);
		li.add("kishore");
		li.add(20.5);
		li.add(null);
		//System.out.println(li);  [10, kishore, 20.5, null]
		
		li.addFirst(230);
		//System.out.println(li);  [230, 10, kishore, 20.5, null]
		
		li.addLast(350);
		//System.out.println(li);  [230, 10, kishore, 20.5, null, 350]
		
		String s = (String)li.get(2);
		//System.out.println(s);   kishore
		
		//enter TABLE OBJ data
		li.add(new TABLE(123,"TABLE1"));
		//System.out.println(li);       [230, 10, kishore, 20.5, null, 350, LinkedList.TABLE@41a4555e]
		
		//print all data
		
        /*for(Object o:li) {
			if(o instanceof Integer)
				System.out.println(o);
			else if(o instanceof Double)
				System.out.println(o);
			else if(o instanceof String)
				System.out.println(o);
			else if(o instanceof TABLE) {
				TABLE t = (TABLE)o;
				System.out.println(t.tid+" "+t.tname);
			}
			else if(o==null)
				System.out.println(o);
		} 
		*/
		
		li.removeFirst(); 
		//System.out.println(li);      [10, kishore, 20.5, null, 350, LinkedList.TABLE@41a4555e]
		
		li.removeLast();
		//System.out.println(li);      [10, kishore, 20.5, null, 350]
 
	}

}
class TABLE
{
	int tid;
	String tname;
	TABLE(int x,String y){
		tid = x;
		tname=y;
	}
}