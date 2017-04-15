package team_open_source.RPG_Game.logic;
import java.util.ArrayList;
public class Room {
ArrayList<Thing> tiles;

	public Room(){
	
	}
	
	public void add(Thing addThing){
	tiles.add(addThing);
	}
	
	public Thing get(int i){
		return tiles.get(i);
	}
	
	public void clear(){
		tiles.clear();
	}
	
	public void next(){
		for(Thing thing: tiles){
			thing.next();
		}
	}

}
