public class NthToLastNode{
	
	/*
	 * find the kth to last element of a singly linked list
	 *	
	 * a)recursive way
	 * go through the linked list, when hits the end, pass back a counter set to 0	
	 * each parent calls adds 1 to the counter, until it equals k
	 * space complexity O(n); time complexity: O(n)	
	 *	
	 * b)two pointers, one ahead the other k steps
	 * in place method use O(1) space, time complexity O(n)
	 *	
	 * c)use math method: two scan approach(not good)
	 * first scan: get the length of the ListNode, kth to last which means length-1-k from the beginning
	 * in place method use O(1) space, time complexity O(n)		 		
	 */
	
		
	/* solution one
	 * use wrapper class as could not pass back a node and a counter using simple return, 
	 * get the counter a wrapper
	 */
	public class CountWrapper{
		public int counter = 0;
	}	
	
	
	public static ListNode nthToLastNode_One(ListNode head, int n, CountWrapper count){
		if(head == null || n <= 0) return null;
		
		
		ListNode current = nthToLastNode_One(head.next, n, count);
		count.counter = count.counter + 1;
		if(count.counter == n){
			return head;
		}
		
		return current;
		
	}
	
	
	
	//solution 2
	public static ListNode nthToLastNode_Two(ListNode head, int n){
		if(head == null || n <= 0) return null;
		
		ListNode fast = head;
		ListNode slow = head;
		
		for(int i = n; i > 0; i--){
			if(fast != null){
				fast = fast.next;
			}else{
				return null;//list length is smaller than n
			}
		}
		
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
		
	}
	
	
	
	public static void main(String[] str){
		ListNode head = new ListNode(1);
		head.appendToTail(13);
		head.appendToTail(10);
		head.appendToTail(11);
		head.appendToTail(13);
		head.appendToTail(10);
		head.appendToTail(1);
		
		
		System.out.println(nthToLastNode_Two(head, 4).value);
		
		
	}
	
	
	
	
	
	
}
