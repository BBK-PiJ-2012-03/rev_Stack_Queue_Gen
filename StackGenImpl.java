public class StackGenImpl <N extends Number> {
  private Node<N> head = null;
  
	public StackGenImpl(Node<N> firstNode) {
		this.head = firstNode;
	}
	
	public void push(N number) {
		Node<N> newNode = new Node(number);
		
		if (head != null) {
		newNode.setNext(head);
	    }
		head = newNode;	  
    }
	
	public N pop() {
	
		if (head == null) {
			return null;
		}
		N result = head.getValue();
		head = head.getNext();
		return result;
    }
			
	public boolean isEmpty() {
		int result = 0;
		Node<N> currentNode = head;
		
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			result++;
		
		}
		
		if (result == 0) {
			return true;
		} 
		else {
			return false;
		}	
	}	
}		
		
		