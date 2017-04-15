package team_open_source.RPG_Game.logic;

public class EldAbom extends Enemy {
	public EldAbom(int xPos, int yPos){
		super(xPos, yPos);
		super.addToStat(4);
	}
	
	public String getImageName(){ return "eldritch-abomination.png"; }
}