package team_open_source.RPG_Game.logic;

public class DarkElf extends Enemy {
	public DarkElf(int xPos, int yPos){
		super(xPos, yPos);
		super.addToStat(3);
	}
	public String getImageName(){ return "dark-elf.png"; }
}