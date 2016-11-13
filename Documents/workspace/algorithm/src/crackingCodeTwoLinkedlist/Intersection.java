package crackingCodeTwoLinkedlist;

public class Intersection {
	
	
class result 
{    
	public int size ;
	public Node tail ;
	public result (Node tail, int size)
	{
		this.tail = tail ;
		this.size = size ; 	
	}	
}

public result getSizeAndTail(Node list)
{   
	if ( list == null ) return null ;
	int size = 0 ;
	while ( list != null){
		list = list.next  ;
		size ++ ;
	}
	
	result temp = null ;
	temp.size = size ;
	temp.tail = list ;
	return temp ;
}

public Node Kthlist (Node list , int k){
	if (list == null) return null ;	
	while (list != null)
	{
		list = list.next ;
		k--;

	}
	return list ;
}

public Node intersectionResult(Node list1 , Node list2)
{    if (list1 == null || list2 == null) return null ;
     if (getSizeAndTail(list1).tail != getSizeAndTail(list2).tail) return null ;
	
    Node longlist = null ;
    Node shortlist = null ;
	
    
    //longlist = getSizeAndTail(list1).size > getSizeAndTail(list2).size ? list1:list2 ;
    //shortlist = getSizeAndTail(list1).size > getSizeAndTail(list2).size? list2:list1 ;
    
    
    if (getSizeAndTail(list1).size > getSizeAndTail(list2).size)
    {
    	longlist = list1 ;
    	shortlist = list2 ;
    }
    else {
    	longlist = list2 ;
    	shortlist =list1 ;
    }
    
    longlist = Kthlist (longlist, Math.abs(getSizeAndTail(list1).size-getSizeAndTail(list2).size) );
    
    
    while(shortlist != null && shortlist!=longlist)
    {
    	shortlist = shortlist.next ;
    	longlist = longlist.next ;
    	
    }
    
	return longlist ;
}



}
