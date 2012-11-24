public interface StackGen<N extends Number> {
	
	//pushes an element in the stack
	
	void push(N number);
	
	//pops the last element out of the stack and returns it
	
	N pop();
	
	// checks if the stack is Empty
	
	boolean isEmpty();
}	