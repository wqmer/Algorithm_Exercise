package crackingCodeOneString;

public class Zero_Matrix {	
//check the row/or column No# has a zero ,dont need to konw the exactly cell's location
//space o(n)	
public int[][] Solution_one (int m[][]){
	int rl = m.length; //row length
	int cl = m[0].length;//column length
	boolean [] row = new boolean [rl];
	boolean [] column = new boolean[cl];
    for (int i = 0 ; i < rl ; i ++ ){
    	for ( int j = 0 ; j < cl ;  j++ )
    	{
    		if (m[i][j] == 0)
    		{
    			row[i] = true ;
    			column[j] = true ;
    		}
    	}
    }
	
    for (int i = 0 ; i < rl ; i ++)
    {
    	if (row[i]) {
    		row_to_zero( m, i );	
    	}		
    }
    
    for (int j = 0 ; j < cl ; j++) 
    {    
    	if (column[j]){	
    		column_to_zero ( m , j);
    	}	
    }
    
	return m ;
}
//check the first row and column .And the check the rest if any 0 in [i][j] ,setting to the [0][j] and [i][0]
//set all 0 to if zero in [0][j] and [i][0] 
//set fisrt row ,and column to 0 if needed . space o(1)
public int[][] Solution_two (int m[][]){
	
 boolean row = false ;
 boolean column = false ;
//check the first row and column 
 for (int i = 0 ;  i < m.length ; i++ ){
	 if (m[0][i] == 0) row = true ;	 
	 break;
 }
 
 for (int j = 1 ; j < m[0].length ; j++){
	 if (m[j][0] == 0 )column = true ;
	 break;
 }
 
 // check the rest, mapping to first row and column
 for (int i = 1 ; i < m.length ; i ++){
	 for (int j = 0 ; j < m[0].length ; j ++){
		 if  ( m [i][j] == 0){
			 m[i][0] = 0 ;
			 m[0][j] = 0 ;
			 
		 }
	 }
 }
 
// set row to 0  if it match the condition 
 for ( int i = 1 ; i < m.length ; i ++) {
	 if ( m[i][0] == 0 ) {
		 row_to_zero (m , i) ;
	 }
 }
 
 //set column to 0 if it match the condition 
 for ( int j = 1; j < m[0].length ; j++) {
	 if ( m[0][j] == 0 ) {
		 column_to_zero  (m , j) ;
	 }
 }
 
// set first row and column to 0 if needed.
	 if (row) row_to_zero (m , 0);
	 if (column ) column_to_zero (m ,0);
 
	return m ;
}
public void row_to_zero (int[][] matrix , int row)
{
    for (int i = 0 ; i <  matrix.length ; i ++){
    	matrix[row][i] = 0 ; 
    }
}

public void column_to_zero (int[][] matrix , int col)
{
    for (int i = 0 ; i <  matrix[0].length ; i ++){
    	matrix[i][col] = 0 ; 
    }
}

}
