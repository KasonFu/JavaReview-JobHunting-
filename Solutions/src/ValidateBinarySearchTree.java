
public class ValidateBinarySearchTree {
    public static boolean valid(TreeNode root,Integer min,Integer max) {
    	if(root==null)return true;
    	if(min!=null&&root.val<=min) return false;
    	if(max!=null&&root.val>=max) return false;
    	return valid(root.left,min,root.val)&&valid(root.right,root.val,max);
    	
    }
	public static boolean isValidBST(TreeNode root) {
		if(root==null)return true;
    	return valid(root,null,null);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(1);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(6);
		a.left=b;
		a.right=c;
		c.left=d;
		c.right=e;
		System.out.println(isValidBST(a));
		
	}

}
