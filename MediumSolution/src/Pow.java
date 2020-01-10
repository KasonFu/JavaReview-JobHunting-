
public class Pow {
    public static double myPow(double x, int n) {
        double res = 1.0;
        int k = n;
        while(n!=0)
        {
            if(n%2!=0)
                res *= x;
            x *= x;
            n /= 2;
        }
        if(k<0)
            return (1/res);
        else
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(myPow(2.0, -2));
	}

}
