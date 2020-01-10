
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int n = s.length();
        int res = 0;
        int tmp = 1;
        for (int i = n-1; i >= 0; --i) {
            res += (s.charAt(i) - 'A' + 1) * tmp; 
            tmp *= 26;
        }
        return res;
    }
    
    public String NumberToTitle(int n) {
    	String res = "";
        while (n>0) {
            if (n % 26 == 0) {
                res += 'Z';
                n -= 26;
            } else {
                res += n % 26 - 1 + 'A';
                n -= n % 26;
            }
            n /= 26;
        }
        //reverser res
        String finalres="";
        for(int i=res.length()-1;i>=0;i--)
        {
        	finalres+=res.charAt(i);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
