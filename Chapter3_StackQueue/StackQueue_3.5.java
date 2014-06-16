import java.util.Stack;
public class StackQueue{
	/* complete one queue using two queue
	 */
	Stack<Integer> stackIn = new Stack<Integer>();
	Stack<Integer> stackOut = new Stack<Integer>();
	
	public void enqueue(int value){
		stackIn.push(value);
	} 	
	
	public int dequeue(){
		shift();
		stackOut.pop();
	}
	
	
	//shift elements from stackIn to stackOut
	public void shift(){
		if (stackOut.isEmpty()) { 
			while (!stackIn.isEmpty()) {
				stackOut.push(stackIn.pop());
			}
		}
	}
}
