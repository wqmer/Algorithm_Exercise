package leetcode;


public class reverse_string {
  public static String Rs (String s){
//	  if (s.length() == 1){
//		  return s ;
//	  }
	  
	  char[] a = s.toCharArray() ;
	  int right = a.length -1 ;
	  int left = 0;
	  for ( left = 0 ; left < right; left++ ,right--){
		  char temp = a[left];
		  a[left] = a[right];
		  a[right] = temp ;
	  }
	  
//      for (char c : a ) {
//    	  System.out.print(c);
//      }
	  return new String(a);
  }
  
 
}
  