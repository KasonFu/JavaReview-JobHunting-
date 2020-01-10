import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	//我写的，复杂度太高了，大概是n+n*n*logn*m
    public static List<List<String>> groupAnagrams(String[] strs) {
    	if(strs.length==0) return null;
    	List<List<String>> list = new ArrayList<List<String>>();
    	List<String> Stringlist = new ArrayList<String>();
    	for(String k: strs)
    	{
    		Stringlist.add(k);
    	}
    	for(int i=0;i<Stringlist.size();i++)
    	{
    		List<String> a = new ArrayList<String>();
    		String compare = Stringlist.get(i);
    		a.add(compare);
    		if(i!=Stringlist.size()-1)
    		{	
	    		for(int j=i+1;j<Stringlist.size();j++)
	    		{
	    			String compared = Stringlist.get(j);
	    			if(isAnagrams(compare, compared))
	    			{
	    				a.add(compared);
	    				Stringlist.remove(j);
	    				j--;
	    			}
	    		}
    		}
    		list.add(a);
    	}
    	return list;
    }
    public static boolean isAnagrams(String a, String b)
    {
    	if(a.length()==b.length())
    	{
    		char[] c = a.toCharArray();
    		char[] d = b.toCharArray();
    		Arrays.sort(c);
    		Arrays.sort(d);
    		for(int i=0;i<c.length;i++)
    		{
    			if(c[i]!=d[i])
    				return false;
    		}
    		return true;
    	}
    	return false;
    }
    
    //标准答案，时间复杂度n*m*logn
    public static List<List<String>> groupAnagrams2(String[] strs) {
    	if(strs.length==0) return null;
    	List<List<String>> list = new ArrayList<List<String>>();
    	HashMap<String, List<String>> h= new HashMap<String, List<String>>();
    	for(String k: strs)
    	{
    		char[] c = k.toCharArray();
    		Arrays.sort(c);
    		String s = String.valueOf(c);
    		if(h.containsKey(s))
    		{
    			h.get(s).add(k);
    		}else
    		{
    			List<String> l = new ArrayList<String>();
    			l.add(k);
    			h.put(s,l);
    		}
    	}
    	for(String s:h.keySet())
    	{
    		list.add(h.get(s));
    	}
    	return list;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] a = {"eat","tea","tan","ate","nat","bat"};
//		List<List<String>> list = groupAnagrams(a);
	}

}
