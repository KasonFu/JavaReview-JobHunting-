import java.util.ArrayList;

public class Library {
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
	public void list()
	{
		for(Item k: listItem)
		{
			k.print();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		library.listItem.add(new CD("abc","def",4,60,"..."));
		library.listItem.add(new DVD("ggg","hhh",4,60,"..."));
		library.list();
	}

}
