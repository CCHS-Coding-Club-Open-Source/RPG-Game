package cchs_open_source.RPG_Game.logic;

public class Zombie extends Enemy {
	public Zombie(int xPos, int yPos){
		super(xPos, yPos);
		super.addToStat(2);
	}
	
	public String getImageName(){ return "zombie.png"; }
}
