package crackingCodeFourTreesAndGraphs;

public class DFS {
	void search (Node root) {
		if (root == null ) return ;
		visit(root);
		root.visited = true;
		foreach (Node u : root.getAdjacent){
			if(u.visited == false ){
				search (u);
			}
		}
	}
}
