package test;

public class NumberPuzzle {
	
	String answer ;
	
    public String check (String answer ,  String num ){
    this.answer = answer ;
    int m = 0 ;
    int n = 0 ;
  
    char[] Num = num.toCharArray() ;
    char[] Answer = answer.toCharArray();
    
    if (Num.length != 4 ){
    	return "Error ! please input a 4-digit nubmer !" ;
    }

    if (Answer.length !=4 ){
    	return "Error ! please input a 4-digit nubmer !" ;
    }
    for (int i = 0 ; i < 4 ; i++ ){
    	if ( Num[0] == Answer[i]) {
    		if (i == 0 ){ 
    			m++ ;
    			n++ ;
    		}else { n ++ ;}		
    	}
    	
    	if ( Num[1] == Answer[i]) {
    		if (i == 1 ){ 
    			m++ ;
    			n++ ;
    		}else { n ++ ;}		
    	}
    	
    	if ( Num[2] == Answer[i]) {
    		if (i == 2 ){ 
    			m++ ;
    			n++ ;
    		}else { n ++ ;}		
    	}
    	
    	if ( Num[3] == Answer[i]) {
    		if (i == 3 ){ 
    			m++ ;
    			n++ ;
    		}else { n ++ ;}		
    	}
    	
    }
    if ( m != 4 && n == 4 ){
    	System.out.println("So close ! Try again !");
    }
    
    if ( m == 4 && n == 4 ){
    	
    	System.out.println("Hey,Baby ! Nice shot !");
    }
    
    
    return "Here is your result " +  String.valueOf(m) + "A" + String.valueOf(n) + "B" ;
    
    
    
    
    }


	
}
