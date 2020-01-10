
public class SortColors {
    public static void sortColors(int[] nums) {
    	quicksort(nums,0,nums.length-1);
    }
    public static void quicksort(int[] nums, int lo, int hi)
    {
    	if(lo<hi)
    	{
	    	int midindex = partition(nums,lo,hi);
	    	quicksort(nums,lo,midindex-1);
	    	quicksort(nums,midindex+1,hi);
	    }
    }
    
    public static int partition(int[] nums,int lo, int hi)
    {
    	int savedlo = lo;
    	int pivotvalue=nums[lo];
    	lo++;
    	while(lo<=hi)
    	{
    		if(nums[lo]>pivotvalue)
    		{
    			swap(nums,lo,hi);
    			hi--;
    		}
    		else
    			lo++;
    	}
    	swap(nums,savedlo,hi);
    	return hi;
    }
    public static void swap(int[] nums,int a,int b)
    {
    	int temp = nums[a];
    	nums[a] = nums[b];
    	nums[b] = temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,6,1,7,2,9};
		sortColors(nums);
		for(int k:nums)
		{
			System.out.print(k+" ");
		}
	}

}
