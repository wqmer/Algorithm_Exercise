package crackingCodeTwoLinkedlist;

public class ReturnKthtoLast {
	
//return a index ，Recursion
public int RetrunKtoLast (Node<Character> list , int k){
   if (list == null) return 0;
  // while(list != null) ,error
    int index = RetrunKtoLast(list.next , k) + 1;
	if (index == k ) System.out.println("The "+k+"th node is" + list.Data);
	return index ;
}


public Node ReturnKtoLast2(Node<Character> list, int k){
	Node p1 = list ;
	Node p2 = list ;
	if (list == null) return list ;
	
	for(int i = 0 ; i < k ; i++ ){
		if (list == null) return null ;
		p1 = p1.next ;
	}	
	while(p1 != null)
	{
		p1 = p1.next ;
		p2 = p2.next ;		
	}
	return p2 ;
}
}



