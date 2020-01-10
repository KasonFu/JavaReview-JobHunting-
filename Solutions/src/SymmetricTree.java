
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return symmetric(root.left,root.right);
        }
    public boolean symmetric(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return true;
        if(!(root1==null)==(root2==null)) return false; 
        return (root1.val==root2.val)&&symmetric(root1.left,root2.right)
        		&&symmetric(root2.left,root1.right);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
