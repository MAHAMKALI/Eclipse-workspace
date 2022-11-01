package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "sai");
		hm.put(102, "kishore");
		hm.put(103, "priyanka");
		hm.put(104, "sai"); //value can be duplicate but key must be unique
		
		//System.out.println(hm);   {101=sai, 102=kishore, 103=priyanka, 104=sai}
		
		hm.put(105, null);
		//System.out.println(hm); {101=sai, 102=kishore, 103=priyanka, 104=sai, 105=null}
		Set<Integer> s =  hm.keySet();
		//System.out.println(s);  [101, 102, 103, 104, 105]
		Collection<String> val = hm.values();
		//System.out.println(val); [sai, kishore, priyanka, sai, null]
		Set<Entry<Integer,String>> ss=  hm.entrySet();
		for(Entry<Integer,String> e:ss) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		
	}

}
