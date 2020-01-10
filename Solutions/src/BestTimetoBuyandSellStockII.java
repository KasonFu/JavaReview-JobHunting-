
public class BestTimetoBuyandSellStockII {
	
    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i=1; i<prices.length;i++)
        {
            if(prices[i-1]<prices[i])
            max = max + prices[i]-prices[i-1];
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(a));
	}

}
