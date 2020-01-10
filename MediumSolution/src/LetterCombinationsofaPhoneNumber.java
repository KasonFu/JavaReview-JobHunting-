import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static List<String> letterCombinations(String digits) {
    	List<String> list = new ArrayList<String>();
    	if(digits.length()==0) return list;
        HashMap<Integer,String> h = new HashMap<Integer, String>();
        h.put(0, null);
        h.put(1, null);
        h.put(2, "abc");
        h.put(3, "def");
        h.put(4, "ghi");
        h.put(5, "jkl");
        h.put(6, "mno");
        h.put(7, "pqrs");
        h.put(8, "tuv");
        h.put(9, "wxyz");
        StringBuilder s = new StringBuilder();
        helper(digits,0,s,list,h);
        return list;
    }
    
    public static void helper(String s, int index, StringBuilder sb,List<String> list,HashMap<Integer,String> h)
    {
    	if(index==s.length()) {
    		list.add(sb.toString());
    		return;}
    	int n = s.charAt(index)-'0';
    	String rep = h.get(n);
    	for(int i=0;i<rep.length();i++)
    	{
    		sb.append(rep.charAt(i));
    		helper(s,index+1,sb,list,h);
    		sb.deleteCharAt(index);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "23";
		List<String> l = letterCombinations(s);
		for(String k: l)
		{
			System.out.print(k+" ");
		}
	}

}
