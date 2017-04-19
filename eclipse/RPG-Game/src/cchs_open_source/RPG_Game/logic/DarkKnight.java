package cchs_open_source.RPG_Game.logic;

public class DarkKnight extends Enemy {
	public DarkKnight (int xPos, int yPos){
		super(xPos, yPos);
		for(int i = 0; i < 5; i++){
		super.addToStat(i);
		}
	}
	public String getImageName(){ return "dark-knight.png"; }
}

