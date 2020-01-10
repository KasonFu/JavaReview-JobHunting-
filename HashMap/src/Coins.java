import java.util.HashMap;

public class Coins {
	private HashMap<Integer, String> coinnames = new HashMap<Integer,String>();
	
	public Coins()
	{
		coinnames.put(1,"penny");
		coinnames.put(10,"dime");
		coinnames.put(25,"quarter");
		coinnames.put(50,"half-dollar");
	}
	public void getKeys()
	{
		for(Integer k: coinnames.keySet())
		{
			System.out.print(k+", ");
		}
	}
	public void getValues()
	{
		for(Integer k: coinnames.keySet() )
		{
			System.out.print(coinnames.get(k)+", ");
		}
	}
	public String getname(int amount)
	{
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "Not Found";
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coins coin = new Coins();
		System.out.println(coin.getname(10));
		System.out.println(coin.coinnames);
		coin.getValues();
		coin.getKeys();
	}

}
