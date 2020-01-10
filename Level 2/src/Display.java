



public class Display {
	int value = 0;
	int limit = 0;
	
	public Display(int limit)
	{
		this.limit = limit;
	}
	
	public void increase() 
	{
		value++;
		if(value == limit)
		{
			value = 0;
		}
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
