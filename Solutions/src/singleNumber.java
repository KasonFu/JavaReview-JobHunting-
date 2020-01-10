import java.util.Arrays;

public class singleNumber {
    public static int singleNumber(int[] nums) {  		
        int a=-1;
        if(nums.length == 1)
        {
        	a=nums[0];
        }
        else {
		        Arrays.sort(nums);
		        for(int j=1;j<nums.length-1;j++)
		        {
		        	if(nums[j-1]!=nums[j]&&nums[j]!=nums[j+1])
		        		 a = nums[j];
		        }
		        if(nums[0]!=nums[1])
		        	a=nums[0];
		        if(nums[nums.length-1]!=nums[nums.length-2])
		        	a=nums[nums.length-1];
        }
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,2,1};
		System.out.println(singleNumber(a));
	}

}
