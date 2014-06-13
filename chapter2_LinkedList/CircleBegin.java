public class CircleBegin{
	/* Find the beginning of the loop of the LinkedList
	 *
	 * use two pointer technic (faster one goes twice the speed of the slower one)
	 * if there is a loop in the LinkedList, the faster and the slower pointer would collide in the circle	
	 * the point which two pointer collide: faster should be twice the distance of the slower, 
	 * slower: D1(not the loop part) + Dloop - D1
	 * faster: D1 + Dloop + Dloop - D1	
	 * it is clear that they collide D1 to the beginning of the loop
	 * then put slower pointer to the beginning, slower pointer and faster pointer same speed when they would collide second time at        * the beginning of the loop, both go the distance of D1
	 */
	public ListNode circleBegin(ListNode head){
		if(head == null) return null;
		
		ListNode fast = head;
		ListNode slow = head;
		
		//first collide
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slower.next;
			if(slow == fast){
				break;
			}
		}
		
		//if there is no loop
		if(fast == null || fast.next == null){
			return null;
		}
		
		
		//second collide
		slow = head;
		while(fast != slow){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
		
	} 
}
