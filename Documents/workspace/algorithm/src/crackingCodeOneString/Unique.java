package crackingCodeOneString;
//  string.charAt() 

public class Unique {
	
public boolean isunique ( String test ) {
     if ( test.length() > 128 ) return false ;
     boolean[] check  = new boolean[128];
     int val = 0 ; 
     for ( int i = 0 ; i < test.length(); i++ )
     {
    	 val = test.charAt(i);
    	if ( check[val] ) return false ;
    	    check[val] = true ;
      }

return true ;
}


}
