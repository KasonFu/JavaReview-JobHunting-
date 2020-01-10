
public class Sqrt {
    public static int mySqrt(int x) {
    	if(x<=1)
    		return x;
    	int left = 0;
    	int right = x;
    	int mid = 0;
    	while(left<right)
    	{
    		mid = left+(right-left)/2;
    		if(x/mid>mid)
    			left = mid+1;
    		else if(x/mid<mid)
    			right = mid;
    		else return mid;
    	}
    	return left-1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(mySqrt(3));
	}

}
