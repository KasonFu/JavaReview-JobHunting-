import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {
	//nlogn
    public static int findKthLargest(int[] nums, int k) {
        if(nums.length<k) return -1;
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    //nlogk
    public static int findKthLargest2(int[] nums, int k) {
    	int res = -1;
        if(nums.length<k) return res; 
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int n:nums)
        {
        	q.offer(n);
        	if(q.size()>k)
        		q.poll();
        }
        return q.poll();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3,1,2,4,5,5,6};
		System.out.print(findKthLargest2(nums,4));
	}

}
