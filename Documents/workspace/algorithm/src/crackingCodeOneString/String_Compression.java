package crackingCodeOneString;
//String.valueOf() + Integer.toString();
//StringBuilder

public class String_Compression {	
public String sc (String test) {
	int i = 0 ;
	int j = 0 ;
	int k = 0 ;
	int[] counter = new int[test.length()];
	
for (j = 0 ; j < test.length() -1 ; j++ ){
	 i = j ;
	if (test.charAt(i) == test.charAt(j+1)) {
		counter[k]++ ;	
	} else {  
	        k++;
	} 
	
}

int index =  0          ;
String str = new String ();
 for (i = 0 ; i < k + 1 ; i ++ )
 {  
	 if( i == 0 ){
		 str =   String.valueOf(test.charAt(counter[i]) + Integer.toString(counter[i] + 1));
	     index = counter[i]  ;
	 }
	 if (i  > 1  ||  i == 1)   {
         index =  index + counter[i-1] +1 ;
	      str = str + String.valueOf(test.charAt(index) + Integer.toString(counter[i] + 1));
	
	 }
  }

if (str.length() > test.length() )
	return test ;

else
	return  str ;
	
}
public String sc2(String test) {
	StringBuilder compression = new StringBuilder ();
	int counter = 0 ;
	for (int i = 0 ; i < test.length() ; i++){
		counter ++ ;
		if (i + 1 >= test.length() || test.charAt(i) != test.charAt(i+1))
		{
			compression.append(test.charAt(i));
			compression.append(counter);
			counter = 0 ;
		}
		
 	
	}
	return (compression.length() < test.length() ? compression.toString():test)	 ;
	
}
}


