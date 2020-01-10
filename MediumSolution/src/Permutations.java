
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> lists = new ArrayList<>();
    	List<Integer> list = new ArrayList<>();
    	if(nums.length==0) 
    	return lists;
    	generate(nums,list,lists);
    	return lists;
    }
    
    public static void generate(int[] nums, List<Integer> list, List<List<Integer>> lists)
    {
    	if(list.size()==nums.length)
    		lists.add(new ArrayList<>(list));
    	else {
	    	for(int i=0;i<nums.length;i++)
	    	{
	    		if(list.contains(nums[i]))
	    			continue;
	    		list.add(nums[i]);
	    		generate(nums,list,lists);
	    		list.remove(list.size()-1);
	    	}
	    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		int[] nums = {1,2,3};
		list = permute(nums);
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
