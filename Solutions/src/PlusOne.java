
public class PlusOne {
    public static int[] plusOne(int[] digits) {
    	int carry = 1;
    	for(int i=digits.length-1;i>=0;i--) {
    		int number = digits[i]+carry;
    		digits[i] = number%10;
    		carry = number/10;
    	} 
    	if(carry==1)
    	{ int[] a = new int[digits.length+1];
    		a[0]=1;
	    	for(int i=1;i<a.length;i++)
	    	{
	    		a[i]=digits[i-1];
	    	}
	    	return a;
    	}
    	else return digits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,8,7,6,5,4,3,2,1,0};
		
		for(int k: plusOne(a))
		{
			System.out.println(k);
		}
	}

}
