package crackingCodeFourTreesAndGraphs;

public class Minimal_Tree {
	
	
	TreeNode Min_tree(int arry[]){
		return Min_tree(arry , 0 , arry.length - 1 ) ;		
	}
	
	TreeNode Min_tree(int Arry[], int start ,int end){
		if (end < start) return null ;
		int mid = (start + end)/2;
		TreeNode n = new TreeNode (Arry[mid]);
		n.left = Min_tree (Arry, start , mid-1 );
		n.right = Min_tree (Arry, mid , end ); 
		return n ;
		
		
	}

}
