
public class CountPrimes {
	public static int countPrimes(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			boolean a = false;
			for(int j=2;j<=Math.pow(i, 0.5);j++) {
				if(i%j==0) {
					a = true;
					break;
				}
			}
			if(!a)
				count++;
		}
		return count;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countPrimes(10));
	}

}
