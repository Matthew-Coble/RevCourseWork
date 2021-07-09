package game;

import java.util.Scanner;

import fixtures.Fixture;

public class Main {

	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();
		
		
		
		Player player = new Player();
		player.setCurrentRoom(rm.startingRoom);
		printRoom(player);
		
		String parse;
		
		do {
			
			
		} while (parse != "leave");
		
	}

	private static void printRoom(Player player) {
		
		System.out.println(player.getCurrentRoom());
	}
	
	private static String[] collectInput() {
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		
	}
	
	private static String parse(String[] command, Player player) {
		return "leave";
	}
}
