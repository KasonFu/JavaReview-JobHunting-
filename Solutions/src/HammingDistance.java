
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int[] a = new int[32];
        int[] b = new int[32];
        A:
        for(int i=31;i>=0;i--) {
        	if(x==1) {
        		a[i]=1;
        		break A;
        	}
        	a[i] = x%2;
        	x /= 2;
        }
        B:
        for(int i=31;i>=0;i--) {
        	if(y==1) {
        		b[i]=1;
        		break B;
        	}
        	b[i] = y%2;
        	y /= 2;
        }
        int count=0;
        for(int i=0; i<32; i++) {
        	if(a[i]!=b[i])
        		count++;
        }
        return count;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1,4));
	}

}
