

public class RemoveNthNodeFromEndofList {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
        	ListNode dummy = new ListNode(0);
            ListNode slow = new ListNode(0);
            ListNode fast = new ListNode(0);
	        dummy.next = head;
	        fast = slow = dummy;
	        for(int i=0;i<n;i++) {
	        	fast=fast.next;
	        }
	        while(fast.next!=null)
	        {
	        	slow = slow.next;
	        	fast = fast.next;
	        }
	        slow.next=slow.next.next;
	        return dummy.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
