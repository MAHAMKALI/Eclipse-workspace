package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("sai");
		al.add("kishore");
		al.add("mohan");
		//al.add(10);  get an error because of heterogenous data
		
		al.add("ravi");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
