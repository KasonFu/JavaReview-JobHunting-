class ListNode{
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
	private static int a;
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		int sum = 0;
		while(l1!=null&&l2!=null)
		{
			sum += l1.val+ l2.val;
			dummy.next = new ListNode(sum%10);
			sum /= 10;
			l1 = l1.next;
			l2 = l2.next;
			dummy = dummy.next;
		}
		while(l1!=null)
			{	
				sum += l1.val;
				dummy.next = new ListNode(sum%10);
				sum /= 10;
				l1 = l1.next;
				dummy = dummy.next;
			}
		while(l2!=null)
		{	
			sum += l2.val;
			dummy.next = new ListNode(sum%10);
			sum /= 10;
			l2 = l2.next;
			dummy = dummy.next;
		}
		if(sum == 1)
			dummy.next = new ListNode(1);
		return head.next;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;
		ListNode d = new ListNode(5);
		ListNode e = new ListNode(6);
		d.next = e;
		ListNode g = addTwoNumbers(a,d);
		while(g!=null)
		{
			System.out.print(g.val);
			g=g.next;
		}
	}

}
