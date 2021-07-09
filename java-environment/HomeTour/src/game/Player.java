package game;

import fixtures.Room;

public class Player {
//create current room variable
	private Room currentRoom;


	public Room getCurrentRoom() {
		return currentRoom;
	}

/*	call upon this method to change the currentRoom variable to match the room you
	want to go to*/
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public String toString() {
		String a = currentRoom.getName()+"\n"+currentRoom.getShortDes()+"\n"+currentRoom.getLongDes();
		return a;
	}
}