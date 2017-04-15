package team_open_source.RPG_Game.logic;

public class Enemy extends Being {
	public Enemy(){
		super();
	}
	public int attack(){
		return ((int)( Math.random() * 3) + 1) + super.str;
	}
	
	public int dodge(){
		return ((int)( Math.random() * 3) + 1) + super.dex;
	}
	
	public void move(int xDir, int yDir){
	super.xPos += xDir;
	super.yPos += yDir;
	}
	
}
