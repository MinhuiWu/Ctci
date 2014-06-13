import java.util.HashSet;


public class RemoveDup{
	/**
	* remove duplicate from a linkedlist
	* 
	* 1) use hashset to store the node in the linked list,
		 as the hashset is one to one pair, no duplicate value could be put in the set
		 in this solution, extra space is used O(n), and time is O(n)
	* 2) two pointer technic
		 use one point go through the list, another from the beginning to the end to see whether there is same node in the list
		 no extra space is used, but time complexity is O(n^2)			
	*/	
	
	public static void removeDup_One(ListNode head){
		if(head == null) return;
		
		HashSet<Integer> target = new HashSet<Integer>();
		target.add(head.value); // add head value to the hashset
		ListNode current = head.next;
		
		while(current.next != null){
			if(target.contains(current.next.value)){
				current.next = current.next.next;
			}else{
				target.add(current.value);
				current = current.next;
			}
		}
		
	}
	
	
	
	
	public static void removeDup_Two(ListNode head){
		if(head == null) return;
		
		ListNode slow = head;
			
		while(slow != null){
			ListNode fast = slow;
			while(fast.next != null){
				if(slow.value == fast.next.value){
					fast.next = fast.next.next;
				}else{
					fast = fast.next;
				}				
			}
			slow = slow.next;
		}		
	}
	
	
	
	public static void main(String[] str){
		ListNode head = new ListNode(1);
		head.appendToTail(13);
		head.appendToTail(10);
		head.appendToTail(11);
		head.appendToTail(13);
		head.appendToTail(10);
		head.appendToTail(1);
		
		head.printList(head);
		removeDup_Two(head);
		//removeDup_One(head);	
		head.printList(head);
		
	}
	
	
	
}
