package ArrayList;

import java.util.ArrayList;

public class ArrayList3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<EMP> arrayList = new ArrayList<EMP>();
		
		arrayList.add(new EMP(10,"SAI"));
		arrayList.add(new EMP(11,"KISHORE"));
		arrayList.add(new EMP(12,"PRIYAKA"));
		
		for(EMP i:arrayList) {
			System.out.println(i.eid+" "+i.ename);
		}
		

	}

}

class EMP 
{
	int eid;
	String ename;
	EMP(int eid,String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
}
