package team_open_source.RPG_Game.logic;

import java.util.ArrayList;

public class Board {
	ArrayList<Room> board;
	public Board(){
		RoomGenerator g = new RoomGenerator();
		for(int i = 0; i < 11; i++){
			Room r = new Room(g.genRoom(i));
			board.add(r);
		}
	}
	
	public Room get(int index){
		return board.get(index);
	}
}
