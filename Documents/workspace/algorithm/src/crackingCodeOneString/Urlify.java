package crackingCodeOneString;

public class Urlify {
	
	public static String replace_space (String test){
		char[] t = test.toCharArray();
		int i = 0 , space_value = 0;
		for (i=0; i< t.length; i++ ){
			if (t[i] == ' '){
				space_value++;
			}	
		}
		if (space_value == 0 ) {
			return test ;
		}
		
		
		int index_ex= t.length + space_value*2;
		char [] T = new char[index_ex];
		int j = 0 ;
		int k = 0 ;
		int power = 0;
		for (k = 0, j = 0 ; j < t.length; k++, j++) {
			if (t[j] == ' '){
				power ++;
				T[k] = '2';
				T[k+1] = '0';
				T[k+2] = '%';
				k = j + 2*power;
			}else 
		     { T[k] = t[j] ;
					 
		     }
				
				
			}
				
		
		return new String (T) ;
	}

}
