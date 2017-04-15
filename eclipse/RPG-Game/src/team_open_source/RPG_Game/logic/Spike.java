package team_open_source.RPG_Game.logic;

public class Spike extends Trap implements Trigger {

	public Spike(int xPos, int yPos){
	super(xPos, yPos);
	
 }
 
public void setPos(){
	//xPos = this.xPos;
	//yPos = this.yPos;
}

public void set(){
	super.triggered = false;
}

public void activate(){
	super.triggered = true; 
	
}
 
}
