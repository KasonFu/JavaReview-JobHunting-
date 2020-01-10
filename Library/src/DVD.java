
public class DVD extends Item {
	private String director;
	
	public DVD(String title, String director, int numofTracks, int playTime, String comment) {
		super(title,numofTracks,playTime,false,comment);
		this.director = director;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("title: ");
		super.print();
		System.out.println("artist: "+this.director);
		System.out.println("----------");
	}
}
