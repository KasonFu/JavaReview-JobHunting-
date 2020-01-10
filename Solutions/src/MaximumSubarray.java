
public class MaximumSubarray {
	public static int maxSubArray(int[] nums) {
		int max=nums[0];
		int[] before = new int[nums.length];
		before[0]=nums[0];
		for(int i=1;i<nums.length;i++) {
			before[i] = Math.max(before[i-1]+nums[i], nums[i]);
			max = Math.max(before[i], max);
		}
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
