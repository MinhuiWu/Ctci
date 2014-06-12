
public class ListNode {

	//implement a single linked list
	ListNode next = null;
	int value;
	
	public ListNode(int value){
		this.value = value;
		this.next = next;
	}
	
	
	
	
	//get a new List and add new node in the end of the list
	public void appendToTail(int value){
		ListNode end = new ListNode(value);
		ListNode current = this;
		while(current.next != null){
			current = current.next; 
		}
		current.next=end;
    }
	
	
	public void printList(ListNode head) {
        ListNode current = head;
        System.out.print("{");
        while (current != null) {
            if (current.next != null)
                System.out.print(current.value + ", ");
            else
                System.out.println(current.value + "}");
            current = current.next;
        }
    }
	
	
	
	public static ListNode deleteNode(ListNode head, int value){
		ListNode current = head;
		
		if(current.value == value){
			return head.next;
		}
		
		while(current.next != null){
			if(current.next.value == value){
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return head;
	}
	
	
	
	public static void main(String[] str){
		ListNode head = new ListNode(1);
		head.appendToTail(13);
		head.appendToTail(10);
		head.appendToTail(11);
		
		head.printList(head);
		head.deleteNode(head, 13);
		head.printList(head);
		
	}	

}
