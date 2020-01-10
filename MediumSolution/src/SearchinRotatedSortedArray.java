
public class SearchinRotatedSortedArray {
	 public static int search(int[] nums, int target) {
	        if(nums.length==0) return -1;
	        if(nums.length==1&&target==nums[0]) return 0;
	        int lo=0;int hi=nums.length-1;
	        while(lo<=hi) {
	        	int mid = lo+(hi-lo)/2;
	        	if(nums[mid]==target) return mid;
	        	if(nums[mid]<nums[lo]) {
	        		if(nums[mid]<target&&nums[hi]>=target)
	        			lo = mid+1;
	        		else
	        			hi = mid-1;
	        	}else {
	        			if(nums[mid]>target&&nums[lo]<=target)
	        				hi = mid-1;
	        			else
	        				lo = mid+1;
	        	}
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]nums = {4,5,6,7,0,1,2};
			System.out.print(search(nums,0));
	}

}
