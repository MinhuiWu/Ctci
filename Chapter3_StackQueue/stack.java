public class Stack{
	/* stack elements is stored as linkedlist	
	 */	
	
	ListNode top;
	ListNode bottom;
	public int size = 0;

	
	
	public stack(int capacity){
		this.capacity = capacity;
	}
	
	public boolean isEmpty(){
		if(size == 0){
			// or top == null;	
			return true;
		}else{
			return false;
		}	
	}
	
	
	public boolean isFull(){
		return size = capacity;
	}
	
	
	public void push(int value){
		if(size >= capacity){
			break;
		}
		size++;
		ListNode newNode = new ListNode(value);
		if(size == 1){
			bottom = newNode;
		}else{
			top = newNode;
		}
		
	}
	
	
	public int pop(){
		if(size == 0){
			break; 
		}
		int result = top.value;
		top = top.next;
		size--;
		return result;
	}
	
	
	public int peek(){
		if(size == 0){
			break; 
		}
		
		return top.value;
	}
	
	
}	
