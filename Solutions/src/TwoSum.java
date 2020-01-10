import java.util.ArrayList;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
	        int[] a = new int[2];
	        A:
	        for(int i=0; i<nums.length-1;i++) {
	        	for(int j=i+1;j<nums.length;j++) {
	        		if(nums[i]+nums[j]==target)
	        		{
	        			a[0]=i;a[1]=j;break A;
	        		}
	        	}
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,8,5,5,6,7};

		for(int k: twoSum(a,9))
		{
			System.out.println(k);
		}
	}

}
