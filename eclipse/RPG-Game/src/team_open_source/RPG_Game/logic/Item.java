package team_open_source.RPG_Game.logic;
import java.util.ArrayList;
public class Item extends Thing{
	String name;
	int stat = 0;
	ArrayList<Integer> stats = new ArrayList<Integer>();
	public Item (int xPos, int yPos, int stat){
		super(xPos, yPos);
		this.stat = stat;
	}
	
	public Item(int xPos, int yPos){
		super(xPos, yPos);
		stats.add(1);
	}
	
	public String getImageName(){
		//TODO add real imageName
		return "NUll";
	}

	
	
	
	
	

}
