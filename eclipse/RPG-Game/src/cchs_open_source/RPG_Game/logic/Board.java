package cchs_open_source.RPG_Game.logic;

import java.util.ArrayList;

public class Board {
	ArrayList<Room> board = new ArrayList<Room>();
	public Board(){
		RoomGenerator g = new RoomGenerator();
		for(int i = 0; i < 11; i++){
			ArrayList<Thing> stuff = g.genRoom(i);
			Room r = new Room(stuff);
			board.add(r);
		}
	}
	
	public Room get(int index){
		return board.get(index);
	}
	
	
}
