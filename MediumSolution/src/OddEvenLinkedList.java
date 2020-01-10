
public class OddEvenLinkedList {
	public static ListNode oddEvenList(ListNode head) {
	   if(head==null||head.next==null||head.next.next==null)
		   return head;
       ListNode res = head;
       ListNode curr = head.next.next;
       ListNode even = head.next;
       ListNode dummy1 = res;
       ListNode dummy2 = even;
       int index = 3;
       while(curr!=null)
       {
    	   if(index%2==0)
    	   {
    		   even.next = curr;
    		   even = even.next;
    	   }
    	   else
    	   {
    		   res.next = curr;
    		   res = res.next;
    	   }
    	   curr = curr.next;
    	   index++;
       }
       even.next = null;
       res.next = dummy2;
       return dummy1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		ListNode g = oddEvenList(a);
		while(g!=null)
		{
			System.out.print(g.val);
			g=g.next;
		}
	}

}
