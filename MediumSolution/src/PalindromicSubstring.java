
public class PalindromicSubstring {
	static String res ="";
	 public static String longestPalindrome(String s) {
	        if(s.length()==0||s==null) return s;
	        for(int i=0;i<s.length();i++)
	        {
	        	helper(s,i,i);
	        	helper(s,i,i+1);
	        }
	        return res;
	    }
	 public static void helper(String s,int left, int right )
	 {
		 while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
		 {
			 left--;
			 right++;
		 }
		 String current = s.substring(left+1, right);
		 if(current.length()>res.length())
			 res = current;
			 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbbd";
		System.out.print(longestPalindrome(s));
	}

}
