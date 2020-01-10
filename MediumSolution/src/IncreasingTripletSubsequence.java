
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
    	if(nums.length<3) return false;
    	int min = nums[0];
    	int medium = Integer.MAX_VALUE;
    	
    	for(int i=1;i<nums.length;i++)
    	{
    		if(nums[i]<min)
    			min = nums[i];
    		else if(nums[i]>min&&nums[i]<medium)
    			medium = nums[i];
    		else if(nums[i]>medium)
    			return true;
    	}
    	return false;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,6,4,7,8};
		System.out.print(increasingTriplet(a));
	}

}
