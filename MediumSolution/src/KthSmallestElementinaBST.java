import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KthSmallestElementinaBST {
    public static int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int[] nums = new int[k];
        for(int i =0;i<k;i++){
            nums[i]= Integer.MAX_VALUE;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            helper(nums,curr.val);
            if(curr.left!=null)
                q.offer(curr.left);
            if(curr.right!=null)
                q.offer(curr.right);
        }
        
        return nums[k-1];
    }
    
    public static void helper(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(k<nums[i]){
                for(int j=nums.length-1;j>i;j--){
                    nums[j]=nums[j-1];
                }
                nums[i]=k;
                break;
            }
        }
    }
    
    //由于是BST，所以中序遍历，可以递归成有序数组
    public static int kthSmallest2(TreeNode root, int k) {
    	List<Integer> list = new ArrayList<>();
    	tranversal(root,list,k);
    	return list.get(k-1);
    }
    public static void tranversal(TreeNode root, List<Integer>list,int k) {
    	if(root==null||list.size()==k)return;
    	if(root.left!=null)
    	tranversal(root.left,list,k);
    	list.add(root.val);
    	if(root.right!=null)
        tranversal(root.right,list,k);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(6);
		TreeNode d = new TreeNode(2);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(1);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		d.left=f;
		System.out.print(kthSmallest2(a,3));
	}

}
