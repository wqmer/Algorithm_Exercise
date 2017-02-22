package crackingCodeFourTreesAndGraphs;

import java.util.LinkedList;

import javax.xml.soap.Node;

public class route_Between_Node {
// BFS 
	enum State { unvisited ,visited ,visiting; }
	boolean search (Graph g , Node start , Node end){
		if (start == end) return true ;//checNodee 1 node case
		LinkedList<Node> q = new Linkedlist<Node>();//treat with queue
		for (Node u : g.getNodes()){
			u.state = State.unvisited;
		}
		start.state = State.visiting;
		q.add(start);
		Node u ;
		while (!q.isEmpty()){
			u = q.removeFirst();
			if (u!= null){
			   for(Node v : u.getAdjacent){
				   if(v.state == State.visited){
					   if (v == end){
						   return true ;
					   } else {
						   v.state = State.visiting ;
						   q.add(v);
					   }
				   }
					   
			   }
			   u.state = State.visited ;	   
		     }	
	     }
		return false ;				
     }
}

