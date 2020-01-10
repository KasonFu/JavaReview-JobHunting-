import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	//Recursion
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root==null) return list;
		helper(root,list);
		return list;
	 }
	public static void helper(TreeNode curr, List<Integer>list) {
		if(curr.left!=null)
			helper(curr.left,list);
		list.add(curr.val);
		if(curr.right!=null)
			helper(curr.right,list);
	}
	//Stack,Iteration
	public List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> s = new Stack<>();
		if(root==null) return list;
		TreeNode curr = root;
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
