
class ListNode{
	int val;
	ListNode next;
	ListNode(int a)
	{
		val= a;
	}
}
public class πÿ”⁄List¡∑œ∞ {

	public static ListNode reverse(ListNode a)
	{
		ListNode current = a.next;
		ListNode prev = a;
		prev.next=null;
		while(current !=null) {
			ListNode next = current.next; 
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode start = null;
		for(int i=1;i<10;i++)
		{
			ListNode  newnode = new ListNode(i);
			newnode.next = start;
			start = newnode;
		}
		ListNode current = start;
		while(current!=null)
		{
			System.out.println(current.val);
			current=current.next;
		}
		ListNode head = reverse(start);

		while(head!=null)
		{
			System.out.println(head.val);
			head=head.next;
		}
	}

}
