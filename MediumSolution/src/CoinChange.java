import java.util.Arrays;

public class CoinChange {
	static int min = Integer.MAX_VALUE;
    public static int coinChange(int[] coins, int amount) {
    	if(coins.length==0) return -1;
    	if(amount==0) return 0;
    	Arrays.sort(coins);
    	helper(coins,amount,coins.length-1,0);
    	if(min==Integer.MAX_VALUE) return -1;
    	return min;
    }
    
    public static void helper(int[] coins, int amountleft, int index, int count) {
    	if(index==0) {
    		if(amountleft%coins[index]==0)
	    		min = Math.min(min, count+amountleft/coins[index]);
	    	return;
    	}
    	
    	for(int i=amountleft/coins[index];i>=0&&amountleft/coins[index]+count<min;i--) {
    		helper(coins,amountleft-coins[index]*i,index-1,i+count);
    	}
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins= {2,5};
		System.out.print(coinChange(coins,23));
	}

}
