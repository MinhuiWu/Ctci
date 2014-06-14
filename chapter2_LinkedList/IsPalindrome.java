import java.util.Stack;

public class IsPalindrome{
	/* check if a linkedlist is palindrome
	 *
	 * 1) could reverse the linkedlist and then compare; only need compare half of the list 
	 * time complexity: O(), space complexity O(n)	
	 *
	 * 2) use extra stack, put half of the elements in the stack, use two pointer to get to the middle of the linkedlist
	 * then compare the push elements of the stack and the remain half of the linkedlist
	 *	
	 * 3) reversive way		
	 */	
		
	//public boolean isPalindrome_One(ListNode head){
		
		//}
	
	
				
	public static boolean isPalindrome_Two(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//push the first half elements in the stack and find the middle node of the list
		while(fast != null && fast.next != null){
			stack.push(slow.value);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//while there are odd number of nodes in the list, skip the middle element
		if(fast != null && fast.next == null){
			slow = slow.next;
		}
		
		while(slow != null){
			int stackNode = stack.pop().intValue();
			if(stackNode != slow.value){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
	
	
	public static void main(String[] str){
		ListNode head_one = new ListNode(1);
		ListNode head_two = new ListNode(1);
		ListNode head_three = new ListNode(1);
		head_one.appendToTail(13);
		head_one.appendToTail(10);
		head_one.appendToTail(11);
		head_one.appendToTail(13);
		head_one.appendToTail(10);
		head_one.appendToTail(1);
		
		head_two.appendToTail(13);
		head_two.appendToTail(10);
		head_two.appendToTail(11);
		head_two.appendToTail(10);
		head_two.appendToTail(13);
		head_two.appendToTail(1);
		
		head_three.appendToTail(13);
		head_three.appendToTail(10);
		head_three.appendToTail(10);
		head_three.appendToTail(13);
		head_three.appendToTail(1);
		
		//first is not palindrome, second is odd number of palindrome, three is even number of palindrome
		System.out.println(isPalindrome_Two(head_one));
		//System.out.println(isPalindrome_Two(head_two));
		//System.out.println(isPalindrome_Two(head_three));
		
	}
	
	
	
}
