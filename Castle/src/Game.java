import java.util.Scanner;

public class Game {
	
	private Room currentRoom;
	public void createRoom()
	{
		Room outside = new Room("城堡外");
		Room lobby = new Room("大堂");
		Room pub = new Room("酒吧");
		Room study = new Room("书房");
		Room bedroom = new Room("卧室");
		
		outside.setRoom("east", lobby);
		outside.setRoom("west", pub);
		outside.setRoom("south", study);
		
		pub.setRoom("east", outside);
		pub.setRoom("down", lobby);
		
		lobby.setRoom("west", outside);
		lobby.setRoom("up", pub);
		
		study.setRoom("east", bedroom);
		study.setRoom("north", outside);
		
		bedroom.setRoom("west", study);
		
		currentRoom = outside;
	}
	
	
	public void printWelcome()
	{
		System.out.println("Welcome to castle");
		System.out.println("You can print 'go','bye'.");

		
	}
	
	private void showPrompt() {
		// TODO Auto-generated method stub
		System.out.println("You are in "+currentRoom);
		System.out.println("You can go to "+currentRoom.getDirections());
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.createRoom();
		game.printWelcome();
		
		Scanner in = new Scanner(System.in);
		while(true)
		{
			game.showPrompt();
			String user = in.nextLine();
			String[] users = user.split(" ");
			if(users[0].equals("go"))
			{
				if(users[1] != null)
				{
					game.goRoom(users[1]);}
				else {
					System.out.println("Can't read, input again");
					System.out.println("--------");
					}
			}
			else if(users[0].equals("bye"))
				break;
			else 
			{
				System.out.println("Can't read, input again");
				System.out.println("--------");
			}
		}
		in.close();
	}


	private void goRoom(String string) {
		// TODO Auto-generated method stub
		Room nextRoom = currentRoom.getRoom(string);
		if(nextRoom == null)
			System.out.println("No door there");
		else
			currentRoom = nextRoom;
	}

}
