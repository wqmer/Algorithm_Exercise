package crackingCodeTwoLinkedlist;

public class LoopDetection {
	
	
	Node loopstart( Node list ) {
		if (list == null ) return null ;
		Node slower = list ;
		Node faster = list ;
		
	    while (faster != null && slower != faster ){
	    	   slower = slower.next ;
	    	   faster = faster.next.next ;
	    	
	    }
	    
	    slower = list ;
	    while (slower != null && slower != faster){
	    	   slower = slower.next ;
	    	   faster = faster.next ;
	    }
	    
		return slower ;
	}

}
