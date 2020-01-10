
public class Item {

	private String title;
	private int numofTracks;
	private int playTime;
	private boolean gotIt;
	private String comment;
	public Item(String title, int numofTracks, int playTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.numofTracks = numofTracks;
		this.playTime = playTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	
	public void print()
	{
		System.out.println(this.title);
	}
}
