import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(new ArrayList<>());
        if(nums.length==0)
        	return lists;
        helper(nums,new ArrayList<>(),lists,0);
        return lists;
    }
    public static void helper(int[] nums, List<Integer>list, List<List<Integer>> lists,int index)
    {
    	for(int i=index;i<nums.length;i++)
    	{
    		if(list.contains(nums[i]))
    			continue;
    		list.add(nums[i]);
    		lists.add(new ArrayList<>(list));
    		helper(nums,list,lists,i+1);
    		list.remove(list.size()-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		int[] nums = {1,2,3};
		list = subsets(nums);
		for(List<Integer> k : list)
		{
			for(int n:k)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}

}
