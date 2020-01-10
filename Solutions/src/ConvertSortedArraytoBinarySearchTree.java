

public class ConvertSortedArraytoBinarySearchTree {
	 public static TreeNode sortedArrayToBST(int[] nums) {
		 if(nums.length==0)return null;
		 TreeNode root = new TreeNode(nums[nums.length/2]);
		 int[] left = new int[nums.length/2];
		 for(int i=0;i<nums.length/2;i++)
		 {
			left[i] = nums[i];
		 }
		 int[] right = new int[nums.length-nums.length/2-1];
		 for(int i=nums.length/2+1;i<nums.length;i++)
		 {
			right[i-nums.length/2-1] = nums[i];
		 }
		 root.left = sortedArrayToBST(left);
		 root.right = sortedArrayToBST(right);
		 return root;
	    }
	 public static TreeNode sortedArrayToBST2(int[] nums) {
		 if(nums.length==0) return null;
		 TreeNode root = new TreeNode(nums[nums.length/2]);
		 root.left = getmidNode(nums,0,nums.length/2-1);
		 root.right = getmidNode(nums,nums.length/2+1,nums.length-1);
		 return root;
	 }
	 public static TreeNode getmidNode(int[] nums, int start, int end)
	 {
		 if(start==end) return new TreeNode(nums[start]);
		 if(start>end) return null;
		 int mid = (end-start+1)/2+start;
		 TreeNode midNode = new TreeNode(nums[mid]);
		 midNode.left = getmidNode(nums,start,mid-1);
		 midNode.right = getmidNode(nums, mid+1, end);
		 return midNode;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,-3,0,5,9};
		sortedArrayToBST2(nums);
	}

}
