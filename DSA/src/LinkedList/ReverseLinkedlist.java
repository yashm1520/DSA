package LinkedList;

public class ReverseLinkedlist {
	
	
	  public class ListNode {
	      int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	    public ListNode reverseBetween(ListNode head, int left, int right) {
	     ListNode dummy=new ListNode();
	       ListNode leftNode=head;
	       ListNode rightNode=head;
	        ListNode prevtNode=dummy;
	        dummy.next = head;

	       for(int i=1;i<left;i++){
	        prevtNode=leftNode;
	        leftNode=leftNode.next;
	       }
	       for(int i=1;i<right;i++){
	        rightNode=rightNode.next;
	       }
	       ListNode rightNext=rightNode.next;
	       rightNode.next=null;
	       
	       prevtNode.next=reverse(leftNode);
	       leftNode.next=rightNext;
	      
	       
	       return dummy.next;

	    }
	    public ListNode reverse(ListNode head){
	        ListNode prev=null;
	        ListNode curr=head;
	        ListNode next=null;

	        while(curr!=null){
	            next=curr.next;
	            curr.next=prev;
	            prev=curr;

	            curr=next;
	        }
	         return prev;

	    }
}
