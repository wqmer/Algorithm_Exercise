package crackingCodeThreeStacksAndQueues;

import java.util.Stack;

public class QuereViaStacks {
	
	class MyQueue<T>
	{
		
		Stack<T>  oldstack ;
		Stack<T>  newstack ;
		
		public MyQueue ()
		{
	    oldstack = new Stack<T>  ();
		newstack = new Stack<T>  ();
		}
			
		
		public void add (T value){
		newstack.push(value);	
		}
		
		public void shift(){
			if (oldstack.isEmpty()){
				while(!newstack.isEmpty()){
					oldstack.push(newstack.pop());
				}	
			}
		}
		
		public T peek(){
			shift();
		    return oldstack.peek() ;	
		}
		
		public T remove(){
			shift();
			return oldstack.pop();	
		}
		
		
	}

}
