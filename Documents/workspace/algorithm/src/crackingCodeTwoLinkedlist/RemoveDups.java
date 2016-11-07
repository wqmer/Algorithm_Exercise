package crackingCodeTwoLinkedlist;

import java.util.HashSet;

public class RemoveDups {
	public void removeDups ( Node list){
	Node temp = null ;
	HashSet<Integer> s = new HashSet<Integer>();
   while (list.next != null ){
	   if(s.contains((Integer) list.Data)){
		   
		// actually ,list.next is list.next.next as the list = list.next in every circle 
		   temp.next = list.next; //remove the Dups 
	   }else {
		   s.add((Integer) list.Data);
		   temp = list ;
		   
	   }
	   
	   list = list.next ;
	   
	   
   }
	
	
	}

}
