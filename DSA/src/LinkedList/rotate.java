package LinkedList;

public class rotate {

	
	  public class ListNode {
	      int val;
	      ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
    int count (ListNode head){
	int length = 0;
	ListNode current = head;

	while (current != null) {
	    length++;
	    current = current.next;
	}
	return length;
	    }
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head==null){
	            return null;
	        }
	        k=k%count(head);
	        

	if (k == 0) {
	    return head;
	}
	        ListNode slow=head;
	        ListNode fast=head;

	        while(k>0){
	            fast=fast.next;
	            k--;
	        }
	        while(fast.next!=null){
	            fast=fast.next;
	            slow=slow.next;
	        }
	        fast.next=head;
	        head=slow.next;
	        slow.next=null;

	        return head;
	    }
	    
	}

