package crackingCodeOneString;

public class Rotate_Matrix {
public int[][] MR (int[][] matrix) {
	int len = matrix.length ;
	int layer = 0 ;
	int temp = 0 ;
	if(len == 0) { return matrix ; }
	for ( layer = 0  ; layer < len / 2; layer ++ ) 
{   int i = 0 ;
    // if (layer < len - layer
	for (i = layer ; i < len - layer - 1; i++)
	temp = matrix [layer][i];
	
	matrix[layer][i] = matrix[len-i-1][layer];//left to top
	matrix[len-i-1][layer] = matrix[len-layer-1][len-i-1];//bottom to left
	matrix[len-layer-1][len-i-1] = matrix[i][len-layer-1];//right to bottem
	matrix[i][len-layer-1] = temp ;//save top to right
	
}
	
	return matrix;
	
	
	
	
	
}
}
