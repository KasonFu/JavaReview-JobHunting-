import java.util.HashMap;

public class Room {
	private String description;
	HashMap<String, Room> hm = new HashMap<String, Room>();
	
	
	public Room(String description) {
		this.description = description;
	}


	public String toString() {
		return description;
	}
	
	public void setRoom(String dir,Room room){
		hm.put(dir,room);
	}
	
	public String getDirections(){
		StringBuffer sb = new StringBuffer();
		for(String dir:hm.keySet())
		{
			if(hm.get(dir)!=null)
				sb.append(dir+' ');
		}
		return sb.toString();
	}


	public Room getRoom(String dir) {
		// TODO Auto-generated method stub
		return hm.get(dir);
	}
	
	
}
