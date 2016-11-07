package leetcode;

public class insert_sort {
	
	 public static void main(String[] args ) { 
		 int testArray [] = new int []{ 6, 5 ,0 ,2 ,9,  10, 4, 5, 3} ;
		 InsertSort(testArray);
		 for (int item : testArray){
			System.out.print(item + " "); 
			 
		 }
			 
	 } 
	 
	 public static void InsertSort( int array[] ) {
		 int l= array.length;
		 for ( int i=0; i<l; i++){	
			 
			 
	 	 int index = i ; 
	 	 int temp = array[i];
	 	 while (index>0 && array [index - 1] > temp ){
	 		 array [index] = array [index-1 ];
	 		 array [index-1 ]= temp ;
	 		 index -=1 ;
	 
	 	  }
	
	 	 }
	 		 
	 			 
	   }
		 
		 
	 }

