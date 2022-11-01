package Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push("kishore");
		s.push(null);
		s.push(new RUBBER("camel"));
		//print data
		//System.out.println(s);   [10, kishore, null, Stack.RUBBER@76ccd017]
		
		s.pop();
		//System.out.println(s);   [10, kishore, null]
		
		//see top most element
		
		//System.out.println(s.peek());   null
		
		
		//System.out.println(s.empty());   false
		
		//get first element
		
		//System.out.println(s.get(0));  10
		
		
		
		
		
	}

}
class RUBBER
{
	String name;
	RUBBER(String name){
		this.name = name;
	}
}