package crackingCodeThreeStacksAndQueues;

import java.util.Stack;

public class SortStack {
	
	void sort( Stack <Integer> n){
		Stack <Integer> t = new Stack <Integer>() ;
		while(! n.empty()){
			int temp = n.pop() ;
			
			while(! t.isEmpty() && temp<t.peek()){
				t.push(n.pop());
				
			}
			
			t.push(temp);	
		}
		
		while(!t.isEmpty()){
			
			n.push(t.pop());	
		}
	}

}
