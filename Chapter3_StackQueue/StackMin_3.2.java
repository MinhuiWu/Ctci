import java.util.Stack;


public class StackMin extends Stack<Integer>{
	/* complete min() function in stack to let the time complexity of get the min value of the stack be O(1)
	 *	
	 * one solution is to use the method when creating a min heap(waste space)
	 * use pop and push method to put the existing min element on the top
	 * 
	 * another is to use additional stack to track the min()			
	 */	
	Stack<Integer> stackMin;	
	
	public StackMin(){
		stackMin = new Stack<Integer>();
	}
	
	
	public void push(int value){
		if(value > min()){
			stackMin.push(value);
		}else{
			super.push(value);
		}
	}
	
	
	public Integer pop(){
		if(super.pop() == min()){
			stackMin.pop();
		}
		return super.pop();
	}
	
	
	public int min(){
		if(stackMin.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return stackMin.peek();
		}		
	}	
	
	
		
	public static void main(String[] str){
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(20);
		stack.push(3);
		stack.push(10);
		stack.push(12);
		stack.push(7);
		stack.push(9);
		stack.push(2);

		System.out.println("Popped " + stack.pop());
		System.out.println("New min is " + stack.min());

	}	
}
