import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	//把所有可能性都列下来，然后再检测每一个的正确性，留下正确的，时间复杂度太高
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        if(n<=0) return list;
        generateAll(new char[2*n],0,list);
        return list;
    }
    public static void generateAll(char[] c, int index, List<String> result)
    {
    	if(index==c.length)
    	{	
    		String s = String.valueOf(c);
    		if(valid(s))
    			result.add(s);
    	}else
    	{
	    	c[index]='(';
	    	generateAll(c,index+1,result);
	    	c[index]=')';
	    	generateAll(c,index+1,result);
    	}
    }
    public static boolean valid(String s)
    {
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)=='(')
    			sb.append('(');
    		else 
    		{
    			if(sb.length()>0&&sb.charAt(sb.length()-1)=='(')
    				sb.deleteCharAt(sb.length()-1);
    			else return false;
    		}
    	}
    	if(sb.length()==0)return true;
    	return false;
    }
    
    public static List<String> generateParenthesis2(int n) {
    	List<String> list = new ArrayList<String>();
    	if(n<=0) return list;
    	generate2(n,"",list,0,0);
    	return list;
    }
    public static void generate2(int n, String s, List<String> list, int left, int right)
    {
    	if(left<right)
    		return;
    	if(left==n&&right==n)
    		list.add(s);
    	if(left<n)
    	{
    		generate2(n,s+"(",list,left+1,right);
    	}
    	if(right<n)
    	{
    		generate2(n,s+")",list,left,right+1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = generateParenthesis2(3);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+",     ");
		}
	}

}
