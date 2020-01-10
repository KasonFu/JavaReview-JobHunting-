import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLeveOrderTraversal {
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		 List<List<Integer>> lists = new ArrayList<>();
		 if(root==null) return lists;
		 Queue<TreeNode> q = new LinkedList<>();
		 q.offer(root);
		 int level=1;
		 while(!q.isEmpty())
		 {
			 List<Integer> list = new ArrayList<>();
			 for(int i=q.size();i>0;i--) {
				 TreeNode curr = q.poll();
				 list.add(curr.val);
				 if(curr.left!=null)
					 q.offer(curr.left);
				 if(curr.right!=null)
					 q.offer(curr.right);
			 }
			 if(level%2==0)
				 reverse(list);
			 lists.add(list);
			 level++;
		 }
		 
		 return lists;
	   }
	 
	 public static void reverse(List<Integer> list) {
		 for(int i=0;i<list.size()/2;i++) {
			 int temp=list.get(i);
			 list.set(i, list.get(list.size()-i-1));
			 list.set(list.size()-i-1, temp);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		for(int k:a) {
			System.out.print(k);
		}
		reverse(a);
		for(int k:a) {
			System.out.print(k);
		}
	}

}
