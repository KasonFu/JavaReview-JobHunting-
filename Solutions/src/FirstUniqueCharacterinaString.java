
public class FirstUniqueCharacterinaString {
	public static int firstUniqChar(String s) {
		if(s.length()==1)
			return 0;
		for(int i=0;i<s.length();i++) {
			boolean found=false;
			for(int j=0;j<s.length();j++) {
				if(i==j)
					continue;
				if(s.charAt(i) == s.charAt(j)) {
					found=true;
					break;
				}
			}
			if(!found)
				return i;
		}
		return -1;
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		System.out.println(firstUniqChar(s));
	}

}
