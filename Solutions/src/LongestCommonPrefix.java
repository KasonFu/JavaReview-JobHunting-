
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
			return "";
    	boolean end = false;
    	int index=0;
    	int l=strs[0].length();
    	for(int i =1;i<strs.length;i++) {
    		if(strs[i].length()<l)
    			l=strs[i].length();
    	}
    	A:
    	while(!end&&index<l) {
    		for(int i=0;i<strs.length;i++) {
    			char c = strs[0].charAt(index);
    			if(strs[i].charAt(index) != c) {
    				end = true;
    				break A;
    			}
    		}
    		index++;
    	}
    	if(index == 0)
    		return "";
    	else if(index == 1)
    		return Character.toString(strs[0].charAt(0));
    	else
    		return strs[0].substring(0,index);

        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"flower","flow","flight"};
 		System.out.println(longestCommonPrefix(s));
	}

}
