class TreeNode{
	int val;
	char c;
	int position;
	TreeNode left;
	TreeNode right;
	TreeNode next;
	TreeNode(int a,int b){
		val=a;
		position=b;
	}
	TreeNode(int a)
	{
		val=a;
	}
	TreeNode(char a)
	{
		c=a;
	}
}
class BinaryTree{
	TreeNode root;
	public void add(int a, int b){
		if(root==null)
			root = new TreeNode(a,b);
		else {
			add(root,a,b);
		}
	}
	private void add(TreeNode current, int a, int b) {
		if(a==current.val)return;
		else if(a<current.val){
			if(current.left==null)
				current.left=new TreeNode(a,b);
			else
				add(current.left,a,b);
		}else {
			if(current.right==null)
				current.right=new TreeNode(a,b);
			else
				add(current.right,a,b);
		}
		
	}
	
	public int search(int a)
	{
		if(a==root.val)
			return 0;
		else 
			return search(a,root);
	}
	
	private int search(int a, TreeNode t)
	{
		if(t==null)return -1;
		if(a==t.val)
			return t.position;
		else if(a<t.val)
			return search(a,t.left);
		else if(a>t.val)
			return search(a,t.right);
		
		return -2;
	}
	
	//深度优先DFS遍历
	public void preordertravel(TreeNode a) {
		if(a==null)return;
		System.out.println(a.val);
		preordertravel(a.left);
		preordertravel(a.right);
	}
	//中序可以给二叉树节点排序
	public void midordertravel(TreeNode a) {
		if(a==null)return;
		midordertravel(a.left);
		System.out.println(a.val);
		midordertravel(a.right);
	}
	
	
	public void postordertravel(TreeNode a) {
		if(a==null)return;
		postordertravel(a.left);
		postordertravel(a.right);
		System.out.println(a.val);
	}
	
	
	//求深度
	public int depth(){
		return depth(root);
	}
	public int depth(TreeNode a)
	{
		if(a==null)return 0;
		return Math.max(depth(a.left), depth(a.right))+1;
	}
	
	//广度优先搜索Recursion方法
	public void BFS()
	{
		for(int i=0;i<depth();i++) {
			printlevel(root,i);
			System.out.println("-------------");
		}
	}
	
	public void printlevel(TreeNode a,int level)
	{
		if(a==null) return;
		if(level==0) System.out.println(a.val);
		else
		{
			printlevel(a.left,level-1);
			printlevel(a.right,level-1);
		}
	}
}
public class 关于二叉树创建添加搜索 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,6,5,8,3,4,7,9,0};
		BinaryTree b = new BinaryTree();
		for(int i=0;i<a.length;i++) {
			b.add(a[i],i);
		}
		//System.out.println(b.search(9));
		
		//b.preordertravel(b.root);
		//b.midordertravel(b.root);
		//b.postordertravel(b.root);
		
		//System.out.println(b.depth());
		b.BFS();
	}

}
