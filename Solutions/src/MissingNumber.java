import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        if(nums.length==1) return 0;
    	Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
        	if(nums[i+1]-nums[i]!=1)
        		return nums[i]+1;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
