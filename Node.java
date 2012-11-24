public class Node<N extends Number> {
	private N value;
	private Node<N> next;
	
	public Node (N value) {
		this.value = value;
		this.next = null;
	}

	public N getValue() {
		return value;
	}	
	
	public Node<N> getNext() {
		return this.next;
	}	
	
	public void setNext(Node<N> newNode) {
		this.next = newNode;
	}
}	
		