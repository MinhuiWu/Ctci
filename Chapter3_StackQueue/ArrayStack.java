public class ArrayStack{
	/* 
	 * using array to complete a stack
	 */		
	int size = 0;
	public int[] elements;
	
		
	public ArrayStack(int capacity){
		this.capacity = capacity;
	}	
	
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size = capacity;
	}
	
	
	public void push(int element){
		if(size < capacity){
			elements[size] = element;
			size++;
		}		
	}
	
	
	public int peek(){
		if(size > 0){
			return elements[size];
		}
	}
	
	
	public int pop(){
		if(size > 0){
			return elements[size-1];
			size--;
		}
	}
	
}
