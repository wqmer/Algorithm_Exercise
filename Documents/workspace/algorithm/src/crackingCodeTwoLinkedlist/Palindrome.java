package crackingCodeTwoLinkedlist;

//reversed and check
public class Palindrome {
	
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
}
