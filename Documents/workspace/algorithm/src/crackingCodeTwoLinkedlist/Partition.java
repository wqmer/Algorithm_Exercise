package crackingCodeTwoLinkedlist;

public class Partition { 
    
    public Node<Integer> Partition( Node <Integer> list , int a) {  
      Node <Integer> temp1 = null;
      Node <Integer> temp2 = null;
      Node <Integer> small = null;
      Node <Integer> large = null;
      
      temp1 = small ; // use a list to set the head and return it in the future as a result
      temp2 = large ;
     
      while (list != null){
    	  Node <Integer> next = list.next;
    	  list.next = null  ;
    	  if (list.Data < a ) 
    		  {
    		  temp1.next = list;// cant use temp1 = list because the action of moving next point well replace it .
    		  temp1 = temp1.next;
    		  }
    	  else{  
    		  temp2.next = list ;
    		  temp2 = temp2.next ;	  
    	  }
    	  list = next ;    
      }
      
      if (small == null) return large ; //check 
      temp1.next = large ;//merge 2 part to a one list
      return small;
}
    public Node<Integer> Partition2(Node <Integer> list , int a) {
    	// use original list instead of creating a new list  . Set a list receive the updated original list ,return it 
    	Node <Integer> head  = list ;
    	Node <Integer> tail  = list ;
    	
    while (list != null){
    	Node <Integer> next = list.next ;
    	if (list.Data < a )
    	{    
    		list.next = head ;
    		head = list ;	
    	}else
    	{
    		
    		
    	list.next = tail ;	
    	tail = list;
    	}
    	
    }
    	
     return head ;
    }
    //uncompleted
    
}

