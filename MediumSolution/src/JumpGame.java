import java.util.ArrayList;
import java.util.List;

public class JumpGame {    
	//自己写的列出第一个能到达终点的点，再把这个点当终点，从0迭代递归能不能到达那个点。
    public static boolean canJump(int[] nums) {
    	if(nums.length==0||nums.length==1) return true;
    	return helper(nums,nums.length-1);
    }
    
    public static boolean helper(int[] nums, int canjump) {
    	for(int i=0;i<canjump;i++) {
    		if(nums[i]+i>=canjump)
    			{	
    				if(i==0) return true;
    				else return helper(nums,i);
    			}
    	}
    	return false;
    }
    
    //简化第一种的写法
    public static boolean canJump3(int[] nums) {
    	int lastposition = nums.length-1;
    	for(int i=nums.length-2;i>=0;i--) {
    		if(nums[i]+i>=lastposition) {
    			lastposition = i;
    		}
    	}
    	if(lastposition==0)
    		return true;
    	return false;
    }
    //标记法，标记每一个点能不能到达终点，就免去了重复的递归
    public static boolean canJump2(int[] nums) {
    	if(nums.length==0||nums.length==1) return true;
    	boolean[] marked = new boolean[nums.length];
    	marked[nums.length-1]=true;
    	helper2(nums,nums.length-2,marked);
    	return marked[0];
    }
    
    public static void helper2(int[]nums,int curr,boolean[] marked) {
    	if(curr==-1) return;
    	for(int i=1;i<=nums[curr];i++) {
    		if(marked[curr+i]==true)
    		{
    			marked[curr]=true;
    			break;
    		}
    	}
    	helper2(nums,curr-1,marked);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0};
		System.out.print(canJump3(nums));
	}

}
