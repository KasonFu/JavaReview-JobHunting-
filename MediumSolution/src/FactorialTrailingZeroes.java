
public class FactorialTrailingZeroes {
	//�������ж��ٸ�5���
    public static int trailingZeroes(int n) {
    	int res = 0;
    	while(n>0) {
    		res+=n/5;
    		n/=5;
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(trailingZeroes(13));
		}
	
}
