package crackingCodeFourTreesAndGraphs;

import java.util.Queue;

public class BFS {
	void search ( Node Root){
		Queue<E> q = new Queue();
		Root.marked = true ;
		q.add(Root);//q.enqueue(Root)
		
		while(!queue.isEmpty()){
			Node u = q.dequeue();
			visit(u);
			foreach (Node v : u.getAdjacent){
				if ( v.marked == false ){
					v.marked = true ;
					q.enqueue(v);
				}	
			}	
		}	
	}

}
