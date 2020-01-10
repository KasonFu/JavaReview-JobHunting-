import java.util.ArrayList;

class Queue{
	//两种方法，一种ArrayList，一种数列Array
	ArrayList<TreeNode> list = new ArrayList<TreeNode>();
	TreeNode[] treelist = new TreeNode[20];
	int head=0;
	int tail=0;
	
	public void push(TreeNode a){
		list.add(0, a);
	}
	public void push2(TreeNode a) {
		treelist[tail] = a;
		tail = (tail+1)%treelist.length;
	}
	public TreeNode showtail()
	{
		if(list.size()==0) return null;
		return list.get(list.size()-1);
	}
	public TreeNode showtail2()
	{
		return treelist[head];
	}
	public void pop()
	{
		if(list.size()==0) return;
		list.remove(list.size()-1);
	}
	public void pop2()
	{
		treelist[head]=null;
		head = (head+1)%treelist.length;
	}
	public boolean isempty()
	{
		if(list.size()==0)
			return true;
		return false;
	}
	public boolean isempty2()
	{
		if(head==tail)
			return true;
		return false;
	}
}
public class 通过队列QueueBFS二叉树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,6,5,8,3,4,7,9,0};
		BinaryTree b = new BinaryTree();
		for(int i=0;i<a.length;i++) {
			b.add(a[i],i);
		}
		Queue q = new Queue();
		q.push2(b.root);
		while(!q.isempty2())
		{
			TreeNode current = q.showtail2();
			q.pop2();
			System.out.print(current.val);
			if(current.left!=null)
				q.push2(current.left);
			if(current.right!=null)
				q.push2(current.right);
		}
	}

}
