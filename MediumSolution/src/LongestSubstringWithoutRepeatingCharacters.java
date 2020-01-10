
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	//我的方法，复杂度太高，n*n
	public static int lengthOfLongestSubstring(String s) {
		int maxlength = 0;
		for(int i=0;i<s.length()-maxlength;i++)
		{
			HashSet<Character> h = new HashSet<Character>();
			for(int j=i;j<s.length();j++)
			{
				if(h.contains(s.charAt(j)))
				{
					int length = h.size();
					if(length>maxlength) 
						maxlength = length;
					break;
				}else
				{
					h.add(s.charAt(j));
					if(j==s.length()-1)
						return Math.max(maxlength, h.size());
				}
			}
		}
		return maxlength;
    }
	//标准答案复杂的n
	public static int lengthOfLongestSubstring2(String s) {
		int maxlength = 0;
		HashSet<Character> h = new HashSet<Character>();
		for(int i=0, j=0;i<s.length();)
		{
			 if(h.contains(s.charAt(i))) {
	                h.remove(s.charAt(j++));
	            }
	            else {
	                h.add(s.charAt(i++));
	                maxlength = Math.max(maxlength, h.size());
	            }
		}
		return maxlength;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "dvdf";
		System.out.print(lengthOfLongestSubstring2(a));
	}

}
