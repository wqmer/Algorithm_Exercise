package crackingCodeOneString;

//substring(begingindex,endindex) ,string.equals() or sbustring (int index)
public class String_Rotation {

	public boolean isRotation (String a , String b) {
     String aa = a + a ;   
	 if (a.length() == b.length() && a.length() > 0)
		 return isSubstring(aa, b); 
	 return false ;
	 
	}
	
	public boolean isSubstring (String a, String b) {
		if ( a.length() <= b.length() )  { return false ;}
		
	        for (int i = 0 ; i < a.length() - b.length() + 1 ; i++){
			  if(a.substring(i, i + b.length()).equals(b) ) { 
				  return true ;
			  }
	        }   
	        
	    return false ; 	
	}
    public boolean isSubstring2(String a ,String b) {
    	if (b.length() == 0)
        return false;

        if (a.equals(b))
        return true;

    else     
        return (isSubstring(a, b.substring(0,b.length()-1))||isSubstring(a, b.substring(1)));            
}
    
}
