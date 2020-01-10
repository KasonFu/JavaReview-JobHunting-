
public class RotateArray {
    public static void rotate(int[] nums, int k) {
    	for(int i=0;i<k;i++)
    	{
    		int last = nums[nums.length-1];
    		
    		for(int j=nums.length-1;j>0;j--){
    			nums[j]=nums[j-1];
    		}
    		nums[0]=last;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1,-100,3,99};
		rotate(a, 2);
		for(int k: a)
		{
			System.out.println(k);
		}
	}

}
