package crackingCodeThreeStacksAndQueues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackOfPlate {
ArrayList<Stack> stacks = new ArrayList<Stack>();

void push (int v){
	Stack last = getLastStack();
	if (last != null && ! isFull(last)){
		last.push(v);
			
	}
	else{
		
	Stack stack = new Stack();
	stack.push(v);
	stacks.add(stack);		
	}
	
}
int pop(){
	Stack last = getLastStack();
	if (last == null) throw new EmptyStackException();
	int  v = (int) last.pop();
	if (last.size() == 0 ) stacks.remove(stacks.size() - 1);
	return v;
}
	



Stack getLastStack() {

	return null;
}

 boolean isFull(Stack list){
return  list.size()== list.capacity() ;
}



}
