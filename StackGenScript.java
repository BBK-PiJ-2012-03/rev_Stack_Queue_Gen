public class StackGenScript {

	public static void main(String[] args) {
		StackGenScript script = new StackGenScript();
		script.launch();
	}
 
	public void launch() {
		Node firstNode = new Node(1);
		StackGenImpl<Integer> intStack = new StackGenImpl<Integer>(firstNode);
		
		intStack.pop();
		System.out.println(intStack.isEmpty());	
		intStack.push(5);
		intStack.push(10);
		System.out.println(intStack.pop());
		System.out.println(intStack.isEmpty());	
		
	}	
}	