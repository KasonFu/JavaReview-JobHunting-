


public class Move0 {
    public static void moveZeroes(int[] nums) {
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]==0) {
    			for(int j=i+1;j<nums.length;j++) {
    				if(nums[j]!=0) {
    					int a = nums[j];
    					nums[j] = nums[i];
    					nums[i] = a;
    					break;
    				}
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,3,4,2,5,1,0};
		moveZeroes(a);
		for(int k: a)
		{
			System.out.println(k);
		}
	}

}
