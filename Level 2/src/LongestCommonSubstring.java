
public class LongestCommonSubstring {
	public static String lcs(char[] a, char[] b)
	{
		//int[][] res= new int[a.length+1][b.length+1];
		String[][] s= new String[a.length+1][b.length+1];
		if(a.length==0||b.length==0) return "";
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++) {
				if(i==0||j==0)
					s[i][j]="";
				else {
					if(a[i-1]==b[j-1])
						s[i][j]=s[i-1][j-1]+a[i-1];
					else {
						if(s[i-1][j].length()>=s[i][j-1].length())
							s[i][j]= s[i-1][j];
						else s[i][j]= s[i][j-1];
					}
				}
			}
		}
		return s[a.length][b.length];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= {'a','b','c','d','e'};
		char[] b= {'h','a','d','f','e'};
		System.out.print(lcs(a,b));
	}

}
