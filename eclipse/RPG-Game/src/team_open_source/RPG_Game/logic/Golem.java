package team_open_source.RPG_Game.logic;

public class Golem extends Enemy {
	public Golem(int xPos, int yPos){
		super(xPos, yPos);
		super.addToStat(2);
	}
}
