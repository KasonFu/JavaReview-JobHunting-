 class stack{
	TreeNode head;
	public void push(TreeNode a)
	{
		if(head==null) head=a;
		else {
			a.next=head;
			head=a;
		}
	}
	public TreeNode pop()
	{
		TreeNode temp = head;
		head = head.next;
		return temp;
	}
	public boolean isempty()
	{
		return (head==null);
	}
	public int size()
	{
		int count=0;
		TreeNode dummy= new TreeNode(0);
		dummy.next=head;
		while(dummy.next!=null)
		{
			count++;
			dummy=dummy.next;
		}
		return count;
	}
}
public class 通过栈遍历二叉树 {
	public static void main(String[] args) {
		int[] a = {2,6,5,8,3,4,7,9,0};
		BinaryTree b = new BinaryTree();
		for(int i=0;i<a.length;i++) {
			b.add(a[i],i);
		}
		stack s = new stack();
		TreeNode current = b.root;
		while(current!=null)
		{
			System.out.print(current.val);
			if(current.right!=null) {
				s.push(current.right);
			}
			if(current.left!=null){
				current = current.left;
			}else
			{
				if(s.isempty())
					current = null;
				else
				current =  s.pop();
			}	
		}
	}
}
