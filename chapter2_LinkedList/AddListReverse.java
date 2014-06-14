public class AddListReverse {
	/*add two linkedlists which represents two numbers	
	 */
	public static ListNode addListReverse(ListNode l1, ListNode l2) {
		
		ListNode pre = null;
		ListNode head = null;
		int carry = 0;
		while( l1 != null || l2 != null || carry != 0 )
		{
			int value_l1 = ( l1 == null ? 0 : l1.value );
			int value_l2 = ( l2 == null ? 0 : l2.value );
			int sum = value_l1 + value_l2 + carry;
			ListNode cur = new ListNode( sum % 10 );
			if( head == null )
				head = cur;
			else if( head != null )
				pre.next = cur;
			pre = cur;
			carry = sum / 10;
			l1 = ( l1 == null ? l1 : l1.next );
			l2 = ( l2 == null ? l2 : l2.next );
		}
		return head;
	}
	
	
	public static void main(String[] str){
		ListNode head_one = new ListNode(1);
		ListNode head_two = new ListNode(2);
		
		head_one.appendToTail(3);
		head_one.appendToTail(1);
		head_one.appendToTail(1);

		head_two.appendToTail(7);
		head_two.appendToTail(3);
		
		addListReverse(head_one, head_two).printList(addListReverse(head_one, head_two));
	}
}
