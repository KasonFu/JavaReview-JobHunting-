
public class ReverseInteger {
    public static int reverse(int x) {
    	int rev = 0;
        while (x != 0) {
        	
            int k = x%10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && k > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && k < -8)) return 0;
            x /= 10;
            rev = rev*10 + k;
        }
        return rev;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-123;
		System.out.println(reverse(a));
	}
    
}
