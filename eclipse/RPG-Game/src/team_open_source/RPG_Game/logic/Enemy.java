package team_open_source.RPG_Game.logic;

public class Enemy extends Being {
	public Enemy(int xPos, int yPos){
		super(xPos, yPos);
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
	
	public void next(){
	if(xPos >  5){
		xPos = 5;
	}
	if(xPos < 0){
		xPos = 0; 
	}
	if(yPos > 5){
		yPos = 5;
	}
	if(yPos < 0){
		yPos = 0;
	}
	int xPosAdditive = (int) (Math.random() * 1) -1;
	int yPosAdditive = (int) (Math.random() * 1) -1;
	
	xPos += xPosAdditive;
	yPos += yPosAdditive;
	
	
	}
	
	public String getImageName(){ return "Enemy?"; }
	
	
}
