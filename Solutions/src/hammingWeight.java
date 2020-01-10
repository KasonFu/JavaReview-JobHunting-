
public class hammingWeight {
    public int HammingWeight(int n) {
        int count =0;
    	for(int i=0;i<32;i++) {
        	count += n&1;
        	n >>= 1;
        }
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
