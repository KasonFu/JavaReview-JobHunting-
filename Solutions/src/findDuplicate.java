import java.util.Arrays;

public class findDuplicate {

	 public static boolean containsDuplicate(int[] nums) {
     	Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++)
	        {
	        	if(nums[i]==nums[i+1])
                 return true;
	        }
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,1};
		System.out.println(containsDuplicate(a));
	}

}
