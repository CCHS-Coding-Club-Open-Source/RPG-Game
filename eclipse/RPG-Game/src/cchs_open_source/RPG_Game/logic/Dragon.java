package cchs_open_source.RPG_Game.logic;

public class Dragon extends Enemy {
	public Dragon (int xPos, int yPos){
		super(xPos, yPos);
		for(int i = 0; i < 5; i++){
		super.addToStat(i);
		}
	}
	public String getImageName(){ return "dragon.png"; }
}
