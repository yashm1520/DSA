package LinkedList;

public class DeleteDuplicate {
	

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	     ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	  public ListNode deleteDuplicates(ListNode head) {
	        ListNode dummy=new ListNode(0);
	        ListNode temp=dummy;
	       ListNode current=head;
	        int duplicate=Integer.MIN_VALUE;
	     
	        
	        while(current!=null){
	             
	           
	            if(current.next!=null&&current.val==current.next.val){
	                duplicate=current.val;
	            }
	           
	            if(duplicate!=current.val){
	                temp.next=new ListNode(current.val);
	                temp=temp.next;
	                
	            }
	            current=current.next;
	            
	        }
	        return dummy.next;
	    }

}
