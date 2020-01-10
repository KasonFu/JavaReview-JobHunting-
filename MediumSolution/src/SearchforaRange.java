
public class SearchforaRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {0,0};
        if(nums.length==1&&target==nums[0])return res;
        int index = binarysearch(nums,target,0,nums.length-1);
        if(index != -1)
        {
            int hi=index;
            int lo=index;
            while(hi<nums.length&&nums[hi]==target)
            {hi++;}
            while(lo>=0&&nums[lo]==target)
            {lo--;}
            return new int[]{lo+1,hi-1};
        }
       
        return new int[]{-1,-1};
    }
    public static int binarysearch(int[] nums, int target, int lo, int hi)
    {
        if(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                return binarysearch(nums,target,lo,mid-1);
            else
                return binarysearch(nums,target,mid+1,hi);
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		for(int k:searchRange(nums,target))
		{
			System.out.print(k);
		}
	}

}
