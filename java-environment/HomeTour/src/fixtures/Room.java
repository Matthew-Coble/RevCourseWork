package fixtures;

public class Room extends Fixture {
	
	private Room[] exits;

	public Room(String name, String shortDes, String longDes) {
		super(name, shortDes, longDes);
		this.exits = new Room[7];
	}

public Room[] getExits() {
	return exits;
}

public Room getExit(String direction) {
	if (direction.equals("north")) {
		return exits[0];
	} else if (direction.equals("east")) {
		
	} else if (direction.equals("south")) {
		
	} else if (direction.equals("west")) {
		
	} else {
		
	}
}

public String toString() {
	String a = this.getName()+"\n\n"+this.getLongDes()+"\n\n"+this.getShortDes();
	return a;
	}
}