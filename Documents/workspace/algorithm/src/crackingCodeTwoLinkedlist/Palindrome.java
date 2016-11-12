package crackingCodeTwoLinkedlist;

import java.util.Stack;


public class Palindrome {
	//reversed and check
	public boolean palindorme (Node list)

	{ if ( list == null || list.next  == null) return false ;
		Node copy  = list ;
		Node reverse = null ;
		while (copy != null)
		{
			//copy.next = reverse ;
			//reverse = copy ;
			reverse.next = reverse ;
			reverse = copy ;
			copy= copy.next ;
		}
		
		while (list!= null)
		{
			if  (list.Data == reverse.Data) 
			{ list = list.next ;
			  reverse = reverse.next ;
			}
			else return false ;
		}
		
	return true ;	
		
	}
     //fast runner and slow  runner pointer , with a stack  
    public boolean palindorme2 (Node list){
     	
    	Stack <Integer> st = new Stack<Integer>();
    	Node fast = list ;
    	Node slow = list ;
    	
    	while(fast != null && fast.next != null){
    		st.push(slow.Data);
    		fast = fast.next.next ;
    		slow = slow.next ;  		
    	}
    	
    	if (fast !=null)slow = slow.next ;//skip the middle
    	
    	while(slow != null )
    	{  int top = st.pop().intValue();
    	    if ( top != slow.Data) {
    	    	return false ;
    	    }
    	       slow = slow.next ;
    	 }  
    	
    	return true ;
    }



}
