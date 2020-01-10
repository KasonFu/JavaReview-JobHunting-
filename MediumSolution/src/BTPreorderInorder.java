
public class BTPreorderInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	return helper(preorder,inorder,0,0,inorder.length-1);
    }
    
    public static TreeNode helper(int[] preorder,int[] inorder,int prestart,int instart, int inend) {
    	if(prestart>=preorder.length||instart>inend) return null;
    	int rootindex=0;
    	for(int i=instart;i<=inend;i++) {
    		if(inorder[i]==preorder[prestart])
    		{
    			rootindex=i;
    			break;
    		}
    	}
    	TreeNode root = new TreeNode(preorder[prestart]);
    	root.left = helper(preorder,inorder,prestart+1,instart,rootindex-1);
    	root.right = helper(preorder,inorder,prestart+rootindex-instart+1,rootindex+1,inend);
    	
    	return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
