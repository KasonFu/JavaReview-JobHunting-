

public class ReverseLinkedList {
	//Iteration
    public static ListNode reverseList1(ListNode head) {
    	ListNode prev = null;
    	ListNode current = head;
    	while(current!=null) {
    		ListNode nextnode = current.next;
    		current.next = prev;
    		prev = current;
    		current = nextnode;
    	}
    	return prev;
    }
    //Recursion
    public static ListNode reverseList2(ListNode head) {
    	if(head==null||head.next==null) return head;
    	ListNode second = head.next;
    	ListNode newhead = reverseList2(second);
    	second.next = head;
    	head.next=null;
    	return newhead;
    }
    //×Ô´´Ð´·¨
    public static  ListNode reverseList3(ListNode head) {
    ListNode prev = head.next;
    ListNode next = null;
    ListNode curr = head;
    while(true)
    {
        curr.next = next;
        next = curr;
        curr = prev;
        if(curr==null)
            break;
        prev = prev.next;
    }
    return next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		ListNode current = reverseList1(a);
		while(current!=null)
		{
			System.out.print(current.val);
			current = current.next;
		}
	}

}
