import java.util.Stack;
public class SortStack{
	/* sort a stack in ascending order 
	 * use one additional stack	
	 */	
	public static Stack<Integer> sortStack(Stack<Integer> s){
		Stack<Integer> bufferStack = new Stack<Integer>();
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!bufferStack.isEmpty() && bufferStack.pop()>temp){
				s.push(bufferStack.pop());
			}
			s.push(temp);
		} 
	return s;
	}
	
	/**	
	public static void main(String[] str){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(14);
		stack.push(1);
		sortStack(stack);
		System.out.println(stack.pop());
	}
	*/		
}
