import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 用优先级队列合并有序数列 {
	//PriorityQueue是二叉堆排序的重要应用方法
	public static void mergeLists(ArrayList<ListNode> lists)
	{
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.size(),MyCmp);
		
		for(ListNode k: lists) {
			q.add(k);
		}
		while(q.size()>0)
		{
			ListNode temp = q.poll();
			System.out.print(temp.val+" ");
			if(temp.next!=null)
			{
				q.add(temp.next);
			}
		}
	}
	
	//Comparator 是用来定义两个陌生类型的比较方法
	 public static Comparator<ListNode> MyCmp = new Comparator<ListNode>() {
	        @Override //升序
	        public int compare(ListNode o1, ListNode o2) {
	            return o1.val - o2.val;
	        }
	    };
	
	//如果是数组怎么办！！！
	public static void mergeLists2(ArrayList<int[]> arrays)
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(arrays.size());
		//未完待续
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ListNode> a = new ArrayList<ListNode>();
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(7);
		l1.next.next = new ListNode(9);
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(10);
		ListNode l3 = new ListNode(4);
		l3.next = new ListNode(8);
		l3.next.next = new ListNode(11);
		a.add(l1);
		a.add(l2);
		a.add(l3);
		mergeLists(a);
		
		ArrayList<int[]> b = new ArrayList<int[]>();
		int[] d = {5,7,9};
		int[] e = {3,6,10};
		int[] c = {4,8,11};
		b.add(d);
		b.add(e);
		b.add(c);
		
	}

}
