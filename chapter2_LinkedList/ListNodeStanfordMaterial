public class ListNode{
	int value;
	ListNode next;
	
	public ListNode(int value){
		this.value = value;
		next = null;
	}
	
	public ListNode(int value, ListNode next){
		this.value = value;
		this.next = next;
	}
	
}



public class ListStanford{	
	/*
	* counts the number of times a given value occurs in the list.
	*/
	public static int count(ListNode head, int target){
		int count = 0;
		
		if(head == null) return count;
		
		ListNode current = head;
		while(current != null){
			if(current.value == target){
				count++;
			}else{
				current = current.next;
			}
		}
		return count;		
	}
	
	
	
	
	
    /**
        * Returns the data stored in the node at the index position.
        * The index uses the C numbering convention that starts from 0.
	*/	
	public static int getNth(ListNode head, int index){
		if(head == null){
			throws new IllegalAugumentException("Empty List");
		} 
		
		ListNode current = head;
		//int count = 0;
		while(current != null){
			for(int count = 0; count < index; count++){
				current = current.next;
			}		
			
		}
		
		if(current = null){
			throws new IndexOutOfBountException();
		}else{
			return current.value;
		}
	}
		
	
	
	
	
	
	/**
	 * Inserts a new node at any index within a list. The legal index should be in the range [0..length]
	 */
	public ListNode insertNth(ListNode head, int index, int value){
		ListNode current = head;
		ListNode target = new ListNode(value);
		
		if(head == null){
			throws new IllegalAugumentException("Empty List");
		}
		while(current != null){
			for(int count = 0; count < index; count++){
				current = current.next;
			}	
		}
		if(current == null){
			throws new IndexOutOfBoundException();
		}
		target.next = current.next;
		current.next = node;
		
		return head;				
	}	
	
	
	
	/**
	  * Inserts the node into the correct sorted position in the list.
	  * put a dummy head in front of the list
	  */
	public ListNode sortedInsert(ListNode head, int value){		
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode current = head;
		
		while(current.next != null && current.next.value < value){
			current = current.next;
		}
		
		ListNode target = new ListNode(value);
		target.next = current.next;
		current.next = node;
		
		return dummy.next;
	}
	
	
	
	/**
	  * Divides up a list's nodes to make two smaller lists. All the even
	  * elements should go in the first list, and the odd elements in the second.
	  */
	public void ListNode[] alternatingSplit(ListNode head){
		if(head == null) return null;
		
		ListNode headOdd = new ListNode();
		ListNode headEven = new ListNode();
		
		ListNode current = head;
		
		while(current != null){
			moveNode(current, headOdd);
			current = current.next;
			if(current != null){
				moveNode(current, headEven);
			}
			current = current.next;
		}
		ListNode[] listArray = new ListNode[]();
		listArray[0] = headOdd;
		listArray[1] = headEven;
	}
	
	
	public static ListNode moveNode(ListNode head, ListNode move){
		if(head == move) return null;
		
		head.next = move;
		return head;
	}
	
	
	
	
	
	
	/**
	  * takes two lists, each of which is sorted in increasing
      * order, and merges the two together into one list which is in increasing order	
	 */	
	public static ListNode mergeSortedList(ListNode headOne, ListNode headTwo){
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		
		while(headOne != null && headTwo != null){
			if(headOne.value < headTwo.value){
				current.next = headOne;
				headOne = headOne.next;
			}else{
				current.next = headTwo;
				headTwo = headTwo.next;
			}
		}
		
		
		if(headOne != null){
			current.next = headOne;
		}else{
			current.next = headTwo;
		}
		
		return current.next;
	}
	
	
	
	
	
	
	/**
	 Iterative list reverse.
	 Iterate through the list left-right.
	 Move/insert each node to the front of the result list 	 
	*/	
	public static ListNode reverse(ListNode head){
		ListNode current = head;
		ListNode result = null;
		ListNode next = null;
		
		while(current != null){
			next = current.next;
			current.next = result;
			result = current;
			current = next;
		}
		
		reture result;
	}
		
}


