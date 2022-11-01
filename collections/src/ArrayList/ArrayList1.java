package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList = new ArrayList(); //showing blub symbol bcz of not generic version 
		arrayList.add(10);
		arrayList.add("Kishore");
		arrayList.add(null);
		arrayList.add("Kishore");
		for(Object o : arrayList) {
			if(o instanceof Integer)
				System.out.println(o);
			else if(o instanceof String)
				System.out.println(o);
			else if(o==null)
				System.out.println(o);
		}

	}

}
