package crackingCodeTwoLinkedlist;

public class Delete_Middle_Node {
	
boolean DeleteMiddleNode(Node list) {
	
if (list.next == null ) return false ;
	Node Newlist = list.next ;
	list.Data = Newlist.Data ;
	list.next = Newlist.next ;
    return true ;		
}

}
