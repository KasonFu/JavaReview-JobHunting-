
public class LongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] nums) {
		if(nums.length==0) return 0;
		int max = 1;
		int res[] = new int[nums.length];
		for(int i=0;i<nums.length;i++) {res[i]=1;}
		for(int i=nums.length-2;i>=0;i--) {
			for(int k=i+1;k<nums.length;k++) {
				if(nums[i]<nums[k])
					res[i]=Math.max(res[i], res[k]+1);
			}
			max=Math.max(max, res[i]);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={10,9,2,5,3,7,101,18};
		System.out.print(lengthOfLIS(nums));
	}

}
