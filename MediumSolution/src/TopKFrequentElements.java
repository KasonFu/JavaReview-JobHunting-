import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequentElements {
	
	//自己写的，太复杂
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if(nums.length==0||k==0)return list;
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int n:nums)
        {
        	if(map.containsKey(n))
        		map.replace(n,map.get(n)+1);
        	else
        		map.put(n, 1);
        }

        List<Map.Entry<Integer,Integer>> entrylist = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        sort(entrylist);
        
        for(int i=entrylist.size()-1;i>=entrylist.size()-k;i--)
        {
        	list.add(entrylist.get(i).getKey());
        }
        return list;
    }
    
    public static void sort(List<Map.Entry<Integer,Integer>> entry)
    {
    	quicksort(entry,0,entry.size()-1);
    }
    
    public static void quicksort(List<Map.Entry<Integer,Integer>> entry, int lo, int hi)
    {
    	if(lo<hi)
    	{
    		int pivotindex = partition(entry,lo,hi);
    		quicksort(entry,lo,pivotindex-1);
    		quicksort(entry,pivotindex+1,hi);
    	}
    }
    public static int partition(List<Map.Entry<Integer,Integer>> entry,int lo,int hi)
    {
    	int savedlo = lo;
    	int pivotvalue = entry.get(lo).getValue();
    	lo++;
    	while(lo<=hi)
    	{
    		if(entry.get(lo).getValue()>pivotvalue)
    		{
    			swap(entry,lo,hi);
    			hi--;
    		}
    		else
    			lo++;
    	}
    	swap(entry,savedlo,hi);
    	return hi;
    }
    
    public static void swap(List<Map.Entry<Integer,Integer>> entry,int a,int b)
    {
    	Map.Entry<Integer,Integer> temp = entry.get(a);
    	entry.set(a, entry.get(b));
    	entry.set(b, temp);
    }
    //PriorityQueue堆排序，每次Pop出最大频率
    public static List<Integer> topKFrequent2(int[] nums, int k)
    {
    	List<Integer> list = new ArrayList<>();
    	if(nums.length==0||k==0)return list;
    	HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int n:nums)
        {
        	map.put(n,map.getOrDefault(n, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = 
        		new PriorityQueue<Map.Entry<Integer,Integer>>(map.size(),ByDescendingFrequency);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
        	q.add(entry);
        }
        while(k>0)
        {
        	list.add(q.poll().getKey());
        	k--;
        }
        return list;
    }
    
	 public static Comparator<Map.Entry<Integer,Integer>> ByDescendingFrequency = 
			 new Comparator<Map.Entry<Integer,Integer>>() {
	        @Override //升序
	        public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
	            return o2.getValue() - o1.getValue();
	        }
	    };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,3,3,3};
		for(int k:topKFrequent2(nums,2))
		{
			System.out.print(k+" ");
		}
	}

}
