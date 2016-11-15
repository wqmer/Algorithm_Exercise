package crackingCodeThreeStacksAndQueues;

import java.util.EmptyStackException;

public class MyStack<T>{

	public static class StackNode<T> 
	{
		
		private T data ;
		private StackNode<T> next ;
		private StackNode(T data){
			this.data = data ;	
		}
			
	}
	
	private StackNode<T> top ;
	
	public T pop()
	{
		if (top == null) throw new EmptyStackException();
		//StackNode<T> temp = new StackNode<T>(top.data);
		T temp = top.data ;
		top = top.next ;
		return temp ;
	}
 	
	public void push(T item)
	{
		if (top == null) top.data = item ;
		
		StackNode<T> current = new StackNode<T>(item);
		current.next = top ;
		top = current ;
	}
	
	public T peek(){
		if (top == null) throw new EmptyStackException();
		return top.data ;
	
	}
	
	public boolean isEmpty(){
		
		return top == null ;
		
	}	
	
}
