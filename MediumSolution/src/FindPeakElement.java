
public class FindPeakElement {
	public static int findPeakElement(int[] nums) {
		if(nums.length==1||nums[0]>nums[1]) return 0;
		if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
		return peak(nums,0,nums.length-1);
	}
	public static int peak(int[] nums, int lo, int hi)
	{
		if(hi-lo>1)
		{
			int mid=lo+(hi-lo)/2;
			if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])
				return mid;
			else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1])
				return peak(nums,mid,hi);
			else
				return peak(nums,lo,mid);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,5,6,4};
		System.out.print(findPeakElement(nums));
	}

}
