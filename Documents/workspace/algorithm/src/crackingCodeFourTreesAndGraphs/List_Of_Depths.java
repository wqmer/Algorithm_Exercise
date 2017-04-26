package crackingCodeFourTreesAndGraphs;

import java.util.ArrayList;

public class List_Of_Depths {
	
	void CreateLinklist( TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level ){
    if (root == null) return ;
    LinkedList<TrreNode> list = null ;//?
    if ( lists.size == level)
    {    list = new LinkedList<TreeNode>() ;//?
         lists.add(list);
    }
    else{
         list = lists.get(level); //?
    }
	
	CreateLinklist(root.left , lists , level +1 );
	CreateLinklist(root.right , lists , level +1 );
	
}
	
	ArrayList<LinkedList<TreeNode>> CreateLinklist(TreeNode root){
		ArrayList<LinkedList<TreeNode>> Lists = new ArrayList<LinkedList<TreeNode>>();
		CreateLinklist(root , Lists , 0 );
		return Lists ;
		
	}
	
	

}
