import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BFS{
	List<Integer> list = new ArrayList<Integer>();
    public void getlevelnumber(TreeNode root,int level)
    {
    	if(level==0)
    		list.add(root.val);
    	else
    	{
    		if(root.left!=null)
    		getlevelnumber(root.left,level-1);
    		if(root.right!=null)
    		getlevelnumber(root.right,level-1);
    	}
    }
}


public class BTLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        if(root==null)	return a;
        List<Integer> l = new ArrayList<Integer>();
        l.add(root.val);
        a.add(l);
        for(int i=1;i<getlevel(root);i++)
        {	
        	BFS b = new BFS();
        	b.getlevelnumber(root, i);
        	a.add(b.list);
        }
        return a;
    }
    
    public static int getlevel(TreeNode root)
    {
    	if(root==null) return 0;
    	return Math.max(getlevel(root.left), getlevel(root.right))+1;
    }
    
    
    //用Queue来BFS，第一次用Queue类。
    public static List<List<Integer>> levelOrder2(TreeNode root)
    {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if(root==null) return list;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.offer(root);
    	while(!q.isEmpty())
    	{
    		List<Integer> a = new ArrayList<Integer>();
    		int size = q.size();
    		for(int i=0;i<size;i++)
    		{
    			TreeNode temp = q.poll();
    			a.add(temp.val);
    			if(temp.left!=null)
        			q.offer(temp.left);
        		if(temp.right!=null)
        			q.offer(temp.right);
    		}
    		list.add(a);
    	}
    	return list;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(20);
		TreeNode d = new TreeNode(15);
		TreeNode e = new TreeNode(7);
		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;
		List<List<Integer>> k = levelOrder2(a);
		for(int i=0;i<k.size();i++)
		{
			for(int j=0;j<k.get(i).size();j++)
			{
				System.out.print(k.get(i).get(j)+" ");
				System.out.println();
			}
			System.out.println("---------");
		}
	}

}
