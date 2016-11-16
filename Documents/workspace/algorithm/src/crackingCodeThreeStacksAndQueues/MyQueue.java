package crackingCodeThreeStacksAndQueues;

import java.util.NoSuchElementException;



public class MyQueue <T> {
public static class queuelist<T>
{
	private T data ;
	private queuelist <T> next ;
	private queuelist (T data)
	{
		this.data = data ;	
	}
	
}
	public queuelist<T> first;
	public queuelist<T> last;

	public void add(T item){
		queuelist<T>  temp = new queuelist<T>(item);
	    if (last != null){
	    	last.next =  temp ;// set the current.next point to the new node
	    }
		last = temp ;//move the point to the new node
		if(first == null)
		{
			first = last ;
			
		}    
//		queuelist temp = queue;
//		if (temp == null) queue.data = item ;
//		else{
//	           while (temp.next != null){
//	        	   temp = temp.next ;     
//	           }
//	           temp.next = new queuelist<T>(item) ;
//		    }
	
		
	    }
		
	 public T remove(){
		 if (first == null) throw new NoSuchElementException();
		 T data = first.data ;
		 first = first.next ;
         if(first == null) last = null;
         return data ;
         
     }
	
	public T peek(){
		if (first == null) throw new NoSuchElementException();
		return first.data;
			
	}
	
	public boolean isEmpty(){
		
		
		return first == null ;
		
	}
	
	
	
}
