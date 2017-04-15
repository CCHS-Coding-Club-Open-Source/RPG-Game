package team_open_source.RPG_Game.logic;

public class Goblin extends Enemy {
	String imageName = "goblin.png";
	
	public Goblin(int xPos, int yPos){
		super(xPos, yPos);
	}
	
	public String getImageName(){
		return this.imageName;
	}
	
	
}
