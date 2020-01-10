
public class CountandSay {

	public static String countAndSay(int n) {
		int i = 1;
		String res = "1";
		while(i<n)
		{
			StringBuffer c = new StringBuffer();
			int count = 0;
			char c1 = res.charAt(0);
			for(int j=0;j<=res.length();j++) {
				if(j!=res.length()&&res.charAt(j)==c1)
					count++;
				else {
					c.append(count);
					c.append(c1);
					if(j!=res.length()) {
						count=1;
						c1=res.charAt(j);
					}
				}
			}
			res = c.toString();
			i++;
		}
		return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(2));
	}

}
