package crackingCodeThreeStacksAndQueues;

import java.util.EmptyStackException;

// fixed
public class ThreeInOne {
	
	class FixedMutliStack
	{
		private int numberOfStack = 3 ;
		private int stackCapacity;
		private int [] values ;
		private int [] sizeOfStack ;//current size of stack #
		
		public FixedMutliStack (int stackSize)
		{
			stackCapacity = stackSize ;
			values = new int[stackSize * numberOfStack];
			sizeOfStack  = new int [numberOfStack];
			 	
		}
		
		public void push(int stackindex , int value ) //throws FullStackException
	   {
//		    if ( isFull(stackindex) ) {
//			throw new FullStackException();
//		   }
			sizeOfStack[stackindex]++ ;
			values[indexOfTop(stackindex)] = value ;	
		}
		
		
		
		public int pop(int stackindex ) {
			if ( isEmpty (stackindex)) throw new EmptyStackException() ;
		    int temp = values[indexOfTop(stackindex)] ;
		    values[indexOfTop(stackindex)] = 0 ;
		    sizeOfStack[stackindex] -- ;
		     return temp ;
		}
		
		public int peek (int stackindex){
			if ( isEmpty (stackindex)) throw new EmptyStackException() ;
			return  values[indexOfTop(stackindex)] ;
		}
		
		public boolean isEmpty(int stackindex){
			return sizeOfStack[stackindex] == 0 ;
		}
		
		
		public boolean isFull(int stackindex){
			return sizeOfStack[stackindex] == stackCapacity ;
		}
		
		
		private int indexOfTop(int stackindex){
			int offset = ( stackindex - 1 ) * stackCapacity;
			return offset + sizeOfStack[stackindex] ;
			
			
		}
		
		
	}
	
	

}
