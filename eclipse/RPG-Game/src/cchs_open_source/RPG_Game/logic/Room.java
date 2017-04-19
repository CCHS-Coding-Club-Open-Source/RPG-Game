package cchs_open_source.RPG_Game.logic;
import java.util.ArrayList;
public class Room {
ArrayList<Thing> tiles;

	public Room(ArrayList<Thing> tiles){
	this.tiles = tiles;
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
	
	public void move(){
		for(Thing thing: tiles){
			thing.next();
		}
	}
	
	public ArrayList<Thing> getAll(){
		return tiles;
	}
	


}
