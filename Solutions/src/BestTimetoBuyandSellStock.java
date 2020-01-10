
public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
    	if(prices.length==0||prices.length==1)
    		return 0;
		int max=0;
    	for(int i=0;i<prices.length-1;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j]-prices[i]>max)
					max = prices[j]-prices[i];
			}
		}
    	return max;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {7,1,5,3,6,4};
		System.out.println(maxProfit(s));
	}

}
