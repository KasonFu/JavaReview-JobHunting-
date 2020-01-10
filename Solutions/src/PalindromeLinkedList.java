
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        int n=0;
        while(current!=null) {
        	n++;
        	current=current.next;
        }
        int[] a=new int[n/2];
        int[] b=new int[n/2];
      
       	for(int i=0;i<a.length;i++) {
        		a[i]=dummy.next.val;
        		dummy=dummy.next;
        	}
        if(n%2==1)
        dummy = dummy.next;
        
        for(int i=0;i<b.length;i++){
        		b[i]=dummy.next.val;
        		dummy=dummy.next;
        }
        for(int i=0;i<a.length;i++) {
        		if(a[i]!=b[a.length-i-1])
        			return false;
        }
        return true;
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
