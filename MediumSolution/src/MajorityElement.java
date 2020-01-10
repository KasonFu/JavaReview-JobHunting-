import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        int n = nums.length;
        int compare = n/2;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int k:nums) 
        {map.put(k, map.getOrDefault(k, 0)+1);}
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
        	if(entry.getValue()>compare)
        		return entry.getKey();
        }
        return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
