

public class ClimbingStairs {
    public static int climbStairs(int n) {
    	if(n==0||n==1) {
    		return 1;
    	}
    	int[] s = new int[n+1];
    	s[0]=1;
    	s[1]=1;
    	for(int i=2;i<n+1;i++) {
    		s[i]=s[i-1]+s[i-2];
    	}
    	return s[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));
	}

}
