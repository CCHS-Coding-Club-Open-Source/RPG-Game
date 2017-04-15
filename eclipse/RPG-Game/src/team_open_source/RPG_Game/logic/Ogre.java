package team_open_source.RPG_Game.logic;

public class Ogre extends Enemy {
	public Ogre(int xPos, int yPos){
		super(xPos, yPos);
		super.addToStat(1);
	}
}
