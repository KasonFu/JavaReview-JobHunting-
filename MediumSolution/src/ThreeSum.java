import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        if(nums.length<3)return list;
        
        
        for(int i=0;i<nums.length-2;i++)
        {	
        	if(i>0&&nums[i]==nums[i-1])
        		continue;
        	int low = i+1;
        	int high = nums.length-1;
        	while(low<high)
        	{
        		if(nums[low]+nums[high]==0-nums[i])
        		{
        			List<Integer> a =new ArrayList<Integer>();
        			a.add(nums[i]);
        			a.add(nums[low]);
        			a.add(nums[high]);
        			list.add(a);
        			low++;
        			high--;
    				while(low<high&&nums[low]==nums[low-1]) {low++;}
    				while(low<high&&nums[high]==nums[high+1]){high--;} 
        		}
        		else if(nums[low]+nums[high]<0-nums[i])
        				low++;
        		else if(nums[low]+nums[high]>0-nums[i])
        				high--;
        	}
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {0,0,0,0};
	//	List<List<Integer>> list = threeSum(nums);
	}

}
