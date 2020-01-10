  class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1(int x) {
          val = x;
         next = null;
      }
 }
public class IntersectionofTwoLinkedLists {
    public static ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        if (headA == null || headB == null) return null;
       int lenA = getLength(headA), lenB = getLength(headB);
       if (lenA > lenB) {
           for (int i = 0; i < lenA - lenB; ++i) headA = headA.next;
       } else {
           for (int i = 0; i < lenB - lenA; ++i) headB = headB.next;
       }
       while (headA != null && headB != null && headA != headB) {
           headA = headA.next;
           headB = headB.next;
       }
       return (headA != null && headB != null) ? headA : null;

   }
   
   public static int getLength(ListNode1 head) {
       int cnt = 0;
       while (head != null) {
           ++cnt;
           head = head.next;
       }
       return cnt;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode1 a = new ListNode1(4);
		ListNode1 b = new ListNode1(1);
		ListNode1 c = new ListNode1(8);
		ListNode1 e = new ListNode1(4);
		ListNode1 f = new ListNode1(5);
		ListNode1 g = new ListNode1(5);
		ListNode1 h = new ListNode1(0);
		ListNode1 m = new ListNode1(1);
		ListNode1 n = new ListNode1(8);
		ListNode1 k = new ListNode1(4);
		ListNode1 l = new ListNode1(5);
		a.next = b;
		b.next = c;
		c.next = e;
		e.next = f;
		g.next = h;
		h.next = m;
		m.next = n;
		n.next = k;
		k.next = l;
		System.out.print(getIntersectionNode(a,g).val);
		
	}

}
