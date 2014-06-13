public class Partition{
	/* partition linkedlist around value x
	 * 
	 * scan the list put larger than x elements in the larger list, smaller elements in the smaller list, 
	 * then merge the two lists (needs to scan the smaller list to find the end of the list)	
	 * time complexity o(N), space complexity O(N)		
	 */
	public static ListNode partition(ListNode head, int n)	{
		if(head == null || head.next == null) return head;
		
		ListNode largerHead = null;
		ListNode smallerHead = null;
		ListNode current = head;
		
		while(current != null){
			ListNode tmpCurrent = current.next;
			if(current.value < n){
				//put smaller node in front of the smaller list
				current.next = smallerHead;
				smallerHead = current;//change the head of the smaller list
			}else{
				//put larger node in front of the larger list
				current.next = largerHead;
				largerHead = current;//change the head of the larger list
			}
			current = tmpCurrent;
			
		}
		
		
		//merge the larger list and smaller list
		if(smallerHead == null){
			return largerHead;
		}
		
		//go through the smaller list to find the end of the list, then merge
		ListNode tmp = smallerHead;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = largerHead;
		
		return smallerHead;
		
	}
	
	
	
	public static void main(String[] str){
		ListNode head = new ListNode(1);
		head.appendToTail(13);
		head.appendToTail(9);
		head.appendToTail(11);
		head.appendToTail(5);
		head.appendToTail(15);
		head.appendToTail(8);
		
		
		head.printList(head);
		partition(head,10);
		head.printList(head);
	}
	

}
