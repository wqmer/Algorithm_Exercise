package crackingCodeTwoLinkedlist;

public class Node<type> { 
	public Integer Data ;
	public Node<type> next ;
	
	public Node( Integer Data , Node<type> next) {
		this.Data = Data ;
		this.next = next ;
	
	}
	
//Recursion	
public Node <type> reverse(Node <type> list){
	if ( list.next == null || list == null)
return list ;
	Node <type> current ;
	current = list.next ;
	list.next = null ;
	current.next = list ;
	return reverse(list.next) ;
}

//Iteration
public Node <type> reverse2 (Node <type> list)
{  	if ( list.next == null || list == null)
	return list ;
Node <type> rev_list = null  ;


while(list != null ){
	rev_list.next = rev_list ;
	rev_list = list ;
	list = list.next;
}
	return rev_list;
			
}

//test uncompleted 
public static void main (String[] args){

	
}


	 
}
