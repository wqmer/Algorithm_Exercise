package crackingCodeOneString;
import java.util.Arrays;

// java.util.Arrays.sort
// toCharArray()
// equals()
//solution 1
public class Check_permutation {
public static String sort_string( String s) {
	char [] temp = s.toCharArray();
	Arrays.sort(temp);
	String m = new String(temp) ;
	return m ;
}
public static boolean solution_one (String a ,String b ){
	if (a.length() != b.length() ) {
		return false ;
	}
//	String A = sort_string (a);
//	String B = sort_string (b);
//	for ( int i = 0 ; i < a.length() ; i ++ )
//	{
//	if ( A.charAt(i) != B.charAt(i))
//		return false ;
//	}
//	return true ;
	return sort_string (a).equals(sort_string(b));
   }


//solution 2 
public static boolean solution_two ( String a , String b){
	if (a.length() != b.length() ){
		return false ;
	}
	int [] val = new int [180]; //assumption 
		char [] A = a.toCharArray();
		char [] B = b.toCharArray();
		for ( char c : A ){
			val[c]++ ;
		}
		for (char d : B){
			val[d]-- ;
			if (val[d] < 0 ){
				return false ;
			}
		}
		
		return true ;
	}
	

}




