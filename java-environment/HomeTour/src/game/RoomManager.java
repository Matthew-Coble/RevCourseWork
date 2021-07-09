package game;

import fixtures.Room;

public class RoomManager {
//making 
	Room[] rooms = new Room[7];
	public Room startingRoom;

	public void init() {
		Room parlor = new Room(
				"The Parlor",
				"a moody parlor",
				"A shadowy corridor that has welcomed all manner of guests. \n"
				+ "To the east you can see a dining room, where\n"
				+ "platter of food appears to already be laid out. To the west "
				+ "you can see stairs the go down into darkness.");
				this.rooms[1] = parlor;
				
		Room start = new Room(
				"The Spooky House",
				"Through the open door you see a parlor to the north.", 
				"You are standing at the front door of The Spooky House. Having come "
				+ "to the old abandoned house on a dare,\n"
				+ "you are determined to see for yourself what's so strange about the place.");
				this.startingRoom = start;
				this.rooms[0] = start;
				
		Room dining = new Room();
		
		
	}
}
