package Vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(10);
		v.add("kishore");
		v.add(null);
		v.add(10);
		v.add(23.5f);
		v.add(new DOOR(10,"abc"));
		
		//print vector
		//System.out.println(v);     [10, kishore, null, 10, 23.5, Vector.DOOR@762efe5d]
	}

}
class DOOR
{
	int did;
	String dname;
	DOOR(int x,String y){
		did = x;
		dname = y;
	}
}