
class circle{
	ListNode tail;
	ListNode deletenext;
	public void add(ListNode a)
	{
		if(tail==null)
			{tail = a;
			tail.next=tail;
		}else {
			a.next=tail.next;
			tail.next=a;
			tail=a;
		}	
	}
	
	public void printcircle()
	{
		if(tail==null)System.out.println();
		else{
				ListNode current = tail.next;
				while(current!=tail)
				{
					System.out.print(current.val + ", ");
					current=current.next;
				}
				System.out.println(current.val);
			}
	}
	
	public void delete(int k)
	{
		if(tail==null)System.out.println();
		else {
			if(deletenext==null)
				deletenext=tail;
			for(int i=0;i<k-1;i++) {
				deletenext=deletenext.next;
			}
			if(deletenext.next==tail)
				tail = deletenext;
			deletenext.next=deletenext.next.next;
		}
		
	}
}
public class JosephCircle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		for(int i=1;i<= 6;i++)
		{
			ListNode a= new ListNode(i);
			c.add(a);
		}
		c.printcircle();
		while(c.tail.next!=c.tail)
		{
			c.delete(3);
			c.printcircle();
		}
	}

}
