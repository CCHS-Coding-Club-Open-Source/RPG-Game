package team_open_source.RPG_Game.logic;
import java.util.ArrayList;
public class Player extends Being{
int gold; 

// TODO items + class
	public Player(int xPos, int yPos){
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
	
	
	
	
	public String getImageName(){ return "Player?"; }
}
