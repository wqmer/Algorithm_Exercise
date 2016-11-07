package crackingCodeOneString;

// Character.getNumericValue   
//unicode

public class Plaindrome_Permutation {

	public static boolean check_pp (String test){
	   char[] content = test.toCharArray();
	   if (content.length == 1){
		   return true ;
	   }
	   
	   int[] val = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
	   for(char c : content){
		   val[c]++ ; 	   
	   }
	   
	   //if the length is even 
	   if (content.length %2 == 0 ){
		   for ( int b : val){
			   //all the result mod 2 should be 0, check it !
			   if ( b %2 != 0){
				   return false ;
			   }     
		   }   
	   }
	   
	   //if the length is odd
	   int j = 0 ;
	   if (content.length %2 ==1){
		   for (int b : val){
			   
			   if (b%2 == 1){
				   j ++ ;				   
			   }	   
		   }
		   //the (mod 2 ) result equals one , should't be more than 1 times ,check it !
		   if (j > 1) {
			   return false ;
		   }
	   }
	  
		return true ;
	}
	
	
	
	
	
}
