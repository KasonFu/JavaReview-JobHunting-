
public class CD extends Item{
	private String artist;

	public CD(String title, String artist, int numofTracks, int playTime, String comment) {
		super(title,numofTracks,playTime,false,comment);
		this.artist = artist;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("title: ");
		super.print();
		System.out.println("artist: "+this.artist);
		System.out.println("----------");
	}


	
}
