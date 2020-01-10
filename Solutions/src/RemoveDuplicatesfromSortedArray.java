import java.util.ArrayList;
public class RemoveDuplicatesfromSortedArray {

		public static int removeDuplicates(int[] nums)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			int count=0;
			for(int i=0; i<nums.length;i++)
			{
				boolean found = false;
				for(int j=0; j<list.size(); j++)
				{
					if(nums[i] == list.get(j))
						found = true;
				}
				if(found == false)
				{
					list.add(count,nums[i]);
					count++;
				}else
					list.add(nums[i]);
			}
			
			for(int i=0; i<list.size();i++)
			{
				nums[i] = list.get(i);
			}
			return count;
		}

	}


