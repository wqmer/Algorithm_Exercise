package crackingCodeOneString;

public class One_Away {
public static boolean IsOneAway(String A , String B){
	if (B.length( ) - A.length() > 1 && A.length() - B.length() > 1){
		return false ;
	}
	
	if (B.length() == A.length()){
		int k = 0 ;
		for (int i = 0 ; i < A.length() ; i ++ ){
			if(A.charAt(i) != B.charAt(i)){
				k++ ; 
			}
		}	
		if (k == 1) {
			return true;
		}
		else {return false ;}
		
	}
	
	 StringBuffer temp = new StringBuffer(); 
	 if (A.length() == B.length() + 1){
		 for ( int j = 0 ; j < A.length(); j++) {
	          temp = new StringBuffer(A).deleteCharAt(j);
	          
		   if  ( B.equals(temp.toString()) ){
			   return true ;
		        }
		 }
	 }else {return false;}
	 
	
	 if (B.length() == A.length() + 1){
		 for ( int j = 0 ; j < B.length(); j++) {
	          temp = new StringBuffer(B).deleteCharAt(j);
	          
		   if  ( A.equals(temp.toString()) ){
			   return true ;
		        }
		 }
	 }else {return false;}
	 

return true ;	
}
}
