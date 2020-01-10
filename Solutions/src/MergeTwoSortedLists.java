import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MergeTwoSortedLists {
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
    	if(l1==null)return l2;
    	if(l2==null)return l1;
    	ListNode dummy = new ListNode(0);
    	List<Integer> a = new ArrayList<Integer>();
    	while(l1!=null)
    	{
    		a.add(l1.val);
    		l1 = l1.next;
    	}
    	while(l2!=null)
    	{
    		a.add(l2.val);
    		l2 = l2.next;
    	}
    	int[] b = new int[a.size()];
    	for(int i=0;i<a.size();i++)
    	{
    		b[i]=a.get(i);
    	}
    	Arrays.sort(b);
    	dummy.next = new ListNode(b[0]);
    	ListNode current = dummy.next;
    	for(int i=1;i<b.length;i++)
    	{
    		current.next = new ListNode(b[i]);
    		current = current.next;
    	}
    	   return dummy.next;
    }
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    	ListNode dummy = new ListNode(0);
    	ListNode current = dummy;
    	while(l1!=null&&l2!=null)
    	{
    		if(l1.val>=l2.val)
    		{
    			current.next = l2;
    			l2 = l2.next;
    		}else
    		{
    			current.next = l1;
    			l1 = l1.next;
    		}	
    		current = current.next;
    	}
    	if(l1!=null)current.next = l1;
    	if(l2!=null)current.next = l2;
    	return dummy.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
