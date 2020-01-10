
public class ImplementStrstr {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(needle.length()>haystack.length())
        	return -1;
		for(int i=0; i<=haystack.length()-needle.length();i++) {
	    	boolean match = true;
			if(haystack.charAt(i)==needle.charAt(0)) {
				for(int j=0;j<needle.length();j++) {
					if(haystack.charAt(i+j)!=needle.charAt(j)) {
						match = false;
						break;
					}
				}
				if(match)
					return i;
			}
		}
    	
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "mississippi";
		String b = "issipi";
		System.out.println(strStr(a,b));
	}

}
