package crackingCodeTwoLinkedlist;

public class Sum_list {
  public Node<Integer> addlist (Node<Integer> list1 , Node<Integer> list2  , int carry ){
	  if(list1 == null && list2 == null && carry ==0 ) return null ;
	  Node<Integer> result = null;
	  int value = carry ;
	  if (list1 != null){
		  value += list1.Data ;
	  } 
	  if (list2 != null){
		  value += list2.Data ;
	  }
	  
	  result.Data = value % 10 ; //current digit
	  
	  
	  //recurse
	  if (list1 != null || list2 != null){
		  
		  Node<Integer> next =  addlist ( list1 == null ? null :list1.next,
			                              list2 == null ? null :list2.next,
			                              value >= 10 ? 1 : 0 ) ;
                               
	        result.next = next ;
	  }  
	  return result ;
  }

  //public Node<Integer> addlistFollowUp

}
