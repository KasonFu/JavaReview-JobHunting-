import java.util.ArrayList;



public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        
        ArrayList<ListNode> a = new ArrayList<ListNode>();
        while(head!=null) {
        	if(a.contains(head)) 
        		return true;
        	a.add(head);
        	head = head.next;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
