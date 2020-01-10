import java.util.HashSet;

public class HappyNumber {
	  public static boolean isHappy(int n) {
		  HashSet<Integer> set = new HashSet<>();
		  while(n!=1) {
			  if(set.contains(n))
				  return false;
			  set.add(n);
			  n=helper(n);
		  }
		  return true;
	    }
	    public static int helper(int n){
	        int sum=0;
	        while(n!=0){
	            sum+=Math.pow(n%10,2);
	            n/=10;
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isHappy(19));
	}

}
