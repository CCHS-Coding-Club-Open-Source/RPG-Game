package cchs_open_source.RPG_Game.logic;

public class Golem extends Enemy {
	public Golem(int xPos, int yPos){
		super(xPos, yPos);
		super.addToStat(2);
	}
	public String getImageName(){ return "golem.png"; }
}
