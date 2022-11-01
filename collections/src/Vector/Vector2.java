package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector2{
	public static void main(String[] args) {
		Vector<DOOR1> v = new Vector<DOOR1>();
		
		v.add(new DOOR1(121,"ABC"));
		v.add(new DOOR1(122,"BC"));
		v.add(new DOOR1(123,"AC"));
		v.add(new DOOR1(124,"RBC"));
		v.add(new DOOR1(125,"BRC"));
		
		Enumeration<DOOR1> e =  v.elements();
		
		while(e.hasMoreElements()) {
			DOOR1 d = e.nextElement();
			
			System.out.println(d.did+" "+d.dname);
		}
		
	}
}

class DOOR1
{
	int did;
	String dname;
	DOOR1(int x,String y){
		did = x;
		dname = y;
	}
}